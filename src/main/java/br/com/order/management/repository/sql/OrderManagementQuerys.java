package br.com.order.management.repository.sql;

public class OrderManagementQuerys {

    private OrderManagementQuerys() {
    }

    public static final String INSERT_USER = "INSERT INTO `order`.`user` " +
            " (email, name, password, `role`) " +
            " VALUES(:email, :name, :password, :role)";
    public static final String FIND_ALL = "SELECT * FROM `user` u";
    public static final String SEARCH_BY_ID = "SELECT * FROM `user` u WHERE id = :id";
    public static final String UPDATE_USER = "UPDATE `user` SET " +
            " email = :email, name = :name, password = :password, role = :role WHERE id = :id ";
    public static final String DELETE_USER = "DELETE FROM user WHERE id = :id";
    public static final String INSERT_REQUEST = " INSERT INTO request " +
            " (creation_date, description, state, subject, owner_id) " +
            " VALUES(:creation_date, :description, :state, :subject, :owner_id) ";
    public static final String UPDATE_REQUEST = " UPDATE request " +
            " SET state= :state  WHERE id= :id ";
}
