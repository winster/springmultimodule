package com.example.multimodule.stringtype;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Order(Ordered.HIGHEST_PRECEDENCE)
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
