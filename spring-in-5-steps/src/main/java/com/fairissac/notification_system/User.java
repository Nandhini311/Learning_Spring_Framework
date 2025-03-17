package com.fairissac.notification_system;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {

    @Autowired
    private NotificationService EmailNotificationService;

     //this is spring injection using constructor
    //    public User(NotificationService notificationService)
    //    }

    //dependency injection.
    //spring injection using setter
    public void setNotificationService(NotificationService notificationService) {
        this.EmailNotificationService = notificationService;
    }

    public void notification(){
        EmailNotificationService.sendNotification();
    }
}
