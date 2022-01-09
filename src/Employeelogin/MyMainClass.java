package Employeelogin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MyMainClass {
	
   ArrayList<Employee> List = new ArrayList<Employee>();

   void addEmployee(int id,String Name, int Salary){
	Employee emp = new Employee(id, Name, Salary); 
	List.add(emp);
	} 
   
  
   void displayEmpDetails(){
	Iterator<Employee> it = List.iterator();
	while(it.hasNext()){
		Employee temp = it.next();
		temp.display();
		}
	}
  
   void findEmployee(int id){
	Iterator<Employee> it=List.iterator();
	while(it.hasNext()){
		Employee temp = it.next();
		if(temp.id==id){
			temp.display();
		}
		}
	}
	public static void main(String[] args) {
		MyMainClass obj = new MyMainClass();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of Employee You want to Add :");
		int n = sc.nextInt();
		for(int i=1;i<=n; i++) {
			System.out.println("Enter Employee Id  ");
			int id = sc.nextInt();
			System.out.println("Enter Employee Name ");
			String Name=sc.next(); sc.nextLine();
			System.out.println("Enter Employee Salary ");
			int Salary = sc.nextInt();
			
			obj.addEmployee(id,Name,Salary);
		} 
		obj.displayEmpDetails();
		
		System.out.println("Enter the id to find Employee Details");
		int id=sc.nextInt();
		obj.findEmployee(id);
	
	}

}
