/**
 * Created by mengfeifei on 2017/4/30.
 */
public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        // Your code here.
        String[] s1;
            StringBuffer stringBuffer;
            stringBuffer=getDir(arr);
            while (true) {
                System.out.println(stringBuffer);
                String s = String.valueOf(stringBuffer);
                if ((s.contains("NORTH") && s.contains("SOUTH"))||(s.contains("WEST") && s.contains("EAST"))) {
                    s1 = s.split(",");
                    StringBuffer stringBuffer1 = getDir(s1);
                    stringBuffer.delete(0, stringBuffer.length());
                    stringBuffer.append(stringBuffer1);
                } else {
                    s1 = s.split(",");
                    break;
                }
                if(s.length()==21&&(s.contains("NORTH")&&s.contains("SOUTH")&&s.contains("WEST") && s.contains("EAST"))){
                    //System.out.println("四个");
                    s1 = s.split(",");
                    break;
                }
            }
        return s1;
    }

    public static StringBuffer getDir(String[] arr){
        StringBuffer stringBuffer = new StringBuffer();
        for(int i =1; i< arr.length; i ++) {
            if (arr[i - 1].equals("NORTH")) {
                if (!arr[i].equals("SOUTH")) {
                    stringBuffer.append(arr[i-1]);
                    stringBuffer.append(",");
                }else {
                    i++;
                }
            } else if (arr[i - 1].equals("SOUTH")) {
                if (!arr[i].equals("NORTH")) {
                    stringBuffer.append(arr[i-1]);
                    stringBuffer.append(",");
                }else {
                    i++;
                }
            } else if (arr[i - 1].equals("WEST")) {
                if (!arr[i].equals("EAST")) {
                    stringBuffer.append(arr[i-1]);
                    stringBuffer.append(",");
                }else {
                    i++;
                }
            } else if (arr[i - 1].equals("EAST")) {
                if (!arr[i].equals("WEST")) {
                    stringBuffer.append(arr[i-1]);
                    stringBuffer.append(",");
                }else {
                    i++;
                }
            }
        }
        stringBuffer.append(arr[arr.length-1]);
        return stringBuffer;
    }
}