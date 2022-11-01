/* method overriding /runtime polymorphism*/


class MyBase{
	public void display(){
		System.out.println("Display from message");
		
	}
}
class Derive extends MyBase {
	public void show(){
		
		System.out.println("show from Derive!!!");
    }
//method overriding 
	public void display(){
		
		System.out.println("Display from Derive");
	
	  }
	}
	
	

class Derive2 extends MyBase {
	//method overriding 
	public void display(){
		System.out.println("Display from Derive2");
	}	
}
class InheritanceDemo2{
	public static void main(String[]args){
		Derive derive=new Derive();
		derive.display();
		MyBase mybaseobj=derive;//upcasting
		mybaseobj.display();//display from derive
		MyBase mybaseobj2=new MyBase();
		mybaseobj2.display();
		
		mybaseobj=new Derive2();
		mybaseobj.display();
		
	}
}
