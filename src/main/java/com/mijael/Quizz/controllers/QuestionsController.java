package com.mijael.Quizz.controllers;

import com.mijael.Quizz.Exceptions.IllegalActionException;
import com.mijael.Quizz.beans.Category;
import com.mijael.Quizz.beans.Question;
import com.mijael.Quizz.services.QuestionsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("questions")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class QuestionsController {

    private final QuestionsService questionService;

    @GetMapping("q")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @GetMapping("q/e")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Question> getAllQuestionsEasy() {
        return questionService.getQuestionsEasy();
    }

    @GetMapping("q/m")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Question> getAllQuestionsMedium() {
        return questionService.getQuestionsMedium();
    }

    @GetMapping("q/h")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Question> getAllQuestionsHard() {
        return questionService.getQuestionsHard();
    }

    @GetMapping("q/{category}")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Question> getQuestionsByCategory(@PathVariable Category category) {
        return questionService.getQuestionsByCategory(category);
    }

    @GetMapping("q/{questionId}")
    @ResponseStatus(code = HttpStatus.OK)
    public Question getOneQuestion(@PathVariable int questionId) throws IllegalActionException {
        return questionService.getQuestion(questionId);
    }


}
