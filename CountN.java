package com.tulun.course;

import java.io.StringReader;
import java.util.Scanner;

public class CountN {

    public static  int countN(){
        Scanner scanner = new Scanner(System.in);
        int a =scanner.nextInt();
        int n=scanner.nextInt();
        int i=1;
        String  a1=Integer.toString(a);
        int result = a;
        String temp = a1;
        while(i<n){
            temp+=a1;
            result=Integer.valueOf(temp)+result;
            i++;
        }
        return result;
    }

    public static void main(String []args){
        System.out.println("请输入a，n");
      System.out.println(countN());
    }
}
