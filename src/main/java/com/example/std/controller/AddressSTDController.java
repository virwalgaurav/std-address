package com.example.std.controller;

import com.example.std.services.AddressSTDService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/v1/")
public class AddressSTDController {

    private AddressSTDService addressSTDService;

    @GetMapping("validate")
    public ResponseEntity<String> validateaddressSTD(@RequestParam String city, @RequestParam Integer zip){
        return new ResponseEntity(addressSTDService.validateAddress(city,zip), HttpStatus.OK);
    }
}
