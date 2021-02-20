package com.suthan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suthan.model.Vendor;


public interface VendorRepo extends JpaRepository<Vendor, Integer> {


}
