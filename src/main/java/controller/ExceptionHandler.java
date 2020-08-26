package controller;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author chengjinging
 * @date 2020/8/26 下午5:38
 */
public class ExceptionHandler implements HandlerExceptionResolver {


    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest,
                                         HttpServletResponse httpServletResponse,
                                         Object o,
                                         Exception e) {

            ModelAndView modelAndView=new ModelAndView();
            modelAndView.addObject( "emsg",((ExceptionClass) e).getMsg());
            modelAndView.setViewName("error");
            return modelAndView;

    }
}
