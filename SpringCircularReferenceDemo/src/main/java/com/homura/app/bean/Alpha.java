
package com.homura.app.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alpha {
    @Autowired
    private Beta beta;

    public void a() {
        System.out.println("Alpha.a(): beta=" + this.beta);
    }

    public void setBeta(Beta beta) {
        this.beta = beta;
    }
}
