
package recuperacao;

import java.util.ArrayList;


public class Conta {
    String tipoConta;
    double saldoInicial;
    ArrayList<Movimento> meusmovimentos;

    public Conta() {
        meusmovimentos = new ArrayList<Movimento>();
    }
    
    public void addMovimento(Movimento m){
        meusmovimentos.add(m);
    }

    public ArrayList<Movimento> getMeusmovimentos() {
        return meusmovimentos;
    }
    
    

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }
    
    
    
}
