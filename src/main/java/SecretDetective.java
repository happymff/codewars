/**
 * Created by mff on 2017/7/11.
 */
public class SecretDetective {
    public String recoverSecret(char[][] triplets) {
        //http://www.codewars.com/kata/53f40dff5f9d31b813000774/train/java
        /**
         * There is a secret string which is unknown to you. Given a collection of random triplets from the string, recover the original string.

         A triplet here is defined as a sequence of three letters such that each letter occurs somewhere before the next in the given string. "whi" is a triplet for the string "whatisup".

         As a simplification, you may assume that no letter occurs more than once in the secret string.

         You can assume nothing about the triplets given to you other than that they are valid triplets and that they contain sufficient information to deduce the original string. In particular, this means that the secret string will never contain letters that do not occur in one of the triplets given to you.

         */
        int k =0;
        String s1 ="";
        String temp;
        String s;
        int count;
        for (int i =0; i < triplets.length; i++) {
            temp= String.valueOf(triplets[i]);
            s1 = s1 +temp + ",";
        }
        StringBuffer stringBuffer1= new StringBuffer();
        stringBuffer1.append(s1);
        System.out.println(s1);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(s1,0,3);
        System.out.println(stringBuffer);
        for(int i = -3; i <0; i ++) {
            System.out.println("第"+(i+3));
            s = stringBuffer.substring(stringBuffer.length()+i);
            //System.out.println(s);
            System.out.println(s.charAt(0));
            for(int j =0; j <stringBuffer.length()-2; j ++) {
                count= s1.indexOf(s.charAt(0));
                //System.out.println(s1.charAt(count));
                System.out.println("----count----"+count);
                while (count != -1) {
                    if (i!= -3){
                        j=k+1;
                    }
                    count = s1.indexOf(stringBuffer.charAt(j), count + 1);//*从这个索引往后开始第一个出现的位置
                    System.out.println("count = " + count);
                    if ((count > 1) && ((stringBuffer1.charAt(count - 1)) != ',')){
                        System.out.println("插入位置："+(stringBuffer.length() + i-k));

                        if (i==-3){
                            if (stringBuffer.toString().charAt(0)!=s1.charAt(count-1)) {
                                stringBuffer.insert(stringBuffer.length() + i - k, s1.charAt(count - 1));
                            }else {
                                continue;
                            }
                        }else if(i==-2) {
                            if (stringBuffer.toString().charAt(stringBuffer.length() -3)!=s1.charAt(count-1)) {
                                stringBuffer.insert(stringBuffer.length() -2, s1.charAt(count - 1));
                            }else {
                                continue;
                            }
                        }
                        System.out.println("stringBuffer:" + stringBuffer);
                        k++;
                        stringBuffer1.deleteCharAt(count-1);
                    }
                }
                System.out.println(k);
                j= j+k;
            }
        }
        //stringBuffer1.substring(0,stringBuffer1.indexOf(","));
        return stringBuffer.toString();
    }

}
