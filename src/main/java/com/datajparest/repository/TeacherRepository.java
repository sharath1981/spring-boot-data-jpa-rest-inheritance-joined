package com.datajparest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.datajparest.domain.Teacher;

@RepositoryRestResource
public interface TeacherRepository extends CrudRepository<Teacher, Long> {

}
