package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/whiskies")
public class WhiskyController {

    @Autowired
    WhiskyRepository whiskyRepository;


    @GetMapping("distilleryage/{id}/{age}")
    public List<Whisky> findWhiskiesOfDistilleryByAge(@PathVariable Long id, @PathVariable int age){
        return whiskyRepository.findWhiskiesOfDistilleryByAge(id, age);
    }

    @GetMapping("/year/{year}")
    public List<Whisky> searchForWhiskyByYear(@PathVariable int year){
        return whiskyRepository.findWhiskyByYear(year);
    }

    @GetMapping("{region}")
    public List<Whisky> findWhiskiesOfRegion(@PathVariable String region){
        return whiskyRepository.findWhiskiesOfRegion(region);
    }


}
