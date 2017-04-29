package com.example.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by kushan_chinthaka on 4/29/2017.
 */

@RepositoryRestResource
public interface PersonRepository extends CrudRepository<Person, Long> {

}
