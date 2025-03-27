package com.station.net.Rest.models;
import javax.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity

public class Resource {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

@Column
private long id;

@Column
private String product_name;

@Column
private int quantity;

public long getId(){
    return id;
}

public String getProductname(){
    return product_name;
}

public int getQuantity(){
    return quantity;
}

public void setId(long id){
    this.id = id;
}

public void setProductname(String product_name){
    this.product_name = product_name;
}

public void setQuantity(int quantity){
    this.quantity = quantity;
}
}
