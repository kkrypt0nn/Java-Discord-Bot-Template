package studio.spacelab.krypton.commands.moderation;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import studio.spacelab.krypton.commands.ICommand;
import studio.spacelab.krypton.utils.ArgumentsBeautifier;
import studio.spacelab.krypton.utils.Constants;

import java.io.IOException;
import java.net.Authenticator;

/**
 * Created by Krypton the 1/21/2021 at 18:21
 *
 * @author Krypton
 * @copyright Spacelab Studio 2015-2021, under Apache 2.0 Licence
 */
public class Ban implements ICommand {

    @Override
    public void execute(String[] args, MessageReceivedEvent messageReceivedEvent) throws IOException {
        Member author = messageReceivedEvent.getMessage().getMember();
        if ((author.hasPermission(Permission.BAN_MEMBERS)) || (author.hasPermission(Permission.ADMINISTRATOR))) {
            EmbedBuilder embedBuilder = new EmbedBuilder();
            String reason = "none";
            if (args.length > 1) {
                reason = ArgumentsBeautifier.getBanReason(args);
            }
            Member target = messageReceivedEvent.getMessage().getMentionedMembers().get(0);
            try {
                messageReceivedEvent.getGuild().ban(target, 7, reason).queue();
                embedBuilder.setColor(0x00ff00);
                embedBuilder.setDescription(target.getEffectiveName() + " has been successfully banned.");
            } catch (Exception exception) {
                embedBuilder.setColor(0xff0000);
                embedBuilder.setDescription("An error occured when trying to ban " + target.getEffectiveName() + "!");
            }
            messageReceivedEvent.getChannel().sendMessage(embedBuilder.build()).queue();
        } else {
            System.out.println("Yes");
        }
    }

    @Override
    public Constants.CommandCog commandCog() {
        return Constants.CommandCog.MODERATION;
    }

    @Override
    public String commandUsage() {
        return "!ban <User> <Reason>";
    }

    @Override
    public String commandDescription() {
        return "Bans a user";
    }

    @Override
    public int permissionRequired() {
        return 2;
    }

}
