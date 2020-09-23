/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iesptocruz.franciscoadomingueziceta;

/**
 *
 * @author tote
 */
public class Calculadora {

    private double operando;
    private double resultado;
    private char operador;

    public Calculadora() {
        operando = 0;
        resultado = 0;
        operador = '=';
    }

    public double sumar() {

        switch (operador) {
            case '=':
            case '+':
                resultado = operando + resultado;
                if (operador == '=') {
                    operador = '+';
                }
                break;
            case '-':
                resultado = operando - resultado;
                operador = '+';
                break;
            case '*':
                resultado = operando * resultado;
                operador = '+';
                break;
            case '/':
                resultado = operando / resultado;
                operador = '+';
                break;
            default:
                break;
        }
        return resultado;
    }

    public double restar() {
        switch (operador) {
            case '=':
            case '-':
                resultado = operando - resultado;
                if (operador == '=') {
                    operador = '-';
                }
                break;
            case '+':
                resultado = operando + resultado;
                operador = '-';
                break;
            case '*':
                resultado = operando * resultado;
                operador = '-';
                break;
            case '/':
                resultado = operando / resultado;
                operador = '-';
                break;
            default:
                break;
        }
        return resultado;
    }

    public double multiplicar() {
        switch (operador) {
            case '=':
            case '*':
                resultado = operando * resultado;
                if (operador == '=') {
                    operador = '*';
                }
                break;
            case '+':
                resultado = operando + resultado;
                operador = '*';
                break;
            case '-':
                resultado = operando - resultado;
                operador = '*';
                break;
            case '/':
                resultado = operando / resultado;
                operador = '*';
                break;
            default:
                break;
        }
        return resultado;
    }

    public double dividir() {
        switch (operador) {
            case '=':
            case '/':
                resultado = operando / resultado;
                if (operador == '=') {
                    operador = '/';
                }
                break;
            case '+':
                resultado = operando + resultado;
                operador = '/';
                break;
            case '-':
                resultado = operando - resultado;
                operador = '/';
                break;
            case '*':
                resultado = operando * resultado;
                operador = '/';
                break;
            default:
                break;
        }
        return resultado;
    }

    public double calcular() {
        switch (operador) {
            case '+':
                resultado = operando + resultado;
                operador = '=';
                break;
            case '-':
                resultado = operando - resultado;
                operador = '=';
                break;
            case '*':
                resultado = operando * resultado;
                operador = '=';
                break;
            case '/':
                resultado = operando / resultado;
                operador = '=';
                break;
            default:
                break;
        }
        return resultado;
    }

    public void reset(){
        operando = 0.0;
        resultado = 0.0;
        operador = '=';
    }
    
    public double getOperando() {
        return operando;
    }

    public void setOperando(double operando) {
        this.operando = operando;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public char getOperador() {
        return operador;
    }

    public void setOperador(char operador) {
        this.operador = operador;
    }

}
