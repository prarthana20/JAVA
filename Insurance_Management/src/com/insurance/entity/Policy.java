package com.insurance.entity;

import java.util.List;

public class Policy {
	
	private int policyId;
    private String policyName;

    public Policy() {}

    public Policy(int policyId, String policyName) {
        this.policyId = policyId;
        this.policyName = policyName;
    }

    // Getters - setters Methods
    public int getPolicyId() {
        return policyId;
    }
    public void setPolicyId(int policyId) {
        this.policyId = policyId;
    }
    public String getPolicyName() {
        return policyName;
    }
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }
    
    public void printUserDetails() {
        System.out.println("Policy Details: ");
        System.out.println("policyId: " + policyId);
        System.out.println("policyName: " + policyName);
    }

    @Override
    public String toString() {
        return "Policy{" +
                "policyId=" + policyId +
                ", policyName='" + policyName + '\'' +
                '}';
    }

	public List<Policy> getAllPolicies() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getPolicyDetails() {
		// TODO Auto-generated method stub
		return null;
	}


}
