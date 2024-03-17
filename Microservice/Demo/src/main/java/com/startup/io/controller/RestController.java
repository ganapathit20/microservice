package com.startup.io.controller;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.startup.io.entity.Employee;
import com.startup.io.service.EmployeeService;
import com.startup.io.utility.CommonUtility;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api/v1")
public class RestController {
	
	private final static Logger log = LoggerFactory.getLogger(RestController.class);
	
	@Autowired
	private EmployeeService empService;
	
	@Autowired
	CommonUtility utility;
	
	@GetMapping(value = "/getAllInfo")
	public String getAllInformation(){
		return "it is working employee";
	}
	
	@PostMapping(value = "/add")
	public JSONObject addNewEmployee(@RequestBody Employee newEmployee) {
		log.info("enterying addNewEmployee controller");
		JSONObject json = new JSONObject();
		try {
			
			if(newEmployee !=null) {
				empService.addNewEmployee(newEmployee);
				json.put("sucessMsg", "done");
			}else {
				json.put("errorMsg", "employee not found");
			}
		}catch(Exception ex) {
			log.info(ex.toString());
		}
		
		return json;
	}
	
	@GetMapping
	public JSONObject getAllEmployeeInformation() {
		log.info("enterying getAllInformation...");
		JSONObject json = new JSONObject();
		JSONArray arrList = new JSONArray();
		try {
			List<Employee> empList = empService.getAllEmployeeInformation();
			json.put("Employee Information", arrList.put(empList));
			json.put("total record", utility.getTotalRecords(empList));
		}catch(Exception ex) {
			log.info(ex.toString());
		}
		
		return json;
	}
	
	
}
