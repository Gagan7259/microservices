package com.example.Quiz.Project.Repository;

import com.example.Quiz.Project.Model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepo extends JpaRepository<Question,Integer> {
}
