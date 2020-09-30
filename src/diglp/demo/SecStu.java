//抽取随机数据数组的应用

package diglp.demo;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class SecStu{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("我们将从100个数字中抽取幸运观众！");
        int n = 100;
        System.out.println("请问抽出几名幸运观众？");
        int k = input.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i<n;i++){
            numbers[i] = i+1;
        }

        int[] result = new int[k];
        for (int i =0;i<k;i++){
            int r = (int)(Math.random()*n);
            result[i] = numbers[r];
            numbers[r] = numbers[n-1];
            n--;
        }

        Arrays.sort(result);
        System.out.println(Arrays.toString(result));

    }

}