package com.vilauweb.PlatformSh;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import sh.platform.config.Config;
import sh.platform.config.MySQL;

@Component
@Slf4j
public class Test {
    public void Test (){
    }

    @Override
    public String toString() {
        log.error("A INTRAT PE AICI!**********************************************");
        Config config = new Config();
        try {
            MySQL database = config.getCredential("db", MySQL::new);
            log.info(database.toString());
            //log.info("**************** VGC-The path is: {}", database.getPath());
            log.info("**************** VGC-The username is: {}", database.getUserName());
            log.info("**************** VGC-The port is: {}", database.getPort());
            log.info("**************** VGC-The host is: {}", database.getHost());
        } catch(RuntimeException exception) {
            System.out.println(exception);
        }

        return "Test{}";
    }
}
