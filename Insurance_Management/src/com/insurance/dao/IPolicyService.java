package com.insurance.dao;

import com.insurance.entity.Policy;

public interface IPolicyService {
	
	void getPolicyById();
    void getAllPolicies();
    void createPolicy();
    void updatePolicy();
    

	static void updatepolicy(Policy updatedPolicy) {
		// TODO Auto-generated method stub
		
	}

	static Policy getPolicyById(int updatePolicyId) {
		// TODO Auto-generated method stub
		return null;
	}

	static void removePolicy(int removePolicyId) {
		// TODO Auto-generated method stub
		
	}

}
