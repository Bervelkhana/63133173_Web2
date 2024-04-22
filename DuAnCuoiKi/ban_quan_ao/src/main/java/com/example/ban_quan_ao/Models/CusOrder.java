package com.example.ban_quan_ao.Models;

import java.sql.Date;

public class CusOrder {
    private String order_id;
    private String customer_id;
    private Date order_date;
    private String total_amount;
    private String status;

        // Getter and Setter for order_id
        public String getOrder_id() {
            return order_id;
        }
    
        public void setOrder_id(String order_id) {
            this.order_id = order_id;
        }
    
        // Getter and Setter for customer_id
        public String getCustomer_id() {
            return customer_id;
        }
    
        public void setCustomer_id(String customer_id) {
            this.customer_id = customer_id;
        }
    
        // Getter and Setter for order_date
        public Date getOrder_date() {
            return order_date;
        }
    
        public void setOrder_date(Date order_date) {
            this.order_date = order_date;
        }
    
        // Getter and Setter for total_amount
        public String getTotal_amount() {
            return total_amount;
        }
    
        public void setTotal_amount(String total_amount) {
            this.total_amount = total_amount;
        }
    
        // Getter and Setter for status
        public String getStatus() {
            return status;
        }
    
        public void setStatus(String status) {
            this.status = status;
        }
    public CusOrder(String order_id, String customer_id, Date order_date, String total_amount, String status){
        this.order_id = order_id;
        this. customer_id = customer_id;
        this.order_date = order_date;
        this.total_amount = total_amount;
        this.status = status;
    }
}
