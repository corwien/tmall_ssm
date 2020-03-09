package com.how2java.tmall.mapper;
import com.how2java.tmall.pojo.Category;

import com.how2java.tmall.util.Page;
import java.util.List;

/**
 * Created by kaiyiwang on 20/3/3.
 */
public interface CategoryMapper {

    public List<Category> list(Page page);

    public int total();

    void add(Category category);
}
