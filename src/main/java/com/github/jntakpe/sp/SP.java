package com.github.jntakpe.sp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Classe mère de l'application
 *
 * @author jntakpe
 */
@Configuration
@ComponentScan("com.github.jntakpe.sp")
@EntityScan("com.github.jntakpe.sp.domain")
@EnableJpaRepositories
@EnableAutoConfiguration
public class SP {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SP.class, args);
    }

}
