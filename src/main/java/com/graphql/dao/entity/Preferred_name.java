package com.graphql.dao.entity;

public class Preferred_name {

    private final String initials;
    private final String indexed_name;
    private final String surname;
    private final String given_name;

    public Preferred_name(String initials, String indexed_name, String surname, String given_name){
        this.initials = initials;
        this.indexed_name = indexed_name;
        this.surname = surname;
        this.given_name = given_name;
    }

    public String getInitials() {
        return initials;
    }

    public String getIndexed_name() {
        return indexed_name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGiven_name() {
        return given_name;
    }
}
