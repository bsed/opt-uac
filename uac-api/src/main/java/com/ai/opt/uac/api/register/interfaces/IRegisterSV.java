package com.ai.opt.uac.api.register.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.uac.api.register.param.PhoneRegisterRequest;
import com.ai.opt.uac.api.register.param.PhoneRegisterResponse;

/**
 * 注册服务<br>
 * Date: 2016年3月16日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhanglh
 */
public interface IRegisterSV {

    /**
     * bass用户注册
     * 
     * @param request
     * @return 账号ID
     * @throws BusinessException
     * @throws SystemException
     * @author zhanglh
     * @ApiCode UAC_0001
     */
    PhoneRegisterResponse registerByPhone(PhoneRegisterRequest request)
            throws BusinessException, SystemException;

}
