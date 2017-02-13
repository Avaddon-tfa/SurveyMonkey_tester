import domain.Choice
import domain.Constants
import domain.Question
import groovy.json.JsonSlurper
import services.UserResponseExtractor

/**
 * Created by Ruslan on 11.12.16.
 */
class NewMain {

    public static void main(String[] args) {

        String constantKey = Constants.apiKey
        String surveyId = '85694193'

        def slurper = new JsonSlurper()

        Object response = getResponseOrStub(slurper)

        Map<String, Question> questions = response.pages.collectEntries { page ->
            page.questions.collect { question ->
                List<Choice> choices = question.answers?.choices?.collect { choice ->
                    return new Choice(id: choice.id, text: choice.text)
                }

                return [(question.id): new Question(id: question.id, text: question.headings.heading.first(), choices: choices)]
            }
        }

        println questions

        UserResponseExtractor responsesList = new UserResponseExtractor()
        println responsesList.getUserResponsesByQuestions()
    }

    private static Object getResponseOrStub(JsonSlurper slurper) {

//        def response = slurper.parseText(new URL("https://api.surveymonkey.net/v3/surveys/${surveyId}/details?api_key=${constantKey}").getText(
//                requestProperties:['Authorization': "Bearer ${Constants.token}"]
//        ))

        def response = slurper.parseText(Constants.RESPONSE_EX)
        response
    }
}
