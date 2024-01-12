package com.abrhernandez.demo.mapper;

import com.abrhernandez.demo.apimodel.DogApiModel;
import com.abrhernandez.demo.model.Dog;
import org.springframework.stereotype.Component;

@Component
public class DogMapper {

    public static Dog toDogEntity(DogApiModel dogApiModel){
        return Dog.builder()
                .name(dogApiModel.getName())
                .age(dogApiModel.getAge())
                .color(dogApiModel.getColor())
                .gender(dogApiModel.getGender())
                .build();
    }

}
