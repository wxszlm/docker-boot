package top.yxf.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
* 订单
* @author xs.wu
* @className OrderController
* @date 2023/2/22 15:50
*/
@RequestMapping("/order")
@RestController
public class OrderController {


    @GetMapping("/index")
    public String index() {
        return "order index ~~~" + UUID.randomUUID();
    }


    @GetMapping("/docker")
    public String docker() {
        return "order docker ~~~" + UUID.randomUUID();
    }

}
