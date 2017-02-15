package domain;
/**
 * Created by Ruslan on 11.11.16.
 */
public class Constants {
//    static {
//        token = System.getenv("SM_TOKEN");
//        apiKey = System.getenv("SM_APIKEY");
//    }
    public static String token = "2EeL0iAeov1n3SbG9YH6-nIHw5Nf5BGOZtYU7v.zXHhISLJPbi8i0Y-Wp62-quw8kxQdGwxreazgyK6IxuS9Y4fTvtXNkY.fytwkiUuYR9trqnbkeX77kwYBH.EysvyM";
    public static String apiKey = "6hg28mw7zwdm79udkqqznv9p";

    public final static String LIST_OF_RESPONSES = "Exception in thread \"main\" [data:[[href:https://api.surveymonkey.net/v3/surveys/85694193/responses/5040961394, id:5040961394], [href:https://api.surveymonkey.net/v3/surveys/85694193/responses/5040958820, id:5040958820], [href:https://api.surveymonkey.net/v3/surveys/85694193/responses/5040958572, id:5040958572], [href:https://api.surveymonkey.net/v3/surveys/85694193/responses/5040959162, id:5040959162], [href:https://api.surveymonkey.net/v3/surveys/85694193/responses/5040959960, id:5040959960], [href:https://api.surveymonkey.net/v3/surveys/85694193/responses/5040958495, id:5040958495], [href:https://api.surveymonkey.net/v3/surveys/85694193/responses/5040969585, id:5040969585], [href:https://api.surveymonkey.net/v3/surveys/85694193/responses/5040961023, id:5040961023], [href:https://api.surveymonkey.net/v3/surveys/85694193/responses/5040961923, id:5040961923], [href:https://api.surveymonkey.net/v3/surveys/85694193/responses/5040960583, id:5040960583], [href:https://api.surveymonkey.net/v3/surveys/85694193/responses/5040973920, id:5040973920], [href:https://api.surveymonkey.net/v3/surveys/85694193/responses/5040957545, id:5040957545], [href:https://api.surveymonkey.net/v3/surveys/85694193/responses/5040964643, id:5040964643], [href:https://api.surveymonkey.net/v3/surveys/85694193/responses/5040971107, id:5040971107], [href:https://api.surveymonkey.net/v3/surveys/85694193/responses/5040970294, id:5040970294], [href:https://api.surveymonkey.net/v3/surveys/85694193/responses/5040983274, id:5040983274], [href:https://api.surveymonkey.net/v3/surveys/85694193/responses/5040985668, id:5040985668], [href:https://api.surveymonkey.net/v3/surveys/85694193/responses/5040981406, id:5040981406], [href:https://api.surveymonkey.net/v3/surveys/85694193/responses/5040973482, id:5040973482], [href:https://api.surveymonkey.net/v3/surveys/85694193/responses/5040983262, id:5040983262], [href:https://api.surveymonkey.net/v3/surveys/85694193/responses/5040977177, id:5040977177], [href:https://api.surveymonkey.net/v3/surveys/85694193/responses/5040977362, id:5040977362], [href:https://api.surveymonkey.net/v3/surveys/85694193/responses/5040958683, id:5040958683], [href:https://api.surveymonkey.net/v3/surveys/85694193/responses/5040990059, id:5040990059], [href:https://api.surveymonkey.net/v3/surveys/85694193/responses/5040958508, id:5040958508], [href:https://api.surveymonkey.net/v3/surveys/85694193/responses/5040966757, id:5040966757], [href:https://api.surveymonkey.net/v3/surveys/85694193/responses/5040971065, id:5040971065], [href:https://api.surveymonkey.net/v3/surveys/85694193/responses/5040974317, id:5040974317], [href:https://api.surveymonkey.net/v3/surveys/85694193/responses/5041000969, id:5041000969], [href:https://api.surveymonkey.net/v3/surveys/85694193/responses/5040996246, id:5040996246], [href:https://api.surveymonkey.net/v3/surveys/85694193/responses/5040989387, id:5040989387], [href:https://api.surveymonkey.net/v3/surveys/85694193/responses/5040994652, id:5040994652], [href:https://api.surveymonkey.net/v3/surveys/85694193/responses/5040999301, id:5040999301], [href:https://api.surveymonkey.net/v3/surveys/85694193/responses/5041000538, id:5041000538], [href:https://api.surveymonkey.net/v3/surveys/85694193/responses/5040992086, id:5040992086], [href:https://api.surveymonkey.net/v3/surveys/85694193/responses/5040983112, id:5040983112], [href:https://api.surveymonkey.net/v3/surveys/85694193/responses/5041003862, id:5041003862], [href:https://api.surveymonkey.net/v3/surveys/85694193/responses/5040976845, id:5040976845], [href:https://api.surveymonkey.net/v3/surveys/85694193/responses/5040999014, id:5040999014], [href:https://api.surveymonkey.net/v3/surveys/85694193/responses/5041015706, id:5041015706], [href:https://api.surveymonkey.net/v3/surveys/85694193/responses/5041014353, id:5041014353], [href:https://api.surveymonkey.net/v3/surveys/85694193/responses/5040990790, id:5040990790], [href:https://api.surveymonkey.net/v3/surveys/85694193/responses/5041031883, id:5041031883], [href:https://api.surveymonkey.net/v3/surveys/85694193/responses/5041034820, id:5041034820], [href:https://api.surveymonkey.net/v3/surveys/85694193/responses/5041025576, id:5041025576], [href:https://api.surveymonkey.net/v3/surveys/85694193/responses/5041030083, id:5041030083], [href:https://api.surveymonkey.net/v3/surveys/85694193/responses/5041035698, id:5041035698], [href:https://api.surveymonkey.net/v3/surveys/85694193/responses/5041024276, id:5041024276], [href:https://api.surveymonkey.net/v3/surveys/85694193/responses/5041044411, id:5041044411], [href:https://api.surveymonkey.net/v3/surveys/85694193/responses/5041046204, id:5041046204]], links:[last:https://api.surveymonkey.net/v3/surveys/85694193/responses?page=17&per_page=50, next:https://api.surveymonkey.net/v3/surveys/85694193/responses?page=2&per_page=50, self:https://api.surveymonkey.net/v3/surveys/85694193/responses?page=1&per_page=50], page:1, per_page:50, total:850]\n";
    public final static String RESPONSE_EX = "{\n" +
            "  \"response_count\": 850,\n" +
            "  \"page_count\": 20,\n" +
            "  \"buttons_text\": {\n" +
            "    \"done_button\": \"\\u0413\\u043e\\u0442\\u043e\\u0432\\u043e\",\n" +
            "    \"prev_button\": \"\\u041f\\u0440\\u0435\\u0434\\u044b\\u0434.\",\n" +
            "    \"exit_button\": \"\",\n" +
            "    \"next_button\": \"\\u0421\\u043b\\u0435\\u0434.\"\n" +
            "  },\n" +
            "  \"custom_variables\": {},\n" +
            "  \"nickname\": \"\",\n" +
            "  \"id\": \"85694193\",\n" +
            "  \"question_count\": 81,\n" +
            "  \"category\": \"\",\n" +
            "  \"preview\": \"http:\\/\\/www.surveymonkey.com\\/r\\/Preview\\/?sm=bt0qVycvfR2UUkgYAIucFWFT6DBZaCoAKvM1rvoH38w_3D\",\n" +
            "  \"is_owner\": true,\n" +
            "  \"language\": \"ru\",\n" +
            "  \"date_modified\": \"2016-12-01T09:26:00\",\n" +
            "  \"title\": \"\\u041e\\u0442\\u0437\\u044b\\u0432 \\u043e \\u043a\\u043e\\u043d\\u0444\\u0435\\u0440\\u0435\\u043d\\u0446\\u0438\\u0438 Joker 2016\",\n" +
            "  \"analyze_url\": \"http:\\/\\/www.surveymonkey.com\\/analyze\\/w8FFoVTbL1MPGsDKxLfQEamMCRk_2BdmKtGGmQ_2FHPUymw_3D\",\n" +
            "  \"pages\": [\n" +
            "    {\n" +
            "      \"href\": \"https:\\/\\/api.surveymonkey.net\\/v3\\/surveys\\/85694193\\/pages\\/256015122\",\n" +
            "      \"description\": \"\",\n" +
            "      \"questions\": [\n" +
            "        {\n" +
            "          \"display_options\": {\n" +
            "            \"show_display_number\": false\n" +
            "          },\n" +
            "          \"sorting\": null,\n" +
            "          \"family\": \"presentation\",\n" +
            "          \"subtype\": \"descriptive_text\",\n" +
            "          \"required\": null,\n" +
            "          \"visible\": true,\n" +
            "          \"href\": \"https:\\/\\/api.surveymonkey.net\\/v3\\/surveys\\/85694193\\/pages\\/256015122\\/questions\\/1023191955\",\n" +
            "          \"headings\": [\n" +
            "            {\n" +
            "              \"heading\": \"<span style=\\\"font-size: 14pt;\\\">14-15 \\u043e\\u043a\\u0442\\u044f\\u0431\\u0440\\u044f\\u00a0\\u0432\\u044b \\u0443\\u0447\\u0430\\u0441\\u0442\\u0432\\u043e\\u0432\\u0430\\u043b\\u0438 \\u0432 \\u043a\\u043e\\u043d\\u0444\\u0435\\u0440\\u0435\\u043d\\u0446\\u0438\\u0438\\u00a0Joker 2016.\\u00a0\\u041f\\u043e\\u0436\\u0430\\u043b\\u0443\\u0439\\u0441\\u0442\\u0430, \\u043e\\u0441\\u0442\\u0430\\u0432\\u044c\\u0442\\u0435 \\u0441\\u0432\\u043e\\u0439 \\u043e\\u0442\\u0437\\u044b\\u0432. \\u041e\\u043d \\u043f\\u043e\\u043c\\u043e\\u0436\\u0435\\u0442 \\u043d\\u0430\\u043c \\u0441\\u0434\\u0435\\u043b\\u0430\\u0442\\u044c \\u0441\\u043b\\u0435\\u0434\\u0443\\u044e\\u0449\\u0443\\u044e \\u043a\\u043e\\u043d\\u0444\\u0435\\u0440\\u0435\\u043d\\u0446\\u0438\\u044e \\u043b\\u0443\\u0447\\u0448\\u0435 \\u0438 \\u0438\\u043d\\u0442\\u0435\\u0440\\u0435\\u0441\\u043d\\u0435\\u0435. <\\/span><br><span style=\\\"font-size: 14pt;\\\"><br>\\u0417\\u0430\\u043f\\u043e\\u043b\\u043d\\u0438\\u0432\\u0448\\u0438\\u043c \\u044d\\u0442\\u0443 \\u0430\\u043d\\u043a\\u0435\\u0442\\u0443 \\u043c\\u044b \\u0432 \\u0442\\u0435\\u0447\\u0435\\u043d\\u0438\\u0435 \\u043d\\u0435\\u0434\\u0435\\u043b\\u0438 \\u043f\\u0440\\u0438\\u0448\\u043b\\u0451\\u043c \\u0441\\u0441\\u044b\\u043b\\u043a\\u0443 \\u043d\\u0430 raw-\\u0432\\u0438\\u0434\\u0435\\u043e\\u0437\\u0430\\u043f\\u0438\\u0441\\u0438 \\u0432\\u0441\\u0435\\u0445 \\u0434\\u043e\\u043a\\u043b\\u0430\\u0434\\u043e\\u0432, \\u0430 \\u0433\\u0434\\u0435-\\u0442\\u043e \\u0447\\u0435\\u0440\\u0435\\u0437 \\u043c\\u0435\\u0441\\u044f\\u0446 \\u2014 \\u0441\\u0441\\u044b\\u043b\\u043a\\u0443 \\u043d\\u0430 \\u043f\\u043b\\u0435\\u0439\\u043b\\u0438\\u0441\\u0442 \\u0441\\u043e \\u0441\\u043c\\u043e\\u043d\\u0442\\u0438\\u0440\\u043e\\u0432\\u0430\\u043d\\u043d\\u044b\\u043c\\u0438 \\u0432\\u0438\\u0434\\u0435\\u043e.<br><\\/span>\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"position\": 1,\n" +
            "          \"validation\": null,\n" +
            "          \"id\": \"1023191955\",\n" +
            "          \"forced_ranking\": false\n" +
            "        },\n" +
            "        {\n" +
            "          \"sorting\": null,\n" +
            "          \"family\": \"open_ended\",\n" +
            "          \"subtype\": \"single\",\n" +
            "          \"required\": {\n" +
            "            \"text\": \"\\u041d\\u0435\\u043e\\u0431\\u0445\\u043e\\u0434\\u0438\\u043c\\u043e \\u043e\\u0442\\u0432\\u0435\\u0442\\u0438\\u0442\\u044c \\u043d\\u0430 \\u0432\\u043e\\u043f\\u0440\\u043e\\u0441.\",\n" +
            "            \"amount\": \"0\",\n" +
            "            \"type\": \"all\"\n" +
            "          },\n" +
            "          \"visible\": true,\n" +
            "          \"href\": \"https:\\/\\/api.surveymonkey.net\\/v3\\/surveys\\/85694193\\/pages\\/256015122\\/questions\\/1023191954\",\n" +
            "          \"headings\": [\n" +
            "            {\n" +
            "              \"heading\": \"\\u041a\\u0430\\u043a \\u0432\\u0430\\u0441 \\u0437\\u043e\\u0432\\u0443\\u0442? (\\u0418\\u043c\\u044f \\u0424\\u0430\\u043c\\u0438\\u043b\\u0438\\u044f)\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"position\": 2,\n" +
            "          \"validation\": null,\n" +
            "          \"id\": \"1023191954\",\n" +
            "          \"forced_ranking\": false\n" +
            "        },\n" +
            "        {\n" +
            "          \"sorting\": null,\n" +
            "          \"family\": \"open_ended\",\n" +
            "          \"subtype\": \"single\",\n" +
            "          \"required\": {\n" +
            "            \"text\": \"\\u041d\\u0435\\u043e\\u0431\\u0445\\u043e\\u0434\\u0438\\u043c\\u043e \\u043e\\u0442\\u0432\\u0435\\u0442\\u0438\\u0442\\u044c \\u043d\\u0430 \\u0432\\u043e\\u043f\\u0440\\u043e\\u0441.\",\n" +
            "            \"amount\": \"0\",\n" +
            "            \"type\": \"all\"\n" +
            "          },\n" +
            "          \"visible\": true,\n" +
            "          \"href\": \"https:\\/\\/api.surveymonkey.net\\/v3\\/surveys\\/85694193\\/pages\\/256015122\\/questions\\/1023191956\",\n" +
            "          \"headings\": [\n" +
            "            {\n" +
            "              \"heading\": \"\\u0423\\u043a\\u0430\\u0436\\u0438\\u0442\\u0435 \\u0432\\u0430\\u0448 \\u0440\\u0430\\u0431\\u043e\\u0447\\u0438\\u0439 e-mail <br>(\\u043f\\u043e \\u0443\\u043a\\u0430\\u0437\\u0430\\u043d\\u043d\\u043e\\u043c\\u0443 \\u0430\\u0434\\u0440\\u0435\\u0441\\u0443 \\u043c\\u044b \\u043f\\u0440\\u0438\\u0448\\u043b\\u0451\\u043c \\u0432\\u0438\\u0434\\u0435\\u043e\\u0437\\u0430\\u043f\\u0438\\u0441\\u0438 \\u0434\\u043e\\u043a\\u043b\\u0430\\u0434\\u043e\\u0432 \\u043a\\u043e\\u043d\\u0444\\u0435\\u0440\\u0435\\u043d\\u0446\\u0438\\u0438)\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"position\": 3,\n" +
            "          \"validation\": {\n" +
            "            \"sum_text\": \"\",\n" +
            "            \"min\": null,\n" +
            "            \"text\": \"\\u041f\\u043e\\u0436\\u0430\\u043b\\u0443\\u0439\\u0441\\u0442\\u0430, \\u0443\\u043a\\u0430\\u0436\\u0438\\u0442\\u0435 \\u043a\\u043e\\u0440\\u0440\\u0435\\u043a\\u0442\\u043d\\u044b\\u0439 e-mail.\",\n" +
            "            \"sum\": null,\n" +
            "            \"max\": null,\n" +
            "            \"type\": \"email\"\n" +
            "          },\n" +
            "          \"id\": \"1023191956\",\n" +
            "          \"forced_ranking\": false\n" +
            "        },\n" +
            "        {\n" +
            "          \"sorting\": null,\n" +
            "          \"family\": \"open_ended\",\n" +
            "          \"subtype\": \"single\",\n" +
            "          \"required\": {\n" +
            "            \"text\": \"\\u041d\\u0435\\u043e\\u0431\\u0445\\u043e\\u0434\\u0438\\u043c\\u043e \\u043e\\u0442\\u0432\\u0435\\u0442\\u0438\\u0442\\u044c \\u043d\\u0430 \\u0432\\u043e\\u043f\\u0440\\u043e\\u0441.\",\n" +
            "            \"amount\": \"0\",\n" +
            "            \"type\": \"all\"\n" +
            "          },\n" +
            "          \"visible\": true,\n" +
            "          \"href\": \"https:\\/\\/api.surveymonkey.net\\/v3\\/surveys\\/85694193\\/pages\\/256015122\\/questions\\/1023191957\",\n" +
            "          \"headings\": [\n" +
            "            {\n" +
            "              \"heading\": \"\\u0423\\u043a\\u0430\\u0436\\u0438\\u0442\\u0435 \\u0432\\u0430\\u0448 \\u043b\\u0438\\u0447\\u043d\\u044b\\u0439 e-mail<br>(\\u043f\\u043e \\u044d\\u0442\\u043e\\u043c\\u0443 \\u0430\\u0434\\u0440\\u0435\\u0441\\u0443 \\u043c\\u044b \\u043f\\u0440\\u043e\\u0434\\u0443\\u0431\\u043b\\u0438\\u0440\\u0443\\u0435\\u043c \\u043f\\u0438\\u0441\\u044c\\u043c\\u043e, \\u043d\\u0430 \\u0441\\u043b\\u0443\\u0447\\u0430\\u0439, \\u0435\\u0441\\u043b\\u0438 \\u043e\\u0441\\u043d\\u043e\\u0432\\u043d\\u043e\\u0435 \\u043f\\u043e\\u043f\\u0430\\u0434\\u0435\\u0442 \\u0432 \\u0441\\u043f\\u0430\\u043c)\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"position\": 4,\n" +
            "          \"validation\": {\n" +
            "            \"sum_text\": \"\",\n" +
            "            \"min\": null,\n" +
            "            \"text\": \"\\u041f\\u043e\\u0436\\u0430\\u043b\\u0443\\u0439\\u0441\\u0442\\u0430, \\u0443\\u043a\\u0430\\u0436\\u0438\\u0442\\u0435 \\u043a\\u043e\\u0440\\u0440\\u0435\\u043a\\u0442\\u043d\\u044b\\u0439 e-mail.\",\n" +
            "            \"sum\": null,\n" +
            "            \"max\": null,\n" +
            "            \"type\": \"email\"\n" +
            "          },\n" +
            "          \"id\": \"1023191957\",\n" +
            "          \"forced_ranking\": false\n" +
            "        },\n" +
            "        {\n" +
            "          \"sorting\": null,\n" +
            "          \"family\": \"open_ended\",\n" +
            "          \"subtype\": \"single\",\n" +
            "          \"required\": null,\n" +
            "          \"visible\": true,\n" +
            "          \"href\": \"https:\\/\\/api.surveymonkey.net\\/v3\\/surveys\\/85694193\\/pages\\/256015122\\/questions\\/1023191964\",\n" +
            "          \"headings\": [\n" +
            "            {\n" +
            "              \"heading\": \"\\u0423\\u043a\\u0430\\u0436\\u0438\\u0442\\u0435 \\u0432\\u0430\\u0448 \\u043d\\u043e\\u043c\\u0435\\u0440 \\u0442\\u0435\\u043b\\u0435\\u0444\\u043e\\u043d\\u0430 (\\u043e\\u043f\\u0446\\u0438\\u043e\\u043d\\u0430\\u043b\\u044c\\u043d\\u043e)\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"position\": 5,\n" +
            "          \"validation\": null,\n" +
            "          \"id\": \"1023191964\",\n" +
            "          \"forced_ranking\": false\n" +
            "        },\n" +
            "        {\n" +
            "          \"sorting\": null,\n" +
            "          \"family\": \"open_ended\",\n" +
            "          \"subtype\": \"single\",\n" +
            "          \"required\": {\n" +
            "            \"text\": \"\\u041d\\u0435\\u043e\\u0431\\u0445\\u043e\\u0434\\u0438\\u043c\\u043e \\u043e\\u0442\\u0432\\u0435\\u0442\\u0438\\u0442\\u044c \\u043d\\u0430 \\u0432\\u043e\\u043f\\u0440\\u043e\\u0441.\",\n" +
            "            \"amount\": \"0\",\n" +
            "            \"type\": \"all\"\n" +
            "          },\n" +
            "          \"visible\": true,\n" +
            "          \"href\": \"https:\\/\\/api.surveymonkey.net\\/v3\\/surveys\\/85694193\\/pages\\/256015122\\/questions\\/1023191958\",\n" +
            "          \"headings\": [\n" +
            "            {\n" +
            "              \"heading\": \"\\u0412 \\u043a\\u0430\\u043a\\u043e\\u043c \\u0433\\u043e\\u0440\\u043e\\u0434\\u0435 \\u0432\\u044b \\u043f\\u0440\\u043e\\u0436\\u0438\\u0432\\u0430\\u0435\\u0442\\u0435?\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"position\": 6,\n" +
            "          \"validation\": null,\n" +
            "          \"id\": \"1023191958\",\n" +
            "          \"forced_ranking\": false\n" +
            "        },\n" +
            "        {\n" +
            "          \"sorting\": null,\n" +
            "          \"family\": \"open_ended\",\n" +
            "          \"subtype\": \"single\",\n" +
            "          \"required\": {\n" +
            "            \"text\": \"\\u041d\\u0435\\u043e\\u0431\\u0445\\u043e\\u0434\\u0438\\u043c\\u043e \\u043e\\u0442\\u0432\\u0435\\u0442\\u0438\\u0442\\u044c \\u043d\\u0430 \\u0432\\u043e\\u043f\\u0440\\u043e\\u0441.\",\n" +
            "            \"amount\": \"0\",\n" +
            "            \"type\": \"all\"\n" +
            "          },\n" +
            "          \"visible\": true,\n" +
            "          \"href\": \"https:\\/\\/api.surveymonkey.net\\/v3\\/surveys\\/85694193\\/pages\\/256015122\\/questions\\/1023191959\",\n" +
            "          \"headings\": [\n" +
            "            {\n" +
            "              \"heading\": \"\\u0423\\u043a\\u0430\\u0436\\u0438\\u0442\\u0435 \\u0432\\u0430\\u0448 \\u0432\\u043e\\u0437\\u0440\\u0430\\u0441\\u0442\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"position\": 7,\n" +
            "          \"validation\": {\n" +
            "            \"sum_text\": \"\",\n" +
            "            \"min\": \"17\",\n" +
            "            \"text\": \"\\u041a\\u043e\\u043c\\u043c\\u0435\\u043d\\u0442\\u0430\\u0440\\u0438\\u0439 \\u0432\\u0432\\u0435\\u0434\\u0435\\u043d \\u0432 \\u043d\\u0435\\u043f\\u0440\\u0430\\u0432\\u0438\\u043b\\u044c\\u043d\\u043e\\u043c \\u0444\\u043e\\u0440\\u043c\\u0430\\u0442\\u0435.\",\n" +
            "            \"sum\": null,\n" +
            "            \"max\": \"80\",\n" +
            "            \"type\": \"integer\"\n" +
            "          },\n" +
            "          \"id\": \"1023191959\",\n" +
            "          \"forced_ranking\": false\n" +
            "        },\n" +
            "        {\n" +
            "          \"sorting\": null,\n" +
            "          \"family\": \"single_choice\",\n" +
            "          \"subtype\": \"vertical\",\n" +
            "          \"required\": {\n" +
            "            \"text\": \"\\u041d\\u0435\\u043e\\u0431\\u0445\\u043e\\u0434\\u0438\\u043c\\u043e \\u043e\\u0442\\u0432\\u0435\\u0442\\u0438\\u0442\\u044c \\u043d\\u0430 \\u0432\\u043e\\u043f\\u0440\\u043e\\u0441.\",\n" +
            "            \"amount\": \"0\",\n" +
            "            \"type\": \"all\"\n" +
            "          },\n" +
            "          \"answers\": {\n" +
            "            \"other\": {\n" +
            "              \"id\": \"10633811358\",\n" +
            "              \"visible\": true,\n" +
            "              \"is_answer_choice\": true,\n" +
            "              \"apply_all_rows\": false,\n" +
            "              \"text\": \"\\u0414\\u0440\\u0443\\u0433\\u0430\\u044f \\u0434\\u043e\\u043b\\u0436\\u043d\\u043e\\u0441\\u0442\\u044c (\\u0443\\u043a\\u0430\\u0436\\u0438\\u0442\\u0435)\",\n" +
            "              \"position\": 0,\n" +
            "              \"num_chars\": 50,\n" +
            "              \"error_text\": \"\\u0412\\u0432\\u0435\\u0434\\u0438\\u0442\\u0435 \\u043a\\u043e\\u043c\\u043c\\u0435\\u043d\\u0442\\u0430\\u0440\\u0438\\u0439.\",\n" +
            "              \"num_lines\": 1\n" +
            "            },\n" +
            "            \"choices\": [\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"Junior Developer \\/ \\u041c\\u043b\\u0430\\u0434\\u0448\\u0438\\u0439 \\u0440\\u0430\\u0437\\u0440\\u0430\\u0431\\u043e\\u0442\\u0447\\u0438\\u043a \\/ \\u041c\\u043b\\u0430\\u0434\\u0448\\u0438\\u0439 \\u043f\\u0440\\u043e\\u0433\\u0440\\u0430\\u043c\\u043c\\u0438\\u0441\\u0442\",\n" +
            "                \"position\": 1,\n" +
            "                \"id\": \"10633811347\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"Middle Developer \\/ Developer \\/ \\u0420\\u0430\\u0437\\u0440\\u0430\\u0431\\u043e\\u0442\\u0447\\u0438\\u043a \\/ \\u041f\\u0440\\u043e\\u0433\\u0440\\u0430\\u043c\\u043c\\u0438\\u0441\\u0442\",\n" +
            "                \"position\": 2,\n" +
            "                \"id\": \"10633811348\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"Senior Developer \\/ \\u0421\\u0442\\u0430\\u0440\\u0448\\u0438\\u0439 \\u0440\\u0430\\u0437\\u0440\\u0430\\u0431\\u043e\\u0442\\u0447\\u0438\\u043a \\/ \\u0412\\u0435\\u0434\\u0443\\u0449\\u0438\\u0439 \\u0440\\u0430\\u0437\\u0440\\u0430\\u0431\\u043e\\u0442\\u0447\\u0438\\u043a \\/ \\u0412\\u0435\\u0434\\u0443\\u0449\\u0438\\u0439 \\u043f\\u0440\\u043e\\u0433\\u0440\\u0430\\u043c\\u043c\\u0438\\u0441\\u0442\",\n" +
            "                \"position\": 3,\n" +
            "                \"id\": \"10633811349\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"Team Lead\",\n" +
            "                \"position\": 4,\n" +
            "                \"id\": \"10633811350\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"CTO \\/ CIO \\/ \\u0422\\u0435\\u0445\\u043d\\u0438\\u0447\\u0435\\u0441\\u043a\\u0438\\u0439 \\u0434\\u0438\\u0440\\u0435\\u043a\\u0442\\u043e\\u0440\",\n" +
            "                \"position\": 5,\n" +
            "                \"id\": \"10633811351\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"\\u041c\\u0435\\u043d\\u0435\\u0434\\u0436\\u0435\\u0440\",\n" +
            "                \"position\": 6,\n" +
            "                \"id\": \"10633811352\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"\\u0414\\u0438\\u0440\\u0435\\u043a\\u0442\\u043e\\u0440 \\/ CEO\",\n" +
            "                \"position\": 7,\n" +
            "                \"id\": \"10633811353\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"Architect \\/ Senior Architect \\/ \\u0410\\u0440\\u0445\\u0438\\u0442\\u0435\\u043a\\u0442\\u043e\\u0440 \\/ \\u0421\\u0438\\u0441\\u0442\\u0435\\u043c\\u043d\\u044b\\u0439 \\u0430\\u0440\\u0445\\u0438\\u0442\\u0435\\u043a\\u0442\\u043e\\u0440\",\n" +
            "                \"position\": 8,\n" +
            "                \"id\": \"10633811354\"\n" +
            "              }\n" +
            "            ]\n" +
            "          },\n" +
            "          \"visible\": true,\n" +
            "          \"href\": \"https:\\/\\/api.surveymonkey.net\\/v3\\/surveys\\/85694193\\/pages\\/256015122\\/questions\\/1023191960\",\n" +
            "          \"headings\": [\n" +
            "            {\n" +
            "              \"heading\": \"\\u0412\\u0430\\u0448\\u0430 \\u043f\\u043e\\u0437\\u0438\\u0446\\u0438\\u044f \\u0432 \\u043a\\u043e\\u043c\\u043f\\u0430\\u043d\\u0438\\u0438?\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"position\": 8,\n" +
            "          \"validation\": null,\n" +
            "          \"id\": \"1023191960\",\n" +
            "          \"forced_ranking\": false\n" +
            "        },\n" +
            "        {\n" +
            "          \"sorting\": null,\n" +
            "          \"family\": \"single_choice\",\n" +
            "          \"subtype\": \"vertical\",\n" +
            "          \"required\": {\n" +
            "            \"text\": \"\\u041d\\u0435\\u043e\\u0431\\u0445\\u043e\\u0434\\u0438\\u043c\\u043e \\u043e\\u0442\\u0432\\u0435\\u0442\\u0438\\u0442\\u044c \\u043d\\u0430 \\u0432\\u043e\\u043f\\u0440\\u043e\\u0441.\",\n" +
            "            \"amount\": \"0\",\n" +
            "            \"type\": \"all\"\n" +
            "          },\n" +
            "          \"answers\": {\n" +
            "            \"choices\": [\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"\\u041c\\u0435\\u043d\\u0435\\u0435 1 \\u0433\\u043e\\u0434\\u0430\",\n" +
            "                \"position\": 1,\n" +
            "                \"id\": \"10633811361\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"1-3 \\u0433\\u043e\\u0434\\u0430\",\n" +
            "                \"position\": 2,\n" +
            "                \"id\": \"10633811362\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"4-6 \\u043b\\u0435\\u0442\",\n" +
            "                \"position\": 3,\n" +
            "                \"id\": \"10633811363\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"\\u0411\\u043e\\u043b\\u0435\\u0435 6 \\u043b\\u0435\\u0442\",\n" +
            "                \"position\": 4,\n" +
            "                \"id\": \"10633811364\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"\\u042f \\u043d\\u0435 \\u0440\\u0430\\u0431\\u043e\\u0442\\u0430\\u044e \\u0441 Java\",\n" +
            "                \"position\": 5,\n" +
            "                \"id\": \"10633811365\"\n" +
            "              }\n" +
            "            ]\n" +
            "          },\n" +
            "          \"visible\": true,\n" +
            "          \"href\": \"https:\\/\\/api.surveymonkey.net\\/v3\\/surveys\\/85694193\\/pages\\/256015122\\/questions\\/1023191961\",\n" +
            "          \"headings\": [\n" +
            "            {\n" +
            "              \"heading\": \"\\u0412\\u0430\\u0448 \\u0441\\u0442\\u0430\\u0436 \\u0440\\u0430\\u0431\\u043e\\u0442\\u044b Java-\\u0440\\u0430\\u0437\\u0440\\u0430\\u0431\\u043e\\u0442\\u0447\\u0438\\u043a\\u043e\\u043c\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"position\": 9,\n" +
            "          \"validation\": null,\n" +
            "          \"id\": \"1023191961\",\n" +
            "          \"forced_ranking\": false\n" +
            "        },\n" +
            "        {\n" +
            "          \"sorting\": {\n" +
            "            \"type\": \"random\",\n" +
            "            \"ignore_last\": true\n" +
            "          },\n" +
            "          \"family\": \"multiple_choice\",\n" +
            "          \"subtype\": \"vertical\",\n" +
            "          \"required\": null,\n" +
            "          \"answers\": {\n" +
            "            \"choices\": [\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"\\u041e\\u0434\\u043d\\u043e\\u043a\\u043b\\u0430\\u0441\\u0441\\u043d\\u0438\\u043a\\u0438\",\n" +
            "                \"position\": 1,\n" +
            "                \"id\": \"10633811366\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"EPAM\",\n" +
            "                \"position\": 2,\n" +
            "                \"id\": \"10633811367\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"T-Systems\",\n" +
            "                \"position\": 3,\n" +
            "                \"id\": \"10633811368\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"Luxoft\",\n" +
            "                \"position\": 4,\n" +
            "                \"id\": \"10633922474\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"Deutsche Bank\",\n" +
            "                \"position\": 5,\n" +
            "                \"id\": \"10633811371\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"SEMrush\",\n" +
            "                \"position\": 6,\n" +
            "                \"id\": \"10633893980\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"\\u0421\\u0431\\u0435\\u0440\\u0431\\u0430\\u043d\\u043a-\\u0422\\u0435\\u0445\\u043d\\u043e\\u043b\\u043e\\u0433\\u0438\\u0438\",\n" +
            "                \"position\": 7,\n" +
            "                \"id\": \"10633893984\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"\\u0418\\u043d\\u043d\\u043e\\u043f\\u043e\\u043b\\u0438\\u0441\",\n" +
            "                \"position\": 8,\n" +
            "                \"id\": \"10633977966\"\n" +
            "              }\n" +
            "            ]\n" +
            "          },\n" +
            "          \"visible\": true,\n" +
            "          \"href\": \"https:\\/\\/api.surveymonkey.net\\/v3\\/surveys\\/85694193\\/pages\\/256015122\\/questions\\/1023191962\",\n" +
            "          \"headings\": [\n" +
            "            {\n" +
            "              \"heading\": \"\\u042f \\u0445\\u043e\\u0447\\u0443 \\u043f\\u0435\\u0440\\u0435\\u0434\\u0430\\u0442\\u044c \\u043c\\u043e\\u0438 \\u043f\\u0435\\u0440\\u0441\\u043e\\u043d\\u0430\\u043b\\u044c\\u043d\\u044b\\u0435 \\u0434\\u0430\\u043d\\u043d\\u044b\\u0435 \\u0441\\u043b\\u0435\\u0434\\u0443\\u044e\\u0449\\u0438\\u043c \\u0413\\u0435\\u043d\\u0435\\u0440\\u0430\\u043b\\u044c\\u043d\\u044b\\u043c \\u0438 \\u0417\\u043e\\u043b\\u043e\\u0442\\u044b\\u043c \\u0441\\u043f\\u043e\\u043d\\u0441\\u043e\\u0440\\u0430\\u043c Joker 2016:\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"position\": 10,\n" +
            "          \"validation\": null,\n" +
            "          \"id\": \"1023191962\",\n" +
            "          \"forced_ranking\": false\n" +
            "        },\n" +
            "        {\n" +
            "          \"sorting\": null,\n" +
            "          \"family\": \"single_choice\",\n" +
            "          \"subtype\": \"vertical\",\n" +
            "          \"required\": {\n" +
            "            \"text\": \"\\u041d\\u0435\\u043e\\u0431\\u0445\\u043e\\u0434\\u0438\\u043c\\u043e \\u043e\\u0442\\u0432\\u0435\\u0442\\u0438\\u0442\\u044c \\u043d\\u0430 \\u0432\\u043e\\u043f\\u0440\\u043e\\u0441.\",\n" +
            "            \"amount\": \"0\",\n" +
            "            \"type\": \"all\"\n" +
            "          },\n" +
            "          \"answers\": {\n" +
            "            \"choices\": [\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"\\u0423\\u0447\\u0430\\u0441\\u0442\\u043d\\u0438\\u043a\",\n" +
            "                \"position\": 1,\n" +
            "                \"id\": \"10633811374\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"\\u0421\\u043f\\u0438\\u043a\\u0435\\u0440\",\n" +
            "                \"position\": 2,\n" +
            "                \"id\": \"10633811375\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"\\u0421\\u043f\\u043e\\u043d\\u0441\\u043e\\u0440\",\n" +
            "                \"position\": 3,\n" +
            "                \"id\": \"10633811376\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"\\u041e\\u0440\\u0433\\u0430\\u043d\\u0438\\u0437\\u0430\\u0442\\u043e\\u0440 \\/ \\u0412\\u043e\\u043b\\u043e\\u043d\\u0442\\u0435\\u0440\",\n" +
            "                \"position\": 4,\n" +
            "                \"id\": \"10633811377\"\n" +
            "              }\n" +
            "            ]\n" +
            "          },\n" +
            "          \"visible\": true,\n" +
            "          \"href\": \"https:\\/\\/api.surveymonkey.net\\/v3\\/surveys\\/85694193\\/pages\\/256015122\\/questions\\/1023191963\",\n" +
            "          \"headings\": [\n" +
            "            {\n" +
            "              \"heading\": \"\\u0423\\u043a\\u0430\\u0436\\u0438\\u0442\\u0435 \\u0432\\u0430\\u0448 \\u0441\\u0442\\u0430\\u0442\\u0443\\u0441 \\u043d\\u0430 \\u043a\\u043e\\u043d\\u0444\\u0435\\u0440\\u0435\\u043d\\u0446\\u0438\\u0438:\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"position\": 11,\n" +
            "          \"validation\": null,\n" +
            "          \"id\": \"1023191963\",\n" +
            "          \"forced_ranking\": false\n" +
            "        }\n" +
            "      ],\n" +
            "      \"title\": \"\",\n" +
            "      \"position\": 1,\n" +
            "      \"id\": \"256015122\",\n" +
            "      \"question_count\": 11\n" +
            "    },\n" +
            "    {\n" +
            "      \"href\": \"https:\\/\\/api.surveymonkey.net\\/v3\\/surveys\\/85694193\\/pages\\/256015123\",\n" +
            "      \"description\": \"\",\n" +
            "      \"questions\": [\n" +
            "        {\n" +
            "          \"sorting\": null,\n" +
            "          \"family\": \"multiple_choice\",\n" +
            "          \"subtype\": \"vertical\",\n" +
            "          \"required\": null,\n" +
            "          \"answers\": {\n" +
            "            \"other\": {\n" +
            "              \"id\": \"10633811388\",\n" +
            "              \"visible\": true,\n" +
            "              \"is_answer_choice\": true,\n" +
            "              \"apply_all_rows\": false,\n" +
            "              \"text\": \"\\u0414\\u0440\\u0443\\u0433\\u043e\\u0435 (\\u0443\\u043a\\u0430\\u0436\\u0438\\u0442\\u0435)\",\n" +
            "              \"position\": 0,\n" +
            "              \"num_chars\": 50,\n" +
            "              \"error_text\": \"\\u0412\\u0432\\u0435\\u0434\\u0438\\u0442\\u0435 \\u043a\\u043e\\u043c\\u043c\\u0435\\u043d\\u0442\\u0430\\u0440\\u0438\\u0439.\",\n" +
            "              \"num_lines\": 1\n" +
            "            },\n" +
            "            \"choices\": [\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"\\u0418\\u043c \\u043d\\u0435\\u0438\\u043d\\u0442\\u0435\\u0440\\u0435\\u0441\\u043d\\u043e \\u0443\\u0447\\u0430\\u0441\\u0442\\u0438\\u0435 \\u0432 Joker 2016\",\n" +
            "                \"position\": 1,\n" +
            "                \"id\": \"10633811380\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"\\u0423\\u0447\\u0430\\u0441\\u0442\\u0438\\u0435 \\u0432 \\u043a\\u043e\\u043d\\u0444\\u0435\\u0440\\u0435\\u043d\\u0446\\u0438\\u044f\\u0445 \\u0438\\u0445 \\u0432\\u043e\\u043e\\u0431\\u0449\\u0435 \\u043d\\u0435 \\u0438\\u043d\\u0442\\u0435\\u0440\\u0435\\u0441\\u0443\\u0435\\u0442\",\n" +
            "                \"position\": 2,\n" +
            "                \"id\": \"10633811381\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"\\u0411\\u0438\\u043b\\u0435\\u0442\\u044b \\u0441\\u0442\\u043e\\u044f\\u0442 \\u0441\\u043b\\u0438\\u0448\\u043a\\u043e\\u043c \\u0434\\u043e\\u0440\\u043e\\u0433\\u043e\",\n" +
            "                \"position\": 3,\n" +
            "                \"id\": \"10633811382\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"\\u041d\\u0435 \\u0445\\u043e\\u0442\\u044f\\u0442 \\u0442\\u0440\\u0430\\u0442\\u0438\\u0442\\u044c \\u0432\\u044b\\u0445\\u043e\\u0434\\u043d\\u043e\\u0439 \\u0434\\u0435\\u043d\\u044c \\u043d\\u0430 \\u043a\\u043e\\u043d\\u0444\\u0435\\u0440\\u0435\\u043d\\u0446\\u0438\\u044e\",\n" +
            "                \"position\": 4,\n" +
            "                \"id\": \"10633811383\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"\\u041e\\u043d\\u0438 \\u043d\\u0435 \\u0437\\u043d\\u0430\\u044e\\u0442 \\u043f\\u0440\\u043e Joker 2016\",\n" +
            "                \"position\": 5,\n" +
            "                \"id\": \"10633811384\"\n" +
            "              }\n" +
            "            ]\n" +
            "          },\n" +
            "          \"visible\": true,\n" +
            "          \"href\": \"https:\\/\\/api.surveymonkey.net\\/v3\\/surveys\\/85694193\\/pages\\/256015123\\/questions\\/1023191966\",\n" +
            "          \"headings\": [\n" +
            "            {\n" +
            "              \"heading\": \"\\u041a\\u0430\\u043a \\u0432\\u044b \\u0434\\u0443\\u043c\\u0430\\u0435\\u0442\\u0435, \\u043f\\u043e \\u043a\\u0430\\u043a\\u0438\\u043c \\u043f\\u0440\\u0438\\u0447\\u0438\\u043d\\u0430\\u043c \\u043d\\u0435\\u043a\\u043e\\u0442\\u043e\\u0440\\u044b\\u0435 \\u0432\\u0430\\u0448\\u0438 \\u043a\\u043e\\u043b\\u043b\\u0435\\u0433\\u0438\\/\\u0434\\u0440\\u0443\\u0437\\u044c\\u044f \\u043d\\u0435 \\u0443\\u0447\\u0430\\u0441\\u0442\\u0432\\u0443\\u044e\\u0442 \\u0432 Joker 2016?\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"position\": 1,\n" +
            "          \"validation\": null,\n" +
            "          \"id\": \"1023191966\",\n" +
            "          \"forced_ranking\": false\n" +
            "        },\n" +
            "        {\n" +
            "          \"sorting\": null,\n" +
            "          \"family\": \"single_choice\",\n" +
            "          \"subtype\": \"vertical\",\n" +
            "          \"required\": {\n" +
            "            \"text\": \"\\u041d\\u0435\\u043e\\u0431\\u0445\\u043e\\u0434\\u0438\\u043c\\u043e \\u043e\\u0442\\u0432\\u0435\\u0442\\u0438\\u0442\\u044c \\u043d\\u0430 \\u0432\\u043e\\u043f\\u0440\\u043e\\u0441.\",\n" +
            "            \"amount\": \"0\",\n" +
            "            \"type\": \"all\"\n" +
            "          },\n" +
            "          \"answers\": {\n" +
            "            \"other\": {\n" +
            "              \"id\": \"10633811402\",\n" +
            "              \"visible\": true,\n" +
            "              \"is_answer_choice\": true,\n" +
            "              \"apply_all_rows\": false,\n" +
            "              \"text\": \"\\u0414\\u0440\\u0443\\u0433\\u043e\\u0435 (\\u0443\\u043a\\u0430\\u0436\\u0438\\u0442\\u0435)\",\n" +
            "              \"position\": 0,\n" +
            "              \"num_chars\": 50,\n" +
            "              \"error_text\": \"\\u0412\\u0432\\u0435\\u0434\\u0438\\u0442\\u0435 \\u043a\\u043e\\u043c\\u043c\\u0435\\u043d\\u0442\\u0430\\u0440\\u0438\\u0439.\",\n" +
            "              \"num_lines\": 1\n" +
            "            },\n" +
            "            \"choices\": [\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"\\u041f\\u043e\\u043a\\u0443\\u043f\\u0430\\u043b \\u0441\\u0430\\u043c, \\u043a\\u043e\\u043c\\u043f\\u0430\\u043d\\u0438\\u044f \\u043d\\u0435 \\u043a\\u043e\\u043c\\u043f\\u0435\\u043d\\u0441\\u0438\\u0440\\u0443\\u0435\\u0442\",\n" +
            "                \"position\": 1,\n" +
            "                \"id\": \"10633811392\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"\\u041f\\u043e\\u043a\\u0443\\u043f\\u0430\\u043b \\u0441\\u0430\\u043c, \\u043a\\u043e\\u043c\\u043f\\u0430\\u043d\\u0438\\u044f \\u043a\\u043e\\u043c\\u043f\\u0435\\u043d\\u0441\\u0438\\u0440\\u0443\\u0435\\u0442 \\u0447\\u0430\\u0441\\u0442\\u0438\\u0447\\u043d\\u043e\",\n" +
            "                \"position\": 2,\n" +
            "                \"id\": \"10633811393\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"\\u041f\\u043e\\u043a\\u0443\\u043f\\u0430\\u043b \\u0441\\u0430\\u043c, \\u043a\\u043e\\u043c\\u043f\\u0430\\u043d\\u0438\\u044f \\u043f\\u043e\\u043b\\u043d\\u043e\\u0441\\u0442\\u044c\\u044e \\u043a\\u043e\\u043c\\u043f\\u0435\\u043d\\u0441\\u0438\\u0440\\u0443\\u0435\\u0442\",\n" +
            "                \"position\": 3,\n" +
            "                \"id\": \"10633811394\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"\\u0411\\u0438\\u043b\\u0435\\u0442 \\u043c\\u043d\\u0435 \\u043f\\u043e\\u043a\\u0443\\u043f\\u0430\\u043b\\u0430 \\u043a\\u043e\\u043c\\u043f\\u0430\\u043d\\u0438\\u044f\",\n" +
            "                \"position\": 4,\n" +
            "                \"id\": \"10633811395\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"\\u041d\\u0435 \\u043f\\u043e\\u043a\\u0443\\u043f\\u0430\\u043b, \\u044f \\u043e\\u0440\\u0433\\u0430\\u043d\\u0438\\u0437\\u0430\\u0442\\u043e\\u0440 \\/ \\u0441\\u043f\\u0438\\u043a\\u0435\\u0440 \\/ \\u0432\\u043e\\u043b\\u043e\\u043d\\u0442\\u0435\\u0440 \\/ \\u0441\\u043f\\u043e\\u043d\\u0441\\u043e\\u0440\",\n" +
            "                \"position\": 5,\n" +
            "                \"id\": \"10633811396\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"\\u041d\\u0435 \\u043f\\u043e\\u043a\\u0443\\u043f\\u0430\\u043b — \\u043e\\u0440\\u0433\\u0430\\u043d\\u0438\\u0437\\u0430\\u0442\\u043e\\u0440\\u044b \\u0434\\u0430\\u043b\\u0438 \\u043f\\u0440\\u043e\\u0445\\u043e\\u0434\\u043a\\u0443\",\n" +
            "                \"position\": 6,\n" +
            "                \"id\": \"10633811397\"\n" +
            "              }\n" +
            "            ]\n" +
            "          },\n" +
            "          \"visible\": true,\n" +
            "          \"href\": \"https:\\/\\/api.surveymonkey.net\\/v3\\/surveys\\/85694193\\/pages\\/256015123\\/questions\\/1023191967\",\n" +
            "          \"headings\": [\n" +
            "            {\n" +
            "              \"heading\": \"\\u041a\\u0430\\u043a \\u0432\\u044b \\u043f\\u043e\\u043a\\u0443\\u043f\\u0430\\u043b\\u0438 \\u0431\\u0438\\u043b\\u0435\\u0442?\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"position\": 2,\n" +
            "          \"validation\": null,\n" +
            "          \"id\": \"1023191967\",\n" +
            "          \"forced_ranking\": false\n" +
            "        },\n" +
            "        {\n" +
            "          \"sorting\": null,\n" +
            "          \"family\": \"multiple_choice\",\n" +
            "          \"subtype\": \"vertical\",\n" +
            "          \"required\": null,\n" +
            "          \"answers\": {\n" +
            "            \"other\": {\n" +
            "              \"id\": \"10633811411\",\n" +
            "              \"visible\": true,\n" +
            "              \"is_answer_choice\": true,\n" +
            "              \"apply_all_rows\": false,\n" +
            "              \"text\": \"\\u0414\\u0440\\u0443\\u0433\\u0438\\u0435 (DotNext, Mobius, HolyJS — \\u0443\\u043a\\u0430\\u0436\\u0438\\u0442\\u0435, \\u043f\\u043e\\u0436\\u0430\\u043b\\u0443\\u0439\\u0441\\u0442\\u0430, \\u043a\\u0430\\u043a\\u0438\\u0435 \\u0438\\u043c\\u0435\\u043d\\u043d\\u043e)\",\n" +
            "              \"position\": 0,\n" +
            "              \"num_chars\": 100,\n" +
            "              \"error_text\": \"\\u0412\\u0432\\u0435\\u0434\\u0438\\u0442\\u0435 \\u043a\\u043e\\u043c\\u043c\\u0435\\u043d\\u0442\\u0430\\u0440\\u0438\\u0439.\",\n" +
            "              \"num_lines\": 1\n" +
            "            },\n" +
            "            \"choices\": [\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"\\u041d\\u0438 \\u0432 \\u043a\\u0430\\u043a\\u0438\\u0445 — \\u044d\\u0442\\u043e \\u043c\\u043e\\u044f \\u043f\\u0435\\u0440\\u0432\\u0430\\u044f \\u043a\\u043e\\u043d\\u0444\\u0435\\u0440\\u0435\\u043d\\u0446\\u0438\\u044f \\u043e\\u0442 JUG.ru Group\",\n" +
            "                \"position\": 1,\n" +
            "                \"id\": \"10633811403\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"JPoint 2016\",\n" +
            "                \"position\": 2,\n" +
            "                \"id\": \"10633811404\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"JBreak 2016\",\n" +
            "                \"position\": 3,\n" +
            "                \"id\": \"10633911077\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"Joker 2015\",\n" +
            "                \"position\": 4,\n" +
            "                \"id\": \"10633911078\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"JPoint 2015\",\n" +
            "                \"position\": 5,\n" +
            "                \"id\": \"10633911079\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"Joker 2014\",\n" +
            "                \"position\": 6,\n" +
            "                \"id\": \"10653332713\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"JPoint 2014\",\n" +
            "                \"position\": 7,\n" +
            "                \"id\": \"10653332714\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"Joker 2013\",\n" +
            "                \"position\": 8,\n" +
            "                \"id\": \"10653332715\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"JPoint 2013\",\n" +
            "                \"position\": 9,\n" +
            "                \"id\": \"10653332716\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"\\u0412\\u0441\\u0442\\u0440\\u0435\\u0447\\u0438 JUG.ru\",\n" +
            "                \"position\": 10,\n" +
            "                \"id\": \"10633811406\"\n" +
            "              }\n" +
            "            ]\n" +
            "          },\n" +
            "          \"visible\": true,\n" +
            "          \"href\": \"https:\\/\\/api.surveymonkey.net\\/v3\\/surveys\\/85694193\\/pages\\/256015123\\/questions\\/1023191968\",\n" +
            "          \"headings\": [\n" +
            "            {\n" +
            "              \"heading\": \"\\u0412 \\u043a\\u0430\\u043a\\u0438\\u0445 \\u043a\\u043e\\u043d\\u0444\\u0435\\u0440\\u0435\\u043d\\u0446\\u0438\\u044f\\u0445 JUG.ru Group \\u0432\\u044b \\u0443\\u0447\\u0430\\u0441\\u0442\\u0432\\u043e\\u0432\\u0430\\u043b\\u0438 \\u0440\\u0430\\u043d\\u0435\\u0435? (\\u0438\\u043b\\u0438 \\u0441\\u043c\\u043e\\u0442\\u0440\\u0435\\u043b\\u0438 \\u043e\\u043d\\u043b\\u0430\\u0439\\u043d)\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"position\": 3,\n" +
            "          \"validation\": null,\n" +
            "          \"id\": \"1023191968\",\n" +
            "          \"forced_ranking\": false\n" +
            "        },\n" +
            "        {\n" +
            "          \"sorting\": null,\n" +
            "          \"family\": \"multiple_choice\",\n" +
            "          \"subtype\": \"vertical\",\n" +
            "          \"required\": null,\n" +
            "          \"answers\": {\n" +
            "            \"other\": {\n" +
            "              \"id\": \"10653464486\",\n" +
            "              \"visible\": true,\n" +
            "              \"is_answer_choice\": true,\n" +
            "              \"apply_all_rows\": false,\n" +
            "              \"text\": \"\\u0414\\u0440\\u0443\\u0433\\u0438\\u0435 (\\u0443\\u043a\\u0430\\u0436\\u0438\\u0442\\u0435, \\u043f\\u043e\\u0436\\u0430\\u043b\\u0443\\u0439\\u0441\\u0442\\u0430, \\u043a\\u0430\\u043a\\u0438\\u0435 \\u0438\\u043c\\u0435\\u043d\\u043d\\u043e)\",\n" +
            "              \"position\": 0,\n" +
            "              \"num_chars\": 100,\n" +
            "              \"error_text\": \"\\u0412\\u0432\\u0435\\u0434\\u0438\\u0442\\u0435 \\u043a\\u043e\\u043c\\u043c\\u0435\\u043d\\u0442\\u0430\\u0440\\u0438\\u0439.\",\n" +
            "              \"num_lines\": 1\n" +
            "            },\n" +
            "            \"choices\": [\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"\\u041d\\u0438 \\u0432 \\u043a\\u0430\\u043a\\u0438\\u0445\",\n" +
            "                \"position\": 1,\n" +
            "                \"id\": \"10653464478\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"HighLoad++\",\n" +
            "                \"position\": 2,\n" +
            "                \"id\": \"10653464474\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"RIT++\",\n" +
            "                \"position\": 3,\n" +
            "                \"id\": \"10653464475\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"CEE SECR\",\n" +
            "                \"position\": 4,\n" +
            "                \"id\": \"10653464476\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"JEEConf\",\n" +
            "                \"position\": 5,\n" +
            "                \"id\": \"10653464477\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"Codefest\",\n" +
            "                \"position\": 6,\n" +
            "                \"id\": \"10653464480\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"Devoxx\",\n" +
            "                \"position\": 7,\n" +
            "                \"id\": \"10653464481\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"JavaOne\",\n" +
            "                \"position\": 8,\n" +
            "                \"id\": \"10653464482\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"JavaZone\",\n" +
            "                \"position\": 9,\n" +
            "                \"id\": \"10653464483\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"JFokus\",\n" +
            "                \"position\": 10,\n" +
            "                \"id\": \"10653464479\"\n" +
            "              }\n" +
            "            ]\n" +
            "          },\n" +
            "          \"visible\": true,\n" +
            "          \"href\": \"https:\\/\\/api.surveymonkey.net\\/v3\\/surveys\\/85694193\\/pages\\/256015123\\/questions\\/1026044958\",\n" +
            "          \"headings\": [\n" +
            "            {\n" +
            "              \"heading\": \"\\u0412 \\u043a\\u0430\\u043a\\u0438\\u0445 \\u0434\\u0440\\u0443\\u0433\\u0438\\u0445 \\u043a\\u043e\\u043d\\u0444\\u0435\\u0440\\u0435\\u043d\\u0446\\u0438\\u044f\\u0445 \\u0432\\u044b \\u0443\\u0447\\u0430\\u0441\\u0442\\u0432\\u043e\\u0432\\u0430\\u043b\\u0438 \\u0437\\u0430 \\u043f\\u0440\\u043e\\u0448\\u0435\\u0434\\u0448\\u0438\\u0439 \\u0433\\u043e\\u0434? (\\u0438\\u043b\\u0438 \\u0441\\u043c\\u043e\\u0442\\u0440\\u0435\\u043b\\u0438 \\u043e\\u043d\\u043b\\u0430\\u0439\\u043d)\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"position\": 4,\n" +
            "          \"validation\": null,\n" +
            "          \"id\": \"1026044958\",\n" +
            "          \"forced_ranking\": false\n" +
            "        },\n" +
            "        {\n" +
            "          \"sorting\": null,\n" +
            "          \"family\": \"single_choice\",\n" +
            "          \"subtype\": \"vertical\",\n" +
            "          \"required\": {\n" +
            "            \"text\": \"\\u041d\\u0435\\u043e\\u0431\\u0445\\u043e\\u0434\\u0438\\u043c\\u043e \\u043e\\u0442\\u0432\\u0435\\u0442\\u0438\\u0442\\u044c \\u043d\\u0430 \\u0432\\u043e\\u043f\\u0440\\u043e\\u0441.\",\n" +
            "            \"amount\": \"0\",\n" +
            "            \"type\": \"all\"\n" +
            "          },\n" +
            "          \"answers\": {\n" +
            "            \"choices\": [\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"\\u041f\\u0440\\u0438\\u0441\\u0443\\u0442\\u0441\\u0442\\u0432\\u043e\\u0432\\u0430\\u043b \\u043b\\u0438\\u0447\\u043d\\u043e\",\n" +
            "                \"position\": 1,\n" +
            "                \"id\": \"10633811412\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"\\u0421\\u043c\\u043e\\u0442\\u0440\\u0435\\u043b \\u0442\\u0440\\u0430\\u043d\\u0441\\u043b\\u044f\\u0446\\u0438\\u044e (\\u043e\\u0434\\u0438\\u043d \\u0438\\u043b\\u0438 \\u0432 \\u0441\\u043e\\u0441\\u0442\\u0430\\u0432\\u0435 \\u0433\\u0440\\u0443\\u043f\\u043f\\u044b \\u043a\\u043e\\u043b\\u043b\\u0435\\u0433)\",\n" +
            "                \"position\": 2,\n" +
            "                \"id\": \"10633811413\"\n" +
            "              },\n" +
            "              {\n" +
            "                \"visible\": true,\n" +
            "                \"text\": \"\\u041d\\u0435 \\u0441\\u043c\\u043e\\u0433 \\u043f\\u043e\\u0443\\u0447\\u0430\\u0441\\u0442\\u0432\\u043e\\u0432\\u0430\\u0442\\u044c \\u043b\\u0438\\u0447\\u043d\\u043e, \\u0445\\u043e\\u0447\\u0443 \\u0432\\u0438\\u0434\\u0435\\u043e\",\n" +
            "                \"position\": 3,\n" +
            "                \"id\": \"10633811414\"\n" +
            "              }\n" +
            "            ]\n" +
            "          },\n" +
            "          \"visible\": true,\n" +
            "          \"href\": \"https:\\/\\/api.surveymonkey.net\\/v3\\/surveys\\/85694193\\/pages\\/256015123\\/questions\\/1023191969\",\n" +
            "          \"headings\": [\n" +
            "            {\n" +
            "              \"heading\": \"\\u0423\\u043a\\u0430\\u0436\\u0438\\u0442\\u0435 \\u0444\\u043e\\u0440\\u043c\\u0443 \\u0443\\u0447\\u0430\\u0441\\u0442\\u0438\\u044f \\u0432 \\u043a\\u043e\\u043d\\u0444\\u0435\\u0440\\u0435\\u043d\\u0446\\u0438\\u0438\"\n" +
            "            }\n" +
            "          ],\n" +
            "          \"position\": 5,\n" +
            "          \"validation\": null,\n" +
            "          \"id\": \"1023191969\",\n" +
            "          \"forced_ranking\": false\n" +
            "        }\n" +
            "      ],\n" +
            "      \"title\": \"\",\n" +
            "      \"position\": 2,\n" +
            "      \"id\": \"256015123\",\n" +
            "      \"question_count\": 5\n" +
            "    }\n" +
            "  ],\n" +
            "  \"summary_url\": \"http:\\/\\/www.surveymonkey.com\\/summary\\/w8FFoVTbL1MPGsDKxLfQEamMCRk_2BdmKtGGmQ_2FHPUymw_3D\",\n" +
            "  \"href\": \"https:\\/\\/api.surveymonkey.net\\/v3\\/surveys\\/85694193\",\n" +
            "  \"date_created\": \"2016-10-03T08:47:00\",\n" +
            "  \"collect_url\": \"http:\\/\\/www.surveymonkey.com\\/collect\\/list?sm=w8FFoVTbL1MPGsDKxLfQEamMCRk_2BdmKtGGmQ_2FHPUymw_3D\",\n" +
            "  \"edit_url\": \"http:\\/\\/www.surveymonkey.com\\/create\\/?sm=w8FFoVTbL1MPGsDKxLfQEamMCRk_2BdmKtGGmQ_2FHPUymw_3D\"\n" +
            "}";
}

