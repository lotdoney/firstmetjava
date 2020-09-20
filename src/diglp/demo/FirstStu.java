package diglp.demo;

import com.sun.tools.javac.util.Log;
import com.sun.xml.internal.xsom.impl.scd.Step;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

/**
 * 2020.9.18
 * 第一次练习java——数据结构
 *
 */

public class FirstStu{
    public  static  void main(String[] args){
       System.out.println("这是一份信息收集，请填写你的信息：");
       Scanner input = new Scanner(System.in);
       System.out.print("姓名：");
       String name = input.nextLine();
       System.out.print("性别：");
       char type = input.next().charAt(0); //获得字符串的第一个字符
       System.out.print("年龄：");
       int age  = input.nextInt();

       System.out.println("你的信息为："+ name+ '\t'+ type+'\t'+age);
    }
}
