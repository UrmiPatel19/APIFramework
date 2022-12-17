package tests;

import constants.BaseURLs;
import constants.Endpoints;
import model.PersonRequest;
import model.PersonResponse;
import org.testng.asserts.SoftAssert;
import utilities.PersonPayload;
import utilities.Utils;
import com.fasterxml.jackson.databind.ObjectMapper;

public class BaseTest {

    public Utils utils;
    public Endpoints endpoints;
    public BaseURLs baseURLs;
    public ObjectMapper objectMapper;
    public SoftAssert softAssert;
    public PersonRequest personRequest;
    public PersonResponse personResponse;
    public PersonPayload personPayload;

    public BaseTest(){
        utils = new Utils();
        endpoints = new Endpoints();
        baseURLs = new BaseURLs();
        softAssert = new SoftAssert();
        objectMapper = new ObjectMapper();
        personRequest = new PersonRequest();
        personResponse = new PersonResponse();
        personPayload = new PersonPayload();
    }
}
