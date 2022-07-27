package br.com.interfaces.defaultmethodwithjuros.services;

import java.security.InvalidParameterException;

public class BrazilTaxService implements InterestService{

	private double intestRate;

	public BrazilTaxService(double intestRate) {
		this.intestRate = intestRate;
	}
	
	@Override
	public double getIntestRate() {
		return intestRate;
	}

	
}
