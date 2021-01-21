package studio.spacelab.krypton.commands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import studio.spacelab.krypton.utils.Constants;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Krypton the 1/21/2021 at 14:47
 *
 * @author Krypton
 * @copyright Spacelab Studio 2015-2021, under Apache 2.0 Licence
 */
public class CommandDataParser {

    public class CommandData {

        public String raw;
        public String name;
        public String[] split;
        public String[] args;
        public MessageReceivedEvent messageReceivedEvent;

        public CommandData(String raw, String name, String[] split, String[] args, MessageReceivedEvent messageReceivedEvent) {
            this.raw = raw;
            this.name = name;
            this.split = split;
            this.args = args;
            this.messageReceivedEvent = messageReceivedEvent;
        }

    }

    public CommandData parseData(String raw, MessageReceivedEvent messageReceivedEvent) {

        ArrayList<String> splittedData = new ArrayList<>();
        String prefixRemoved = raw.substring(Constants.PREFIX.length());
        String[] prefixRemovedSplitted = prefixRemoved.split(" ");
        Collections.addAll(splittedData, prefixRemovedSplitted);
        String commandName = splittedData.get(0);
        String[] args = new String[splittedData.size() - 1];
        splittedData.subList(1, splittedData.size()).toArray(args);
        return new CommandData(raw, commandName, prefixRemovedSplitted, args, messageReceivedEvent);

    }

}
