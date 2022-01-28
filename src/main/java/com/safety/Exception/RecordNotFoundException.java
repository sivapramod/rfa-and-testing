package com.safety.Exception;

public class RecordNotFoundException  extends RuntimeException
{
	private static final long serialversionUID =1L;
	public RecordNotFoundException(String message)
	{
		super(message);
		
	}

}
