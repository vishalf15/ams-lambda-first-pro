package com.pract.aws;

public class LambdaMain {

	public String handler() {
		System.out.println("Within handler() method");
		return "Hello";
	}

}
