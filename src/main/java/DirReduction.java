/**
 * Created by mengfeifei on 2017/4/30.
 */
public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        // Your code here.
        String[] s1 = new String[] {}, s2;
        StringBuffer stringBuffer;
        stringBuffer = getDir(arr);
        if (stringBuffer.length() == 0) {
          return s1;
        } else {
            while (true) {
                System.out.println(stringBuffer);
                String s = String.valueOf(stringBuffer);
                if ((s.contains("NORTH") && s.contains("SOUTH")) || (s.contains("WEST") && s.contains("EAST"))) {
                    s1 = s.split(",");
                    StringBuffer stringBuffer1 = getDir(s1);
                    System.out.println(stringBuffer1.length());
                    if (stringBuffer1.length()==0){
                        s1= new String[]{};
                        break;
                    }
                    stringBuffer.delete(0, stringBuffer.length());
                    stringBuffer.append(stringBuffer1);
                    String s3 = String.valueOf(stringBuffer1);
                    s2 = s3.split(",");
                    if (s2.length == s1.length) {
                        break;
                    }
                } else {
                    s1 = s.split(",");
                    break;
                }


            }
            //return s1;
        }
        return s1;
    }

    public static StringBuffer getDir(String[] arr) {
        StringBuffer stringBuffer = new StringBuffer();
        System.out.println(arr.length);
        //stringBuffer.append(arr[0]);
        if (arr.length == 2) {
            System.out.println(arr[0]);
            System.out.println(arr[1]);
            if (arr[0].equals("NORTH")) {
                if (!arr[1].equals("SOUTH")) {
                    stringBuffer.append(arr[0]);
                    stringBuffer.append(",");
                }
            } else if (arr[0].equals("SOUTH")) {
                if (!arr[1].equals("NORTH")) {
                    stringBuffer.append(arr[1]);
                    stringBuffer.append(",");
                }
            } else if (arr[0].equals("WEST")) {
                if (!arr[1].equals("EAST")) {
                    stringBuffer.append(arr[0]);
                    stringBuffer.append(",");
                }
            } else if (arr[0].equals("EAST")) {
                if (!arr[1].equals("WEST")) {
                    stringBuffer.append(arr[0]);
                    stringBuffer.append(",");
                }

            }
        } else {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i-1].equals("NORTH")) {
                    if (!arr[i].equals("SOUTH")) {
                        stringBuffer.append(arr[i]);
                        stringBuffer.append(",");
                    } else {
                        stringBuffer.delete(stringBuffer.length()-5,stringBuffer.length());
                        i++;
                    }
                } else if (arr[i - 1].equals("SOUTH")) {
                    if (!arr[i].equals("NORTH")) {
                        stringBuffer.append(arr[i]);
                        stringBuffer.append(",");
                    } else {
                        stringBuffer.delete(stringBuffer.length()-5,stringBuffer.length());
                        i++;
                    }
                } else if (arr[i - 1].equals("WEST")) {
                    if (!arr[i].equals("EAST")) {
                        stringBuffer.append(arr[i]);
                        stringBuffer.append(",");
                    } else {
                        stringBuffer.delete(stringBuffer.length()-4,stringBuffer.length());
                        i++;
                    }
                } else if (arr[i - 1].equals("EAST")) {
                    if (!arr[i].equals("WEST")) {
                        stringBuffer.append(arr[i]);
                        stringBuffer.append(",");
                    } else {
                        stringBuffer.delete(stringBuffer.length()-4,stringBuffer.length());
                        i++;
                    }
                }
            }
            //stringBuffer.append(arr[arr.length - 1]);
            //return stringBuffer;
        }
        return stringBuffer;
    }
}