package com.E_Commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.E_Commerce.modal.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
