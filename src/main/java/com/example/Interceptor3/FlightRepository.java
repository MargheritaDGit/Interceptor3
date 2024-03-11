package com.example.Interceptor3;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
@Query(value = "SELECT * FROM Flight", nativeQuery = true)
List<Flight> flightList();    //ritorna lista di aerei e poi andare a chiamare nel controller con una get
}
