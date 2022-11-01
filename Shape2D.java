/*
Create the Shape class hierarchy of classes, in which the super class Shape 
would be an abstract class and two other classes Shape2D and Shape3D are also 
abstract, and other classes in hierarchy i.e. sub classes of Shape2D, Circle & 
Rectangle as well as subclasses of Shape3D, Sphere & Cuboid are concrete 
classes.
The entire Shape class hierarchy is represented as follows:
Consider applicable & suitable input parameters for each concrete class. Then 
display all calculated parameters (for example, for Rectangle area and perimeter) 
of each concrete 2D as well as 3D shapes. Test all classes by writing main method
*/

abstract class ShapeMain{
	
	public float area;
	public float perimeter;
	public float volume;
	public static float pi=3.14f;
	
	public abstract void rec(int length,int breadth);
	public abstract void cir(int radius);
	public abstract void cub(int length, int breadth, int height);
	abstract void display ();
	abstract void display1();
		
}
abstract class Shape2D extends Shape{
	public abstract void rec(int length,int breadth);
	public abstract void cir(int radius);
	public abstract void cub(int length, int breadth, int height);
	abstract void display ();
	abstract void display1();
}
class Rectangle extends Shape2D{
	
	public void rec(int length,int breadth){
		area=(length*breadth);
		perimeter=2*(length+breadth);
		
	}
	void display(){
		System.out.println("area of rectangle is:"+area);
		
	}
    void display1(){
		System.out.println("Perimeter of rectangle is:"+perimeter);
		
	}
	
	class circle extends Shape2D{
		public void cir(int radius){
			area=pi*(radius*radius);
			perimeter=2*pi*radius;
		}
	void display(){
		System.out.println("area of circle is:"+area);
		
	}
    void display1(){
		System.out.println("Perimeter of circle is:"+perimeter);
		
	}
	
	 }
	 
	 abstract class Shape3D extends Shape{
		 public abstract void rec(int length,int breadth){}
	     public abstract void cir(int radius){}
	     public abstract void cub(int length, int breadth){}
	     abstract void display();
	     abstract void display1();
}
  class Sphere extends Shape3D{
	  public void cir(int radius){
		  area=4*pi*radius*radius;
		  volume=4/3*(pi*radius*radius*radius);
		  }
        void display(){
		System.out.println("area of sphere is:"+area);
		
	}
        void display1(){
		System.out.println("volume of sphere is:"+volume);
		
	}
  }
class Cuboid extends Shape3D{
	 public void cub(int l, int b, int h){
		  area=2*(l*b + b*h + l*h);
		  volume=l*b*h;
		  }
        void display(){
		System.out.println("area of cuboiod is:"+area);
		
	}
        void display1(){
		System.out.println("volume of cuboid is:"+volume);
		
	}
}
public class ShapeMain{
	public static void main(String[]args)
	{
	   Shape obj=new Rectangle();
		obj.rec(4,6);
		obj.display();
		obj.display1();
		
       Shape obj1=new Circle();
		obj1.cir(8);
		obj1.display();
		obj1.display1();
		
		Shape obj2=new Sphere();
		obj2.spr(3);
		obj2.display();
		obj2.display1();
		
       Shape obj3=new Cuboid();
		obj3.cub(2,3,4);
		obj3.display();
		obj3.display1();
	
	}
}
 