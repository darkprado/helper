package my.home.helper;

import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.Environment;

import java.io.PrintStream;

@SpringBootApplication
public class HelperApplication implements CommandLineRunner {

    public static void main(String[] args) {
//        SpringApplication.run(HelperApplication.class, args);
        SpringApplication app = new SpringApplication(HelperApplication.class);
        app.setBanner(new Banner() {
            @Override
            public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
                out.println("░░░░░░░░░▄▄▄▄▄▀▀▀██▀▀▀▀▀▀▀▄▄▄▄▄░░░░░░░░░\n" +
                        "░░░░░▄▄▀▀▀░░▄▄▄▄░██░░░░░░░░░░░▀▀▀▄▄░░░░░\n" +
                        "░░▄█▀░░▄▄██████▀░███░░░░░░▄████▄▄░░▀█▄░░\n" +
                        "░█▀░░▄█████████░███▀░░░░░▄████████▄░░▀█░\n" +
                        "█▀░░███████████░███░░░░▄████████████░░░█\n" +
                        "█▄░░███████████░█▀░░░░▄█████████████░░▄█\n" +
                        "░█▄░░▀█████████░░░░▄██▀░░█████████▀░░▄█░\n" +
                        "░░▀█▄░░▀▀██████▄██████░████████▀▀░░▄█▀░░\n" +
                        "░░░░░▀▀▄▄▄░░▀▀▀▀▄▄▄▄▄▄▄▀▀▀▀▀░░▄▄▄▀▀░░░░░\n" +
                        "░░░░░░░░░▀▀▀▀▀▄▄▄▄▄▄▄▄▄▄▄▄▀▀▀▀▀░░░░░░░░░");
            }
        });
        app.run(args);
    }

    @Order(2)
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello from command line runner!");
    }

    @Order(1)
    @Bean
    CommandLineRunner myRunner() {
        return args -> System.out.println("Hello runner with bean!");
    }
}
