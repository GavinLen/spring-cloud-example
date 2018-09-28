package xyz.ieden.config.client.controller;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lianghongwei01
 * @date 2018/9/28 10:20
 */
@RestController
@RequestMapping(value = "hello")
public class HelloController {
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

//    @Value(value = "${un}")
    private String username;
//    @Value(value = "${up}")
    private String password;
    @Value("${foo}")
    private String foo;

    @GetMapping(value = "user", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public JSONObject getUser() {
        LOGGER.info("Username:[{}], Password:[{}].", username, password);
        LOGGER.info("foo:[{}].", foo);
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("username", username);
        jsonObj.put("password", password);

        LOGGER.info("Response Result:{}.", jsonObj.toJSONString());

        return jsonObj;
    }
}
