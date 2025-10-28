/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Ana Luiza Soares
 */
public class Raio {
    //atributos
    private double raio;
    private String opcao;

    public String getOpcao() {
        return opcao;
    }

    public void setOpcao(String opcao) {
        this.opcao = opcao;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) throws Exception {
        if (raio <= 0) throw new Exception ("O raio não pode ser <= 0");
        this.raio = raio;
    }
    
    
    //metodos
    public double calcularAreaSuperficial(){
        return  ( 4.0 * 3.1415 * raio*raio);
    }
    public double calcularVolume(){
        return (calcularAreaSuperficial()*raio/3.0);
        //retrun (float) (4.0/3.0*3.1415*Math.pow(raio,3));
        //pode ser usada essa forma tambem para calcular
    }
}
