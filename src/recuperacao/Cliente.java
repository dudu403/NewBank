
package recuperacao;

import java.util.ArrayList;


public class Cliente {
    String nome;
    String telefone;
    String cpf;
    ArrayList<Conta> minhasconta;

    public Cliente() {
        minhasconta = new ArrayList<Conta>();
    }
    
    public void addConta(Conta c){
        minhasconta.add(c);
    }

    public ArrayList<Conta> getMinhasconta() {
        return minhasconta;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    
}
