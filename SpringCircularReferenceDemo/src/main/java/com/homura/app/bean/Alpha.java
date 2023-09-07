
package com.homura.app.bean;

public class Alpha {
    private Beta beta;

    public void a() {
        System.out.println("Alpha.a(): beta," + this.beta);
    }

    public void setBeta(Beta beta) {
        this.beta = beta;
    }
}
