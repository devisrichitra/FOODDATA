package com.EduLoan.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.EduLoan.demo.Model.UserModel;

public interface UserRepository extends JpaRepository <UserModel,Integer> {
	
	public UserModel findByEmail(String email);
}
