package pers.tnn.test.annotation;

import java.lang.annotation.*;

/**
 * Description: 注解测试
 * User: Tian nan nan
 * Date: 2017/8/23
 */
//@SuppressWarnings(value = "unchecked")
@Retention(value = RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Inherited
public  @interface AnnotationTest {
    // 带成员变量的Annotation
    String name() default "annotation";
    int age() default 1;
}
