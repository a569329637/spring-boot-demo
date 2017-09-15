package com.gsq.springbootdemo.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017/9/15.
 * 该类生效需要在 DemoApplication 上加注解 @EnableScheduling
 */
@Component
public class ScheduledTasks {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("current time: " + dateFormat.format(new Date()));
    }
}
