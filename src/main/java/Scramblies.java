/**
 * Created by mff on 2017/4/26.
 */

public class Scramblies {

    public static boolean scramble(String str1, String str2) {

        // your code
        char[] ch1, ch2;
        ch1 = str1.toCharArray();
        ch2 = str2.toCharArray();
        int m = str1.length() + 1;
        int count=0;
        if(ch1.length<ch2.length){
            return false;
        }else {
            for (int i = 0; i < str2.length(); i++) {
                for (int j = 0; j < str1.length(); j++) {
                    if (ch1[j] == ch2[i] && m != j) {
                        count++;
                        m = j;
                        ch1[j]=' ';
                        break;
                    } else {
                        continue;
                    }
                }
                //System.out.println(count);
            }
            if (count == str2.length()) {
                return true;
            } else {
                return false;
            }
        }

    }
}