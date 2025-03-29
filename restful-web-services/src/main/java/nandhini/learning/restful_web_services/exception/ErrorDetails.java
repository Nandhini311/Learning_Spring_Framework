package nandhini.learning.restful_web_services.exception;

import java.time.LocalDate;

public class ErrorDetails {

    //timestamp
    private LocalDate timeStamp;
    //message
    private String message;
    //details
    private String details;

    public ErrorDetails(LocalDate timeStamp, String message, String details) {
        this.timeStamp = timeStamp;
        this.message = message;
        this.details = details;
    }

    public LocalDate getTimeStamp() {
        return timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}
