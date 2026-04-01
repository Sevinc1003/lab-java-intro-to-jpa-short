package az.lab3.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import az.lab3.demo.entity.FlightBooking;

public interface FlightBookingRepo extends JpaRepository<FlightBooking, Integer>{

}
