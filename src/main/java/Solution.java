/**
 * Created by mff on 2017/4/26.
 */
public class Solution {
    public static int zeros(int n) {
//        // your beatiful code here
//    long result1 = nj(n);
//        System.out.println(result1);
//    int count =0;
//        if(result1<0){
//        return 7;
//    }
//        System.out.println(result1);
//        for(long i =result1; i>0; i=i/10){
//        if(i%10==0){
//            count++;
//        }
//        //System.out.println(i);
//    }
//        return count;
//}
//    public static long nj(int n) {
//        // your beatiful code here
//
//        if(n==0){
//            return 1l;
//        }
//        return n*nj(n-1);
        //被2整除的次数之和
        int count2 = 0;
        //被5整除的次数之和
        int count5 = 0;

        //遍历所有的数
        for (int number = 1; number <= n; number ++) {
            int dynmicNumber = number;//该数的一个复制，用于不数的整除用
            while (dynmicNumber % 2 == 0) { //统计该数能被2整除多少次，但是并不单独统计，而是统计到全局
                count2++;
                dynmicNumber /= 2;
            }
            while (dynmicNumber % 5 == 0) { //统计该数能被2整除多少次，但是并不单独统计，而是统计到全局
                count5++;
                dynmicNumber /= 5;
            }
        }

        System.out.println("结尾0的个数为：" + Math.min(count2, count5));
        return  Math.min(count2, count5);
    }

}
