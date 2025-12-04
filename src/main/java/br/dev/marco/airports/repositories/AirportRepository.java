/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.dev.marco.airports.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author DIT2B
 */
public interface AirportRepository extends JpaRepository<Airport, Long> {
    
}
