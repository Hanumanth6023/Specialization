package com.add;

public class hi {
	public static void main(String[] args) {
		final StringBuffer a= new StringBuffer();
		final StringBuffer b= new StringBuffer();


		new Thread()
		{
			public void run() {
				System.out.print(a.append("A"));
				synchronized(b)
				{
					System.out.print(b.append("B"));
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				System.out.print(b.append("C"));
				synchronized(b)
				{
					System.out.print(a.append("D"));
				}
			}
		}.start();
}
}