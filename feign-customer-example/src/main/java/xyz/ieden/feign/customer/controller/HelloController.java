package xyz.ieden.feign.customer.controller;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.ieden.commons.core.entity.Result;
import xyz.ieden.feign.customer.service.IHelloService;

/**
 * @author lianghongwei01
 * @date 2018/9/27 16:17
 */
@RestController
@RequestMapping(value = "hello")
public class HelloController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @Autowired(required = false)
    private IHelloService helloService;

    @GetMapping(value = "index", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public JSONObject index() {
        JSONObject jsonObj = new JSONObject();
        LOGGER.info("Request Hello Index.");
        try {
            Result<JSONObject> result = helloService.getHomeIndex();
            LOGGER.info("Response Result:{}.", result);
            jsonObj = JSONObject.parseObject(JSONObject.toJSONString(result));
        } catch (Exception e) {
            LOGGER.info("Request Exception Msg:{}.", e.getMessage(), e);
            e.printStackTrace();
        }
        return jsonObj;
    }

}
