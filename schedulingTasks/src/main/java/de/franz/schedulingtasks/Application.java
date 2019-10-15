/*Although scheduled tasks can be embedded in web apps and WAR files, the simpler approach demonstrated below creates 
  a standalone application. You package everything in a single, executable JAR file, driven by a good old Java main() method.*/

package de.franz.schedulingtasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication //convenience Annotation that adds all of the following: "@Configuration", "@EnableAutoConfiguration", "@ComponentScan"
@EnableScheduling //ensures that a Background-Task-Executor is created. Without it, nothing gets scheduled.
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class); //launches the Application
    }
}
