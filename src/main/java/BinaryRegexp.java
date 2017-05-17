/**
 * Created by mengfeifei on 2017/5/17.
 */
import java.util.regex.Pattern;

public class BinaryRegexp {
    public static Pattern multipleOf3() {
        // Regular expression that matches binary inputs that are multiple of 3
        return Pattern.compile("^(0+|0*1((10*1)|(01*0))*10*)$");
        //return Pattern.compile("0*(1(01*0)*10*)*");
    }
}
