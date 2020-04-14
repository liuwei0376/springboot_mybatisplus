package com.example.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.dao.UserInfoDao;
import com.example.service.UserInfoService;
import com.example.entity.UserInfoEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * User: Administrator
 * Date: 2020/4/7
 * Time: 16:20
 * Desc: 用户业务实现
 */
@Service
@Transactional
public class UserInfoSerivceImpl extends ServiceImpl<UserInfoDao, UserInfoEntity> implements UserInfoService{

    /**
     * 查询大于该分数的学生
     * @Author Sans
     * @CreateTime 2019/6/9 14:27
     * @Param  page  分页参数
     * @Param  fraction  分数
     * @Return IPage<UserInfoEntity> 分页数据
     */
    @Override
    public IPage<UserInfoEntity> selectUserInfoByGtFraction(IPage<UserInfoEntity> page, Long fraction) {
        return this.baseMapper.selectUserInfoByGtFraction(page, fraction);
    }
}
