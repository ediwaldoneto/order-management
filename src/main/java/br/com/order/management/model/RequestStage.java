package br.com.order.management.model;

import java.util.Date;

public class RequestStage {

    private Long id;
    private String description;
    private Date dateOfRealization;
    private String requestState;
    private Request request;
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateOfRealization() {
        return dateOfRealization;
    }

    public void setDateOfRealization(Date dateOfRealization) {
        this.dateOfRealization = dateOfRealization;
    }

    public String getRequestState() {
        return requestState;
    }

    public void setRequestState(String requestState) {
        this.requestState = requestState;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
