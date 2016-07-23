package com.cwh.quick.test.library.jedis;

import com.cwh.quick.core.feature.cache.redis.RedisCache;
import com.cwh.quick.core.feature.test.TestSupport;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * JedisTest : 测试 jedis 功能
 * <p>
 * Created by cwh on 2016/7/20.
 */
public class JedisTest extends TestSupport
{
    @Resource
    RedisCache redisCache;

    @Test
    public void testSet()
    {
        redisCache.cache("anchor", "cwh", 1 * 60 * 24);
    }

    @Test
    public void testGet()
    {
        System.out.printf(redisCache.get("anchor"));
    }
}
