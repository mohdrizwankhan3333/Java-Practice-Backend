package org.example.config;

import org.example.db.DatabaseConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@ComponentScan("org.example")
public class AppConfig {
    @Bean(initMethod = "init",destroyMethod = "cleanUp")
    public DatabaseConnection databaseConnection(){
        return new DatabaseConnection();
    }
}
