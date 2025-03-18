package com.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.entity.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Long> {

}
