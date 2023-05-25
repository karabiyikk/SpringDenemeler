package com.karabiyik.bean;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.logging.Logger;

public class PostConstructTutorials {
    @Autowired
    Logger logger;

    @PostConstruct
    public void init() {
        logger.info("Log info çağırıldı");
    }

    public static void main(String[] args) {
        PostConstructTutorials postConstructTutorials = new PostConstructTutorials();
        System.out.println(postConstructTutorials);
    }
}
