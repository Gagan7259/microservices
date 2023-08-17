package com.example.Quiz.Project.Controller;

import com.example.Quiz.Project.Model.Question;
import com.example.Quiz.Project.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("questions")
public class QuestionController {
    @Autowired
    QuestionService questionService;

    @GetMapping("allquestions")
    public List<Question> Allquestions() {
        return questionService.getallQuestions();
    }
}
