package com.Practice;
import java.io.*;

public class IOPractice {
    public static void main(String[] args)throws IOException{
        File f=new File("text.txt");
        FileOutputStream fop=new FileOutputStream(f);
        OutputStreamWriter ops=new OutputStreamWriter(fop,"utf-8");
        ops.append("中文输入");//写入到缓冲区
        ops.append("\r\n");
        ops.append("English");//刷新缓冲区,写入内容
        ops.close();
        fop.close();

        FileInputStream fip=new FileInputStream(f);
        InputStreamReader ip=new InputStreamReader(fip,"utf-8");
        StringBuffer sb=new StringBuffer();
        while(ip.ready()){
            sb.append((char)ip.read());//转成char加到StringBuffer对象中
        }
        System.out.println(sb.toString());
        ip.close();
        fip.close();
    }
}
