package com.soreal.shark_db_test.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@Table(name = "site")
public class Site {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long site_id;

    private String name;

    private String location;

    private String area1;

    private String area2;

    private String info;

}
