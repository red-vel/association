package com.feng.service.impl;

import com.feng.entity.Activity;
import com.feng.dao.ActivityMapper;
import com.feng.service.ActivityService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author rf
 * @since 2019-04-27
 */
@Service
public class ActivityServiceImpl extends ServiceImpl<ActivityMapper, Activity> implements ActivityService {

}