package com.abrhernandez.demo.service;

import com.abrhernandez.demo.api.DogApi;
import com.abrhernandez.demo.apimodel.DogApiModel;
import com.abrhernandez.demo.mapper.DogMapper;
import com.abrhernandez.demo.model.Dog;
import com.abrhernandez.demo.repository.DogRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogService implements DogApi {

    @Autowired
    private DogRepository dogRepository;

    private  final Logger logger = LoggerFactory.getLogger(getClass());


    @Override
    public Dog createDog(DogApiModel dogApiModel) {
        Dog dogEntity = DogMapper.toDogEntity(dogApiModel);
        Dog dogInserted =  dogRepository.save(dogEntity);
        logger.info("Dog inserted : "+dogInserted);
        return dogInserted;
    }

    @Override
    public List<Dog> getAll() {
        logger.info("Getting all dogs");
        return dogRepository.findAll();
    }
}
