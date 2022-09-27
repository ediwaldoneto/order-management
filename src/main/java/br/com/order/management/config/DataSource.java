package br.com.order.management.config;


import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

@Configuration
public class DataSource {

    @Value("${DATASOURCE.DRIVER_CLASS_NAME}")
    private String driverName;
    @Value("${DATASOURCE.POOL_NAME}")
    private String poolName;
    @Value("${DATASOURCE.URL}")
    private String url;
    @Value("${DATASOURCE_USERNAME}")
    private String userName;
    @Value("${DATASOURCE_PASSWORD}")
    private String userPass;
    @Value("${DATASOURCE.CONNECTION_TIMEOUT}")
    private Long connectionTimeOut;
    @Value("${DATASOURCE.MAX_POOL_SIZE}")
    private int maxPoolSize;

    @Bean
    public HikariDataSource hikariDataSource(){
        final HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setJdbcUrl(url);
        hikariDataSource.setDriverClassName(driverName);
        hikariDataSource.setUsername(userName);
        hikariDataSource.setPassword(userPass);
        hikariDataSource.setPoolName(poolName);
        hikariDataSource.setConnectionTimeout(connectionTimeOut);
        hikariDataSource.setMaximumPoolSize(maxPoolSize);
        return hikariDataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(final HikariDataSource dataSource){
        return new JdbcTemplate(dataSource);
    }

    @Bean
    public NamedParameterJdbcTemplate namedParameterJdbcTemplate(final HikariDataSource dataSource){
        return new NamedParameterJdbcTemplate(dataSource);
    }
}
