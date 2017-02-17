package domain

import groovy.transform.Canonical
import groovy.transform.ToString

/**
 * Created by Ruslan on 11.12.16.
 */
@Canonical
class Choice {
    String id;
    String text;
    Long weight;
}
