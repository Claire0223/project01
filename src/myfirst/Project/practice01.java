package myfirst.Project;

/*public class practice01 <main>{
    public  static  void main(String[] args){
        System.out.print("hello world");
    }
}*/

import java.io.*;
public class practice01{
    String name;
    int age;
    String designation;
    double salary;

    //Employee类的构造器
    public practice01(String name){
        this.name=name;
    }
    //设置age的值
    public void empAge(int empAge){
        age=empAge;
    }
    //设置designation的值
    public void emDesignation(String empDesig){
        designation=empDesig;
    }
    //设置salary的值
    public void emSalary(double empSalary){
        salary=empSalary;
    }
    //打印信息
    public void printEmployee(){
        System.out.println("名字:"+ name );
        System.out.println("年龄:"+ age );
        System.out.println("职位:"+ designation );
        System.out.println("薪资:"+ salary );
    }

}