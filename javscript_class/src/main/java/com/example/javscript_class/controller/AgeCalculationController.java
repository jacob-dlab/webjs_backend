package com.example.javscript_class.controller;

import com.example.javscript_class.model.AgeRequest;
import com.example.javscript_class.model.AgeResponse;
import com.example.javscript_class.service.AgeCalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")  // 추가된 부분: CORS 허용
public class AgeCalculationController {

    @Autowired
    private AgeCalculationService ageCalculationService;

    @PostMapping("/calculate-age")
    public AgeResponse calculateAge(@RequestBody AgeRequest request) {
        return ageCalculationService.calculateFutureAge(request);
    }
}