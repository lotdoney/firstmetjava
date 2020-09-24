package diglp.demo;




import java.util.Scanner;


/**
 * 2020.9.18
 * 第一次练习java——数据结构
 *数据类型综合小练习：整钱换零
 */

public class FirstStu{
    public  static  void main(String[] args){
       System.out.println('\t'+"整钱兑换零钱系统");
       System.out.println("************************************************");
       System.out.println("请输入需要兑换的钱，可兑换的有十元、五元、一元、五角和一角：");
       Scanner input = new Scanner(System.in);
       double sum = input.nextDouble();
       int money = (int)sum;
       int ten = money/10;
       int five = money%10/5;
       int one = money%10-5*five;
       //此语句可以直接写为：one = money % 10 - 5 ; 因为5的个数要么是0个要么是1个。
       double temp = sum - ten*10-five*5-one;
       System.out.println(temp);
       int  num = (int)((sum*10)%10); //如果使用sum - money会出现问题。
       //出现的小数可能不精准，这也是为什么需要换成整型，再去求小数部分
       int fivej = num / 5 ;
       int onej  = num % 5;
       System.out.println("需要十元：" + ten + "张");
       System.out.println("需要五元：" + five + "张");
       System.out.println("需要一元：" + one + "张");
       System.out.println("需要五角：" + fivej + "张");
       System.out.println("需要一角：" + onej + "张");

    }
}
