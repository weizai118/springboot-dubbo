package com.gf.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gf.service.TicketService;
import com.gf.service.UserService;
import org.springframework.stereotype.Service;

/**
 * <p>Title: UserServiceImpl</p>
 * <p>Description: </p>
 * <p>Company: </p>
 *
 * @author guofu
 * @version 1.0
 * @date 2018-05-24 10:13
 */
@Service
public class UserServiceImpl implements UserService{

    @Reference
    TicketService ticketService;

    @Override
    public String hello(String name){
        String result = ticketService.getTicket(name);
        return result;
    }

}
