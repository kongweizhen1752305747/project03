package com.situ.project03.service;

import com.situ.project03.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.situ.project03.vo.LayuiListVO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author kwz
 * @since 2022-06-06
 */
public interface IUserService extends IService<User> {

    LayuiListVO select(Integer page, Integer limit);
}
