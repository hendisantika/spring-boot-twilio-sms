package com.hendisantika.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

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
}
