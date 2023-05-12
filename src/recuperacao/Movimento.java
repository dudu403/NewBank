
package recuperacao;


public class Movimento {
    String tipoMovimento;
    String fechaMovimento;
    double saldo;

    public Movimento() {
    }

    public String getTipoMovimento() {
        return tipoMovimento;
    }
    

    public void setTipoMovimento(String tipoMovimento) {
        this.tipoMovimento = tipoMovimento;
    }

    public String getFechaMovimento() {
        return fechaMovimento;
    }

    public void setFechaMovimento(String fechaMovimento) {
        this.fechaMovimento = fechaMovimento;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
}
