package com.sample.r8bugtest;

/**
 * @author lizhangqu
 * @version V1.0
 * @since 2019-10-17 17:41
 */
public interface TestClinit {
    Throwable t = new Throwable();

    //the <clinit> will be obfuscated when there is an applymapping rule in the proguard rule, but it should not be obfuscated actually.
    //Excetion (Method(Lcom/sample/r8bugtest/TestClinit;.a) is marked constructor, but doesn't match name) will be thrown in runtime.
}
