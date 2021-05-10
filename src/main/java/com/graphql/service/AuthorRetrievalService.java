package com.graphql.service;

import com.graphql.dao.entity.Affiliation;
import com.graphql.dao.entity.Author_profile;
import com.graphql.dao.entity.Preferred_name;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AuthorRetrievalService {

    /* Static data for Testing */
    private static final Affiliation affiliation = new Affiliation(
            "Faculdade de Ciências e Tecnologia, Universidade Nova de Lisboa, Department of Environmental Sciences",
            "Department of Environmental Sciences",
            "Department of Environmental Sciences");

    private static final Preferred_name preferred_name = new Preferred_name("P.","Beça P.","Beça","Pedro");

    @Transactional(readOnly = true)
    public Author_profile getAuthor_profile(String  authorId) {
        return new Author_profile("1",affiliation,preferred_name);
    }
}
