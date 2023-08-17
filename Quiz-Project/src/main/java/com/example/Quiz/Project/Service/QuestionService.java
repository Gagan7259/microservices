package com.example.Quiz.Project.Service;

import com.example.Quiz.Project.Model.Question;
import com.example.Quiz.Project.Repository.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionRepo questionRepo;

    public List<Question> getallQuestions() {
        return questionRepo.findAll();
    }
}
