package com.lqy.learn.greeting;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

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
@RestController
public class GreetingController {
    private final static String FORMAT_GREETING="hello, %s";
    private final AtomicInteger mId=new AtomicInteger();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "world")String name){
        return new Greeting(mId.incrementAndGet(), String.format(FORMAT_GREETING, name));
    }
}
