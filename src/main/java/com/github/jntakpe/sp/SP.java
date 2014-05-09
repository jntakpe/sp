package com.github.jntakpe.sp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Classe mère de l'application
 *
 * @author jntakpe
 */
@Configuration
@ComponentScan("com.github.jntakpe.sp")
@EnableAutoConfiguration
public class SP {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SP.class, args);
    }

}
