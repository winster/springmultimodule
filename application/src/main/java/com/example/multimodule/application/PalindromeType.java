package com.example.multimodule.application;

import com.example.multimodule.stringtype.IType;
import org.springframework.stereotype.Component;

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
        return !input.isEmpty() && input.equals(reversed);
    }
}
