package cn.com.mxxk.controller;

import cn.com.mxxk.entity.SysUser;
import cn.com.mxxk.mapper.SysUserMapper;
import cn.com.mxxk.service.SysUserService;
import cn.com.mxxk.service.UserRoleService;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * SysController
 *
 * @auther zhang
 * @date 2021/4/18
 **/
@RestController
@RequestMapping("/sys")
public class SysController {

    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private UserRoleService userRoleService;

    @RequestMapping(value="getAllUser",method= RequestMethod.GET)
    public JSONObject getAllUser(@RequestParam(defaultValue = "1",value = "pageNum") Integer pageNum,@RequestParam(defaultValue = "5",value = "pageSize") Integer pageSize){
        JSONObject jsonObject=new JSONObject();


        PageHelper.startPage(pageNum,pageSize);
        List<SysUser> list = sysUserService.getAllUser();
        PageInfo<SysUser> pageInfo = new PageInfo<SysUser>(list);
        jsonObject.put("msg","查询成功");
        jsonObject.put("code","200");
        jsonObject.put("data",pageInfo.getList());
        return jsonObject;
    }

    @RequestMapping(value="addUser",method = RequestMethod.POST)
    public int addUser(@RequestBody Map<String,Object> map){

        SysUser sysUser=new SysUser();
        if (map.containsKey("emp_number")){
            String empNumber = map.get("emp_number").toString();
            sysUser.setEmpNumber(empNumber);
            System.out.println(empNumber);
        }
        if (map.containsKey("emp_name")){
            String empName = map.get("emp_name").toString();
            sysUser.setEmpName(empName);
            System.out.println(empName);
        }
        if (map.containsKey("role_ids")){
            String roleIds = map.get("role_ids").toString();
            System.out.println(roleIds);
        }
        
        System.out.println(sysUser.getEmpNumber()+":"+sysUser.getEmpName());
        //int result=sysUserService.insert(sysUser);
        return 1;
    }
}
