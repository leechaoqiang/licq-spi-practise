package com.licq.spi;

import java.util.List;

public class DatabaseSearch implements Search {

	@Override
	public List<Object> search(String keyword) {
		// TODO Auto-generated method stub
		System.out.println("  databaseSearch  search.....keywords:"+keyword);
		return null;
	}

}
