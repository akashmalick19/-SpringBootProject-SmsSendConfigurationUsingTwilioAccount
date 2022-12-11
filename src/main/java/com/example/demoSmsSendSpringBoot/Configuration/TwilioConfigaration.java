package com.example.demoSmsSendSpringBoot.Configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("twilio.account")
@Data
public class TwilioConfigaration {
    private String sId;
    private String authToken;
    private String number;
}
