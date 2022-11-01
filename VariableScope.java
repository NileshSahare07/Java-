/* 
local-method level
instance/non-static- class level
class/static-class level
*/

class Test {
	public int id;//instance/non-static
	Test(){
		id=100;
	}
}

class VariableScopeTest{
	int x;//instance/non-static
	static int y;//class/static variable
	public void show(){
		int x;//local variable
		x=30;
		System.out.println("value of x local from show:"+x);
		System.out.println("value of class level x from show:"+this.x);
		System.out.println("value of class level y from show:"+VariableScopeTest.y);
	}
	//here x,y are local variable
	public void add(int x,int y){
		System.out.println("sum of "+x+" and "+y+" is:"+(x+y));
		
	}
	//here y Test are local variable
		public void display(int y, Test test){
			//formal argument
			y=y+20;
			test.id=test.id+30;
			System.out.println("value of y:"+y);
		    System.out.println("value of id:"+test.id);
		}
	}
	
	class VariableTestMain{
		public static void main(String[]args){
			VariableScopeTest obj=new VariableScopeTest();
            Test test=new Test();//100

            //obj.show();// here test and obj are aslo local variable
			//int num1=20,num2=30;//local variable
			//obj.add(num1,num2);
			//obj.x=60;
			//obj.y=80;
			//x=50; invalid
			//y=90; invalid
			//obj.show();
			VariableScopeTest obj=new VariableScopeTest();
            Test test=new Test();//100
			int number=10;
			System.out.println("value of number:"+number);
			System.out.println("value of id:"+test.id);
			obj.display(number,test);
			  //actual argument
			  System.out.println("value of number:"+number);
			  System.out.println("value of id:"+test.id);
			  
			  
		}
			
		}
	
