// Copyright (c) 2017-2018 Flexpoint Tech Ltd. All rights reserved.

package tech.flexpoint.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {
    @RequestMapping("/status")
    public String status() {
        return "All OK";
    }
}
