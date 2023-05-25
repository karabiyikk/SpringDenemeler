package com.karabiyik.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2
public class BeanDto {
    private int id;
    private String beanName;
    private String beanData;

    //başlangıç
    public void initialBeanMethod() {
        log.info("Bean başlamadan önce ");
        System.out.println("Bean başlamadan önce çalışacak method");
    }

    //bitiş
    public void destroyBenMethod() {
        log.info("Bean bittikten sonra ");
        System.out.println("Bean bittikten sonra çalışacak method");
    }
}
