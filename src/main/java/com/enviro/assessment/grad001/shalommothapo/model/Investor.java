package com.enviro.assessment.grad001.shalommothapo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Investor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String contact;

    @OneToMany(mappedBy = "investor", cascade = CascadeType.ALL)
    private List<Product> products;


}
