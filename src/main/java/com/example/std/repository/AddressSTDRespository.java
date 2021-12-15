package com.example.std.repository;

import com.example.std.entity.AddressSTD;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressSTDRespository extends CrudRepository<AddressSTD,Integer> {
    AddressSTD findByCityAndZip(String city,Integer zip);
}
