package com.homura;

import com.homura.app.bean.Alpha;
import com.homura.app.bean.Beta;
import com.homura.app.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationContextTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.start();
        context.getBean(Beta.class).b();
        //报错，AnnotationConfigApplicationContext无法获取XML配置的Bean
        Alpha alphaBean = context.getBean("alphaBean", Alpha.class);
    }
}
