package com.example.multimodule.application;

import com.example.multimodule.stringtype.StringTypeFinder;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@Import(StringTypeFinder.class)
public class Controller1 {

    private final StringTypeFinder stringTypeFinder;

    public Controller1(StringTypeFinder stringTypeFinder) {
        this.stringTypeFinder = stringTypeFinder;
    }

    @GetMapping("/i")
    public List<String> home() {
        List<String> inputs = new ArrayList<>();
        inputs.add("");
        inputs.add("aba");
        List<String> outputs = this.stringTypeFinder.execute(inputs);
        for(String output : outputs) {
            System.out.println(output);
        }
        return outputs;
    }
}
