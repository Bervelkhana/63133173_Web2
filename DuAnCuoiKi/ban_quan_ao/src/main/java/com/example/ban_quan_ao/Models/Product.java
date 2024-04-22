package com.example.ban_quan_ao.Models;

public class Product {
    private String product_id;
    private String name;
    private String description;
    private String price;
    private String category_id;

        // Getter and Setter for product_id
        public String getProduct_id() {
            return product_id;
        }
    
        public void setProduct_id(String product_id) {
            this.product_id = product_id;
        }
    
        // Getter and Setter for name
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        // Getter and Setter for description
        public String getDescription() {
            return description;
        }
    
        public void setDescription(String description) {
            this.description = description;
        }
    
        // Getter and Setter for price
        public String getPrice() {
            return price;
        }
    
        public void setPrice(String price) {
            this.price = price;
        }
    
        // Getter and Setter for category_id
        public String getCategory_id() {
            return category_id;
        }
    
        public void setCategory_id(String category_id) {
            this.category_id = category_id;
        }
        public Product (String product_id, String name, String description, String price, String category_id) {
            this.product_id = product_id;
            this. name = name; 
            this. description = description;
            this. price = price;
            this. category_id = category_id;
        }
}
