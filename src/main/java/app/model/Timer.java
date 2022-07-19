package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Timer {
    private Timer timer;
    private final Long nanoTime = System.nanoTime();

    @Autowired
    public Long getTime() {
        return nanoTime;
    }

    public Timer getTimer() {
        return timer;
    }

}
