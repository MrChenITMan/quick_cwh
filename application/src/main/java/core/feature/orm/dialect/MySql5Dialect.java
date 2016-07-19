package core.feature.orm.dialect;

/**
 * MySQL数据库方言
 * Created by cwh on 2016/7/19.
 *
 */
public class MySql5Dialect extends Dialect
{
    @Override
    public String getLimitString(String sql, int offset, int limit)
    {
        return null;
    }

    @Override
    public String getCountString(String sql)
    {
        return null;
    }
}
