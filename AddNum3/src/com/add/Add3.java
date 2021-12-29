package com.add;

import java.util.Scanner;

public class Add3 {
	
	public static void main(String[] args) {

        // 5696..... 
        // 8929... 1000 * 8 + 9 * 100 + 2* 10 + 9 * 1

        // 5696...

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int p = 1;
        int res =0;
        for(int r=0; n != 0 ;) {

            r = n % 10;// 5696 % 10....6
            n = n /10; // 569... 56 5 0
            r = r+3;
            r = r % 10;// 10 % 10 ===0
            //if(r >= 10) {
                //r = r - 10;// 9+3=12-10=2
                //r = r % 10;// 12 % 10===2
        //    }
            res = res + r * p;
            p = p* 10;

        }

        System.out.println("result...."+res);/// 
        // 5678
        //8901
    }
 
}

