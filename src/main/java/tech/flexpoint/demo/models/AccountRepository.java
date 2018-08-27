// Copyright (c) 2017-2018 Flexpoint Tech Ltd. All rights reserved.

package tech.flexpoint.demo.models;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AccountRepository extends JpaRepository<Account, UUID> {
}
