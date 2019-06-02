package com.ysz;

public abstract class Observable<T> implements ObservableSource<T> {


    protected abstract void subscribeActual(Observer<? super T> observer);

    @Override
    public void subscribe(Observer<? super T> observer) {
        // 省略了null判断和钩子工具
        subscribeActual(observer);
    }
}
