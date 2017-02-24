package domain

import groovy.transform.Canonical


/**
 * Created by Ruslan on 11.12.16.
 */
@Canonical
class Question {
    String id;
    String text;
    List<Choice> choices;

    public void print () {

        println "Question: " + id + " " + text + "\n";

        for (Choice choice: choices) {println(choice.text +" "+ choice.id +" "+ choice.weight)}
    }

}
