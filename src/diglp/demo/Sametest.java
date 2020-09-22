import java.util.Random;
import java.util.Scanner;

public class Sametest{

    public static void main(String[] args){
        System.out.println("这是一个大数相加的计算器，因此你能输入比较长的正整数！");
        long start = System.currentTimeMillis();
        int n= 100;
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
            plus(n1,n2,s);
            for (int i=0;i<s.length;i++){
                System.out.print(s[i]);
            }
            System.out.println();

        }

        long end = System.currentTimeMillis();

        System.out.println("运行时间：" + (end-start));

    }

    public static void plus(int[] n1, int[] n2,int[] sum){
        int position = n1.length-1;
        int carry = 0;
        while (position>=0){
            int total = n1[position] + n2[position] + carry;
            if (total > 9){
                sum[position+1] = total -10;
                carry = 1;
            }
            else {
                sum[position+1] = total;
                carry = 0;
            }
            position--;
        }
        sum[0] = carry;
    }

    public static String getRandomString(int length){
        String str="123456789";
        Random random=new Random();
        StringBuffer s=new StringBuffer();
        for(int i=0;i<length;i++){
            int number=random.nextInt(9);
            s.append(str.charAt(number));
        }
        return s.toString();
    }


    public static  int maxstr(int a ,int b){
        int m = 0;
        if(a>b) m =a;
        else  m = b;

        return  m;

    }

}
