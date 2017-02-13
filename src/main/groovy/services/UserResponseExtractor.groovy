package services

import domain.Constants
import domain.UserResponsesResponse
import groovy.json.JsonSlurper
import groovy.transform.Canonical

/**
 * Created by Ruslan on 11.12.16.
 */
@Canonical
class UserResponseExtractor {

    UserResponsesResponse getUserResponsesByQuestions(){
        def slurper = new JsonSlurper()
        String url = "https://api.surveymonkey.net/v3/surveys/85694193/responses?api_key=" + Constants.apiKey;

        def response = slurper.parseText(new URL(url).getText(
                        requestProperties: ['Authorization': "Bearer ${Constants.token}"]))

        println(response.data.href)


        return 0
    }

}
