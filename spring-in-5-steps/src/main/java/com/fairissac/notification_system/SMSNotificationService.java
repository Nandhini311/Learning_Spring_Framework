package com.fairissac.notification_system;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("sms")
public class SMSNotificationService implements NotificationService{

    @Override
    public void sendNotification() {
        System.out.println("Sending notifications via SMS");
    }
}
