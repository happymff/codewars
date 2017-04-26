/**
 * Created by mff on 2017/4/26.
 */

public class Keypad {
    public static int presses(String phrase) {
        String [] str1 = {"1","ABC2","DEF3","GHI4","JKL5","MNO6","PQRS7","TUV8","WXYZ9","*"," 0","#"};
        int count=0;
        char[] ch= phrase.toCharArray();
        for(int i =0; i< ch.length;i++) {
            for (int j =0; j< str1.length; j++) {
                char ch1 = ch[i];
                char[] ch2 = str1[j].toCharArray();
                for(int k =0; k < ch2.length; k++){
                    if(ch2[k]==ch1){
                        count=count+1+k;
                    }
                }

            }
        }
        return count;
    }
}
