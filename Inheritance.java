/* inheritance */


class MyBase{
	
	public void display(){//protected - not accessible all other accesible
		
	System.out.println("Display from MyBase!!!");
	}
	
	
}
//inheriting MyBase in Derive
class Derive extends MyBase{
	
	public void show(){
		
	System.out.println("Show from Derive!!!");
	}	
}

class InheritanceDemo1{
	
   public static void main(String[]args){
	  /*
	  Derive derive=new Derive();
	   derive.display();
	   derive.show();  
   
        MyBase baseobj=new MyBase();
		baseobj.display();*/ 
		//baseobj.show();//invalid 
   
        MyBase mybaseobj2=new Derive();//upcasting, implicitly
		 mybaseobj2.display();
		// mybaseobj2.show();//invalid
		 
		 //Derive deriveobj=new MyBase();//invalid
		 // Derive deriveobj=mybaseobj2;//invalid
		 Derive deriveobj=(Derive)mybaseobj2;//downcasing,explicit
		 deriveobj.display();
		 deriveobj.show();
		 
		 System.out.println(mybaseobj2);
		 System.out.println(deriveobj);
         System.out.println(mybaseobj2.hashCode());
		 System.out.println(deriveobj.hashCode());
   
         System.out.println(mybaseobj2 instanceof MyBase);//keywords (instanceof)//true
		 System.out.println(deriveobj instanceof MyBase);//true
		 System.out.println(deriveobj instanceof Derive);//true
		 System.out.println(mybaseobj2 instanceof Derive);//true
		 
		 MyBase obj=new MyBase();
		 System.out.println(obj instanceof Derive);//false
		 
		 Derive derive=new Derive();
		  System.out.println(derive instanceof Derive);//true
	
		  System.out.println(derive instanceof MyBase);//true
		 
		 
		 
   }
   
}