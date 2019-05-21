//package com.hdi.crm.insurance;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Component;
//
//import javax.sql.DataSource;
//
//@Component
//public class ProgressConfiguration {
//
//    private JdbcTemplate jdbcTemplate;
//
//    @Autowired
//    public DataSource progressDataSource(JdbcTemplate jdbcTemplate) {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName(
//                "com.ddxq.sqlserver.SQLServerDriver");
//        dataSource.setUrl( "jdbc:datadirect:sqlserver://:/test");
//        dataSource.setUsername( "sa" );
//        dataSource.setPassword( "sa" );    }
//}
