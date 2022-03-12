package com.hendisantika.dto;

import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-twilio-sms
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 13/03/22
 * Time: 06.09
 */
@Data
public class PasswordResetRequestDto {
    private String phoneNumber;
    private String userName;
    private String oneTimePassword;
}
