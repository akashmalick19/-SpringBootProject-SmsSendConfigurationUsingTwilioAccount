package com.example.demoSmsSendSpringBoot.Configuration;

import com.twilio.Twilio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TwilioInitilization {

    Logger log= LoggerFactory.getLogger(TwilioInitilization.class);
    @Autowired
    private TwilioConfigaration twilioConfigaration;

    public TwilioInitilization(TwilioConfigaration twilioConfigaration) {
        this.twilioConfigaration = twilioConfigaration;
        Twilio.init(twilioConfigaration.getSId(),twilioConfigaration.getAuthToken());
        log.info("Twilio account is initialize with sid "+ twilioConfigaration.getSId());
    }

}
