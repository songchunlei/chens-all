package org.chens.core.util;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
 * 并发工具集合
 *
 * @author songchunlei
 * @since 2018/9/17
 */
public class ConcurrentUtil {
    public static void setMaxValue(AtomicInteger current, int value) {
        int max;
        do {
            max = current.get();
        } while(value > max && !current.compareAndSet(max, value));

    }

    public static void setMaxValue(AtomicLong current, long value) {
        long max;
        do {
            max = current.get();
        } while(value > max && !current.compareAndSet(max, value));

    }
}
