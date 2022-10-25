package br.com.order.management.repository.sql;

public class OrderManagementQuerys {

    private OrderManagementQuerys() {
    }

    public static final String INSERT_USER = "INSERT INTO `order`.`user` " +
            " (email, name, password, `role`) " +
            " VALUES(:email, :name, :password, :role)";
    public static final String FIND_ALL = "SELECT * FROM `user` u";
    public static final String SEARCH_BY_ID = "SELECT * fROM `user` u WHERE id = :id";
    public static final String UPDATE_USER = "UPDATE `user` SET email = :email, name :name, password = :password, role = :role WHERE id = :id ";

}
