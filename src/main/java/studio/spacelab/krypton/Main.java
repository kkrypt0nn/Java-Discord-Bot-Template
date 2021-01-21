package studio.spacelab.krypton;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.utils.cache.CacheFlag;
import studio.spacelab.krypton.commands.CommandDataParser;
import studio.spacelab.krypton.commands.ICommand;
import studio.spacelab.krypton.commands.general.Info;
import studio.spacelab.krypton.commands.general.Ping;
import studio.spacelab.krypton.commands.general.ServerInfo;
import studio.spacelab.krypton.commands.help.Help;
import studio.spacelab.krypton.commands.moderation.Ban;
import studio.spacelab.krypton.commands.owner.Say;
import studio.spacelab.krypton.listeners.OnMessageListener;
import studio.spacelab.krypton.listeners.OnReadyListener;
import studio.spacelab.krypton.utils.Constants;

import javax.security.auth.login.LoginException;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by Krypton the 1/21/2021 at 13:45
 *
 * @author Krypton
 * @copyright Spacelab Studio 2015-2021, under Apache 2.0 Licence
 */
public class Main {

    private static JDA jda;

    public static HashMap<String, ICommand> commands = new HashMap<>();
    public static CommandDataParser commandDataParser = new CommandDataParser();

    public static void main(String[] args) {

        try {
            jda = JDABuilder.createDefault(Constants.TOKEN).build();
        } catch (LoginException loginException) {
            loginException.printStackTrace();
        }
        setupCommands();
        setupListeners();
    }

    private static void setupCommands() {
        commands.put("ban", new Ban());
        commands.put("help", new Help());
        commands.put("info", new Info());
        commands.put("ping", new Ping());
        commands.put("say", new Say());
        commands.put("serverinfo", new ServerInfo());
    }

    private static void setupListeners() {
        jda.addEventListener(new OnReadyListener());
        jda.addEventListener(new OnMessageListener());
    }

    public static void executeCommand(CommandDataParser.CommandData commandData) throws IOException {
        if (commands.containsKey(commandData.name)) {
            commands.get(commandData.name.toLowerCase()).execute(commandData.args, commandData.messageReceivedEvent);
        }
    }

}
