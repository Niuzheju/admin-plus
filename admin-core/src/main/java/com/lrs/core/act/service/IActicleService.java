package com.lrs.core.act.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lrs.common.constant.ResponseModel;
import com.lrs.common.dto.PageDTO;
import com.lrs.core.act.entity.Acticle;

import javax.servlet.http.HttpSession;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author rstyro
 * @since 2019-01-16
 */
public interface IActicleService extends IService<Acticle> {
    public ResponseModel getList(PageDTO dto) throws  Exception;
    public ResponseModel add(Acticle item, HttpSession session) throws  Exception;
    public ResponseModel edit(Acticle item, HttpSession session) throws  Exception;
    public ResponseModel del(Long id, HttpSession session) throws  Exception;
    public ResponseModel getDetail(Long id) throws  Exception;
}
