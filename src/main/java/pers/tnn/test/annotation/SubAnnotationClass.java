package pers.tnn.test.annotation;

/**
 * Description: TODO
 * User: Tian nan nan
 * Date: 2017/8/23
 */
public class SubAnnotationClass extends AnnotationClass {

    public static void main(String[] args) {

        /*
        * 查看SubAnnotationClass是否存在指定类型的注解
        * */
        System.out.println(SubAnnotationClass.class.isAnnotationPresent(AnnotationTest.class));
        /*
        * 返回程序元素上指定的注解，如果注解不存在，返回null
        * 返回结果：@pers.tnn.test.annotation.AnnotationTest(name=testAnnotation, age=2)
        * */
        System.out.println(SubAnnotationClass.class.getAnnotation(AnnotationTest.class));
        /*
        * java8新增方法，获取直接修饰程序元素的，指定类型的Annotation,如果不存在，返回null
        * 因为SubAnnotationClass的注解继承的AnnotationClass，没有直接注解
        * 所以返回结果为：null
        * */
        System.out.println(SubAnnotationClass.class.getDeclaredAnnotation(AnnotationTest.class));
        /*
        *与getDeclaredAnnotation()类似
        * */
        System.out.println(SubAnnotationClass.class.getDeclaredAnnotationsByType(AnnotationTest.class));
    }
}
