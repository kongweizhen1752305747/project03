package com.situ.project03.mapper;

import com.situ.project03.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author kwz
 * @since 2022-06-06
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
