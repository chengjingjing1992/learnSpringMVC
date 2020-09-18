package controller;

import domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chengjinging
 * @date 2020/9/5 下午2:12
 */

/**
 * 一、在Spring中@RestController的作用等同于@Controller + @ResponseBody。
 *
 * 　　所以想要理解@RestController注解就要先了解@Controller和@ResponseBody注解。
 */

@RestController
public class NiubiController {

    @RequestMapping(value = "/niubi",method = RequestMethod.POST)
    public User getUser(String body){
        User user=new User();
        user.setUsername("zha");
        user.setPassword("13245");


        System.out.println(body);
        return user;
    }


}
