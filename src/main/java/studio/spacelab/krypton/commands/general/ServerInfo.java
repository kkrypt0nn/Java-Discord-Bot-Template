package studio.spacelab.krypton.commands.general;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Role;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import studio.spacelab.krypton.commands.ICommand;
import studio.spacelab.krypton.utils.Constants;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by Krypton the 1/21/2021 at 17:58
 *
 * @author Krypton
 * @copyright Spacelab Studio 2015-2021, under Apache 2.0 Licence
 */
public class ServerInfo implements ICommand {

    @Override
    public void execute(String[] args, MessageReceivedEvent messageReceivedEvent) throws IOException {
        ArrayList<String> rolesList = new ArrayList<>();
        for (Role role : messageReceivedEvent.getGuild().getRoles()) {
            rolesList.add(role.getName());
        }
        EmbedBuilder embedBuilder = new EmbedBuilder();
        embedBuilder.setTitle("**Server Name**");
        embedBuilder.setDescription(messageReceivedEvent.getGuild().getName());
        embedBuilder.setColor(Constants.BOT_COLOR);
        embedBuilder.setThumbnail(messageReceivedEvent.getGuild().getIconUrl());
        embedBuilder.addField("Server ID", messageReceivedEvent.getGuild().getId(), false);
        embedBuilder.addField("Member Count", String.valueOf(messageReceivedEvent.getGuild().getMemberCount()), false);
        embedBuilder.addField("Text/Voice Channels", String.valueOf(messageReceivedEvent.getGuild().getChannels().size()), false);
        embedBuilder.addField("Roles (" + messageReceivedEvent.getGuild().getRoles().size() + ")", String.join(" / ", rolesList), false);
        messageReceivedEvent.getChannel().sendMessage(embedBuilder.build()).queue();
    }

    @Override
    public Constants.CommandCog commandCog() {
        return Constants.CommandCog.GENERAL;
    }

    @Override
    public String commandUsage() {
        return "!serverinfo";
    }

    @Override
    public String commandDescription() {
        return "Get information about the server";
    }

    @Override
    public int permissionRequired() {
        return 3;
    }

}
