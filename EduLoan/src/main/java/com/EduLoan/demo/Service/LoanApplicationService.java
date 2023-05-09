package com.EduLoan.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EduLoan.demo.Model.LoanApplicationModel;
import com.EduLoan.demo.Repository.LoanApplicationRepository;

@Service
public class LoanApplicationService {

	@Autowired
	LoanApplicationRepository loanRepo;
	
	public List<LoanApplicationModel> getAllLoan()
	{
		return loanRepo.findAll();
	}

	public LoanApplicationModel saveLoan(LoanApplicationModel a) 
	{
		return loanRepo.save(a);	
	}
	
	public LoanApplicationModel updateLoan(LoanApplicationModel a, int loanId) 
	{
		return loanRepo.save(a);
	}

	public void deleteLoan(int loanId) 
	{
		loanRepo.deleteById(loanId);
	}

	public LoanApplicationModel getLoanById(int loanId) 
	{
			return loanRepo.findById(loanId).get();
	}

	public LoanApplicationModel updateLoanById(LoanApplicationModel s, int loanId) 
	{
		Optional<LoanApplicationModel> optional=loanRepo.findById(loanId);
		LoanApplicationModel obj=null;
		if(optional.isPresent())
		{
			obj=optional.get();
			obj.setLoanId(s.getLoanId());
			obj.setLoantype(s.getLoantype());
			obj.setApplicantName(s.getApplicantName());
			obj.setApplicantAddress(s.getApplicantAddress());
			obj.setApplicantMobile(s.getApplicantMobile());
			obj.setApplicantEmail(s.getApplicantEmail());
			obj.setApplicantAadhaar(s.getApplicantAadhaar());
			obj.setApplicantPan(s.getApplicantPan());
			obj.setApplicantSalary(s.getApplicantSalary());
			obj.setLoanAmountRequired(s.getLoanAmountRequired());
			obj.setLoanRepaymentMonths(s.getLoanRepaymentMonths());
			loanRepo.saveAndFlush(s);
		}
		return obj;
	}
}
