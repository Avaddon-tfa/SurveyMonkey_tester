package domain

import groovy.transform.Canonical

/**
 * Created by Ruslan on 11.12.16.
 */
@Canonical
class UserResponsesResponse {
    List<Map<String, String>> data
    int page
    Map<String, String> link
    int per_page
    int total
}
