package com.dgut.provider.controller;


import com.dgut.provider.serive.TickertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TickerController {

    @Autowired
    TickertService tickertService;

    @GetMapping("/ticket")
    public String getTicket(){
        String ticket = tickertService.getTicket();
        return "买到了" + ticket;
    }
}
