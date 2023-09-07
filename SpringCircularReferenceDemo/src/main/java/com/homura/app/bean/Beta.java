
package com.homura.app.bean;

public class Beta {
    private Alpha alpha;

    public void b() {
        System.out.println("Beta.b(): alpha," + this.alpha);
    }

    public void setAlpha(Alpha alpha) {
        this.alpha = alpha;
    }
}
