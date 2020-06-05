package org.zerock.mapswiper.map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j2;

@Controller
@RequestMapping("/map")
@Log4j2
public class MapController {
    
    @GetMapping("/swiper")
    public void swiper(){
        log.info("swiper called....");
    }
}