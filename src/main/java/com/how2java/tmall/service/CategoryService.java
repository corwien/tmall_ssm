package com.how2java.tmall.service;


import com.how2java.tmall.pojo.Category;
import com.how2java.tmall.util.Page;
import java.util.List;

/**
 * Created by kaiyiwang on 20/3/3.
 */
public interface CategoryService {

    int total();
    List<Category> list(Page page);

    void add(Category category);
}
