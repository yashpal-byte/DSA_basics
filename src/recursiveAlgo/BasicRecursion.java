package recursiveAlgo;

import java.util.Scanner;

public class BasicRecursion {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        BasicRecursion br = new BasicRecursion();
        System.out.println("Enter a number");
        int n = scn.nextInt();
        System.out.println(br.fact(n));
    }
    int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);

    }

}
