package com.geekster.Urlhitcounter.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HitCountResponse {
    private String userName;
    private int count;
}
