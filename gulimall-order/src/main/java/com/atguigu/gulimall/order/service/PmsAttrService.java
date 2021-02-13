package com.atguigu.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.order.entity.PmsAttrEntity;

import java.util.Map;

/**
 * ��Ʒ����
 *
 * @author katrinani
 * @email lichenkatrinani@gmail.com
 * @date 2021-02-12 21:05:25
 */
public interface PmsAttrService extends IService<PmsAttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

