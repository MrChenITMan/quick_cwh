package com.cwh.quick.core.generic;

/**
 * 所有自定义枚举类型实现该接口
 *
 * Created by cwh on 2016/7/25.
 **/
public interface GenericEnum {

    /**
     * value: 为保存在数据库中的值
     */
    public String getValue();

    /**
     * text : 为前端显示值
     */
    public String getText();

}
