package com.karabiyik.bean;

import com.karabiyik.dto.BeanDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {
    @Bean(initMethod = "initialBeanMethod", destroyMethod = "destroyBenMethod")
    @Scope("singleton") // request session
    public BeanDto beanDto() {
        return BeanDto.builder().id(0).beanName("my Bean").beanData("my Data").build();

    }
}
