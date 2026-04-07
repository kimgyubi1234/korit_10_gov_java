package study.ch20;

import java.util.ArrayList;
import java.util.List;

public class OderMain {
    public static void main(String[] args) {
        List<Order> orderList = new ArrayList<>();
        List<OrderDetail> orderDetailList = new ArrayList<>();
        Product product1 = Product.builder().productName().price().build();
        OrderDetail.builder().number().product().stock().build();
        orderDetailList.add();

        Oder.builder().orderNumber().orderDetails().orderDateTime().build()
        orderList.add()
    }
}
