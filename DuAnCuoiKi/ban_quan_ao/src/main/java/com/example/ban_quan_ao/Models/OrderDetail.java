package com.example.ban_quan_ao.Models;

public class OrderDetail {
    private String orderDetail_id;
    private String order_id;
    private String product_id;
    private String quantity;
    private String price;

        // Getter and Setter for orderDetail_id
        public String getOrderDetail_id() {
            return orderDetail_id;
        }
    
        public void setOrderDetail_id(String orderDetail_id) {
            this.orderDetail_id = orderDetail_id;
        }
    
        // Getter and Setter for order_id
        public String getOrder_id() {
            return order_id;
        }
    
        public void setOrder_id(String order_id) {
            this.order_id = order_id;
        }
    
        // Getter and Setter for product_id
        public String getProduct_id() {
            return product_id;
        }
    
        public void setProduct_id(String product_id) {
            this.product_id = product_id;
        }
    
        // Getter and Setter for quantity
        public String getQuantity() {
            return quantity;
        }
    
        public void setQuantity(String quantity) {
            this.quantity = quantity;
        }
    
        // Getter and Setter for price
        public String getPrice() {
            return price;
        }
    
        public void setPrice(String price) {
            this.price = price;
        }
        public OrderDetail(String orderDetail_id, String order_id, String product_id, String quantity, String price){
            this.orderDetail_id = orderDetail_id;
            this.order_id = order_id;
            this.product_id = product_id;
            this.quantity = quantity;
            this.price = price;
        }
}
