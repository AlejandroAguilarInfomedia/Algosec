/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.accion;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/CRQalgosec2")
public class CRQalgosec2 {
    public static final Logger log = Logger.getLogger(CRQalgosec2.class);
    //@GetMapping("CRQalgosec2/{z1D_Action}/{Status}/{grupo_coordinador}/{coordinador_cambio}/{Id_CRQ}/{Resumen}/{Notas}/{Clase}/{Impacto}/{Urgencia}/{Prioridad}/{Grupo_de_gestores}/{Empresa}/{Categorizacion_op_1}/{Categorizacion_op_2}/{Cat_producto_1}/{Cat_producto_2}/{Tiempo_inicial}/{Tiempo_final}")
    @GetMapping("{Description}/{Status}/{grupo_coordinador}") 
 public String Params2(
         
         @PathVariable String Description,
         @PathVariable String Status,
         @PathVariable String grupo_coordinador
         
         ){
            log.info(Description);
            log.info(Status);
            log.info(grupo_coordinador);
            return "Accion: "+Description + "Status: "+Status + "Grupo_coordinador: "+ grupo_coordinador;
    }
}
