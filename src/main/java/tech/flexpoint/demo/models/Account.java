// Copyright (c) 2017-2018 Flexpoint Tech Ltd. All rights reserved.

package tech.flexpoint.demo.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "accounts")
public class Account {
    @Id
    private Integer id;
}
