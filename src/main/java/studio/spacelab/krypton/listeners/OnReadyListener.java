package studio.spacelab.krypton.listeners;

import net.dv8tion.jda.api.JDAInfo;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

/**
 * Created by Krypton the 1/21/2021 at 14:03
 *
 * @author Krypton
 * @copyright Spacelab Studio 2015-2021, under Apache 2.0 Licence
 */
public class OnReadyListener extends ListenerAdapter {

    @Override
    public void onReady(ReadyEvent readyEvent) {
        System.out.println("Logged in as: " + readyEvent.getJDA().getSelfUser().getName());
        System.out.println("JDA API version: " + JDAInfo.VERSION);
        //System.out.println("Java version: " + Runtime.version());
        System.out.println("Running on: " + System.getProperty("os.name"));
        System.out.println("-------------------");
    }

}
