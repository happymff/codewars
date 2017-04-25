/**
 * Created by mff on 2017/4/25.
 */
public class Test1 {

    public static String encrypt(final String text, final int n) {
        // Your code here

        if (text == null) {
            return null;

        } else if (n <= 0 || (text.length()) < 2) {
            return text;
        } else {
            String text1 = null;
            char[] ch1;
            int len;
            len = text.length();
            ch1 = text.toCharArray();
            for (int i = 1; i <= n; i++) {
                char[] ch2, ch3;
                ch2 = new char[len/2];
                ch3 = new char[len/2];
                int k,m;
                k=0;m=0;
                for (int j = 1; j < len; j=j+2) {
                    ch2[k++] = ch1[j-1];
                    ch3[m++] = ch1[j];
                }
                if(len%2!=0) {
                    text1 = String.valueOf(ch3) + String.valueOf(ch2) + ch1[len-1];
                    ch1 = text1.toCharArray();
                }else {
                    text1 = String.valueOf(ch3) + String.valueOf(ch2);
                    ch1 = text1.toCharArray();
                }
            }
        return text1;
        }

    }



        public static String decrypt(final String encryptedText, final int n) {
            // Your code here

            if (encryptedText == null) {
                return null;

            } else if (n <= 0 || (encryptedText.length()) < 2) {
                return encryptedText;
            } else {
                String text1 = null;
                char[] ch11,ch12,ch1;
                int len;
                len = encryptedText.length();
                ch1= encryptedText.toCharArray();
                String subTextPer = encryptedText.substring(0,len/2);
                String subTextAf = encryptedText.substring(len/2,len);
                ch11 = subTextPer.toCharArray();
                ch12 = subTextAf.toCharArray();
                for (int i = 1; i <= n; i++) {
                    int m=0;
                    for(int j=0; j<len/2; j++){
                        ch1[m]=ch12[j];
                        ch1[m+1]=ch11[j];
                        m=m+2;
                    }
                        text1 = String.valueOf(ch1);
                        subTextPer = text1.substring(0,len/2);
                        subTextAf = text1.substring(len/2,len);
                        ch11 = subTextPer.toCharArray();
                        ch12 = subTextAf.toCharArray();

                }
                return text1;
            }

        }
    }
