/*
Create a class named SwapTest with a method name 
void swapValue(value1,value2) to swap values of type int,char,float ,double 
and string using method overloading
*/


class SwapTest{
	
	public void swapValues(int num1, int num2){
		
		System.out.printf("Before swap:num1:%d\tnum2:%d\n",num1,num2);
		int temp=num1;
		num1=num2;
		num2=temp;
		System.out.printf("After swap:num1:%d\tnum2:%d\n",num1,num2);
	}
	
	public void swapValues(char ch1, char ch2){

	    System.out.printf("Before swap:ch1:%c\tch2:%c\n",ch1,ch2);
	     char temp=ch1;
		 ch1=ch2;
		 ch2=temp;
		System.out.printf("After swap:ch1:%c\tch2:%c\n",ch1,ch2);
	}
	
	public void swapValues(float f1, float f2){

	    System.out.printf("Before swap:f1:%f\tf2:%f\n",f1,f2);
	     float temp=f1;
		 f1=f2;
		 f2=temp;
		System.out.printf("After swap:f1:%f\tf2:%f\n",f1,f2);
	}
	public void swapValues(double d1, double d2){

	    System.out.printf("Before swap:d1:%D\td2:%D\n",d1,d2);
	    double temp=d1;
		 d1=d2;
		 d2=temp;
		System.out.printf("After swap:d1:%D\td2:%D\n",d1,d2);
	}
	
	public void swapValues(String s1, String s2){

	    System.out.printf("Before swap:s1:%s\ts2:%s\n", s1,s2);
	     String temp=s1;
		 s1=s2;
		 s2=temp;
		System.out.printf("After swap:s1:%s\ts2:%s\n",s1,s2);
	}
}
	class SwapTestMain{
		
	public static void main(String[]args){
		
		SwapTest obj=new SwapTest();
	    obj.swapValues(20,30);//before swap-num1-20, num-30 ; after swap num1-30,num-20;
		obj.swapValues('a','b');//before swap-ch1-a , ch2-b ; after swap ch1-b,ch2-a;
		obj.swapValues(20.0f,52.3f);//before swap-f1-20.0, f2-52.3 ; after swap f1-52.3,f2-20.0;
		obj.swapValues(23564,65448);//before swap-d1-23564, d2-65448; swap-d1-65448, d2-23564;
		obj.swapValues("Nilesh","PGDAC");//before swap-s1-Nilesh, s2-PGDAC ; after swap S1-PGDAC, s2-Nilesh;	
	}
}
	
	
