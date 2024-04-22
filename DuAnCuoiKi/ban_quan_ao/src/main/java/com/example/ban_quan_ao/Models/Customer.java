package com.example.ban_quan_ao.Models;

public class Customer {
    private String customer_id;
    private String userName;
    private String passWord;
    private String email;
    private String address;
    private String phoneNumber;

        // Getter and Setter for customer_id
        public String getCustomer_id() {
            return customer_id;
        }
    
        public void setCustomer_id(String customer_id) {
            this.customer_id = customer_id;
        }
    
        // Getter and Setter for userName
        public String getUserName() {
            return userName;
        }
    
        public void setUserName(String userName) {
            this.userName = userName;
        }
    
        // Getter and Setter for passWord
        public String getPassWord() {
            return passWord;
        }
    
        public void setPassWord(String passWord) {
            this.passWord = passWord;
        }
    
        // Getter and Setter for email
        public String getEmail() {
            return email;
        }
    
        public void setEmail(String email) {
            this.email = email;
        }
    
        // Getter and Setter for address
        public String getAddress() {
            return address;
        }
    
        public void setAddress(String address) {
            this.address = address;
        }
    
        // Getter and Setter for phoneNumber
        public String getPhoneNumber() {
            return phoneNumber;
        }
    
        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
        public Customer(String customer_id, String userName, String passWord, String email,String address, String phoneNumber){
            this.customer_id = customer_id;
            this.userName = userName;
            this. passWord = passWord;
            this.email=email;
            this.address=address;
            this.phoneNumber= phoneNumber;
        }
}
