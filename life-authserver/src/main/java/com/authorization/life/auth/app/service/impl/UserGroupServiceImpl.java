package com.authorization.life.auth.app.service.impl;

import com.authorization.life.auth.app.service.UserGroupService;
import com.authorization.life.auth.infra.entity.UserGroup;
import com.authorization.life.auth.infra.mapper.UserGroupMapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户组表
 *
 * @author code@code.com
 * @date 2022-02-21 20:24:00
 */
@Service
public class UserGroupServiceImpl implements UserGroupService {

    @Autowired
    private UserGroupMapper mapper;


    /**
     * 查找该用户所属的用户组
     */
    @Override
    public List<UserGroup> selectByUserId(Long userId) {
        return mapper.selectList(Wrappers.lambdaQuery(UserGroup.class).eq(UserGroup::getUserId, userId));
    }
}
