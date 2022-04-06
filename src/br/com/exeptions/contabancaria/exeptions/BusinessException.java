package br.com.exeptions.contabancaria.exeptions;

public class BusinessException extends RuntimeException{
	
	//private public final long serialVersionUID = 1L; 
	
	public BusinessException(String msg) {
		super(msg);
	}
}
