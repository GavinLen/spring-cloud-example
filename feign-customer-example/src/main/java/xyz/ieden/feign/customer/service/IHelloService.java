package xyz.ieden.feign.customer.service;

import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import xyz.ieden.commons.core.entity.Result;

/**
 * @author lianghongwei01
 * @date 2018/9/27 16:13
 */
@FeignClient(value = "eureka-producer")
public interface IHelloService {

    /**
     * 获取 home/index
     *
     * @return
     * @throws Exception
     */
    @GetMapping(value = "/eureka/producer/home/index")
    Result<JSONObject> getHomeIndex() throws Exception;
}
