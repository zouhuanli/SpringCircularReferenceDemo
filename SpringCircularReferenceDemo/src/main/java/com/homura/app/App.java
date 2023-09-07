

package com.homura.app;

import com.homura.app.bean.Alpha;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:App-context.xml");
        context.start();
        Alpha alpha = context.getBean(Alpha.class);
        alpha.a();
    }
}
