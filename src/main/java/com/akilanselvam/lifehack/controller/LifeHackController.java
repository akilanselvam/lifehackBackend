package com.akilanselvam.lifehack.controller;

import com.akilanselvam.lifehack.model.LifeHack;
import com.akilanselvam.lifehack.service.LifeHackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin(origins = "http://localhost:3000", methods = { RequestMethod.GET, RequestMethod.POST,RequestMethod.PUT }, allowedHeaders = "Content-Type")
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/lifehacks")
public class LifeHackController {
    @Autowired
    private LifeHackService lifeHackService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public LifeHack createLifeHack(@RequestBody LifeHack lifeHack){
        return lifeHackService.addLifeHack(lifeHack);
    }

    @GetMapping
    public List<LifeHack> getLifeHacks(){
        return lifeHackService.findAllLifeHack();
    }

    @GetMapping("/{lhId}")
    public LifeHack getLifeHack(@PathVariable String lhId){
        return lifeHackService.getLifeHackById(lhId);
    }

    @PutMapping
    public  LifeHack updateLifeHack(@RequestBody LifeHack lifeHack){
        return lifeHackService.updateLifeHack(lifeHack);
    }

    @DeleteMapping("/{lhId}")
    public String deleteLifeHack(@PathVariable String lhId){
        return lifeHackService.deleteLifeHack(lhId);
    }
}
