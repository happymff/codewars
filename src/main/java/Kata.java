public class Kata {

    private static final StringBuffer StringBuffer = null;


    public static String expandedForm(int num) {
        String str1 = num + "";
        int a = str1.length();
        int b;
        String getstr;
        String str = null;
        StringBuffer str2 = new StringBuffer();
        String str3 = null;
        int count = 0;
        if (num > 0) {
            for (int i = 1; i <= a; i++) {
                getstr = str1.substring(i - 1, i);
                //System.out.println(getstr);

                if (getstr.equals("0")) {
                    continue;
                } else {
                    count ++;
                    System.out.println("count:" + count);
                    b = (int) Math.pow(10, a - i);
                    str = Integer.parseInt(getstr) * b + "";
                }
               if (count>1){
                   str2.append(" + ");
                   str2.append(str);

               }else {
                   str2.append(str);
               }

            }

        }

        str3 = str2.toString();
        System.out.println("str:" + str3);
        return str3;
    }
}
