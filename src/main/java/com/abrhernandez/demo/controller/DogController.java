package com.abrhernandez.demo.controller;

import com.abrhernandez.demo.apimodel.DogApiModel;
import com.abrhernandez.demo.model.Dog;
import com.abrhernandez.demo.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/dogs")
public class DogController {

    @Autowired
    private DogService dogService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Dog> createDog(@RequestBody DogApiModel dogApiModel){

        Dog dogEntity = dogService.createDog(dogApiModel);
        return ResponseEntity.ok(dogEntity);

    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Dog> getListDogs(){
        return dogService.getAll();
    }

}
