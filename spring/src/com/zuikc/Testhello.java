package com.zuikc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Testhello {
    @RequestMapping("/hello")      //��Ӧ��index.jsp��hello����
 public String hello() {
    	System.out.println("+++++++++++++++++++++++++++++++++++++++++");
    return "success";                      //���ص�view��helloworld.jsp
    // TODO Auto-generated method stub

}
}