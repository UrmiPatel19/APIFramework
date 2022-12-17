package tests;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.restassured.response.Response;
import model.Person;
import model.PersonRequest;
import model.PersonResponse;
import org.testng.annotations.Test;

public class Test1 extends BaseTest{

    @Test
    public void test() throws JsonProcessingException {
        System.out.println("running");
        String response = utils.getallPersons();
        System.out.println(response);
        Response personres = utils.post(endpoints.createPersonEndpoint(),personPayload.personPayload());
        personRequest = objectMapper.readValue(personPayload.personPayload(),PersonRequest.class);
        personResponse = personres.as(PersonResponse.class);
        System.out.println(personRequest.getJob()+" : "+personResponse.getJob());
        softAssert.assertEquals(personRequest.getJob(),personResponse.getJob(),"success");
    }
}


