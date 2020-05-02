package com.example.soapdemo.controller;

import com.example.soapdemo.service.dto.*;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

@Endpoint
public class ServiceController {

    @PayloadRoot(namespace = "http://localhost:8080/services/example/v1", localPart = "doExampleRequest")
    @ResponsePayload
    public DoExampleResponse doExample(@RequestPayload DoExampleRequest request) {
        Response response = new Response();
        response.setDescription(request.getName() + "-" + request.getAge());
        response.setDate(getDateGregoriCalendar(new Date(), false));
        response.setStatusCode(615);

        DoExampleResponse wrapper = new DoExampleResponse();
        wrapper.setResponse(response);
        return wrapper;
    }

    @PayloadRoot(namespace = "http://localhost:8080/services/example/v1", localPart = "doTransactionRequest")
    @ResponsePayload
    public DoTransactionResponse doTransaction(@RequestPayload DoTransactionRequest request) {
        Response response = new Response();
        response.setDescription(request.getName() + "-" + request.getAge());
        response.setDate(getDateGregoriCalendar(new Date(), false));
        response.setStatusCode(615);

        DoTransactionResponse wrapper = new DoTransactionResponse();
        wrapper.setResponse(response);
        return wrapper;
    }


    @PayloadRoot(namespace = "http://localhost:8080/services/cards/v1", localPart = "getCardRequest")
    @ResponsePayload
    public GetCardResponse getCard(@RequestPayload GetCardRequest request) {
        CardResponse response = new CardResponse();
        response.setCardId(request.getId() + "-" + request.getLength());
        response.setDate(getDateGregoriCalendar(new Date(), false));
        response.setStatusCode(54124224);

        GetCardResponse wrapper = new GetCardResponse();
        wrapper.setCardResponse(response);
        return wrapper;
    }


    private static XMLGregorianCalendar getDateGregoriCalendar(Date date, boolean timezone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(date);
        XMLGregorianCalendar parseDate = null;

        try {
            parseDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
        } catch (Exception e) {
            System.out.println("ERROR");
            System.out.println(e.getMessage());
        }
        if (!timezone)
            Objects.requireNonNull(parseDate).setTimezone(DatatypeConstants.FIELD_UNDEFINED);

        return parseDate;
    }
}
