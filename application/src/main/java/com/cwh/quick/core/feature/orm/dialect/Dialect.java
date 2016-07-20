package com.cwh.quick.core.feature.orm.dialect;

/**
 * 数据库方言抽象类
 *
 * Created by cwh on 2016/7/19.
 */
public abstract class Dialect
{
    /**
     * 得到分页sql
     * @param sql
     * @param offset
     * @param limit
     * @return
     */
    public abstract String getLimitString(String sql,int offset,int limit);

    /**
     * 得到总数量 sql
     * @param sql
     * @return
     */
    public abstract String getCountString(String sql);
}
