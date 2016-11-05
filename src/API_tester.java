/*import junit.framework.TestCase;

public class API_tester extends TestCase {

    public void testSurveyApplication() throws Exception{
        String testCase0 = API_Controller.getSurvey("110218710");
        Class testClass = String.class;
        assertTrue(testClass.isInstance(testCase0));

        try {
            String testCase3 = API_Controller.getSurvey("00");
            fail("Exception expected");
        } catch (Exception e) {
            System.out.println("pass");
        }

        try {
            String testCase2 = API_Controller.getSurvey("");
            fail("Exception expected");
        } catch (Exception e) {
            System.out.println("pass");
        }
    }
}
*/