/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Usuario
 */
public class controller {
    
    @GetMapping("/CV")
    public String metGet(){
    
        return "Mi CV";
    
    }
    
}
