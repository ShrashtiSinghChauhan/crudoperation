package com.crudoperation.repository;

import org.springframework.data.repository.CrudRepository;

import com.crudoperation.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
