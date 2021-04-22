package ar.com.nbch.test.Ejemplo1.controllers;

import ar.com.nbch.test.Ejemplo1.modelos.ModeloRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ejemplo")
public class EjemploControllers {
    @GetMapping(path="/nombre")
    public String obtenerNombre(){
        return "respuesta Diego";
    }
    @PostMapping(path="/")
    public String postNombre(@RequestBody ModeloRequest nombre){


        return "respuesta " + nombre.getPam1();
    }
}
