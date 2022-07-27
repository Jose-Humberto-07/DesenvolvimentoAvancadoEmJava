package br.com.interfaces.defaultmethodwithjuros.services;

import java.security.InvalidParameterException;

public interface InterestService {

	public double getIntestRate();
	
	default double payment(double amount, int months) {
		if (months < 1) {
			throw new InvalidParameterException("Months must be grater than zero");
		}
		
		return amount * Math.pow(1.0 + getIntestRate() / 100.0, months);
	}
}
