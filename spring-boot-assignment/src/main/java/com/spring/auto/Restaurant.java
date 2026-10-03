package com.spring.auto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {

	@Autowired // to pick and chose a specific bean
	@Qualifier("indian") // autowiring by type
	private IMenu menu; // menu =new Indian();

	@Autowired
	private IMenu newMenu;// italian = new Italian autowiring by name

	public Restaurant(@Qualifier("chinese") IMenu newMenu) {
		super();
		this.newMenu = newMenu;
	}

	public List<String> showMenu(String choice) {

		List<String> menuItems = new ArrayList<>();
		if (choice.equalsIgnoreCase("in")) {
			menuItems = menu.itemAvailable();
		} else if (choice.equalsIgnoreCase("it")) {
			menuItems = menu.itemAvailable();
		} else if (choice.equalsIgnoreCase("ch")) {
			menuItems = menu.itemAvailable();
		} else {
			return Arrays.asList("No Menu Available");
		}
		return menuItems;
	}

}
