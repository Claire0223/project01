package com.Practice;
//判断101-200之间有多少个素数，并输出所有素数。除以[2,x.sqrt],能整除是非素数，不能是素数
public class SushuPractice {
    public static void main(String[] args){
        int count=0;
        for(int i=101;i<201;i++){
            if (isPrime(i)){
                count++;
                System.out.println(i+"是素数.");
            }
            else {
                System.out.println(i+"不是素数.");
            }

        }
        System.out.println("101到200之间，一共有"+count+"个素数.");


    }
    //判断是否为素数
    private static boolean isPrime(int n){
        boolean flag=true;
        if(n==1)
            flag=false;
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if ((n % i) == 0) {
                    flag = false;
                    break;
                }
                else {
                    flag=true;
                }
            }
        }
        return flag;

    }
}
