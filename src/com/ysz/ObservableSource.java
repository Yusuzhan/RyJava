package com.ysz;

/**
 * 表示一个基础的, 无背压的可观测源接口,
 * 可由观察者消费.
 * @param <T> 元素类型
 */
public interface ObservableSource<T> {

    /**
     * 让观察者订阅可观测源.
     * @param observer 观察者
     */
    void subscribe(Observer<? super T> observer);
}
