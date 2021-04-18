package cn.com.mxxk.service.impl;

import cn.com.mxxk.entity.UserRole;
import cn.com.mxxk.mapper.UserRoleMapper;
import cn.com.mxxk.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserRoleServiceImpl
 *
 * @auther zhang
 * @date 2021/4/18
 **/
@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired(required = false)
    private UserRoleMapper userRoleMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(UserRole record) {

        int result=0;
        result=userRoleMapper.insert(record);
        return result;
    }

    @Override
    public int insertSelective(UserRole record) {
        return 0;
    }

    @Override
    public UserRole selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(UserRole record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(UserRole record) {
        return 0;
    }
}
