package com.sample.rx;


import com.jakewharton.rxrelay2.PublishRelay;
import com.jakewharton.rxrelay2.Relay;

import io.reactivex.Observable;

/**
 * Rxjava2 rxbus
 *
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 *         参考：https://gist.github.com/jaredsburrows/e9706bd8c7d587ea0c1114a0d7651d13
 *         Rxbus 升级为 RxJava 2 版本 -- > http://www.jianshu.com/p/b22e6b10c6cf
 *
 *         <p>
 *         说明：
 *        Rxjava2默认的 RxBus 在订阅者处理事件出现异常后，订阅者无法再收到事件，这是 RxJava 当初本身的设计原则，
 *        但是在事件总线中这反而是个问题，不过 JakeWharton 大神写了即使出现异常也不会终止订阅关系的 RxRelay，
 *        所以基于 RxRelay 就能写出有异常处理能力的 Rxbus。--->http://johnnyshieh.github.io/android/2017/03/10/rxbus-rxjava2/
 *
 *        JakeWharton/RxRelay:https://github.com/JakeWharton/RxRelay
 */
public final class RxBus {
    private static volatile com.smart.rx.RxBus defaultInstance;
    private Relay<Object> bus;

    public RxBus() {
        bus = PublishRelay.create().toSerialized();
    }

    // 单例RxBus。单列写法有待优化
    public static com.smart.rx.RxBus getDefault() {
        com.smart.rx.RxBus rxBus = defaultInstance;
        if (defaultInstance == null) {
            synchronized (com.smart.rx.RxBus.class) {
                rxBus = defaultInstance;
                if (defaultInstance == null) {
                    rxBus = new com.smart.rx.RxBus();
                    defaultInstance = rxBus;
                }
            }
        }
        return rxBus;
    }


    public void post(Object event) {
        bus.accept(event);
    }

    public Observable<Object> toObservable() {
        return bus;
    }

    /**
     * 判断是否有订阅者
     * @return
     */
    public boolean hasObservers() {
        return bus.hasObservers();
    }
}
