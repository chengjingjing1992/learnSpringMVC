package controller;

import com.sun.jdi.request.MethodEntryRequest;
import domain.User;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.support.AbstractMultipartHttpServletRequest;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author chengjinging
 * @date 2020/8/23 下午2:44
 */

@Controller()
public class HelloController {
    @RequestMapping("/hello")
    public String sayHello(){
        System.out.println(111);
        return "hello";
    }
    @RequestMapping(value = "/demo1",method = {RequestMethod.POST}) //演示只支持post方式
    public String demo1(){

        return "hello1";
    }
    @RequestMapping(value = "/demo2",method = {RequestMethod.GET},params = {"username","password"})
    public String demo2(){

        return "hello2";
    }
    @RequestMapping(value = "/demo3",method = RequestMethod.GET,headers = "Accep")
    public String demo3(){

        return "hello3";
    }
    @RequestMapping(value = "/param1",method = RequestMethod.GET)
    public String demoParam1(String username,int password){
        System.out.println("username"+username);
        System.out.println("password"+password);

        return "hello4";
    }
    @RequestMapping(value = "/param2",method = RequestMethod.GET)
    public String demoParam2(@RequestParam ("name")String username){

        return "hello5";
    }
    @RequestMapping(value = "/param3",method = RequestMethod.POST)
    public String demoParam3(@RequestBody String body){

        System.out.println(body.toString());

        return "hello6";
    }

    @RequestMapping(value = "/param4/{sid}",method = RequestMethod.GET)
    public String demoParam4(@PathVariable("sid") String id){
        System.out.println(id);
        return "hello7";
    }
    @RequestMapping(value = "/demo20",method = RequestMethod.GET)
    public String demo20(@RequestHeader("Accept") String header){

        System.out.println("header===="+header);

        return "hello8";
    }
    @RequestMapping(value = "/demo21",method = RequestMethod.GET)
    public String demo21(@CookieValue("JSESSIONID") String sessionid){

        System.out.println("sessionid===="+sessionid);

        return "hello9";
    }
    @RequestMapping(value = "/demo22",method = RequestMethod.GET)
    public String demo22(Model model){
        User user=new User();
        user.setUsername("xiaowang");
        user.setPassword("12345");
        model.addAttribute("user",user);

        return "hello22";
    }

    @RequestMapping(value = "/demo23",method = RequestMethod.GET)
    public void demo23(HttpServletResponse response){
        try {
            response.sendRedirect("dem22");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/demo24",method = RequestMethod.POST)
    public @ResponseBody User demo24(@RequestBody String body){

        User user=new User();
        user.setUsername("zha");
        user.setPassword("13245");

        System.out.println(body);
        return user;

    }
    @RequestMapping(value = "/showException",method = RequestMethod.GET)
    public String demo26() throws Exception{

        try {
            int a=1/0;
        }catch (Exception e){
            throw new ExceptionClass("妈呀出错了");
        }

        return "hello26";

    }



    @RequestMapping("/demo27")
    public String demo27() throws SysException {

        try {
            int a=1/0;
        }catch (Exception e){

            throw new SysException("sss");

        }

        return "demo27";
    }








}
