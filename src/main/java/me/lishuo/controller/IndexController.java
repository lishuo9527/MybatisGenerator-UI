package me.lishuo.controller;

import com.alibaba.fastjson.JSONObject;
import me.lishuo.service.GenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by lis on 17/5/11.
 */
@Controller
public class IndexController {

    @Autowired
    public GenService genService;


    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/gen")
    @ResponseBody
    public String generator(HttpServletRequest request) {

        String path = request.getContextPath();
        String basePath = request.getScheme() + "://"
                + request.getServerName() + ":" + request.getServerPort()
                + path + "/";

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", genService.genCode(request));
        jsonObject.put("basepath", basePath);


        return jsonObject.toJSONString();
    }


}