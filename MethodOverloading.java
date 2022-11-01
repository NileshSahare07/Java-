/* 
working with method overloadingverloading
*/

class MethodOverLoadTest{
	
	public int addValues(int x,int y){
		return x+y; //int
	}
	public int addValues(int x,int y,int z){  //case-1
	     return x+y+z; //int
	}
	 public float addValues(float x,float y){  //case-2
		return x+y; //float
    }
	 public float addValues(int x,float y){
		return x+y; //float	 
	}
		 public float addValues(float x,int y){  //case-3
		return x+y; //float	 
	}	 
			 
   }


	class MethodOverLoadMain{
		
		public static void main (String[]args){
			
		MethodOverLoadTest obj=new MethodOverLoadTest();
         int result=obj.addValues(20,20);
         System.out.println("result:"+result);
		 
		 result=obj.addValues(20,20,40);
         System.out.println("result:"+result);
		 
		 System.out.println("result:"+obj.addValues(30.4f,50.5f));
		 System.out.println("result:"+obj.addValues(30.4f,50));
         System.out.println("result:"+obj.addValues(30.4f,50.5f));

		 //static binding
		 //early binding
		 //compile time polymorphism
		 //System.out.println("result:"+obj.addValues(30.4f,50.5f,50)); invalid

		 
		}
	}