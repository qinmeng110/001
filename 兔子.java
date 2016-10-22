package javaÁ·Ï°Ìâ;

public class ÍÃ×Ó {
	static int count;
 static int fun(int m){
		if(m==1||m==2) return 1;
		count=fun(m-1)+fun(m-2);
		return count;
	}
public  static void main(String agr[]){
	System.out.println(fun(7));
}
}
