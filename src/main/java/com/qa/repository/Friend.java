package com.qa.repository;

import javax.enterprise.inject.Default;

@Default
public class Friend {
	public String message() {
		return "Hello there buddy";
	}
}
