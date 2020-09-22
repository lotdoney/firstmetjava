import com.sun.javafx.tools.ant.CSSToBinTask;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;
import java.util.Random;

/**
 * 第二次练习，使用的java做一些小算法
 *
 */

//在一定范围找数字,使用二分查找
/*
public  class  SecondStu{

    public static int turns(int n,int low,int high){
        int turns = 0;

        while (low <= high){
            turns++;
            int mid = (low + high)/2;

            System.out.println("第" + turns + "次 low的数值为：" + low +"\t" + "high的" +
                    "数值为：" + high + "\t" + "mid的数值：" + mid );

            if(mid == n){
                return turns;
            }
            else if (n<mid){
                high = mid-1;
            }
            else
                low = mid+1;
        }
        return  turns;
    }

    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        System.out.print("请输入1——100的范围内的数字：");
        int num = input.nextInt();
        long start = System.currentTimeMillis();
        int time = turns(num,1,1000000);
        long end = System.currentTimeMillis();
        System.out.println("哈哈一共查找了" + time + "次");
        System.out.println("使用的时间是：" + (end - start));
        }


    }
*/

//相加算法——大数相加，思考一个问题，同样是大数相加的算法，add和plus哪个更快呢
public class SecondStu{

    public static void main(String[] args){
        System.out.println("这是一个大数相加的计算器，因此你能输入比较长的正整数！");
        long start = System.currentTimeMillis();
        int n = 10000;
        while (--n>0){
            Scanner input = new Scanner(System.in);
            System.out.print("第一个数字：");
            //String str1 = input.nextLine();
            String str1 =getRandomString(2000);
            System.out.println(str1);
            System.out.print("第二个数字：");
            //String str2 = input.nextLine();
            String str2 =getRandomString(2000);
            System.out.println(str2);

            int size1 = str1.length() ;
            int size2 = str2.length() ;
            //根据两个字符串的长度，创建符合最长的字符串的数组
            int leng = maxstr(size1 ,size2);


            int[] n1 = new int[leng];
            int temp = leng-1;
            for(int i = size1 ;i > 0 ;i--){
                int b = str1.charAt(i-1) - 48;
                n1[temp--] = b ;
            }

            int[] n2 = new int[leng];
            int temp1 = leng -1;
            for(int i = size2 ;i > 0;i--){
                int b = str2.charAt(i-1) - 48;
                n2[temp1--] = b ;
            }

            int[] s = new int[leng+1];
            add(n1,n2,s);
            for (int i=0;i<s.length;i++){
                System.out.print(s[i]);
            }
            System.out.println();



        }

        long end = System.currentTimeMillis();

        System.out.println("运行时间：" + (end-start));

    }

    public static void add(int[] n1 , int[] n2, int[] sum){
        int position = n1.length -1;
        int carry = 0;
        while (position >= 0){
            int total  = n1[position] + n2[position] + carry;
            sum[position+1] = total % 10;
            if (total > 9) carry =1;
            else  carry = 0;
            position -- ;
        }
        sum[0] = carry;

    }


    public static String getRandomString(int length){
        String str="123456789";
        Random random=new Random();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<length;i++){
            int number=random.nextInt(9);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }


    public static  int maxstr(int a ,int b){
        int m = 0;
        if(a>b) m =a;
        else  m = b;

        return  m;

    }

}