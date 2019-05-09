package com.orc.sandbox.base.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.util.Map;

@Component
public class ApplicationContextUtil implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    /**
     * 获取spirng上下问对象
     * @return
     */
    public static ApplicationContext getApplicationContext() {
        return ApplicationContextUtil.applicationContext;
    }

    public static Object getBean(String name) {
        if (applicationContext == null) {
            return null;
        }
        return applicationContext.getBean(name);
    }

    public static <T> T getBean(String name, Class<T> cls) {
        if (applicationContext == null) {
            return null;
        }
        return applicationContext.getBean(name, cls);
    }


    public static<T> T getBean(Class<T> requiredType) {
        if (applicationContext == null) {
            return null;
        }
        return applicationContext.getBean(requiredType);
    }



    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ApplicationContextUtil.applicationContext = applicationContext;
    }

    public static void autowireBean(Object obj) {
        AutowireCapableBeanFactory factory = applicationContext.getAutowireCapableBeanFactory();
        factory.autowireBean(obj);
    }

    public static <T> Map<String, T> getBeansOfType(Class<T> cls) {
        return applicationContext.getBeansOfType(cls);
    }

    public static Map<String, Object> getBeansWithAnnotation(Class<? extends Annotation> cls) {
        return applicationContext.getBeansWithAnnotation(cls);
    }


}