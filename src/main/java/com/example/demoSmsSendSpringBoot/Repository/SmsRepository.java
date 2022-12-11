package com.example.demoSmsSendSpringBoot.Repository;

import com.example.demoSmsSendSpringBoot.model.SmsRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmsRepository extends JpaRepository<SmsRequest,Long> {
}
