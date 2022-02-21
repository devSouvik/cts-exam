package com.cts.employeedetailsreport.client;
import com.cts.employeedetailsreport.exception.InvalidEmployeeNumberException;
import com.cts.employeedetailsreport.service.HospitalManagement;
import com.cts.employeedetailsreport.skeleton.SkeletonValidator;

public class EmployeeDetailsMain {

	public static void main(String[] args) throws InvalidEmployeeNumberException {
		// CODE SKELETON - VALIDATION STARTS
		// DO NOT CHANGE THIS CODE

		new SkeletonValidator();
		HospitalManagement hm=new HospitalManagement();
		hm.addEmployeeList("C:\\Users\\shahul\\Downloads\\EmployeeDetailsAutomation_Codeskeleton\\EmployeeDetailsReport\\inputfeed.txt");
		// CODE SKELETON - VALIDATION ENDS

// TYPE YOUR CODE HERE
	}

	}

