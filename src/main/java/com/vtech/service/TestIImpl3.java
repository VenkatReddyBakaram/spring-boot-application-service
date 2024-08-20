package com.vtech.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TestIImpl3 implements TestI {

	@Override
	public String test() {
		return "Testing3...";
	}
}
