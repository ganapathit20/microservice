package com.startup.io.utility;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class CommonUtility {
	
	public int getTotalRecords(List<?> record) {
		return record.size();
	}

}
