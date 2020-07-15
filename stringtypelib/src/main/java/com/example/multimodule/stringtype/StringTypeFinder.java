package com.example.multimodule.stringtype;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StringTypeFinder {

    private final List<IType> types;

    public StringTypeFinder(List<IType> types) {
        this.types = types;
    }

    public List<String> execute(List<String> inputs) {
        List<String> outputs = new ArrayList<>();
        for (String input : inputs) {
            for (IType type : types) {
                if (type.isValid(input)) {
                    outputs.add(type.type());
                    break;
                }
            }
        }
        return outputs;
    }
}
