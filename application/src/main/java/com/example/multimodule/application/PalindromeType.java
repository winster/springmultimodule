package com.example.multimodule.application;

import com.example.multimodule.stringtype.IType;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Component
public class PalindromeType implements IType {
    @Override
    public String type() {
        return "PALINDROME";
    }

    @Override
    public boolean isValid(String input) {
        StringBuffer str = new StringBuffer(input);
        String reversed = str.reverse().toString();
        return input.equals(reversed);
    }
}
