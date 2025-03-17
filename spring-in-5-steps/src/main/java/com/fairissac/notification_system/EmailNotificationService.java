package com.fairissac.notification_system;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("email")
public class EmailNotificationService implements NotificationService{
    @Override
    public void sendNotification() {
        System.out.println("Sending Notification via Email");
    }
}
