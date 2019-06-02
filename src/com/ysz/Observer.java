package com.ysz;

import com.ysz.dispoables.Disposable;

/**
 * 提供一种机制, 用于接收基于推送的通知.
 * 当绑定到可观测源上时, 会调用onSubscribe(Disposable)方法, Disposable允许随时终端序列,
 * 观测源可任意次数调用观察者的onNext来产生通知.
 */
public interface Observer<T> {

        void onSubscribe(Disposable d);

        void onNext(T t);

        void onError(Throwable e);

        void onComplete();
}
