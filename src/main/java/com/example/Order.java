package com.example;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

/**
 * Created by seungki on 2017-03-23.
 */
@Entity
@Table(name="ORDERS")
@Getter
@Setter
public class Order {

    @Id
    @GeneratedValue
    @Column(name = "ORDER_ID")
    private Long id;


    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member member;

    @OneToMany(mappedBy = "order")
    private Collection<OrderItem> orderItems;

    public enum OrderStatus{
        ORDER,CANCEL
    }
}
