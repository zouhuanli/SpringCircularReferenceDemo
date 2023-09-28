
package com.homura.app.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Beta {
    @Autowired
    private Alpha alpha;

    public void b() {
        System.out.println("Beta.b(): alpha=" + this.alpha);
    }

    public void setAlpha(Alpha alpha) {
        this.alpha = alpha;
    }
}
