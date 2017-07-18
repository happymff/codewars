import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by mengfeifei on 2017/5/22.
 */
public class Suite {
    public static double going(int n) {
        // your code
        double going1 =0,going;
        BigInteger sum=new BigInteger("0");
        if(n==0){
            return 0;
        }else{
            for (int i =1; i<=n; i++){
            sum =getM(i).add(sum);
            //System.out.println(sum);
            }
            BigInteger g=new BigInteger("1.0");
            BigInteger h=g.divide(getM(n));
            going=(h.multiply(sum).doubleValue());
            //System.out.println(going);
            BigDecimal bg = new BigDecimal(going);
            going1 = bg.setScale(6, BigDecimal.ROUND_HALF_DOWN).doubleValue();
        }
        return going1;
    }
//    public static long getN(int n) {
//        //System.out.println(n);
//        if(n==1){
//            return 1;
//
//        }else {
//            return n * getN(n - 1);
//        }
//    }
    public  static BigInteger getM(int n ){
        Integer base = new Integer(n);
        BigInteger result = new BigInteger("1");
        for(int i = 1; i <= base; i++){
            String temp1 = Integer.toString(i);
            BigInteger temp2 = new  BigInteger(temp1);
            result = result.multiply(temp2);
        }
        return result;
    }
}
