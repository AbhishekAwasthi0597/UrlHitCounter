package com.geekster.Urlhitcounter.controller;

import com.geekster.Urlhitcounter.model.HitCountResponse;
import com.geekster.Urlhitcounter.service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.Map;

@RestController
@RequestMapping("api/v1/visitor-count-app")
public class UrlHitController {
    @Autowired
    UrlHitService urlHitService;
    @PostMapping("name")
    public String addName(@RequestBody HitCountResponse username){
        return urlHitService.addName(username);
    }
    @GetMapping("count")
    public Map<String,Integer> getHitCount(){
        return urlHitService.getHitCount();
    }
    @GetMapping("username/{username}/count")
    public Map<String, String> getHitCountByUsername(@PathVariable String username) {
        return urlHitService.getCountByUsername(username);
    }
}
