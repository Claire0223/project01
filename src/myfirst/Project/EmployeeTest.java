package myfirst.Project;
import java.io.*;
public class EmployeeTest {
    public static void main(String[] args){
        //使用构造器创建两个对象
        practice01 empOne=new practice01("xiaoming");
        practice01 emptwo=new practice01("xiaohuang");

        //调用这两个对象的成员方法
        empOne.empAge(26);
        empOne.emDesignation("高级程序员");
        empOne.emSalary(32000);
        empOne.printEmployee();

        emptwo.empAge(21);
        emptwo.emDesignation("初级程序员");
        emptwo.emSalary(12000);
        emptwo.printEmployee();
    }
}
