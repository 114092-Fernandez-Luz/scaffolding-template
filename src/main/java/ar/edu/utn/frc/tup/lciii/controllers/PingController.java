package ar.edu.utn.frc.tup.lciii.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

    /**
     * This method is used to check if the server is up and running.
     *

     */
    @GetMapping("/ping")
    public String pong() {
        return "pong";
    }
}
