package com.cchatt.app;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class ChatConfig {

    @Value("${spring.datasource.url}")
    private String DB_URL;

    @Value("${spring.datasource.username}")
    private String DB_USERNAME;

    @Value("${spring.datasource.password}")
    private String DB_PASSWORD;

    @Value("${spring.datasource.driver-class-name}")
    private String DB_DRIVER_CLASSNAME;


    @Bean
    public DataSource hikariDataSource() {

        HikariDataSource hikariDataSource  = new HikariDataSource();
        hikariDataSource.setUsername(DB_USERNAME);
        hikariDataSource.setPassword(DB_PASSWORD);
        hikariDataSource.setJdbcUrl(DB_URL);
        hikariDataSource.setJdbcUrl(DB_URL);
        hikariDataSource.setMaximumPoolSize(20);

        return hikariDataSource;

    }
}
