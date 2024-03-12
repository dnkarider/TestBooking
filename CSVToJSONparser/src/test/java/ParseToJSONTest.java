import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;

public class ParseToJSONTest {
    @Test
    public void testParseCSVFirstPerson() throws ParserConfigurationException, IOException, SAXException {
        // given:
        String listPerson = "1JohnSmithUSA25";
        // when:
        List<Employee> testList = Main.parseXML("data.xml");
        String strListPerson = testList.get(0).id + testList.get(0).firstName + testList.get(0).lastName + testList.get(0).country + testList.get(0).age;
        // then:
        Assertions.assertTrue(listPerson.equals(strListPerson));
    }
    @Test
    public void testParseCSVSecondPerson() throws ParserConfigurationException, IOException, SAXException {
        // given:
        String listPerson = "2InavPetrovRU23";
        // when:
        List<Employee> testList = Main.parseXML("data.xml");
        String strListPerson = testList.get(1).id + testList.get(1).firstName + testList.get(1).lastName + testList.get(1).country + testList.get(1).age;
        // then:
        Assertions.assertFalse(!listPerson.equals(strListPerson));
    }
    @Test
    public void testParseCSVNotNull() throws ParserConfigurationException, IOException, SAXException {
        // when:
        List<Employee> testList = Main.parseXML("data.xml");
        // then:
        Assertions.assertNotNull(testList.get(0));
        Assertions.assertNotNull(testList.get(1));
    }
}
