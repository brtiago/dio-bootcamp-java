package edu.tiago.spring_security_jwt.security;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "security.config")
public class SecurityConfig {
    public static String PREFIX;
    public static String KEY;
    public static Long EXPIRATION;

    public static String getPREFIX() {
        return PREFIX;
    }

    public static void setPrefix(String prefix) {
        PREFIX = prefix;
    }

    public static void setKey(String key) {
        KEY = key;
    }

    public static void setExpiration(Long expiration) {
        EXPIRATION = expiration;
    }
}
