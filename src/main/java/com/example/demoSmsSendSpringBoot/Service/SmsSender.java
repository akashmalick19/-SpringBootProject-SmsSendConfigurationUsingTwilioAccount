package com.example.demoSmsSendSpringBoot.Service;

import com.example.demoSmsSendSpringBoot.model.SmsRequest;

public interface SmsSender {
    public void sendSms(SmsRequest smsRequest);
}
