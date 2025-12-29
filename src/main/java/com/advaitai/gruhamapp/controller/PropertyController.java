package com.advaitai.gruhamapp.controller;

import com.advaitai.gruhamapp.model.Property;
import com.advaitai.gruhamapp.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PropertyController {

    @Autowired
    private PropertyService propertyService;

    @GetMapping("/getProperties")
    public List<Property> getProperties(
            @RequestParam String pincode) {
        return propertyService.getByPincode(pincode);
    }
}
