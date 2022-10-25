package br.com.order.management.repository;

import br.com.order.management.model.Request;

public interface RequestRepository {

    public void save(Request request);
    public void updateRequestState(Long id, String state);
}
