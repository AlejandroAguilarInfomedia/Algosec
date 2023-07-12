/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.accion;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
@RequestMapping(value = "/CRQalgosec")
public class CRQalgosec {

 @GetMapping("{Params}")
 public String Params(
         @PathVariable(value = "Params") String z1D_Action,
         @PathVariable String Status,
         @PathVariable String grupo_coordinador,
         @PathVariable String coordinador_cambio,
         @PathVariable String Id_CRQ,
         @PathVariable String Resumen,
         @PathVariable String Notas,
         @PathVariable String Clase,
         @PathVariable String Impacto,
         @PathVariable String Urgencia,
         @PathVariable String Prioridad,
         @PathVariable String Grupo_de_gestores,
         @PathVariable String Empresa,
         @PathVariable String Categorizacion_op_1,
         @PathVariable String Categorizacion_op_2,
         @PathVariable String Cat_producto_1,
         @PathVariable String Cat_producto_2,
         @PathVariable String Tiempo_inicial,
         @PathVariable String Tiempo_final
         ){
            return "Accion: "+z1D_Action + "Status: "+Status + "Grupo_coordinador: "+ grupo_coordinador;
    }
}
     
        
    