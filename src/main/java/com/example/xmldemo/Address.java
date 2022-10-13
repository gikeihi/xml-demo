package com.example.xmldemo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class Address {
    @JacksonXmlProperty(localName = "city")
    private String city;

    @JacksonXmlProperty(localName = "state")
    private String state;
}
