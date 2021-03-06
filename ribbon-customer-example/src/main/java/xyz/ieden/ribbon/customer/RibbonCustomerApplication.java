package xyz.ieden.ribbon.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author lianghongwei01
 * @date 2018/9/27 14:22
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableHystrix
public class RibbonCustomerApplication {
    public static void main(String[] args) {
        SpringApplication.run(RibbonCustomerApplication.class, args);
    }
}