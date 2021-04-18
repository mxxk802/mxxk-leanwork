package cn.com.mxxk.service.impl;

import cn.com.mxxk.entity.SysUser;
import cn.com.mxxk.mapper.SysUserMapper;
import cn.com.mxxk.service.SysUserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * SysUserServiceImpl
 *
 * @auther zhang
 * @date 2021/4/18
 **/
@Service
public class SysUserServiceImpl implements SysUserService{

    @Autowired(required = false)
    private SysUserMapper sysUserMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(SysUser record) {
        return 0;
    }

    @Override
    public int insertSelective(SysUser record) {
        return 0;
    }

    @Override
    public SysUser selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public List<SysUser> getAllUser() {

        List<SysUser> page=  sysUserMapper.getAllUser();
        return page;
    }

    @Override
    public int updateByPrimaryKeySelective(SysUser record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(SysUser record) {
        return 0;
    }
}
