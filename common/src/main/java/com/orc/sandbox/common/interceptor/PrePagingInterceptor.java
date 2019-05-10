package com.orc.sandbox.common.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class PrePagingInterceptor extends HandlerInterceptorAdapter {

    Logger log = LoggerFactory.getLogger(PrePagingInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        log.info("pageNum:{} pageSize:{}", request.getParameter("pageNum"), request.getParameter("pageSize"));

        return super.preHandle(request, response, handler);
    }
}
