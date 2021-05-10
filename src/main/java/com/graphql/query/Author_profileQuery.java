package com.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graphql.dao.entity.Author_profile;
import com.graphql.service.AuthorRetrievalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Author_profileQuery implements GraphQLQueryResolver {

    @Autowired
    private AuthorRetrievalService authorRetrievalService;

    public Author_profile getAuthor_profile(final String id) {
        return this.authorRetrievalService.getAuthor_profile(id);
    }
}