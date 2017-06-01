package com.wpy.service.impl;

import com.wpy.service.DubboA;
import com.wpy.service.DubboB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>Description:</p>
 * <pre></pre>
 * <p>Company: 深圳市旺生活互联网科技有限公司</p>
 *
 * @author wupengyu
 * @date 2017/5/25 11:47
 * @copyright 2015-2016 happylifeplat.com All Rights Reserved
 */
@Service("dubbob")
public class DubboAImpl implements DubboB {

    @Autowired
    private DubboA dubboa;

    @Override
    public void test(String flag) {
        System.out.println("-----------service dubbob param: "+ flag);
        String dubboaResult = dubboa.test(flag);
        System.out.println("-----------service dubboa return: "+ dubboaResult);
    }
}
