/**
 * Created by mff on 2017/4/26.
 */
public class Rainfall {
    public static double mean(String town, String strng) {
        // your code
        double sum = 0, mean = 0;
        int count = 0;
        if (strng.contains(town)) {
            String[] strings1 = strng.split("\n");
            for (String str1 : strings1) {
                //System.out.println(str1);
                if (str1.startsWith(town)) {
                    String[] strings2 = str1.split(",");
                    //System.out.println(strings2.length);
                    if (strings2.length == 12) {
                        for(int j=0; j <12; j++) {
                            if(strings2[j].contains(".")) {
                                for (String str2 : strings2) {
                                    String[] strings3 = str2.split(" ");
                                    for (String str3 : strings3) {
                                        //System.out.println(str3);
                                        //System.out.println(count + "次");
                                        if (str3.contains(".")) {
                                            // System.out.println(str3);
                                            //System.out.println(Double.valueOf(str3));
                                            sum = sum + Double.valueOf(str3);
                                            count++;
                                        }
                                    }
                                }
                                //System.out.println(sum);
                                mean = sum / count;
                            }else {
                                return -1;

                            }
                        }
                    } else {
                        return -1;
                    }
                }

            }

        } else {
            return -1;
        }
        return mean;
    }

    public static double variance(String town, String strng) {
        // your code
        double avarage = mean(town, strng);
        // your code
        double sum = 0, variance = 0;
        int count = 0;
        if (strng.contains(town)) {
            String[] strings1 = strng.split("\n");
            for (String str1 : strings1) {
                //System.out.println(str1);
                if (str1.startsWith(town)) {
                    String[] strings2 = str1.split(",");
                    //System.out.println(strings2);
                    if (strings2.length == 12) {
                        for (int j =0; j<12; j++){
                            System.out.println(strings2[j]);
                            if(strings2[j].contains(".")) {
                                for (String str2 : strings2) {
                                    String[] strings3 = str2.split(" ");

                                    for (String str3 : strings3) {
                                        //System.out.println(str3);
                                        if (str3.contains(".")) {
                                            // System.out.println(str3);
                                            //System.out.println(Double.valueOf(str3));
                                            sum = sum + (Double.valueOf(str3) - avarage) * (Double.valueOf(str3) - avarage);
                                            count++;
                                        }
                                    }
                                }
                            }else {
                                return -1;
                            }
                        //System.out.println(sum);
                        variance = sum / count;
                    }
                    } else {
                        return -1;
                    }
            }

        }

        }else {
        return -1;
        }
        return variance;
    }


}