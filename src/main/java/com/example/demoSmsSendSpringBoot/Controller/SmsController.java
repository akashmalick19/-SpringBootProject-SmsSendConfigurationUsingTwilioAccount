package com.example.demoSmsSendSpringBoot.Controller;

import com.example.demoSmsSendSpringBoot.Repository.SmsRepository;
import com.example.demoSmsSendSpringBoot.Service.SmsService;
import com.example.demoSmsSendSpringBoot.model.SmsRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

@RestController
@RequestMapping(value = "/api/sms/send")
public class SmsController {

    Logger log= LoggerFactory.getLogger(SmsController.class);
    @Autowired
    private SmsService smsService;
    @Autowired
    private SmsRepository smsRepository;

    //@PostMapping
    @RequestMapping(method = RequestMethod.POST)
    public String sendSms(@Valid @RequestBody SmsRequest smsRequest){
        if(isPhoneNumberValid(smsRequest.getPhoneNumber())){
            smsService.sendSms(smsRequest);
            smsRepository.save(smsRequest);
            log.info("SMS is to be send " + smsRequest.getPhoneNumber() + " number.");
            return ("SMS is to be send "+ smsRequest.getPhoneNumber() + " number.");
        }
        else {
            log.info(smsRequest.getPhoneNumber() +" is not proper phone number.");
            return (smsRequest.getPhoneNumber() +" is not proper phone number.");
        }

    }

    private boolean isPhoneNumberValid(String phoneNumber) {
        return true;
    }

}
