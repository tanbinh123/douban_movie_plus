package org.humingk.movie.service.common.annotation;

import org.springframework.web.bind.annotation.Mapping;

import java.lang.annotation.*;

/**
 * 自定义 @AesDecrypt AES解密注解
 * 作用位置:    类 方法
 * 作用时间:    运行时
 *
 * @author humingk
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Mapping
public @interface AesDecrypt {
}