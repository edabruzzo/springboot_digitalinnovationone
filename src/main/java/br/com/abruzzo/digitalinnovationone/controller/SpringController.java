/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.abruzzo.digitalinnovationone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author emmanuel
 */
@RestController
public class SpringController {

    @GetMapping(value = "/")
    public String hello() {
        return "Hello World";
    }

}
