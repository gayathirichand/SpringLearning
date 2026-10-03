package com.spring.auto;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Chinese implements IMenu {

	@Override
	public List<String> itemAvailable() {
		return Arrays.asList("Frined Rice","Noodles");

	}

}
