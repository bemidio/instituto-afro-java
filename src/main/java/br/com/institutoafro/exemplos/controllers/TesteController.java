package br.com.institutoafro.exemplos.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/institutoafro")
public class TesteController {

    @GetMapping("/nome")
    public String getNome(){

        return "Carla Dal Ri";
    }

}
