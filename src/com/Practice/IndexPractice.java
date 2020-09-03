package com.Practice;

/*
有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子对数为多少？
斐波那契数列:x>1后，x=sum（x-1）+sum（x-2）
程序分析： 兔子的规律为数列1,1,2,3,5,8,13,21....
* */

public class IndexPractice {
    public static void main(String[] args){
        for(int i=1;i<13;i++)
        System.out.println("第"+i+"个月，兔子总数为"+sum(i));

    }
    private static int sum(int num){
        if(num ==1||num==2)
            return 1;
        else
            return sum(num-1)+sum(num-2);
    }

}

