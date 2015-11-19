package com.MemesRUs.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by cameronoakley on 11/19/15.
 */
@Entity
public class User {
    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false)
    public String username;

    @Column(nullable = false)
    public String password;

}
