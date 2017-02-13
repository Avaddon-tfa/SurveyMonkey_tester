package services

import domain.Choice
import domain.Question

/**
 * Created by Ruslan on 11.12.16.
 */
class QuestionExtractor {

    Map<String, Question> getAllQuestionForPoll(Object response){
        Map<String, Question> questions = response.pages.collectEntries { page ->
            page.questions.collectEntries { question ->
                List<Choice> choices = question.answers?.choices?.collect { choice ->
                    return new Choice(id: choice.id, text: choice.text)
                }

                return [(question.id): new Question(id: question.id, text: question.headings.heading.first(), choices: choices)]
            }
        }
    }

}
