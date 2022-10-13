package com.example.xmldemo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.util.List;

@Data
public class Customer {
    @JacksonXmlProperty(localName = "id")
    private int id;
    @JacksonXmlProperty(localName = "name")
    private String name;

    @JacksonXmlProperty(localName = "addresses")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Address> addresses;
}
