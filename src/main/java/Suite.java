import java.math.BigDecimal;

/**
 * Created by mengfeifei on 2017/5/22.
 */
public class Suite {
    public static double going(int n) {
        // your code
        double going1 =0,going;
        long sum=0;
        if(n==0){
            return 0;
        }else{
            for (int i =1; i<=n; i++){
            sum = sum + getN(i);
            System.out.println(sum);
            }
            going=(1.0/getN(n))*sum;
            System.out.println(going);
            BigDecimal bg = new BigDecimal(going);
            going1 = bg.setScale(6, BigDecimal.ROUND_HALF_DOWN).doubleValue();
        }
        return going1;
    }
    public static long getN(int n) {
        //System.out.println(n);
        if(n==1){
            return 1;

        }else {
            return n * getN(n - 1);
        }
    }
}
