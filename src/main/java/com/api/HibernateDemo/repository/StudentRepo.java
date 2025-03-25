package com.api.HibernateDemo.repository;

import com.api.HibernateDemo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

//    We creating an interface because it needs no implementation and we're extending JpaRepository
//    because it has all the methods needed for the db queries and stuff.

//    The generics takes two Arguements, the first is the Entity/Model we're working with
//    the second is the Wrapper Class of the Primary key in the entity, most likely the id.

    List<Student> findByTech(String lang);
//    created manually. somehow java automatically find it for me, just make sure the name is similar
//    to the field in the entity/model
}
