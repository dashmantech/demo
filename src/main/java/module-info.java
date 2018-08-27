// Copyright (c) 2018 Flexpoint Tech Ltd. All rights reserved.

module tech.flexpoint.demo {
    exports tech.flexpoint.demo;
    exports tech.flexpoint.demo.models;

    opens tech.flexpoint.demo to spring.core, spring.beans, spring.context, org.flywaydb.core;
    opens tech.flexpoint.demo.models to hibernate.core, org.hibernate.validator;
    opens db.migration;

    requires org.bouncycastle.provider;
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;
    requires hibernate.core;
    requires io.sentry;
    requires io.sentry.spring;
    requires java.persistence;
    requires java.sql;
    requires java.validation;
    requires javax.inject;
    requires org.apache.commons.lang3;
    requires slf4j.api;
    requires spring.beans;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.core;
    requires spring.data.commons;
    requires spring.data.jpa;
    requires spring.jdbc;
    requires spring.security.config;
    requires spring.security.core;
    requires spring.tx;
    requires spring.web;
    requires spring.webmvc;
    requires tomcat.embed.core;
}
