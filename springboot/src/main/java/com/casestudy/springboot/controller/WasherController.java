package com.casestudy.springboot.controller;

import com.casestudy.springboot.Error.WasherNotFoundException;
import com.casestudy.springboot.entity.Washer;
import com.casestudy.springboot.service.WasherService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class WasherController {

    @Autowired
    private WasherService washerService;

//  private final Logger LOGGER = LoggerFactory.getLogger(name: WasherController.class);
    @PostMapping("/washers")
    public Washer saveWasher(@Valid @RequestBody Washer washer){
//        LOGGER.info("inside saveWasher of WasherController");
        return washerService.saveWasher(washer);
    }

    @GetMapping("/washers")
    public List<Washer> fetchWasherList(){
//        LOGGER.info("inside fetchWasherList of WasherController");
      return washerService.fetchWasherList();
    }

    @GetMapping("/washers/{id}")
    public Washer fetchWasherById(@PathVariable("id") Long washerId) throws WasherNotFoundException {
        return washerService.fetchWasherById(washerId);
    }

    @DeleteMapping("/washers/{id}")
    public String deleteWasherById(@PathVariable("id") Long washerId){
        washerService.deleteWasherById(washerId);
        return "department deleted successfully";
    }

    @PutMapping("/washers/{id}")
    public Washer updateWasher(@PathVariable("id") Long washerId,
                               @RequestBody Washer washer)
    {
     return washerService.updateWasher(washerId,washer);
    }

    @GetMapping("/washers/name/{name}")
    public Washer fetchWasherByName(@PathVariable("name") String washerName){
        return washerService.fetchWasherByName(washerName);
    }
}
