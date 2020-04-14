package com.baomidou.generatorPKG.user.service.impl;

import com.baomidou.generatorPKG.user.entity.Info;
import com.baomidou.generatorPKG.user.mapper.InfoMapper;
import com.baomidou.generatorPKG.user.service.IInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 学生信息表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-04-10
 */
@Service
public class InfoServiceImpl extends ServiceImpl<InfoMapper, Info> implements IInfoService {

}
