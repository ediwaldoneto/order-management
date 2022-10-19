package br.com.order.management.enumeration;

public enum Role {

    ADMINISTRATOR("ADMINISTRATOR"),
    SIMPLE("SIMPLE");

    private final String value;

    Role(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
