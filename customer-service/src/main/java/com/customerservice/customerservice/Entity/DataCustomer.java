package com.customerservice.customerservice.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "data_customer")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DataCustomer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", unique = true)
    private String id;

    @Column(name = "name_customer")
    private String nama;
    
    @Column(name = "alamat_customer")
    private String alamat;
    
    @Column(name = "nohp_customer")
    private String nohp;

}
