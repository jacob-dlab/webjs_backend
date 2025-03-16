package com.example.javscript_class.service;

import com.example.javscript_class.model.AgeRequest;
import com.example.javscript_class.model.AgeResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AgeCalculationService {

    private final List<AgeResponse> responseList = new ArrayList<>();

    public AgeResponse calculateFutureAge(AgeRequest request) {
        System.out.println("-------------------------------");
        System.out.println("Received Request:");
        System.out.println("Name: " + request.getName());
        System.out.println("Age: " + request.getAge());
        System.out.println("School: " + request.getSchool());

        int futureAge = request.getAge() + 10;
        AgeResponse response = new AgeResponse();
        response.setName(request.getName());
        response.setSchool(request.getSchool());
        response.setFutureAge(futureAge);

        responseList.add(response);

//        System.out.println("Stored responses:");
//        for (AgeResponse res : responseList) {
//            System.out.println("---------------");
//            System.out.println("Name: " + res.getName());
//            System.out.println("School: " + res.getSchool());
//            System.out.println("Future Age: " + res.getFutureAge());
//        }
//        System.out.println();

        return response;
    }

    public List<AgeResponse> getAllResponses(){
        return responseList;
    }



}