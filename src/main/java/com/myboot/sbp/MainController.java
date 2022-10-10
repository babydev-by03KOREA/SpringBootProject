package com.myboot.sbp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @RequestMapping("/index.do")
    @ResponseBody
    // ResponseBody Annotation removing > index name file find
    public String index() {
        return "<h1>index.do</h1>";
    }
}
