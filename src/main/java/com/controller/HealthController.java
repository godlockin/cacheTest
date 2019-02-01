package com.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HealthController {

    private Map cache = new HashMap();

    @RequestMapping(value = "/health")
    public int healthCheck() {
        return 200;
    }

    @RequestMapping(value = "/put")
    public Map put(@RequestBody Map param) {

        cache.putAll(param);
        return cache;
    }

    @RequestMapping(value = "/get")
    public Map get(@RequestBody Map param) {

        return cache;
    }

}
