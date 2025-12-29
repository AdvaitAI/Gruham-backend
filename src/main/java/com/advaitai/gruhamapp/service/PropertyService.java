package com.advaitai.gruhamapp.service;

import com.advaitai.gruhamapp.model.Property;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyService {

    private static final List<Property> PROPERTIES = List.of(
            new Property(1L, "Whitefield, Bangalore", "560066", 25000),
            new Property(2L, "Indiranagar, Bangalore", "560038", 30000),
            new Property(3L, "Electronic City", "560100", 20000)
    );

    public List<Property> getByPincode(String pincode) {
        return PROPERTIES.stream()
                .filter(p -> p.getPincode().equals(pincode))
                .toList();
    }
}
