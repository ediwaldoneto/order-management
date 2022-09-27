package br.com.order.management.model;

import br.com.order.management.enumeration.RequestState;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Request {

    private Long id;
    private String subject;
    private String description;
    private Date creationDate;
    private RequestState requestState;
    private User user;
    private List<RequestStage> requestStages = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public RequestState getRequestState() {
        return requestState;
    }

    public void setRequestState(RequestState requestState) {
        this.requestState = requestState;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<RequestStage> getRequestStages() {
        return requestStages;
    }

    public void setRequestStages(List<RequestStage> requestStages) {
        this.requestStages = requestStages;
    }
}
