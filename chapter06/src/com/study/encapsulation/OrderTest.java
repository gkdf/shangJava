package com.study.encapsulation;

/**
 * ClassName: OrderTest
 * Package: com.study.encapsulation
 * Description:
 *
 * @Author wkm
 * @Create 2023/4/12 15:19
 * @Version 1.0
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();

        //调用属性
        order.orderDefault = 1;
        order.orderPublic = 2;
        //调用方法
        order.methodDefault();
        order.methodPublic();

        //不能调用
//        order.orderPrivate = 3;
//        order.methodPrivate();
    }
}
