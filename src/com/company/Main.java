package com.company;


import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {

    public static void main(String[] args) {

        for (int n = 1000; n < 100000; n += 10000 ) {

            SimpleDateFormat sdfDate = new SimpleDateFormat("HH:mm:ss.SSSS.SSSSS");//dd/MM/yyyy
            Date now = new Date();
            String strDate = sdfDate.format(now);
            System.out.println(strDate);


            int data[] = new int[n];

            System.out.println(Arrays.toString(data));


            SimpleDateFormat sdfDate2 = new SimpleDateFormat("HH:mm:ss.SSSS.SSSSS");//dd/MM/yyyy
            Date now2 = new Date();
            String strDate2 = sdfDate2.format(now2);
            System.out.println(strDate2);

        }





    }

}
