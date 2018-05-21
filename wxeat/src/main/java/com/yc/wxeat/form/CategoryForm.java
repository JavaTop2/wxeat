package com.yc.wxeat.form;

import lombok.Data;
/**
 * Created by yc
 */
@Data
public class CategoryForm {

    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;
}
