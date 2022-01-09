package Employeelogin;

public class Employee {
	
	int id,Salary;
	String Name;
	
Employee(int id,String Name,int Salary){
	this.id=id;
	this.Name=Name;
	this.Salary=Salary;
}
	public void display() {
		System.out.println("Employee Id :" +id);
		System.out.println("Employee Name:" +Name);
		System.out.println("Employee Salary :" +Salary);
	}

}
