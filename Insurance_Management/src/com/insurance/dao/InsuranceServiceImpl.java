package com.insurance.dao;
import com.insurance.entity.Policy;
import com.insurance.util.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.insurance.exception.*;

public class InsuranceServiceImpl implements IPolicyService {

    public boolean addPolicy(Policy policy) {
        String sql = "INSERT INTO policies (policy_name, policy_details) VALUES (?, ?)";
        try (Connection conn = DBConn.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, policy.getPolicyName());
            stmt.setString(2, policy.getPolicyDetails());
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Policy getPolicyById(Long policyId) {
        String sql = "SELECT * FROM policies WHERE policy_id = ?";
        try (Connection conn = DBConn.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setLong(1, policyId);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Policy(
                        rs.getLong("policy_id"),
                        rs.getString("policy_name"),
                        rs.getString("policy_details"));
                } else {
                    ("Policy with ID " + policyId + " not found.");
                }
            }
        } catch (SQLException e) {
            // You may want to log this exception or handle it further
            e.printStackTrace();
            ("Error accessing the database", e);
        }
    }


    @Override
    public List<Policy> getAllPolicies() {
        List<Policy> policies = new ArrayList<>();
        String sql = "SELECT * FROM policies";
        try (Connection conn = DBConn.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                policies.add(new Policy(
                    rs.getLong("policy_id"),
                    rs.getString("policy_name"),
                    rs.getString("policy_details")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return policies;
    }

        @Override
        public boolean updatePolicy(Policy policy) throws PolicyNotFoundException {
            String sql = "UPDATE policies SET policy_name = ?, policy_details = ? WHERE policy_id = ?";
            try (Connection conn = DBConn.getConnection();
                 PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, policy.getPolicyName());
                stmt.setString(2, policy.getPolicyDetails());
                stmt.setLong(3, policy.getPolicyId());
                int rowsAffected = stmt.executeUpdate();
                if (rowsAffected == 0) {
                    throw new PolicyNotFoundException("No policy found with ID " + policy.getPolicyId());
                }
                return true;
            } catch (SQLException e) {
                e.printStackTrace();
                throw new PolicyNotFoundException("Database access error occurred", e);
            }
        }
    @Override
    public boolean deletePolicy(Long policyId) throws PolicyNotFoundException {
        String sql = "DELETE FROM policies WHERE policy_id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setLong(1, policyId);
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected == 0) {
                throw new PolicyNotFoundException("Policy with ID " + policyId + " not found.");
            }
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
}
