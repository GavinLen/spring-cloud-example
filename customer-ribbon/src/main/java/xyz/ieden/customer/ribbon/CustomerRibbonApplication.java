package xyz.ieden.customer.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lianghongwei01
 * @date 2018/9/28 16:01
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class CustomerRibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerRibbonApplication.class);
    }
}
