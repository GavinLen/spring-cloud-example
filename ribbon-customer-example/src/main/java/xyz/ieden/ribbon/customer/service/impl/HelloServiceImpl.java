package xyz.ieden.ribbon.customer.service.impl;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import xyz.ieden.commons.core.entity.Result;
import xyz.ieden.ribbon.customer.service.IHelloService;

/**
 * @author lianghongwei01
 * @date 2018/9/27 14:30
 */
@Service
public class HelloServiceImpl implements IHelloService {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloServiceImpl.class);

    private static final String PRODUCER_SERVER = "http://eureka-producer/eureka/producer/";

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String getHomeIndex() throws Exception {
        String reqUrl = PRODUCER_SERVER + "home/index";
        LOGGER.info("Request Producer Server:[{}].", reqUrl);
        ResponseEntity<Result> responseEntity = restTemplate.getForEntity(reqUrl, Result.class);
        LOGGER.info("Response Entity Info:{}.", responseEntity.toString());
        Result<JSONObject> result = responseEntity.getBody();
        LOGGER.info("Result Info:{}.", result.toString());
        String resultStr = JSONObject.toJSONString(result);
        return resultStr;
    }
}
