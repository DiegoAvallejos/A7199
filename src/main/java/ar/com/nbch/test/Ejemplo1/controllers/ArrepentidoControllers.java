package ar.com.nbch.test.Ejemplo1.controllers;



import ar.com.nbch.test.Ejemplo1.Servicios.ArrepentidoServicio;
import ar.com.nbch.test.Ejemplo1.modelos.ModelArrepentido;
import ar.com.nbch.test.Ejemplo1.modelos.ModelRtaArrepentido;
import ar.com.nbch.test.Ejemplo1.modelos.ModeloRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.sql.Timestamp;

import static org.springframework.http.HttpStatus.*;

@RestController

@RequestMapping("/ejemplolink")

public class ArrepentidoControllers {
    @Autowired
    private ArrepentidoServicio servicio;
    @PostMapping(path="/arrepentido")
     public ModelRtaArrepentido postArrepentido(@RequestBody ModelArrepentido modelArrepentido) {
            return servicio.postArrepentido(modelArrepentido);
    }

}
