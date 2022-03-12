package com.hendisantika.service;

import com.hendisantika.config.TwilioConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-twilio-sms
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 13/03/22
 * Time: 06.11
 */
@Service
public class TwilioOTPService {
    Map<String, String> otpMap = new HashMap<>();
    @Autowired
    private TwilioConfig twilioConfig;

}
