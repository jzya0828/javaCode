package com.tulun.course;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Scanner;

public class TestDemo {



    public  static boolean login(int ID[],int id,int size){

        for(int i = 0; i<size; i++){
            if(ID[i]==id){
                return true;
            }
        }
        return false;
    }

    public static boolean register(int ID[],int id,int size){
        for(int i=0;i<size;i++){
            if (ID[i]==id){
                return false;
            }
        }
        ID[size]=id;
        return true;
    }

    public static boolean logOf(int ID[],int id,int size){
        for(int i=0;i<size;i++){
            if( id == ID[i]){
                for(int j=i;j<size-1;j++){
                    ID[j]=ID[j+1];
                }
                ID[size-1]=0;
                return true;
            }
        }
        return false;
    }










    public static void main(String[] args) {
        final int MAXSIZE = 3;
        int ID[] = new int[MAXSIZE];
        int size = 0;
        while(true){
            System.out.println("1login 2register 3logof 4exit");
            Scanner scanner = new Scanner(System.in);
            int select = scanner.nextInt();
            if(select == 4)
                return;

            System.out.println("please input your account");
            int id = scanner.nextInt();

            switch (select){
                case 1:{
                    if (login(ID,id,size)) {
                        System.out.println("login success");
                    } else{
                        System.out.println("login fail");
                    }
                    break;
                }
                case 2:{
                    if (register(ID,id,size)){
                        System.out.println("register success");
                        size++;
                    }else {
                        System.out.println("register fail");
                    }
                    break;
                }
                case 3:{
                    if(logOf(ID,id,size)){
                        System.out.println("delete success");
                    }else {
                        System.out.println("delete fail");
                    }
                    break;
                }
                default:System.out.println("the choice you input is wrong");
            }
        }

    }
}
