package com.insurance.main;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.insurance.dao.*;
import java.util.List;
import com.insurance.entity.Policy;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static PolicyService policyService = new PolicyService();

    public static void main(String[] args) {
        String ch;
        System.out.println("*** WELCOME TO INSURANCE MANAGEMENT SYSTEM ***");
        do {
            System.out.println("Enter your choice");
            System.out.println("1. Create Policy");
            System.out.println("2. View Policy");
            System.out.println("3. View All Policies");
            System.out.println("4. Update Policy");
            System.out.println("5. Delete Policy");

            try {
                int choice = scan.nextInt();

                switch (choice) {
                    case 1:
                        policyService.createPolicy();
                        break;
                    case 2:
                    	System.out.print("Enter Policy Id: ");
                        int PolicyById = scan.nextInt();
                        policyService.getPolicyById();
                        break;
                    case 3:
                        getAllPolicies(policyService,scan);
                        break;
                    case 4:
                        policyService.updatePolicy();
                        break;
                    case 5:
                        policyService.deletePolicy();
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scan.next(); 
            }

            System.out.println("Do you want to continue? C | c");
            ch = scan.next();

        } while (ch.equals("c") || ch.equals("C"));
        System.out.println("***** THANKS FOR USING OUR SYSTEM *****");
        scan.close();
    }
   
	private static void getAllPolicies(PolicyService policyService2, Scanner scan2) {
		// TODO Auto-generated method stub
		List<Policy> policies = policyService.getAllPolicies();
        if (policies.isEmpty()) {
            System.out.println("No policies found.");
        } else {
            System.out.println("Policies:");
            for (Policy policy : policies) {
                System.out.println(policy);
            }
        }
		
	}
}

