package com.mijael.Quizz.serviceImpl;

import com.mijael.Quizz.Exceptions.IllegalActionException;
import com.mijael.Quizz.beans.Category;
import com.mijael.Quizz.beans.Question;
import com.mijael.Quizz.repos.QuestionRepository;
import com.mijael.Quizz.services.QuestionsService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Scope("prototype")
@Service
@RequiredArgsConstructor
@Data
public class QuestionsServiceImpl implements QuestionsService {

    private final QuestionRepository questionRepository;

    @Override
    public Question getQuestion(int id) throws IllegalActionException {
        return questionRepository.findById(id).orElseThrow(() -> new IllegalActionException(id + " doesnt exist in Database"));
    }

    @Override
    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    @Override
    public List<Question> getQuestionsByCategory(Category category) {
        return questionRepository.findByCategory(category);
    }

    @Override
    public List getQuestionsEasy() {
        var questions = getAllQuestions();
        Collections.shuffle(questions);
        List<Question> questionsEasy = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            Question question = questions.get(i);
            questionsEasy.add(question);
        }
        System.out.println(questionsEasy);
        return questionsEasy;
    }


    @Override
    public List getQuestionsMedium() {
        var questions = getAllQuestions();
        Collections.shuffle(questions);
        List<Question> questionsMedium = new ArrayList<>();
        for (int i = 0; i < 60; i++) {
            Question question = questions.get(i);
            questionsMedium.add(question);
        }
        System.out.println(questionsMedium);
        return questionsMedium;
    }

    @Override
    public List getQuestionsHard() {
        var questions = getAllQuestions();
        Collections.shuffle(questions);
        List<Question> questionsHard = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Question question = questions.get(i);
            questionsHard.add(question);
        }
        System.out.println(questionsHard);
        return questionsHard;
    }


}
