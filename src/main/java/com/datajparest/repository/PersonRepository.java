package com.datajparest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.datajparest.domain.Person;

@RepositoryRestResource
public interface PersonRepository extends CrudRepository<Person, Long> {

}
