package com.cwh.quick.core.feature.orm.dialect;

/**
 * MySQL数据库方言
 * Created by cwh on 2016/7/19.
 *
 */
public class MySql5Dialect extends Dialect
{
    protected static final String SQL_END_DELIMITER = ";";

    @Override
    public String getLimitString(String sql, int offset, int limit)
    {
        return MySql5PageHepler.getLimitString(sql,offset,limit);
    }

    @Override
    public String getCountString(String sql)
    {
        return MySql5PageHepler.getCountString(sql);
    }
}
