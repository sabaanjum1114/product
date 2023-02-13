package com.slokam.productone;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/getDate")
	public Date getDate()
	{
		return new Date();
	}
	
	@GetMapping("getCurTimeInMil")
	public long getCurTimeInMil()
	{
		return System.currentTimeMillis();
		
		//qwertyuioojhgfdsdfgh
		
	}

}
