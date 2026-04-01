package az.lab3.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import az.lab3.demo.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
