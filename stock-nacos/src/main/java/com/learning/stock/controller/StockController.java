package com.learning.stock.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类描述：TODO
 *
 * @author djq
 * @date 2022-06-22 15:23
 **/
@RestController
@RequestMapping("/stock")
public class StockController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/reduct")
    public String reduct(){
        System.out.println("扣减库存！");
        return "扣减库存:" + port;
    }
}
