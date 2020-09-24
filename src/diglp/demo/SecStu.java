package diglp.demo;

import java.io.Console;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;

import static java.lang.Math.*;

public class SecStu {

    public static void main(String[] args){
        int sum = 0;
        int n = 1;
        while (n<=100){
            sum += n;
            n++;
        }
        System.out.println(sum);
    }
}