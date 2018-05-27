package com.lqy.learn.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/5/26
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @see
 * @since
 */
@Component
class ScheduledTasks {
    private final static SimpleDateFormat DATE_FORMAT =
            new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    @Scheduled(fixedRate = 2000)
    public void reportCurTime(){
        System.out.println("start");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(DATE_FORMAT.format(new Date()));
        System.out.println("end");
    }
}
