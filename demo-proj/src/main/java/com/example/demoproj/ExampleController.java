package com.example.demoproj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ExampleController {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@GetMapping(value = "/beer/names")
	ResponseEntity printNames() {
		System.out.println("Controller started....");
		List<String> ll = new ArrayList();
		ll.add("King Fisher");
		ll.add("Budwiser");
		Map<String, Object> entity = new HashMap();
		entity.put("status",true);
		entity.put("body", ll);
		return new ResponseEntity(entity, HttpStatus.OK);
	}

}
