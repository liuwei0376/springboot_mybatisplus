package com.example.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.entity.UserInfoEntity;

/**
 * User: Administrator
 * Date: 2020/4/7
 * Time: 16:06
 * Desc: 用户业务接口
 */
public interface UserInfoService extends IService<UserInfoEntity> {

    /**
     * 查询大于该分数的学生
     * @Param  page  分页参数
     * @Param  fraction  分数
     * @Return IPage<UserInfoEntity> 分页数据
     */
    IPage<UserInfoEntity> selectUserInfoByGtFraction(IPage<UserInfoEntity> page, Long fraction);


}
