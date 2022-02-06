package com.zhaohuabing.demo;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Huabing Zhao
 */
@RestController
public class EShopController {

	@GetMapping(value = "/checkout")
	public String checkout(){
		return "you have checkedout, you are amazing";
//		return "You have successfully checked out your shopping cart";
	}

}
