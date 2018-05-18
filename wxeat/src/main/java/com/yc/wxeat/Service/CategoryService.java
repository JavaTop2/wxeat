package com.yc.wxeat.Service;

import com.yc.wxeat.dataobject.ProductCategory;

import java.util.List;

/**
 * @author yc
 */
public interface CategoryService {
    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
