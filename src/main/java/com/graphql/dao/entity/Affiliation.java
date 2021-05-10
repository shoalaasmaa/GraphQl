package com.graphql.dao.entity;

public class Affiliation {

    private final String afdispname;
    private final String preferred_name;
    private final String sort_name;

    public Affiliation(String afdispname, String preferred_name, String sort_name){
        this.afdispname = afdispname;
        this.preferred_name = preferred_name;
        this.sort_name = sort_name;
    }

    public String getAfdispname() {
        return afdispname;
    }

    public String getPreferred_name() {
        return preferred_name;
    }

    public String getSort_name() {
        return sort_name;
    }

}
