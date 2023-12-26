/**
 * 
 */
package com.soa.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.soa.dto.Response;
import com.soa.dto.Factura;
import com.soa.dto.Productos;
import com.soa.dto.Request;

/**
 * 
 */
@RestController
public class FacturaRest {
    
    @PostMapping("/factura")
    public ResponseEntity<Response> facturar(@RequestBody Request request){
        Response response = new Response();
        Factura factura = new Factura();
        Productos productos = new Productos();
        
        int resultado = 0;
        List<Productos> producto = request.getFactura().getProductos();
        for(Productos producto : producto) {
            resultado += producto;
        }

        // Establecer directamente el total en el objeto de respuesta
        response.setTotal(resultado);
        
        
        ResponseEntity<Response> re = new ResponseEntity<>(response, HttpStatus.OK);
        return re;
    }
}
