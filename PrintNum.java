package com.tulun.course;

import java.util.Scanner;


public class PrintNum {

     public static int printLevel(int level,int num){//判断输入几位数

         if(  num/100000>=1||num<=0)
             return  0;

         if(num/10000>=1)
             level=5;
         else if(num/1000>=1)
             level=4;
         else if (num/100>=1)
             level=3;
         else if(num/10>=1)
             level=2;
         else level=1;

         return level;
     }

     public static void printPerPosit(int num,int arr[],int temp){
         //将原数各位倒序存放在arr[]中，打印各位，倒序打印皆可以
     int num2=num;
     int m=0,i=0;
     while(num2!=0){
         m=num2%10;
         arr[i]=m;
         i++;
         num2=num2/10;
     }

     }

    public static void main(String[] args) {
         int level = 0;//位数
         int temp=0;//用来暂存printNum返回值
         int arr[]=new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个不多于五位的数：");
        int num =scanner.nextInt();

        temp=printLevel(level,num);//判断位数
        if(temp==0) {
            System.out.println("你的输入有误");
            return;
        }
        else
            System.out.println("你输入的是"+temp+"位数");

        printPerPosit(num,arr,temp);//调用按位输出函数
        System.out.print("原数按位输出为：");
        for (int i=temp-1;i>=0;i--)
           System.out.printf(arr[i]+"  ");

        System.out.print("按逆序输出各位数字为：");
        for(int i=0;i<temp;i++){
            System.out.printf(arr[i]+"  ");
        }


    }


}
