package com.situ.project03.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.situ.project03.entity.User;
import com.situ.project03.mapper.UserMapper;
import com.situ.project03.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.situ.project03.vo.LayuiListVO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author kwz
 * @since 2022-06-06
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public LayuiListVO select(Integer page, Integer limit) {
        LayuiListVO vo = new LayuiListVO();
        PageHelper.startPage(page,limit);
        List<User> list = baseMapper.selectList(null);
        vo.setData(list);
        vo.setCount(new PageInfo<>(list).getTotal());
        return vo;
    }
}
