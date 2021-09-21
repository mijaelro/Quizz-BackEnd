package com.mijael.Quizz.services;

import com.mijael.Quizz.Exceptions.IllegalActionException;
import com.mijael.Quizz.beans.Category;
import com.mijael.Quizz.beans.Question;

import java.util.List;

public interface QuestionsService {
    Question getQuestion(int id) throws IllegalActionException;

    List<Question> getAllQuestions();

    List<Question> getQuestionsByCategory(Category category);

    List getQuestionsEasy();

    List getQuestionsMedium();

    List getQuestionsHard();

}
