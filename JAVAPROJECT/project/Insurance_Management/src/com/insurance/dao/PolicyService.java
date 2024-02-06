package com.insurance.dao;

import java.util.List;
import java.util.Scanner;
import com.insurance.entity.Policy;
import java.util.ArrayList;

public class PolicyService {
	Policy policy = new Policy();
	Scanner sc = new Scanner(System.in);

	public void createPolicy() {
		System.out.println("Policy ID: ");
		int policyId = sc.nextInt();
		policy.setPolicyId(policyId);
		System.out.println("Policy Name: ");
		String policyName = sc.next();
		policy.setPolicyName(policyName);
	}

	public void deletePolicy() {
		System.out.print("Enter Policy ID to remove: ");
	    int removePolicyId = sc.nextInt();
	    IPolicyService.removePolicy(removePolicyId);
	    System.out.println("Customer removed successfully");
		}

	public void updatePolicy() {
		System.out.print("Enter Policy ID to update: ");
        int updatePolicyId = sc.nextInt();
        sc.nextLine(); 
        	Policy updatedPolicy = IPolicyService.getPolicyById(updatePolicyId);
        		if (updatedPolicy != null) {
        			System.out.print("Enter new Policy Id: ");
        			updatedPolicy.setPolicyId(sc.nextInt());
        			System.out.print("Enter new Policy Name: ");
        			updatedPolicy.setPolicyName(sc.nextLine());          
            IPolicyService.updatepolicy(updatedPolicy);
            System.out.println("Policy updated successfully");
        } else {
            System.out.println("Policy not found");
        }
		
	}

	public void getPolicyById() {
		System.out.println("Enter Policy id");
		int PolicyID =sc.nextInt();
		Policy policyById = IPolicyService.getPolicyById(PolicyID);
		System.out.println("\n---Policy Details---\n" + policyById);
   
		
	}

	public List<Policy> getAllPolicies() {
		List<Policy> policies = new ArrayList<>();
        try {
            policies = policy.getAllPolicies();
        } catch (Exception e) {
            // Handle exceptions appropriately
            e.printStackTrace();
        }
        return policies;
	}

}
