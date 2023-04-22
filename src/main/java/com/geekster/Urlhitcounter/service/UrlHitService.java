package com.geekster.Urlhitcounter.service;

import com.geekster.Urlhitcounter.dao.UrlHitDao;
import com.geekster.Urlhitcounter.model.HitCountResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UrlHitService {
    @Autowired
    UrlHitDao urlHitDao;
     Map<String,Integer> response=new HashMap<>();
    public Map<String,Integer> getHitCount() {
        int count = urlHitDao.getHitCount();
        response.put("visitors", count);
        return response;
    }
    Map<String, String> response1=new HashMap<String, String>();
    public Map<String, String> getCountByUsername(String username) {
         int count1=urlHitDao.getHitCount();
          response1.put("userName",username);
          response1.put("count", String.valueOf(count1));
          return response1;
    }

    public String addName(HitCountResponse username) {
        boolean status =urlHitDao.addNme(username);
        if(status){
            return "Added..,";
        }else{
            return "Not Added";
        }
    }
}
