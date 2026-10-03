package com.spring.javabased;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Theatre {
	@Autowired
	private IMovie movie;
	
	public List<String> showMovie(){
		return movie.showMoviesList();
	}

}
