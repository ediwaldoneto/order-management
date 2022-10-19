package br.com.order.management.repository.sql;

public class OrderManagementQuerys {

    private OrderManagementQuerys() {
    }

    public static final String INSERT = "INSERT INTO `order`.`user` " +
            " (email, name, password, `role`) " +
            " VALUES(:email, :name, :password, :role)";
}
