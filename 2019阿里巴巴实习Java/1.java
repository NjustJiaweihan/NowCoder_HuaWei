
package com.njust.project;



import java.io.*;

import java.lang.reflect.Array;

import java.util.*;

import java.text.*;

import java.math.*;

import java.util.regex.*;



public class Zadd {



/** 请完成下面这个函数，实现题目要求的功能 **/

    /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/

    static String calculate(int m, int k) {

        int[] ans = new int[m+1];

        String[] reverseAns = new String[m+1];

        reverseAns[0] = "";

        int[] result = new int[m+1];

        StringBuffer s = new StringBuffer();

        for(int i=1; i<ans.length; i++)

        {

            ans[i] = func(i+1);

            reverseAns[i] = reverse(ans[i] + "");

        }

        for(int i=1; i<reverseAns.length; i++)

        {

            result[i] = Integer.parseInt(reverseAns[i]);

        }

        Arrays.sort(result);

        s.append(ans[m]);

        s.append(",");

        s.append(m-k);



        return s.toString();

    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] line = in.nextLine().split(",");

        int m = Integer.valueOf(line[0]);

        int k = Integer.valueOf(line[1]);

        ;

        System.out.println(calculate(m, k));



        List<Integer> list = new ArrayList<>();

        List<Pig> list1 = new ArrayList<>();

        list.add(2);

        list.add(3);

        list.add(4);



        Pig pig = new Pig();

        pig.birthyear = 2019;

        pig.number = 2;

        pig.year = 3;

        list1.add(pig);



        pig = new Pig();

        pig.birthyear = 2019;

        pig.number = 3;

        pig.year = 0;

        list1.add(pig);


        for (int i = 1; i < m - 2; i++) {

            list.add(list.get(i) + list.get(i - 1));

        }

        int year = 0;

        int birthyear = 2020;

        while (m > list1.size()) {

            int size = list1.size();

            for (int i = 0; i < size; i++) {

                list1.get(i).year += 1;

            }

            for (int i = 0; i < size; i++) {

                if (list1.get(i).year >= 2) {

                    Pig pig1 = new Pig();

                    pig1.year = 0;

                    pig1.birthyear = birthyear;

                    list1.add(pig1);

                }

            }

            birthyear++;

        }

        System.out.print(","+list1.get(m - 1).birthyear);

        /// System.out.println(calculate(m, k));

    }

        public static class Pig{

            public int birthyear;

            public int year;

            public int number;

        }

    public static int func(int m)

    {

        //int[] ans = new int[m];

        if(m <= 0)

        {

            return -1;

        }

        if(m <= 5)

        {

            return m;

        }
        return func(m-2) + func(m-3);
    }

    public static String reverse(String m)
    {
        String t = m + "";

        StringBuffer s = new StringBuffer();

        for(int i=t.length()-1;i>=0; i--)
        {
            s.append(t.charAt(i));
        }
        return s.toString();
    }
}
