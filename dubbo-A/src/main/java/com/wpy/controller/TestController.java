package com.wpy.controller;

import com.wpy.service.DubboA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Description:</p>
 * <pre></pre>
 * <p>Company: 深圳市旺生活互联网科技有限公司</p>
 *
 * @author wupengyu
 * @date 2017/5/31 17:25
 * @copyright 2015-2016 happylifeplat.com All Rights Reserved
 */
@RestController
public class TestController {
    @Autowired
    private DubboA dubboA;

    @RequestMapping(value = "/dubboa", method = RequestMethod.POST)
    public void test(){
        dubboA.test("dubboa");
    }
}
