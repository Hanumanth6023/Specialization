package com.prime;

import java.util.Scanner;

public class PrimeSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        boolean isFirst = false;
        int firstPrimeNo=0;
        int lastPrimeNo=0;
        for(int i=n1;i<=n2;i++) {

            if( isPrime(i) == true) {

                if(isFirst == false) {
                    firstPrimeNo = i;
                    isFirst = true;
                }

                lastPrimeNo = i;

            }// if
    }// for

        System.out.println("Smalest prime No..."+firstPrimeNo+"....Biggest prime No..."+lastPrimeNo);

    }
 
    
    static boolean isPrime(int n){

        boolean res = false;
        int i;
        for(i=2;(i<=n/2) && (n % i != 0);i++);

        if(i>n/2) {
            res = true;
        }
        return res;
    }

}