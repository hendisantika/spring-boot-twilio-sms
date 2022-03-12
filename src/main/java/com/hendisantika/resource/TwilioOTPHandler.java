package com.hendisantika.resource;

import com.hendisantika.dto.PasswordResetRequestDto;
import com.hendisantika.service.TwilioOTPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

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

    public Mono<ServerResponse> sendOTP(ServerRequest serverRequest) {
        return serverRequest.bodyToMono(PasswordResetRequestDto.class)
                .flatMap(dto -> twilioOTPService.sendOTPForPasswordReset(dto))
                .flatMap(dto -> ServerResponse.status(HttpStatus.OK)
                        .body(BodyInserters.fromValue(dto)));
    }

    public Mono<ServerResponse> validateOTP(ServerRequest serverRequest) {
        return serverRequest.bodyToMono(PasswordResetRequestDto.class)
                .flatMap(dto -> twilioOTPService.validateOTP(dto.getOTP(), dto.getUserName()))
                .flatMap(dto -> ServerResponse.status(HttpStatus.OK)
                        .bodyValue(dto));
    }
}
