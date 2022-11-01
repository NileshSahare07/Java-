 /*
   2. Create an abstract class with name Player. The class should have play(),
  pause(), and stop() methods. Inherit the class in another class
  named GenericPlayer. The GenericPlayer can play .avi and .dat files.
 Derive another class from GenericPlayer named DVDPlayer. This class
 can play .mpg file also.
 Define display method on the derived objects to test the functionality
 */

abstract class Player{
	
	public abstract void play();//abstract method
	public abstract void pause();
	public abstract void stop();
	
}
class Genericplayer extends Player{
	//method overriding
	
		public String abcavi;
		public String abcdat;
		public void play(){
			System.out.println("play music");
		}
		
            public void pause(){
			System.out.println("pause music");
		}
             public void stop(){
			System.out.println("stop music");
		}
//method overriding
          public void display(){
		System.out.println("abcavi and abcdat the music");
	
}
}
 class DVDPlayer extends Genericplayer{
	//method overriding
	public String abcmpg;
	public void play(){
	 System.out.println("play the music");
		
}
     public void pause(){
			System.out.println("pause music");
		}
       public void stop(){
			System.out.println("stop music");
		}

//method overriding
public void display(){
		System.out.println("abcmpg the music");
	
}
}
class AbstractPlayerMain{
	
	public static void main(String[]args){
		
		Genericplayer p=new Genericplayer();
		p.play();
		p.pause();
		p.stop();
		p.display();
		
		
		DVDPlayer d=new DVDPlayer();
		d.play();
		d.pause();
		d.stop();
		d.display();
		
	}
	
}