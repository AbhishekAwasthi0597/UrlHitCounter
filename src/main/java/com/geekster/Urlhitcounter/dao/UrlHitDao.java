package com.geekster.Urlhitcounter.dao;

import com.geekster.Urlhitcounter.model.HitCountResponse;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UrlHitDao {
    private int hitCount=0;
    public int getHitCount() {
        return hitCount++;
    }
    List<HitCountResponse> list=new ArrayList<>();
    public boolean addNme(HitCountResponse username) {
         list.add(username);
          return true;
    }
}
