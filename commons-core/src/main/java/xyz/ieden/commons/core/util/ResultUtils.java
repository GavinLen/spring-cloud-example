package xyz.ieden.commons.core.util;

import xyz.ieden.commons.core.entity.Result;

/**
 * @author lianghongwei01
 * @date 2018/9/27 11:59
 */
public class ResultUtils {

    public static <T> Result<T> createResult(Class<T> clazz) {
        Result<T> result = new Result<>();
        result.setCode(0);
        result.setMsg("SUCCESS");
        return result;
    }

}
