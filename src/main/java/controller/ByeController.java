package controller;

import domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author chengjinging
 * @date 2020/8/23 下午2:44
 */

@Controller()
@RequestMapping("/Bye")
public class ByeController {

    @RequestMapping(value = "/demo1",method = RequestMethod.GET)
    public @ResponseBody String demo1(){

        String str=null;
        System.out.println(str.length());

        return "zhengchang";
    }



    @ExceptionHandler(RuntimeException.class)
    public @ResponseBody
    Map<String,Object> runtimeExceptionHandler(RuntimeException runtimeException) {
//                 logger.error(runtimeException.getLocalizedMessage());
        System.out.println("ssssss");

        Map model = new TreeMap();
        model.put("status", false);
        return model;
    }











}
