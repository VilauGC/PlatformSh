package com.vilauweb.PlatformSh.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sh.platform.config.Config;
import sh.platform.config.MySQL;

import javax.sql.DataSource;

@Configuration
@Slf4j
public class DataSourceConfig {

    @Bean(name="dataSource")
    public DataSource getDataSource(){
        Config config = new Config();
        MySQL database = config.getCredential("database", MySQL::new);

        log.info("**************** VGC-The path is: {}", database.getPath());
        log.info("**************** VGC-The username is: {}", database.getUserName());
        log.info("**************** VGC-The port is: {}", database.getPort());
        log.info("**************** VGC-The host is: {}", database.getHost());

        return database.get();
    }

}
