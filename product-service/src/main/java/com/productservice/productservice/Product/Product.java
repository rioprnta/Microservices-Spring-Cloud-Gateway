package com.productservice.productservice.Product;

import java.util.HashSet;
import java.util.Set;

import com.productservice.productservice.TrxProduct.TrxProduct;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "data_product")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", unique = true)
    private String id;

    @Column(name = "nama_product", unique = true)
    private String namaProduct;
    
    @Column(name = "stock_product")
    private String stock;
    
    @Column(name = "harga_product")
    private Double hargaProduct;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<TrxProduct> trxProduct = new HashSet<>();

}
