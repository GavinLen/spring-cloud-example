package xyz.ieden.ribbon.customer;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;
import xyz.ieden.commons.core.entity.Result;

/**
 * @author lianghongwei01
 * @date 2018/9/27 15:28
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class RestTemplateTest {

    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void testHomeIndex() {
        ResponseEntity<Result> entity = restTemplate.getForEntity("http://eureka-producer/home/index", Result.class);
        Assert.assertNotNull(entity);
        System.out.println(entity);
    }

}
