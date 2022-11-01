
//Product class
class Product{
	//data fields
	
    private int pId;
    private String pName;
    private float pPrice;
    private String pBrand;
    //methods, mutator
	public void setProductData(int pId,String pName,float pPrice,String pBrand)
	{
		//formal arguments
		
		this.pId=pId;
		this.pName=pName;
		this.pPrice=pPrice;
		this.pBrand=pBrand;
		
	}
      public void displayProductDetails(){
		  
		  System.out.println("Product Details:");
	      System.out.printf("ID:%d\tBrand:%s\tName:%s\tPrice:\n",pId,pBrand,pName,pPrice);  
	  
	}


}//end of product class

class ProductAppMain{
	
	public static void main(String[]args){
		
		Product p1=new Product();
		p1.setProductData(100,"Mobile",9999.0f,"Motorola");//actual arguments
        p1.displayProductDetails();
		
		Product p2=p1;
		Product p3=p1;
		
		p2.displayProductDetails();//100
		
		p2.setProductData(200,"Laptop",24599.0f,"Acer");
		
		p1.displayProductDetails();//100,200
		p2.displayProductDetails();//200
		p3.displayProductDetails();//200
		
	
		
		}
}