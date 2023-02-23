package com.googledrive.GoogleDriveFile.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class Config {

//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//                .logout(l -> l
//                        .logoutSuccessUrl("/").permitAll()
//                        .invalidateHttpSession(true)
//                        .deleteCookies("JSESSIONID")
//                )
//                .oauth2Login(withDefaults()).oauth2Login().defaultSuccessUrl("/topHeadlines");
//        return http.build();
//    }
}
