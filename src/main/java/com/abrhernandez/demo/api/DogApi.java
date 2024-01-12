package com.abrhernandez.demo.api;


import com.abrhernandez.demo.apimodel.DogApiModel;
import com.abrhernandez.demo.model.Dog;

import java.util.List;

public interface DogApi {

    Dog createDog (DogApiModel dogApiModel);

    List<Dog> getAll();

}
