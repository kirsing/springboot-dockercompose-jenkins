package com.example.springbootjenkins.controller;


import com.example.springbootjenkins.model.Auto;
import com.example.springbootjenkins.repository.AutoRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ads")
@AllArgsConstructor
public class AutoController {

    AutoRepository autoRepository;

    @GetMapping("/cars")
    public List<Auto> getCars() {
        return autoRepository.findAll();
    }

    @PostMapping("/cars")
    public Auto createCar(@RequestBody Auto auto) {
        return autoRepository.save(auto);
    }

}
