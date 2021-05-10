package com.graphql.dao.entity;

public class Author_profile {

    private final String id;
    private final Affiliation affiliation;
    private final Preferred_name preferred_name;

    public Author_profile(String id, Affiliation affiliation, Preferred_name preferred_name){
        this.id = id;
        this.affiliation = affiliation;
        this.preferred_name = preferred_name;
    }

    public String getId() {
        return id;
    }

    public Affiliation getAffiliation() {
        return affiliation;
    }

    public Preferred_name getPreferred_name() {
        return preferred_name;
    }




}
