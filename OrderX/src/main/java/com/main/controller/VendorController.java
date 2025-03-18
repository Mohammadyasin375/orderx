/**
 * 
 */
package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.main.entity.Vendor;
import com.main.service.VendorService;

/**
 * 
 */
@RestController()
@RequestMapping(value = "/api/vendor")
public class VendorController {
	
	@Autowired
	private VendorService vendorService;
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ResponseEntity<Vendor> postVendor(@RequestBody Vendor vendor) {
		return ResponseEntity.ok(vendorService.postVendor(vendor));
	}
}
