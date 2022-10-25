package br.com.order.management.model;

import java.util.Date;

public class RequestStage {

    private Long id;
    private String description;
    private Date dateOfRealization;
    private String requestState;
    private Long requestId;
    private Long userId;

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

    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
