package com.maxmind.geoip2.model;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.maxmind.db.MaxMindDbConstructor;
import com.maxmind.db.MaxMindDbParameter;
import com.maxmind.db.Network;
import com.maxmind.geoip2.record.City;
import com.maxmind.geoip2.record.Continent;
import com.maxmind.geoip2.record.Country;
import com.maxmind.geoip2.record.Location;
import com.maxmind.geoip2.record.MaxMind;
import com.maxmind.geoip2.record.Postal;
import com.maxmind.geoip2.record.RepresentedCountry;
import com.maxmind.geoip2.record.Subdivision;
import com.maxmind.geoip2.record.Traits;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * This class provides a model for the data returned by the GeoIP2 Enterprise
 * database
 * </p>
 */
public final class EnterpriseResponse extends AbstractCityResponse {

    /**
     * Constructs an instance of {@code EnterpriseResponse} with the specified parameters.
     *
     * @param city city
     * @param continent continent
     * @param country country
     * @param location location
     * @param maxmind maxmind record for the response
     * @param postal postal
     * @param registeredCountry registered country
     * @param representedCountry represented country
     * @param subdivisions subdivisions
     * @param traits traits
     */
    @MaxMindDbConstructor
    public EnterpriseResponse(
        @JsonProperty("city") @MaxMindDbParameter(name = "city") City city,
        @JsonProperty("continent") @MaxMindDbParameter(name = "continent") Continent continent,
        @JsonProperty("country") @MaxMindDbParameter(name = "country") Country country,
        @JsonProperty("location") @MaxMindDbParameter(name = "location") Location location,
        @JsonProperty("maxmind") @MaxMindDbParameter(name = "maxmind") MaxMind maxmind,
        @JsonProperty("postal") @MaxMindDbParameter(name = "postal") Postal postal,
        @JsonProperty("registered_country") @MaxMindDbParameter(name = "registered_country")
        Country registeredCountry,
        @JsonProperty("represented_country") @MaxMindDbParameter(name = "represented_country")
        RepresentedCountry representedCountry,
        @JsonProperty("subdivisions") @MaxMindDbParameter(name = "subdivisions")
        ArrayList<Subdivision> subdivisions,
        @JacksonInject("traits") @JsonProperty("traits") @MaxMindDbParameter(name = "traits")
        Traits traits
    ) {
        super(city, continent, country, location, maxmind, postal, registeredCountry,
            representedCountry, subdivisions, traits);
    }

    /**
     * Constructs an instance of {@code EnterpriseResponse} with only required parameters.
     *
     * @param response the response
     * @param ipAddress the IP address that the data in the model is for.
     * @param network the network associated with the record.
     * @param locales the locales
     */
    public EnterpriseResponse(
        EnterpriseResponse response,
        String ipAddress,
        Network network,
        List<String> locales
    ) {
        super(response, ipAddress, network, locales);
    }
}
