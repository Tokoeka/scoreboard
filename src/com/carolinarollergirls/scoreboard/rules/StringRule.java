package com.carolinarollergirls.scoreboard.rules;


public class StringRule extends AbstractRule {
    public StringRule(String fullname, String description, String defaultValue) {
        super(Type.STRING, fullname, description, defaultValue);
    }

    public boolean isValueValid(String v) {
        return v != null;
    }
}
