package com.lqy.learn;

import com.lqy.learn.quote.Quote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//@EnableScheduling
public class LearnApplication {

    private final static String URL_QUOTE = "http://gturnquist-quoters.cfapps.io/api/random";

    public static void main(String[] args) {
        //方法一
        SpringApplication.run(LearnApplication.class, args);

        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject(URL_QUOTE, Quote.class);
        System.out.println(quote);
        //方法二
//        new SpringApplication(LearnApplication.class)
//                .run(args);

        //方法三
//        new SpringApplicationBuilder()
//                .sources(LearnApplication.class)
//                .run(args);
    }

}
