package org.acme.hibernate.orm.panache;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Cacheable
public class User extends PanacheEntity {
    @Column(length = 64)
    public String username;
    @Column(unique = true)
    public String email;
}
