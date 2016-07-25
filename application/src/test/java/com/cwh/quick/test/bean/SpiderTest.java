package com.cwh.quick.test.bean;

import com.cwh.quick.core.feature.test.TestSupport;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * Created by cwh on 2016/7/25.
 */
public class SpiderTest extends TestSupport
{
    @Resource
    private Spider spider;

    @Test
    public void testInjectSpider() throws Exception{
        System.out.println(spider);
    }
}
