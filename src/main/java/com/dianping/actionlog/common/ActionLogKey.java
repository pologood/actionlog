package com.dianping.actionlog.common;

import com.dianping.actionlog.advice.LogManual;

/**
 * Created by jourrey on 16/11/27.
 * 主要由两部分组成Flow和Action，用来表示一组业务日志；
 * Flow：用来获取业务流，体现形式是文件夹；
 * Action：用来获取业务流的具体节点，体现形式是文件。
 * {@link LogManual}
 */
public interface ActionLogKey {

    /**
     * 业务流名称
     */
    String flow();

    /**
     * 业务功能名称
     */
    String action();

}
