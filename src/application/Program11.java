package application;

import java.util.Date;

import entities.Order;
import entities.OrderStatus;

public class Program11 {

    public static void main(String[] args){

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
    }
}
