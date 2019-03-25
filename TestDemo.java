package com.tulun.course;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Random;
import java.util.Scanner;
import java.math.*;

import static java.lang.Math.pow;
import static java.lang.Math.scalb;
import static java.lang.Math.sqrt;

public class TestDemo{


    public static void GetSushu(){
        System.out.println("素数为");
        int temp=0;
        for(int j=2;j<=100;j++) {
            boolean pd=true;
            for (int i = 2; i <j; i++) {
                temp = j % i;
                if (temp == 0 ) {
                    pd=false;
                    break;
                }
            }
            if (pd==true)
                System.out.println(j);
        }
    }

    public static double getSum(){
        double result=1;
       for(int i=2;i<=100;i++){
           if(i%2==0){
               result+=1.0/i;
           }
           else{
               result=result-1.0/i;
           }
       }
        return result;
    }
    public static  void menu(){
        System.out.println("1.登录");
        System.out.println(" 2.注册");
        System.out.println(" 3.退出");

    }


     public static boolean login(boolean judge,int id[]){


        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for(int i=0;i<id.length;i++){
            if(x==id[i])
                judge = true;
        }
        return judge;
     }

     public  static boolean register(int id[],int size,boolean judge){
        judge = true;
        Scanner scanner=new Scanner(System.in);
        int ID =scanner.nextInt();
        for(int i=0;i<=size;i++) {
            if ( ID== id[i]) {
                judge = false;
                break;
            }
        }
         if(judge){
             id[size] = ID;
         }

        return judge;
     }
    public static void main(String[] args) {
        // GetSushu();
        //double result = getSum();
        //System.out.println(result);

        final  int MAXSIZE = 10;
        int []id=new int[MAXSIZE];
        int size = 0;
        boolean judge = false;
        Scanner scanner = new Scanner(System.in);

        int select = 1;
       while(true) {
           menu();
           select = scanner.nextInt();
           switch (select) {
               case 1: {
                   System.out.println("请输入");

                   judge = login(judge,id);
                   if(judge){
                       System.out.println("登录成功");
                   }else
                       System.out.println("登录失败，请注册：");
                   break;
               }
               case 2: {
                   System.out.println("请输入账号");
                    judge = register(id,size,judge);
                    if (judge){
                        size++;
                        System.out.println("注册成功，请登录");
                    }else
                        System.out.println("注册失败");

                   break;
               }
               case 3: {
                   return;
               }
           }
       }
    }

}
