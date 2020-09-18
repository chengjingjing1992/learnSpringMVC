package controller;

import com.sun.tools.javac.parser.Scanner;
import domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * @author chengjinging
 * @date 2020/8/23 下午2:44
 */

@Controller()
public class HelloController {
    int requestcount=0;
    @RequestMapping("/hello")
    public String sayHello(HttpServletRequest request) throws InterruptedException {
        System.out.println("request.getRemoteHost()==="+request.getRemoteHost());
        System.out.println("Thread.currentThread().getId()==="+Thread.currentThread().getId() +"第"+ ++requestcount +"次请求");
        System.out.println("Thread.activeCount()==="+Thread.activeCount());
        Thread.sleep(1000000);


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
            response.sendRedirect("demo22");
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
        String msg="<!DOCTYPE html><html lang=en><head><meta charset=UTF-8><meta http-equiv=X-UA-Compatible content=\"IE=edge,chrome=1\"><meta name=viewport content=\"width=device-width,initial-scale=1\"><title>圈外同学</title><link href=https://static.iquanwai.com/libs/element-ui/2.13.2/theme-chalk/index.css rel=stylesheet><link href=https://static.iquanwai.com/libs/vant/2.1.4/index.css rel=stylesheet><link href=https://static.iquanwai.com/static/script/iqw_pc_static/20/static/css/vendors.app-0a073e4.css rel=stylesheet><link href=https://static.iquanwai.com/static/script/iqw_pc_static/20/static/css/app.790db3f.css rel=stylesheet></head><body><script>window.subAppDomain = {\"course\":\"https://static.iquanwai.com/static/script/iqw_pc_static_course/\",\"learnning\":\"https://static.iquanwai.com/static/script/iqw_pc_static_learnning/\",\"login\":\"https://static.iquanwai.com/static/script/login_static/\"}</script><div id=app></div><script src=https://static.iquanwai.com/libs/vue/2.6.11/vue.min.js></script><script src=https://static.iquanwai.com/libs/vue-router/3.3.4/vue-router.min.js></script><script src=https://static.iquanwai.com/libs/axios/0.19.2/axios.min.js></script><script src=https://static.iquanwai.com/libs/vuex/3.4.0/vuex.min.js></script><script src=https://static.iquanwai.com/libs/element-ui/2.13.2/element-ui.min.js></script><script src=https://static.iquanwai.com/libs/echarts/4.8.0/echarts.min.js></script><script src=https://static.iquanwai.com/libs/vant/2.1.4/vant.min.js></script><script src=https://static.iquanwai.com/static/script/iqw_pc_static/20/static/js/vendors.app.1c8864a.js></script><script src=https://static.iquanwai.com/static/script/iqw_pc_static/20/static/js/app.e65de0e.js></script></body></html>";

        try {
            int a=1/0;
        }catch (Exception e){
            throw new SysException(msg);

        }

        return "demo27";
    }

    @RequestMapping(value = "/demo28",method = RequestMethod.GET)
    @ResponseBody
    public String demo28(){
        String msg="<!DOCTYPE html><html lang=en><head><meta charset=UTF-8><meta http-equiv=X-UA-Compatible content=\"IE=edge,chrome=1\"><meta name=viewport content=\"width=device-width,initial-scale=1\"><title>圈外同学</title><link href=https://static.iquanwai.com/libs/element-ui/2.13.2/theme-chalk/index.css rel=stylesheet><link href=https://static.iquanwai.com/libs/vant/2.1.4/index.css rel=stylesheet><link href=https://static.iquanwai.com/static/script/iqw_pc_static/20/static/css/vendors.app-0a073e4.css rel=stylesheet><link href=https://static.iquanwai.com/static/script/iqw_pc_static/20/static/css/app.790db3f.css rel=stylesheet></head><body><script>window.subAppDomain = {\"course\":\"https://static.iquanwai.com/static/script/iqw_pc_static_course/\",\"learnning\":\"https://static.iquanwai.com/static/script/iqw_pc_static_learnning/\",\"login\":\"https://static.iquanwai.com/static/script/login_static/\"}</script><div id=app></div><script src=https://static.iquanwai.com/libs/vue/2.6.11/vue.min.js></script><script src=https://static.iquanwai.com/libs/vue-router/3.3.4/vue-router.min.js></script><script src=https://static.iquanwai.com/libs/axios/0.19.2/axios.min.js></script><script src=https://static.iquanwai.com/libs/vuex/3.4.0/vuex.min.js></script><script src=https://static.iquanwai.com/libs/element-ui/2.13.2/element-ui.min.js></script><script src=https://static.iquanwai.com/libs/echarts/4.8.0/echarts.min.js></script><script src=https://static.iquanwai.com/libs/vant/2.1.4/vant.min.js></script><script src=https://static.iquanwai.com/static/script/iqw_pc_static/20/static/js/vendors.app.1c8864a.js></script><script src=https://static.iquanwai.com/static/script/iqw_pc_static/20/static/js/app.e65de0e.js></script></body></html>";

        return msg;
    }

    @RequestMapping(value = "/demo29",method = RequestMethod.GET)
    public void demo29(HttpServletResponse response){
        try {
            response.sendRedirect("demo30");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @RequestMapping(value = "/demo30",method = RequestMethod.GET)
    public @ResponseBody User demo30(HttpServletResponse response){
        User user=new User();
        user.setUsername("小明");

        return user;

    }

    @RequestMapping(value = "/demo31",method = RequestMethod.GET)
    public void demo31(HttpServletResponse response,HttpServletRequest request) throws ServletException, IOException {
        request.getRequestDispatcher("/demo30").forward(request,response);
    }










    @RequestMapping("/getVerifiCode")
    @ResponseBody
    public void getVerifiCode(HttpServletRequest request, HttpServletResponse response) throws IOException {
        /*
             1.生成验证码
             2.把验证码上的文本存在session中
             3.把验证码图片发送给客户端
             */
        ImageVerificationCode ivc = new ImageVerificationCode();     //用我们的验证码类，生成验证码类对象
        BufferedImage image = ivc.getImage();  //获取验证码
        System.out.println("ivc.getText()===" + ivc.getText());
        request.getSession().setAttribute("text", ivc.getText()); //将验证码的文本存在session中
        ivc.output(image, response.getOutputStream());//将验证码图片响应给客户端
    }










}
