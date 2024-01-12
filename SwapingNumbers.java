package test2;
public class SwapingNumbers{
	
	public static void main (String[]args) {
	int a=10,b=20,c=30,d=40;
	
	a=a+b+c+d;
	b=a-b-c-d;
	c=a-b-c-d;
	d=a-b-c-d;
	a=a-b-c-d;

	System.out.println(a+"\n"+b+"\n"+c+"\n"+d);
	}
	
}