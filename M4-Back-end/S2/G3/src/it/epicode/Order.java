package it.epicode;

import java.time.LocalDate;
import java.util.List;

public class Order {

    private Long id;

    private String status;

    private LocalDate orderDate;

    private LocalDate deliveryDate;

    private List<Product> productList;

    private Customer customer;

    public Order(Long id,
                 String status,
                 LocalDate orderDate,
                 LocalDate deliveryDate,
                 List<Product> productList,
                 Customer customer) {
        this.id = id;

        this.status = status;

        this.orderDate = orderDate;

        this.deliveryDate = deliveryDate;

        this.productList = productList;

        this.customer = customer;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
}
