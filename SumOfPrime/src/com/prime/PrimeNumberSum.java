package com.prime;
import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumberSum {
public static void main(String[] args) {
	
int count=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter the range :");
ArrayList<Integer> a=new ArrayList();
int num1=s.nextInt();
int num2=s.nextInt();
for(int i=num1;i<=num2;i++)
{
if( isPrime(i) == true)
{
a.add(i);
count++;
}
}
count--;
System.out.println(a);
int sum=a.get(0)+a.get(count);
System.out.println(sum);
}
static boolean isPrime(int n)
{
boolean res = false;
int i;
for(i=2;(i<=n/2) && (n % i != 0);i++);
{
if (i > n / 2) {
res = true;
}
}
return res;
}
}