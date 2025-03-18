/**
 * 
 */
package com.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.entity.AppUser;

/**
 * 
 */
@Repository
public interface CustomerRepository extends JpaRepository<AppUser, Long> {

}
