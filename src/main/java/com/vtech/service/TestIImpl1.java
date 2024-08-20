package com.vtech.service;

import org.springframework.stereotype.Component;

@Component("Impl1")
public class TestIImpl1 implements TestI {

	@Override
	public String test() {
		return "Testing1...";
	}
}
