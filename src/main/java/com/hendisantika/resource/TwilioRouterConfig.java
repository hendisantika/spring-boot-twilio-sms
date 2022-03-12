package com.hendisantika.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-twilio-sms
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 13/03/22
 * Time: 06.15
 */
@Configuration
public class TwilioRouterConfig {

    @Autowired
    private TwilioOTPHandler twilioOTPHandler;

    @Bean
    public RouterFunction<ServerResponse> handleSMS() {
        return RouterFunctions.route()
                .POST("/api/sendOTP", twilioOTPHandler::sendOTP)
                .POST("/api/validateOTP", twilioOTPHandler::validateOTP)
                .build();
    }
}
