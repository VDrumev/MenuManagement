package com.menumanagement.config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JpaConfig {
      
    @Bean
    public DataSource getDataSource() 
    {
        DataSourceBuilder<DataSource> dataSourceBuilder = (DataSourceBuilder<DataSource>) DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("com.mysql.cj.jdbc.Driver");
        dataSourceBuilder.url("jdbc:mysql://localhost:3306/menu_management?serverTimezone=Europe/Sofia");
        dataSourceBuilder.username("developer");
        dataSourceBuilder.password("dev_pass");
        return dataSourceBuilder.build();
    }
}
