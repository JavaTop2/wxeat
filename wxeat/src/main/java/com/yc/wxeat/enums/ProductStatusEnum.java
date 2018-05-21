package com.yc.wxeat.enums;

import lombok.Getter;

import javax.persistence.criteria.CriteriaBuilder;

/**
 * @author yc
 * @decripe 商品状态枚举
 */
@Getter
public enum ProductStatusEnum implements  CodeEnum{
    UP(0,"在售"),
    DOWN(1,"下架")
    ;
    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
