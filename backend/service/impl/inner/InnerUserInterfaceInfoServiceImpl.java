package com.yupi.project.service.impl.inner;

import com.yupi.project.service.UserInterfaceInfoService;
import com.yupi.yuapicommon.service.InnerUserInterfaceInfoService;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

@DubboService
public class InnerUserInterfaceInfoServiceImpl implements InnerUserInterfaceInfoService {

    @Resource
    private UserInterfaceInfoService userInterfaceInfoService;

    /**
     * 统计接口调查次数（修改剩余次数、总调用次数）
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    @Override
    public boolean invokeCount(long interfaceInfoId, long userId) {
        return userInterfaceInfoService.invokeCount(interfaceInfoId, userId);
    }

    /**
     * 查看接口剩余次数
     * @param userId
     * @return
     */
    @Override
    public int residueNum(long userId){
        return userInterfaceInfoService.residueNum(userId);
    }
}
