package xyz.ieden.produce.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lianghongwei01
 * @date 2018/9/28 15:43
 */
@SpringBootApplication
@EnableEurekaClient
public class ProducerEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProducerEurekaApplication.class, args);
    }
}
