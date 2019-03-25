package com.tulun.course;

public class PrintSHUI {



    public static void printSHUI(int arr[],int size){
        boolean isSHUI = false;
        int high=0,meddle=0,low=0;//将3位数的3位分别提取出来
        int temp=0;
        for(int i=152;i<=999;i++){
            high=i/100;
            meddle=(i-high*100)/10;
            low=i-high*100-meddle*10;
            temp= (int) (Math.pow(high,3)+Math.pow(meddle,3)+Math.pow(low,3));
            if(i==temp){
                arr[size]=i;
                size++;
            }

        }
    }

    public static void main(String []args){
        System.out.println("输出所有水仙花数：");
        final  int MAXSIZE = 100;
        int arr[]=new int[MAXSIZE];
        int size = 0;
        printSHUI(arr,size);
        for(int i=0;i<MAXSIZE;i++){
            if(arr[i]!=0)
               System.out.println(arr[i]);
        }
    }
}
