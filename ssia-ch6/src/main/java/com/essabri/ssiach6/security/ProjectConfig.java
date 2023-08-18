package com.essabri.ssiach6.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.scrypt.SCryptPasswordEncoder;

/**
 * @author FZ.ESSABRI
 */
public class ProjectConfig {
    @Bean
    public BCryptPasswordEncoder getBCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SCryptPasswordEncoder getSCryptPasswordEncoder(){
        return SCryptPasswordEncoder.defaultsForSpringSecurity_v5_8();
    }
}
