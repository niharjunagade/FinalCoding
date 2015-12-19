package ch.makery.address.model;

import org.apache.poi.ss.formula.functions.FinanceLib;

import base.RateDAL;
import domain.RateDomainModel;

public class Rate extends RateDomainModel {
	
	public double getPayment(int NumberOfPayments)
	{
		//FinalExam
		//	Normally this kind of method would be in a BLL, but alas...
		
		//	Figure out payment based on:
		//	Interest rate
		//	PV
		//	FV (make FV = 0, unless you want a balloon payment
		//	Compounding = True
		//	Number of Payments (passed in)
		double GivenCreditScore = 700;
		double PresentValue = 300000;
		
		
		double PMT = FinanceLib.pmt(RateDAL.getRate(GivenCreditScore), NumberOfPayments, PresentValue, 0, true);
		return PMT;
	}
		
		public boolean Approved(double monthlyPMT, double monthlyIncome, double Expenses) {
			if (monthlyPMT > (monthlyIncome * 0.36)) {
				return false;
		}	else if (monthlyPMT > ((monthlyIncome + Expenses) * 0.28)) {
			return false;
		
		}	else {
			return true;
	}
}
}
