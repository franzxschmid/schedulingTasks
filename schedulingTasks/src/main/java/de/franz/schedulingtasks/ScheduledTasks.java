package de.franz.schedulingtasks;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY.MM.dd");
    
   
    @Scheduled(fixedDelay = 5000) //The Scheduled-Annotation defines when a particular Method runs
    public void reportCurrentTime() {
        log.info("The time is now {}", timeFormat.format(new Date()));
    }
    
    @Scheduled(cron = "0 0 0 * * ?")
    public void reportCurrentDate() {
        log.info("Today is {}", dateFormat.format(new Date()));
    }
    
    @Scheduled(cron = "0 0 0 1 1 ?")
    public void scheduleTaskUsingCronExpression() {
        System.out.println("Happy New Year");
    }
    
    @Scheduled(cron = "0 0 0 24 12 ?")
    public void scheduleTaskUsingCronExpression2() {
        System.out.println("Merry Christmas");
    }
    
    
}
