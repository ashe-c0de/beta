package com.example.beta.conf.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

@Configuration
public class BeanConf {

    /**
     * 与授权服务器的私钥保持一致
     */
    private static final String SIGN_KEY = "Little pigs, little pigs, let me come in.";

    /**
     * 注入自定义配置的tokenStore
     */
    @Bean
    public TokenStore tokenStore(){
        // 基于内存的普通令牌
//        return new InMemoryTokenStore();
        // jwt令牌
        return new JwtTokenStore(jwtAccessTokenConverter());
    }

    /**
     * 自定义私钥加密
     */
    @Bean
    public JwtAccessTokenConverter jwtAccessTokenConverter(){
        JwtAccessTokenConverter jwtAccessTokenConverter = new JwtAccessTokenConverter();
        jwtAccessTokenConverter.setSigningKey(SIGN_KEY);
        return jwtAccessTokenConverter;
    }
}
