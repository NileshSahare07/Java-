/*
Final method */

//final class FinalTest
public class FinalTest{
	
	public static final int MAX=100;
	
	/*
	public  final void show(){
		System.out.println("show from finalTest");
		*/
		public  final void show(){
		System.out.println("show from finalTest");
		
	}
}
class Derive extends FinalTest{
	
	//invalid bcz parent show is final
	/*
	public void show(){
		System.out.println("show from Derive");
		*/
		/*
		public static void show(){
		System.out.println("show from Derive");
		*/
}

class FinalMain{
	public static void main(String[]args){
		
		System.out.println("MAX"+FinalTest.MAX);
		
	}
	
}