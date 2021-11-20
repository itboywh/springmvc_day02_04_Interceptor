package com.itboy.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**自定义拦截器
 * @author wh
 * @date 2021年11月19日22:03
 */
public class MyInterceptor2 implements HandlerInterceptor{
    /**
     *
     * preHandle 方法 预处理 在controller之前拦截
     * 可以用登录 登录成功跳转
     * return true放行，执行下一个拦截器，若没有，择执行controller
     * return false 不放行，后面controller不执行，但可以使用 request和response 调到其他页面
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("MyInterceptor2执行了,,,,前222");
      // request.getRequestDispatcher("/WEB-INF/pages/error.jsp").forward(request,response);
        return true;
    }

    /**
     *  后执行方法postHandle 方法是在controller之后执行
     *  可以处理
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("MyInterceptor2执行了,,,,后222");
      //  request.getRequestDispatcher("/WEB-INF/pages/error.jsp").forward(request,response);
    }

    /**
     * 可以释放资源 success执行后 afterCompletion 方法是在所有页面执行后运行
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("MyInterceptor2执行了,,,,最后运行222");
    }
}
