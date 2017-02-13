package domain

import groovy.transform.Canonical
import groovy.transform.ToString

/**
 * Created by Ruslan on 11.12.16.
 */
@Canonical
class Question {
    String id
    String text
    List<Choice> choices
}
