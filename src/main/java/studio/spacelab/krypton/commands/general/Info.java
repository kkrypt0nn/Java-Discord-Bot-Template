package studio.spacelab.krypton.commands.general;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.JDAInfo;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import studio.spacelab.krypton.commands.ICommand;
import studio.spacelab.krypton.utils.Constants;

import java.io.IOException;

/**
 * Created by Krypton the 1/21/2021 at 17:51
 *
 * @author Krypton
 * @copyright Spacelab Studio 2015-2021, under Apache 2.0 Licence
 */
public class Info implements ICommand {

    @Override
    public void execute(String[] args, MessageReceivedEvent messageReceivedEvent) throws IOException {
        EmbedBuilder embedBuilder = new EmbedBuilder();
        embedBuilder.setColor(Constants.BOT_COLOR);
        embedBuilder.setDescription("Used Krypton's Template");
        embedBuilder.setAuthor("Bot Information");
        embedBuilder.addField("Owner:", "Krypton#7331", true);
        //embedBuilder.addField("Java Version:", Runtime.version().toString(), true);
        embedBuilder.addField("JDA Version:", JDAInfo.VERSION, true);
        embedBuilder.addField("Prefix:", Constants.PREFIX, true);
        embedBuilder.setFooter("Requested by " + messageReceivedEvent.getAuthor().getName());
        messageReceivedEvent.getChannel().sendMessage(embedBuilder.build()).queue();
    }

    @Override
    public Constants.CommandCog commandCog() {
        return Constants.CommandCog.GENERAL;
    }

    @Override
    public String commandUsage() {
        return "!info";
    }

    @Override
    public String commandDescription() {
        return "Get information about the bot";
    }

    @Override
    public int permissionRequired() {
        return 3;
    }

}
