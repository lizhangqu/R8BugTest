package com.sample.r8bugtest;

/**
 * @author lizhangqu
 * @version V1.0
 * @since 2019-10-17 17:41
 */
public interface TestClinit {
    public Throwable t = new Throwable();

    //the <clinit> will be proguard but it should not be proguard
}
