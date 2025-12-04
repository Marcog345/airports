package br.dev.marco.airports.service;

import br.dev.marco.airports.DTO.AirportMinDTO;
import br.dev.marco.airports.entities.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import br.dev.marco.airports.repositories.AirportRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AirportService 
{    
    @Autowired
    private AirportRepository airportRepository;
    
    public List<Airport> findALL() {
        List<Airport> result = airportRepository.findAll();
        return result;
    }
    
    
    public List<Airport> findByCity(String city) {
        List<Airport> result = airportRepository.findByCityIgnoreCase(city);
        return result;
    }
    public List<AirportMinDTO> findByCountry(String country) {
        List<Airport> resultAirport = airportRepository.findByCountryIgnoreCase(country);
        List<AirportMinDTO> resultDTO = resultAirport.stream()
                .map(x -> new AirportMinDTO(x)).toList();
        return resultDTO;
    }
}
