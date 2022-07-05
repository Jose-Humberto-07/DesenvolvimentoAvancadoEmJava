package br.com.interfaces.paypal.services;

import java.util.Calendar;
import java.util.Date;

import br.com.interfaces.paypal.entities.Contract;
import br.com.interfaces.paypal.entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, int months) {
		double basicQuota = contract.getTotalValue() / months;
		// basicQuota = 200
		
		for (int i = 1; 1 <= months; i++) {
			double updateQuota = basicQuota + onlinePaymentService.interest(basicQuota, i);
			// updateQuota = 202
			double fullQuota = updateQuota + onlinePaymentService.paymentFee(updateQuota);
			// fullQuota = 206.04
			Date dueDate = addMonths(contract.getDate(), i);
			contract.getInstallments().add(new Installment(dueDate, fullQuota));
		}
	}
	
	
	private Date addMonths(Date date, int N) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, N);
		return calendar.getTime();
	}
	
}
