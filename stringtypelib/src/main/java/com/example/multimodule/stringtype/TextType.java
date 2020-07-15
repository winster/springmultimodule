package com.example.multimodule.stringtype;

import org.springframework.stereotype.Component;

@Component
public class TextType implements IType {

    @Override
    public String type() {
        return "TEXT";
    }

    @Override
    public boolean isValid(String input) {
        return !input.trim().isEmpty();
    }
}
