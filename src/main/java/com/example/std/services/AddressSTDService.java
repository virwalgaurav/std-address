package com.example.std.services;

import com.example.std.entity.AddressSTD;
import com.example.std.repository.AddressSTDRespository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AddressSTDService {
    private AddressSTDRespository addressSTDRespository;

    public boolean validateAddress(String city,Integer zip){

        AddressSTD addressSTD =  addressSTDRespository.findByCityAndZip(city,zip);
        if (addressSTD!= null)
            return true;
        else
            return false;
    }
}
