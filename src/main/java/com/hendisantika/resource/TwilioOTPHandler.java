package com.hendisantika.resource;

import com.hendisantika.service.TwilioOTPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-twilio-sms
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 13/03/22
 * Time: 06.13
 */
@Component
public class TwilioOTPHandler {
    @Autowired
    private TwilioOTPService twilioOTPService;
}
