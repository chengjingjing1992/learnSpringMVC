package controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author chengjinging
 * @date 2020/9/3 下午4:41
 */

public class AccessController {


     @ExceptionHandler(RuntimeException.class)
     public @ResponseBody Map<String,Object> runtimeExceptionHandler(RuntimeException runtimeException) {
//                 logger.error(runtimeException.getLocalizedMessage());
         System.out.println("ssssss");

                 Map model = new TreeMap();
                 model.put("status", false);
                 return model;
     }
}
