package com.yoshidainasaku.output.springvuesample;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @PostMapping("/sample")
    public ResultObjects post(@RequestBody SampleForm sampleForm) {
        int id = sampleForm.getId();
        ResultObjects resultObject = new ResultObjects();
        resultObject.setName("inasaku");
        resultObject.setLank(id);

        return resultObject;
    }
}
