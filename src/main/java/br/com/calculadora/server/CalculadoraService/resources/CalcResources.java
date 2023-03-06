package br.com.calculadora.server.CalculadoraService.resources;

import br.com.calculadora.server.CalculadoraService.model.Calculadora;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calc")
public class CalcResources {

    @GetMapping("/oi")
    public String response(){
        return "Serviço funcionando";
    }
    @GetMapping("/soma2/{v1}/{v2}")
    public double somarService(@PathVariable double v1, @PathVariable double v2){
        Calculadora c = new Calculadora(v1,v2);
        return c.soma();
    }

    @PostMapping("/soma")
    public double somarPost(@RequestBody Calculadora c ){
        //Calculadora c = new Calculadora(v1,v2);
        return c.soma();
    }
    @GetMapping("/soma")
    public double somarService2(@RequestParam( name = "valor1") double v1, @RequestParam( name = "valor2") double v2){
        Calculadora c = new Calculadora(v1,v2);
        return c.soma();
    }
    @DeleteMapping("/delete/{id}")
    public String somarServiceDelete(@PathVariable int id){
         return  "Aluno : " + id + " apagado";

    }

    @PutMapping("soma/{id}")
    public  String somarPut(@PathVariable int id , @RequestBody Calculadora c){
        return "Aluno: "+ id+ " status: " + c.soma();
    }
}
