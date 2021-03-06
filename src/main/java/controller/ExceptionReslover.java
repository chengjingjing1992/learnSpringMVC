package controller;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author chengjinging
 * @date 2020/8/26 下午6:12
 */
public class ExceptionReslover implements HandlerExceptionResolver {


    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        SysException sysException=null;
        ModelAndView modelAndView=new ModelAndView();
        try {
            httpServletResponse.sendRedirect("demo28");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        if (e instanceof SysException){
            sysException=(SysException)e;
            modelAndView.addObject("emsg",sysException.getMessage());
            modelAndView.setViewName("error");

        }
        return modelAndView;
    }
}
