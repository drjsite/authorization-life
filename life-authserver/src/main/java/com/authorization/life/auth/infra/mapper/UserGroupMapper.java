package com.authorization.life.auth.infra.mapper;

import java.util.List;

import com.authorization.life.auth.infra.entity.UserGroup;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * 用户组表 持久
 *
 * @author code@code.com 2022-02-21 20:24:00
 */
@Repository
public interface UserGroupMapper extends BaseMapper<UserGroup> {

    List<UserGroup> page(UserGroup usergroup);

}
