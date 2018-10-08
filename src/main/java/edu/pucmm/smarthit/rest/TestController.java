package edu.pucmm.smarthit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/rest")
public class TestController {

    @ResponseBody
    @GetMapping("/test")
    public String test() {
        return "Prueba con tiempo: " + new Date().toString();
    }
}
