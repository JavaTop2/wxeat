package com.yc.wxeat.Service;


import com.yc.wxeat.dto.OrderDTO;

/**
 * 推送消息
 * Created by yc
 */
public interface PushMessageService {

    /**
     * 订单状态变更消息
     * @param orderDTO
     */
    void orderStatus(OrderDTO orderDTO);
}
