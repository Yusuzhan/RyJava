package com.ysz;

import com.ysz.dispoables.Disposable;

public class Main {

    public static void main(String[] args) {
        testBuildingObservable();
//        testCreate();
    }

    private static void testBuildingObservable() {
        final Disposable disposable = new Disposable() {
            boolean dispose = false;

            @Override
            public void dispose() {
                dispose = true;
            }

            @Override
            public boolean isDisposed() {
                return dispose;
            }
        };
        final Observable<String> source = new Observable<String>() {
            @Override
            protected void subscribeActual(Observer<? super String> observer) {
                observer.onSubscribe(disposable);
                observer.onNext("1");
                observer.onNext("2");
                observer.onComplete();
            }
        };
        Observer<String> ob = new Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {
                System.out.println("onSubscribe");
            }

            @Override
            public void onNext(String s) {
                System.out.println("onNext " + s);
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("onError " + e);
            }

            @Override
            public void onComplete() {
                System.out.println("onComplete");
            }
        };
        source.subscribe(ob);
    }


}
