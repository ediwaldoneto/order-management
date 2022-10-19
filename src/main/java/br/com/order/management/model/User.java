package br.com.order.management.model;

import java.util.ArrayList;
import java.util.List;

public class User {

    private Long id;
    private String name;
    private String email;
    private String password;
    private String role;
    private List<Request> requests = new ArrayList<>();
    private List<RequestStage> requestStages = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<Request> getRequests() {
        return requests;
    }

    public void setRequests(List<Request> requests) {
        this.requests = requests;
    }

    public List<RequestStage> getRequestStages() {
        return requestStages;
    }

    public void setRequestStages(List<RequestStage> requestStages) {
        this.requestStages = requestStages;
    }
}
