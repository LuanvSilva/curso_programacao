package entities;

import java.sql.Date;

public class Order {
    
    private Integer id;
    private Date moment;
    private OrderStatus status;

    public Order(){

    }

    public Order (Integer id, Date moment, OrderStatus status){
        this.id = id;
        this.moment = moment;
        this.status = status;

    }

    
    
}