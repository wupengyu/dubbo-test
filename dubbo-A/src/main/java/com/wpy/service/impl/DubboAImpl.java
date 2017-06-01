package com.wpy.service.impl;

import com.wpy.service.DubboA;
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
@Service("dubboa")
public class DubboAImpl implements DubboA {

    @Override
    public String test(String flag) {
        System.out.println("----------service dubboa param: " + flag);
        return flag;
    }
}
