package com.person.mail.dao;

import com.person.mail.pojo.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @Author popeye
 * @Date 2020/05/20
 * @Version V1.0
 **/
// @Mapper
public interface CategoryMapper {
    @Select("select * from mall_category where id = #{id}")
    Category findById(@Param("id") Integer id);

    Category queryById(@Param("id")Integer id);
}
