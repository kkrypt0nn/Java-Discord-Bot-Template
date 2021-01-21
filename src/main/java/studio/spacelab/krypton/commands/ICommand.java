package studio.spacelab.krypton.commands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import studio.spacelab.krypton.utils.Constants;

import java.io.IOException;

/**
 * Created by Krypton the 1/21/2021 at 14:26
 *
 * @author Krypton
 * @copyright Spacelab Studio 2015-2021, under Apache 2.0 Licence
 */
public interface ICommand {

    void execute(String[] args, MessageReceivedEvent messageReceivedEvent) throws IOException;
    Constants.CommandCog commandCog();
    String commandUsage();
    String commandDescription();
    int permissionRequired();

}
