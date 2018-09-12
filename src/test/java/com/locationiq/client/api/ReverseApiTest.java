/*
 * LocationIQ
 * LocationIQ provides flexible enterprise-grade location based solutions. We work with developers, startups and enterprises worldwide serving billions of requests everyday. This page provides an overview of the technical aspects of our API and will help you get started.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.locationiq.client.api;

import LocationIq.ApiException;
import java.math.BigDecimal;
import com.locationiq.client.model.Error;
import com.locationiq.client.model.Location;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReverseApi
 */
@Ignore
public class ReverseApiTest {

    private final ReverseApi api = new ReverseApi();

    
    /**
     * Reverse Geocoding
     *
     * Reverse geocoding is the process of converting a coordinate or location (latitude, longitude) to a readable address or place name. This permits the identification of nearby street addresses, places, and/or area subdivisions such as a neighborhood, county, state, or country.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reverseTest() throws ApiException {
        BigDecimal lat = null;
        BigDecimal lon = null;
        String format = null;
        Integer normalizecity = null;
        Integer addressdetails = null;
        String acceptLanguage = null;
        Integer namedetails = null;
        Integer extratags = null;
        Location response = api.reverse(lat, lon, format, normalizecity, addressdetails, acceptLanguage, namedetails, extratags);

        // TODO: test validations
    }
    
}