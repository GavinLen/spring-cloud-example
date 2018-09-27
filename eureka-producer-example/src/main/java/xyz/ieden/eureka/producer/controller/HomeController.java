package xyz.ieden.eureka.producer.controller;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.ieden.commons.core.entity.Result;
import xyz.ieden.commons.core.util.ResultUtils;

import java.util.Date;

/**
 * @author lianghongwei01
 * @date 2018/9/27 11:54
 */
@RestController
@RequestMapping(value = "home")
public class HomeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);

    @Value(value = "${server.port}")
    private String port;

    @GetMapping(value = "index")
    public Result<JSONObject> index() {
        LOGGER.info("Request Home Index.");
        Result<JSONObject> result = ResultUtils.createResult(JSONObject.class);
        JSONObject jsonObj = new JSONObject();

        jsonObj.put("date", new Date());
        jsonObj.put("port", port);

        result.setData(jsonObj);
        LOGGER.info("Response Result:{}.", result.toString());
        return result;
    }


}
