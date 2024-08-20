package com.vtech.service;

import org.springframework.stereotype.Component;

@Component("Impl2")
public class TestIImpl2 implements TestI {

	@Override
	public String test() {
		return "Testing2...";
	}
}
