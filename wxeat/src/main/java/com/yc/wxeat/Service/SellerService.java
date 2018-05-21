package com.yc.wxeat.Service;

import com.yc.wxeat.dataobject.SellerInfo;

/**
 * 卖家端
 * Created by yc
 */
public interface SellerService {

    /**
     * 通过openid查询卖家端信息
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}
