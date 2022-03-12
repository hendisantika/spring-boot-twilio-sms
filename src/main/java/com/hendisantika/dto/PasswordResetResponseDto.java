package com.hendisantika.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-twilio-sms
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 13/03/22
 * Time: 06.10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PasswordResetResponseDto {
    private OtpStatus status;
    private String message;
}
