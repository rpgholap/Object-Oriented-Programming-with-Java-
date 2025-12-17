package com.accessmod.hr;

import com.accessmod.company.Employee;

public class Manager extends Employee{
	
	public Manager(String dept){
		
		this.dept = dept;
	}
	
	public void display(){
		System.out.println("Display method : executed");
		show();
	}

}
