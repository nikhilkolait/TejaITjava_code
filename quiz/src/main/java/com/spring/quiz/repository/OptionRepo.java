package com.spring.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.quiz.model.Option;
@Repository
public interface OptionRepo extends JpaRepository<Option, Integer>{

}
