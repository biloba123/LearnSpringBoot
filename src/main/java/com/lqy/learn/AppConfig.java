package com.lqy.learn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
@Configuration
public class AppConfig {
    @Bean
    public User user(){
        User user=new User();
        user.setUsername("biloba");
        return user;
    }
}
