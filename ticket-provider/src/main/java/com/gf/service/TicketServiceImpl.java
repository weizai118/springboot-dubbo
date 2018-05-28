package com.gf.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * <p>Title: TicketServiceImpl</p>
 * <p>Description: </p>
 * <p>Company: </p>
 *
 * @author guofu
 * @version 1.0
 * @date 2018-05-24 10:08
 */
@Component
@Service //将服务发布出去
public class TicketServiceImpl implements TicketService{


    @Override
    public String getTicket(String name) {
        return name +" 买到了《厉害了，我的国》";
    }
}
