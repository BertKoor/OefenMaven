package nl.ordina;
import org.apache.commons.lang3.StringUtils;
public class HelloMaven {

    public static void main(String[] args) {
        System.out.println("Hello " + getName(args) + "!");
    }

    public static String getName(String[] args) {
        String result = "Maven";
        if (args != null && args.length > 0 && !StringUtils.isBlank(args[0])) {
            result = args[0];
        }
        return result;
    }
}
