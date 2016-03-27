package br.calebe.ticketmachine.core;

import java.util.Iterator;

/**
 *
 * @author Calebe de Paula Bianchini
 */
class Troco {

    protected PapelMoeda[] papeisMoeda;

    public Troco(int valor) {
        papeisMoeda = new PapelMoeda[6];
        
        int quant_notas = valor / 100;
        valor %= 100;
        papeisMoeda[5] = new PapelMoeda(100, quant_notas);
        
        quant_notas = valor / 50;
        valor %= 50;        
        papeisMoeda[4] = new PapelMoeda(50, quant_notas);
        
        quant_notas = valor / 20;
        valor %= 20;        
        papeisMoeda[3] = new PapelMoeda(20, quant_notas);
        
        quant_notas = valor / 10;
        valor %= 10;       
        papeisMoeda[2] = new PapelMoeda(10, quant_notas);
        
        if (valor != 6 && valor != 8) {
            quant_notas = valor / 5;
            valor %= 5;
            papeisMoeda[1] = new PapelMoeda(5, quant_notas);
        }
        
        quant_notas = valor / 2;
        valor %= 2;
        papeisMoeda[0] = new PapelMoeda(2, quant_notas);
    }

    public Iterator<PapelMoeda> getIterator() {
        return new TrocoIterator(this);
    }
}
