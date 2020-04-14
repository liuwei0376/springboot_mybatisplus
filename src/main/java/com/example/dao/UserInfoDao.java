package com.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.entity.UserInfoEntity;
import org.apache.ibatis.annotations.Param;

/**
 * User: Administrator
 * Date: 2020/4/7
 * Time: 16:06
 * Desc: 用户信息DAO
 */
public interface UserInfoDao extends BaseMapper<UserInfoEntity> {


    /**
     * 查询大于该分数的学生
     * @Author Sans
     * @CreateTime 2019/6/9 14:28
     * @Param  page  分页参数
     * @Param  fraction  分数
     * @Return IPage<UserInfoEntity> 分页数据
     */
    IPage<UserInfoEntity> selectUserInfoByGtFraction(IPage<UserInfoEntity> page, @Param("fraction") Long fraction);


}
