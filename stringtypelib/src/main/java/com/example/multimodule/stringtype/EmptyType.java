package com.example.multimodule.stringtype;

import org.springframework.stereotype.Component;

@Component
public class EmptyType implements IType {
    @Override
    public String type() {
        return "EMPTY";
    }

    @Override
    public boolean isValid(String input) {
        return input == null || input.trim().isEmpty();
    }
}
