package com.ysz.dispoables;

/**
 * 表示一个可释放的源
 */
public interface Disposable {

    /**
     * 释放源, 幂等操作
     */
    void dispose();

    /**
     * 如果源已经释放了返回true
     */
    boolean isDisposed();
}
