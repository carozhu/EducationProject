package com.smart.rx;


import com.jakewharton.rxrelay2.PublishRelay;
import com.jakewharton.rxrelay2.Relay;

import io.reactivex.Observable;

/**
 * Rxjava2 rxbus
 *
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 *         参考：https://gist.github.com/jaredsburrows/e9706bd8c7d587ea0c1114a0d7651d13
 *         Rxbus 升级为 RxJava 2 版本 -- > http://www.jianshu.com/p/b22e6b10c6cf
 *         <p>
 *         <p>
 *         说明：
 *         Rxjava2默认的 RxBus 在订阅者处理事件出现异常后，订阅者无法再收到事件，这是 RxJava 当初本身的设计原则，
 *         但是在事件总线中这反而是个问题，不过 JakeWharton 大神写了即使出现异常也不会终止订阅关系的 RxRelay，
 *         所以基于 RxRelay 就能写出有异常处理能力的 Rxbus。--->http://johnnyshieh.github.io/android/2017/03/10/rxbus-rxjava2/
 *         JakeWharton/RxRelay:https://github.com/JakeWharton/RxRelay
 *         <p>
 *         支持3种Bus:
 *         Publish Bus( RxBus，参见 PublishSubject )
 *         Behavior Bus(参见 BehaviorSubject)
 *         Replay Bus(参见ReplaySubject)
 *         </p>
 *         说明一下，RxBus支持注解方式订阅和粘滞事件。BehaviorBus和ReplayBus都是不支持的（仅支持手动订阅和发普通事件。
 *         为什么不支持注解呢，因为这两种并不常(我)用(懒)。至于不支持粘滞事件，那是因为这两个天生不合适(这是真的).
 *         比如对于ReplayBus，他发的每个事件就是粘滞事件（因为每个订阅者不管什么时候订阅都能获取到订阅前的所有事件））。
 *         想必理解三种Bus特点的同学估计已经知道原因了。不明白的请看看PublishSubject、BehaviorSubject、ReplaySubject的不同点
 *         </p> from -http://www.jianshu.com/p/7f4a709d2be5
 */
public final class RxBus {
    private static volatile RxBus defaultInstance;
    private Relay<Object> bus;

    public RxBus() {
        bus = PublishRelay.create().toSerialized();
    }

    // 单例RxBus。单列写法有待优化
    public static RxBus getDefault() {
        RxBus rxBus = defaultInstance;
        if (defaultInstance == null) {
            synchronized (RxBus.class) {
                rxBus = defaultInstance;
                if (defaultInstance == null) {
                    rxBus = new RxBus();
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
     *
     * @return
     */
    public boolean hasObservers() {
        return bus.hasObservers();
    }
}
