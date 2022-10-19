package br.com.order.management.enumeration;

public enum RequestState {

    OPEN("OPEN"),
    IN_PROGRESS("IN_PROGRESS"),
    CLOSED("CLOSED");

    private final String value;

    RequestState(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
