package java��ϰ��;

import java.util.Scanner;

public class ���Լ������С������ {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);//��ʼ
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
        System.out.println("���Լ��"+y);//���� ������Լ��
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
        	System.out.print("��С������"+sum);
	}

}
