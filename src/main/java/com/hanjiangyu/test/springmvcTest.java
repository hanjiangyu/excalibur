package com.hanjiangyu.test;

/**
 * Created by hanjiangyu on 2017/2/22.
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class springmvcTest {
    @RequestMapping("/springmvcTest")
    public String view(){
        System.out.println("你已通过springMVC进入controller方法。。。。");
        return "springmvcTest";
    }
}
