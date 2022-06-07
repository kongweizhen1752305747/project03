package com.situ.project03.service.impl;

import com.situ.project03.entity.Role;
import com.situ.project03.mapper.RoleMapper;
import com.situ.project03.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色名称 服务实现类
 * </p>
 *
 * @author kwz
 * @since 2022-06-06
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
