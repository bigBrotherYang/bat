package com.xtkj.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;

@Configuration

public class DruidConfig {

    @Bean
    @ConfigurationProperties("spring.datasource")
    public DataSource druid(){
        return new DruidDataSource();
    }

}
