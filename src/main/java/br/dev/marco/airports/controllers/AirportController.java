package br.dev.marco.airports.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import br.dev.marco.airports.entities.Airport;
import br.dev.marco.airports.service.AirportService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author DIT2B
 */
@RestController
public class AirportController {

    @Autowired
    private AirportService airportService;

    /**
     * Endpoint /airports/airport Retorna TODOS os aeroportos da base de dados.
     *
     * @return
     */
    @GetMapping("/airport")
    publicList<Airport> findALL() {
        List<Airport> result = airport.Service.findALL();
        return result;
    }
}
