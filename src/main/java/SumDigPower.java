import org.apache.commons.collections.FastArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mff on 2017/4/26.
 */
public class SumDigPower {


    public static List<Long> sumDigPow(long a, long b) {
        // your code
        List<Long>  list = new ArrayList();
        long sum=0;
       for(long i =a; i <= b; i++){
           long num1=0,num2=0,num3=0;

           num1 = i/100;
           num2 = i%100/10;
           num3 = i - num1 * 100 - num2 * 10;
        if(num1>0&&num2>0) {
            sum = num1 + num2 * num2 + num3 * num3 * num3;
            System.out.println("num1 + num2 * num2 + num3 * num3 * num3=:"+sum);
        }else if (num2>=1){
            sum = num2 + num3 * num3;
            System.out.println("num2 + num3 * num3=:"+sum);
        }else {
            sum = num3;
            System.out.println("num3=:"+sum);
        }
        if(i==sum){
        list.add(i);
        }
       }
        return list;
    }
}
