package com.datajparest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.datajparest.domain.Student;

@RepositoryRestResource
public interface StudentRepository extends CrudRepository<Student, Long> {

}
