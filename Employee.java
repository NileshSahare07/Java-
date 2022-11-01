
/* Defining Employee class*/
class Employee{
	
	  //data fields
	private int empId=0;
	private String empName;
	private float empSalary;
	
	//method
	//setter method,mutators
	 public void setEmpId(int id){
		empId=id;//data writing
	}
	
       //getter method, inspectors
	 public int getEmpId(){
		return empId;//data reading
	 }
	   //setter method,mutators
	 public void setEmpName(String name){
		empName=name;
	 }
	    //getter method,inspectors
	  public String getEmpName(){
		return empName;
	  }
	   //setter method,mutators
	 public void setEmpSalary(float salary){
		empSalary=salary;
	 }
	    //getter method,inspectors
	  public float getEmpSalary(){
		return empSalary;
	  }	 
}   // End of Employee class


    // EmployeeMain class
  class EmployeeMain{
	  
	  public static void main(String[]args){
		  //creating object of Employee type
		Employee emp;// decln
		emp=new Employee();//initoalization
		
		int id=emp.getEmpId();//method calling, data reading
		String name=emp.getEmpName();//method calling
		float salary=emp.getEmpId();//method calling
		  
		  
		  System.out.printf("ID:%d\tName:%s\tSalary:%f\n",id,name,salary);
	  
	      emp.setEmpId(1000);//method calling,data writing
		  emp.setEmpName("Nilesh");
		  emp.setEmpSalary(1000000.0f);
	      System.out.print("\tID:"+emp.getEmpId());//1000
	      System.out.print("\tName:"+emp.getEmpName());//Nilesh
	      System.out.print("\tSalary:"+emp.getEmpSalary());//10000000
	  }  
	  
  }

