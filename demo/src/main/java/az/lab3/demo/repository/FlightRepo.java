package az.lab3.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import az.lab3.demo.entity.Flight;

public interface FlightRepo extends JpaRepository<Flight, Integer>{

}
