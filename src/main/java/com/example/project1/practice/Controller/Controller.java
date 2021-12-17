package com.example.project1.practice.Controller;

import com.example.project1.practice.objects.Car;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {
    @GetMapping("/get")
    public List<Car> getData(){
        return Arrays.asList(new Car(112,"Benz",2012));
    }

}
