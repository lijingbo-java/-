package com.example.demo.service.impl;

import com.example.demo.entity.Info;
import com.example.demo.mapper.InfoMapper;
import com.example.demo.service.IInfoService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 学生信息表 服务实现类
 * </p>
 *
 * @author Mht
 * @since 2019-11-16
 */
@Service
public class InfoServiceImpl extends ServiceImpl<InfoMapper, Info> implements IInfoService {

}
