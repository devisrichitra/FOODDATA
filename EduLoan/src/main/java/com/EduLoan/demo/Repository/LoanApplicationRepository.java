package com.EduLoan.demo.Repository;

//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EduLoan.demo.Model.LoanApplicationModel;

public interface LoanApplicationRepository extends JpaRepository<LoanApplicationModel,Integer> {
//	Optional<LoanApplicationModel>findById(Integer loanid);

}
