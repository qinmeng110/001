package java��ϰ��;

import java.util.Scanner;

public class �ֽ�����{
	static void fun(int i){
		int j,k;
		k=i;
		for(j=2;j<i;j++){
			if(i%j==0){
				System.out.print(j);
				i=i/j;
				j=j-1;//�����������һ����С������������һ���������Ҳ���ܳ���С�ģ����Բ��ش�ͷ��ʼ
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
