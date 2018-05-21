package com.yc.wxeat.Service.impl;

import com.yc.wxeat.Service.SellerService;
import com.yc.wxeat.dataobject.SellerInfo;
import com.yc.wxeat.repository.SellerInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yc
 */
@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerInfoRepository repository;

    @Override
    public SellerInfo findSellerInfoByOpenid(String openid) {
        return repository.findByOpenid(openid);
    }
}
