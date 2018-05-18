package com.yc.wxeat.VO;

import lombok.Data;

/**
 * http返回信息
 * @author
 */
@Data
public class ResultVO<T> {

    //错误码
    private  Integer code;
    //提示信息
    private String msg;
    //具体内容
    private T data;

}
