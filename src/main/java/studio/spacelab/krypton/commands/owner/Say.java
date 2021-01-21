package studio.spacelab.krypton.commands.owner;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import studio.spacelab.krypton.commands.ICommand;
import studio.spacelab.krypton.utils.Constants;

import java.io.IOException;

/**
 * Created by Krypton the 1/21/2021 at 14:31
 *
 * @author Krypton
 * @copyright Spacelab Studio 2015-2021, under Apache 2.0 Licence
 */
public class Say implements ICommand {

    @Override
    public void execute(String[] args, MessageReceivedEvent messageReceivedEvent) throws IOException {
        messageReceivedEvent.getChannel().sendMessage(String.join(" ", args)).queue();
    }

    @Override
    public Constants.CommandCog commandCog() {
        return Constants.CommandCog.OWNER;
    }

    @Override
    public String commandUsage() {
        return "!say <Message>";
    }

    @Override
    public String commandDescription() {
        return "Echo are you here?";
    }

    @Override
    public int permissionRequired() {
        return 0;
    }
}
