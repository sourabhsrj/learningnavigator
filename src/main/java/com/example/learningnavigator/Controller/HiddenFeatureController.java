package com.example.learningnavigator.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.learningnavigator.Service.NumberFactService;

@RestController
public class HiddenFeatureController {
    @Autowired
    private NumberFactService numberFactService;

    @GetMapping("/hidden-feature/{number}")
    public ResponseEntity<String> getNumberFact(@PathVariable int number) {
        return ResponseEntity.ok(numberFactService.getNumberFact(number));
    }
}
