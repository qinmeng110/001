package java练习题;

import java.util.Scanner;

public class 分解整数{
	static void fun(int i){
		int j,k;
		k=i;
		for(j=2;j<i;j++){
			if(i%j==0){
				System.out.print(j);
				i=i/j;
				j=j-1;//如果不能整除一个较小的数，则整除一个大的数后也不能除较小的，所以不必从头开始
				System.out.print("*");
			}
		}
		if(j==k)System.out.print(1+"*");
		System.out.println(j);
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		fun(x);
	}

}
