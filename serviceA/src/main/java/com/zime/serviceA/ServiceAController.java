package com.zime.serviceA;


import org.springframework.web.bind.annotation.RestController;

import com.zime.api.ServiceAInterface;

@RestController
public class ServiceAController implements ServiceAInterface{


    @Override
    public String Welcome(Long id, String name) {
        if(name.equals("cc")){
            return "{'欢迎光临Vip:"+name+"'}";
        }else
        {
            return "who are you?";}
    }
}
