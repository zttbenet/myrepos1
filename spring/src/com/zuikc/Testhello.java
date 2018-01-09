package com.zuikc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Testhello {
    @RequestMapping("/hello")      //对应于index.jsp的hello请求
 public String hello() {
    	System.out.println("+++++++++++++++++++++++++++++++++++++++++");
    return "success";                      //返回到view的helloworld.jsp
    // TODO Auto-generated method stub

}
}