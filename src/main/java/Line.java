/**
 * Created by mengfeifei on 2017/4/26.
 */
public class Line {
    public static String Tickets(int[] peopleInLine) {
        //Your code is here...
        int sum=0, count25=1,count50=0,count100=0;
        if(peopleInLine.length<=0||peopleInLine[0]!=25){
            return "NO";
        }else if(peopleInLine.length>1&&peopleInLine[0]==25) {

            for(int i =1; i< peopleInLine.length; i++) {
                if(peopleInLine[i] == 50){
                    count50++;
                    if(count50<=count25) {
                        sum = sum + peopleInLine[i] - 25 - count25 * 25;
                        count25--;
                    }else {
                        return "NO";
                    }
                }else if(peopleInLine[i]==100){
                    count100++;
                    if(count50>0) {
                        sum = sum + peopleInLine[i] - 25 - count25 * 25 - count50 * 50;
                        count50--;
                        count25--;
                    }else if(count25>=3){
                        sum = sum + peopleInLine[i] - 25 - count25 * 25;
                        count25=count25-3;
                    }else {
                        return "NO";
                    }
                }else{
                    count25++;
                }
            }
        }
        if (sum<=25){
            return "YES";
        }else {
            return "NO";
        }
    }
}
