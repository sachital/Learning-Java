package practice;

import java.util.Scanner;

public class evaluate {
    public static void main(String[] args) {
        Scanner sy = new Scanner(System.in);
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;
        
        double result = (f * b) + (i % c) - (d * s);
        System.out.println(result);
    }
    
}
