package xyz.ieden.customer.ribbon.controller;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.ieden.customer.ribbon.server.IHelloService;

/**
 * @author lianghongwei01
 * @date 2018/9/28 16:06
 */
@RestController
@RequestMapping(value = "hello")
public class HelloController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private IHelloService helloService;

    @GetMapping(value = "index", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public JSONObject index() {
        JSONObject jsonObj = new JSONObject();
        LOGGER.info("Request Hello Index.");
        try {
            String resultStr = helloService.getHomeIndex();
            jsonObj = JSONObject.parseObject(resultStr);
        } catch (Exception e) {
            LOGGER.info("Request Exception Msg:{}.", e.getMessage(), e);
            e.printStackTrace();
        }
        return jsonObj;
    }

}