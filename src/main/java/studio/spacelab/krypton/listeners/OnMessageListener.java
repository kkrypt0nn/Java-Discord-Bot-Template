package studio.spacelab.krypton.listeners;

import net.dv8tion.jda.api.entities.ChannelType;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;
import studio.spacelab.krypton.Main;
import studio.spacelab.krypton.utils.Constants;

import java.io.IOException;

/**
 * Created by Krypton the 1/21/2021 at 14:18
 *
 * @author Krypton
 * @copyright Spacelab Studio 2015-2021, under Apache 2.0 Licence
 */
public class OnMessageListener extends ListenerAdapter {

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent messageReceivedEvent) {
        if (messageReceivedEvent.getChannelType().equals(ChannelType.PRIVATE)) return;
        if (messageReceivedEvent.getAuthor().isBot()) return;

        if ((messageReceivedEvent.getMessage().getContentRaw().startsWith(Constants.PREFIX)) && (!messageReceivedEvent.getMessage().getAuthor().getId().equals(messageReceivedEvent.getJDA().getSelfUser().getId()))) {
            try {
                Main.executeCommand(Main.commandDataParser.parseData(messageReceivedEvent.getMessage().getContentRaw(), messageReceivedEvent));
                System.out.println("[INFO] Command has been executed by " + messageReceivedEvent.getAuthor().getName() + " in the server " + messageReceivedEvent.getGuild().getName() + ".");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
