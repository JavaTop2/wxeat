package com.yc.wxeat.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
/**
 * Created by yc
 */
@Data
@Entity
public class SellerInfo {

    @Id
    private String sellerId;

    private String username;

    private String password;

    private String openid;
}
