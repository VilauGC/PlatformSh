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

    @Bean(name = "dataSource")
    public DataSource getDataSource() {
        log.error("A INTRAT PE AICI!**********************************************");
        Config config = new Config();
        MySQL database = config.getCredential("database", MySQL::new);
        return database.get();
    }

}
