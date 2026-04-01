package az.lab3.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import az.lab3.demo.entity.Flight;

@Repository
public interface FlightRepo extends JpaRepository<Flight, Integer>{

}
