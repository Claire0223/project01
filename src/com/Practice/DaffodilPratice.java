package com.Practice;
/*打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
* 100-1000之间有哪些水仙花数。*/
public class DaffodilPratice {
    public static void main(String[] args) {
        int count=0;
        for (int i = 100; i < 1000; i++) {
            if (isDaffodil(i)) {
                count++;
                System.out.println(i + "是水仙花数.");
            }

        }
        System.out.println("一共"+count+"个水仙花数.");
    }

    private static boolean isDaffodil(int num) {
        //"/"取整数部分，“%”取余数部分
        int x = num / 100; //百数位
        int y = num % 100 / 10;//十数位
        int z = num % 100 % 10;//个数位

        int sum=x*x*x+y*y*y+z*z*z;
        if(sum==num)
            return true;
        else
            return false;

    }
}
