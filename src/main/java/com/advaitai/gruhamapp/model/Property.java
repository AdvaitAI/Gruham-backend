package com.advaitai.gruhamapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Property {

    private Long id;
    private String address;
    private String pincode;
    private double rent;

}
