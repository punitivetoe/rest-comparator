package com.punitive.tools.restcomparator;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class RestComparatorConfig {
	
	@Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/gstpdb");
        dataSource.setUsername("root");
        dataSource.setPassword("myPwd");
         
        return dataSource;
    }
	
	@Bean
	public JdbcTemplate getJdbctemplate(){
		return new JdbcTemplate(getDataSource());
	}
}
