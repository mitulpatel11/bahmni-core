package org.raxa.module.raxacore.web.v1_0.model;

import org.openmrs.module.webservices.rest.SimpleObject;

public class Address {
    private String address1;
    private String address2;
    private String address3;
    private String cityVillage;
    private String countyDistrict;
    private String stateProvince;

    public Address(SimpleObject post) {
        SimpleObjectExtractor extractor = new SimpleObjectExtractor(post);
        address1 = extractor.extract("address1");
        address2 = extractor.extract("address2");
        address3 = extractor.extract("address3");
        cityVillage = extractor.extract("cityVillage");
        countyDistrict = extractor.extract("countyDistrict");
        stateProvince = extractor.extract("stateProvince");
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getAddress3() {
        return address3;
    }

    public String getCityVillage() {
        return cityVillage;
    }

    public String getCountyDistrict() {
        return countyDistrict;
    }

    public String getStateProvince() {
        return stateProvince;
    }
}
