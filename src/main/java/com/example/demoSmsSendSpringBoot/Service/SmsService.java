package com.example.demoSmsSendSpringBoot.Service;

import com.example.demoSmsSendSpringBoot.Configuration.TwilioConfigaration;
import com.example.demoSmsSendSpringBoot.model.SmsRequest;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.MessageCreator;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SmsService implements SmsSender{
    @Autowired
    private TwilioConfigaration twilioConfigaration;
    @Override
    public void sendSms(SmsRequest smsRequest) {
        PhoneNumber to=new PhoneNumber(smsRequest.getPhoneNumber());
        PhoneNumber from=new PhoneNumber(twilioConfigaration.getNumber());
        String body=smsRequest.getSmsBody();
        MessageCreator messageCreator= Message.creator(to,from,body);
        messageCreator.create();
    }
}
