package com.globomantics.employee;

import org.springframework.data.rest.webmvc.BasePathAwareController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@BasePathAwareController
public class ExampleService {

    @RequestMapping("/schedule")
    public String getSchedule() {

        return "Your v2 schedule is M-W 6-6";
    }
}
