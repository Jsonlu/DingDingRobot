package cn.jsonlu.controller;

import cn.jsonlu.service.NetService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Author:JsonLu
 * DateTime:17/2/7 13:37
 * Email:jsonlu@qq.com
 * Desc:
 */
public interface BaseController {
    Logger logger = LoggerFactory.getLogger("控制器");
    NetService netService = new NetService();
}
