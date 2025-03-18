package com.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entity.Vendor;
import com.main.repository.VendorRepository;

@Service
public class VendorService {
	
	@Autowired
	private VendorRepository vendorRepository;
	
	public Vendor postVendor(Vendor vendor) {
		return vendorRepository.save(vendor);
	}
}
