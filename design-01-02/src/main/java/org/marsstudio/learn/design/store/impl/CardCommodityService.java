package org.marsstudio.learn.design.store.impl;

import com.alibaba.fastjson.JSON;
import org.marsstudio.learn.design.card.IQiYiCardService;
import org.marsstudio.learn.design.store.ICommodity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class CardCommodityService implements ICommodity {


    private Logger logger = LoggerFactory.getLogger(CardCommodityService.class);

    private IQiYiCardService iQiYiCardService = new IQiYiCardService();

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {

        String mobile = queryUserMobile(uId);
        iQiYiCardService.generateToken(mobile, bizId);
        logger.info("请求参数[爱奇艺兑换卡] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[爱奇艺兑换卡]：success");

    }

    private String queryUserMobile(String uId) {
        return "15200101232";
    }
}
