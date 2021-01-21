package studio.spacelab.krypton.utils;

/**
 * Created by Krypton the 1/21/2021 at 19:29
 *
 * @author Krypton
 * @copyright Spacelab Studio 2015-2021, under Apache 2.0 Licence
 */
public class ArgumentsBeautifier {

    public static String getBanReason(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        // i = 1
        // because we only want the arguments after @User
        for (int i = 1; i < args.length; i++) {
            stringBuilder.append(args[i]).append(" ");
        }
        return stringBuilder.toString();
    }

}
