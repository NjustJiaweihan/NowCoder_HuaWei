package cn.deepblog;

import java.util.Scanner;

public class Main1 {
    private static String add(String num1, String num2)
    {
        String res;

        int pointIndex1 = 0;
        for(int i=0; i<num1.length(); i++){

            if(num1.charAt(i) == '.'){

                pointIndex1 = i;
                break;
            }
        }

        int pointIndex2 = 0;
        for(int i=0; i<num2.length(); i++){

            if(num2.charAt(i) == '.'){

                pointIndex2 = i;
                break;
            }
        }

        if(pointIndex1 == 0 && pointIndex2 == 0){

            String[] sb = addTwo(num1, num2);
            res = sb[1].equals("1") ? "1"+sb[0] : sb[0];

        } else if(pointIndex1 == 0 && pointIndex2 > 0){

            String[] sb = addTwo(num1, num2.substring(0, pointIndex2));
            String IntegerRes = sb[1].equals("1") ? "1"+sb[0] : sb[0];
            res = IntegerRes+ num2.substring(pointIndex2);

        } else if(pointIndex1 > 0 && pointIndex2 == 0){

            String[] sb = addTwo(num1.substring(0, pointIndex1), num2);
            String IntegerRes = sb[1].equals("1") ? "1"+sb[0] : sb[0];
            res = IntegerRes + num1.substring(pointIndex1);

        } else {

            String[] sb1 = addTwo(num1.substring(0, pointIndex1), num2.substring(0, pointIndex2));
            String[] sb2 = addTwo(num1.substring(pointIndex1+1), num2.substring(pointIndex2+1));

            String IntegerRes = sb1[1].equals("1") ? "1"+sb1[0] : sb1[0];

            String smallRes = sb2[0];

            if(sb2[1].equals("1")){

                IntegerRes = addTwo(IntegerRes, "1")[0];
            }

            res = checkAllZero(smallRes) ? IntegerRes : IntegerRes + "." + smallRes;
        }

        return res;
    }

    private static String[] addTwo(String s1, String s2){

        int len1 = s1.length();

        int len2 = s2.length();

        if(len1 < len2){

            for(int i=0; i<len2-len1; i++){

                s1 = "0" + s1;
            }
        } else {

            for(int i=0; i<len1-len2; i++){

                s2 = "0" + s2;
            }
        }

        int[] result = new int[s1.length()];
        boolean flag = false;

        for(int j=s1.length()-1; j>=0; j--){

            result[j] = (s1.charAt(j)-'0' + s2.charAt(j)-'0');

            if(flag){
                result[j]++;
                flag = false;
            }

            if(result[j] > 9){

                result[j] = result[j] - 10;
                flag = true;
            }
        }

        String[] s = new String[2];
        //计算结果    最终进位
        s[0] = ""; s[1] = "";
        for(int i=0; i<s1.length(); i++){

            s[0] += result[i];
        }

        if(flag){

            s[1] = "1";
        }
        return s;
    }

    //是否全零
    private static boolean checkAllZero(String s){

        for(int i=0; i<s.length(); i++){

            if(s.charAt(i) != '0'){
                return false;
            }
        }
        return true;
    }
    // please don't modify any code below.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String num1 = sc.nextLine();
        String num2 = sc.nextLine();

        String sum = add(num1,num2);
        System.out.println(sum);
    }
}
