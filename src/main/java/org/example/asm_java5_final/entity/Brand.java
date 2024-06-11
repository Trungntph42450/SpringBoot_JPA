package org.example.asm_java5_final.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Brands")
public class Brand implements Serializable {
    @Id
    private String id;
    private String name;
    private String image;
    @JsonIgnore
    @OneToMany(mappedBy = "brand")
    private List<Product> products;
}
