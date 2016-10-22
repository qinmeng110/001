package java练习题;

import java.util.Scanner;

public class 最大公约数和最小公倍数 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);//开始
        int x=in.nextInt();
        int y=in.nextInt();
        if(x>y){int temp; temp=x;x=y;y=temp;}
        int m=x;
        int n=y;
        int i;
        while(true){
        	i=y%x;
        	y=x;
        	x=i;        	
        if(x==0) break;
        }
        System.out.println("最大公约数"+y);//结束 输出最大公约数
        System.out.println("-------------");
        int a[] = {0};
        int j=0;//
        	for(i=2;i<=m;i++){
        		if(m%i==0&&n%i==0){
        			a[j]=i;
        			j++;
        			m=m/i;n=n/i;i=i-1;
        		}
        	}
        	int sum=1;
        	for(j=0;a[j]!=0;j++){
        		sum=sum*a[j];
        	}
        	sum=sum*m*n;
        	System.out.print("最小公倍数"+sum);
	}

}
