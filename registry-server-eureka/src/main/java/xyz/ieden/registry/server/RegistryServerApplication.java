package xyz.ieden.registry.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author lianghongwei01
 * @date 2018/9/28 15:00
 */
@SpringBootApplication
@EnableEurekaServer
public class RegistryServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(RegistryServerApplication.class, args);
    }
}
