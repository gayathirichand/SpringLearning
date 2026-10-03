package com.basics.autowiring;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Convertible implements ICar {

	@Override
	public List<String> showBrands() {
		return null;
	}

}
