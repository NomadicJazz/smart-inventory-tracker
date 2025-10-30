package com.nomadicjazz.smart_inventory_trackerdemo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "suppliers")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String contactName;
    private String phone;
    private String email;
    private String address;


    // Constructors
    public Supplier() {}

    public Supplier(String name, String contactName, String phone, String email, String address) {
        this.name = name;
        this.contactName = contactName;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id; }

    public String getName() {return name;}
    public void setName(String name) {this.name = name; }

    public String getContactName() {return contactName;}
    public void setContactName(String contactName) {this.contactName = name;}

    public String getPhone() {return phone;}
    public void setPhone(String phone) {this.phone = phone;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email; }

    public String getAddress() {return address;}
    public void setAddress(String address) {this.address = address; }







}
