package com.sample.entity;
import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "t_order1")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "order_num")
    private String orderNum;
    @Column(name = "create_date")
    private Date createDate;
    /*@ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "user_id")
    private UserEntity role;*/

    public OrderEntity() {
    }

    public OrderEntity(String name, String orderNum, Date createDate) {
        this.name = name;
        this.orderNum = orderNum;
        this.createDate = createDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
