

package entities;


// Nome: Nome completo do cliente.​
// CPF: Número do Cadastro de Pessoas Físicas, utilizado para identificação no Brasil.​
// Endereço: Informações de endereço residencial ou comercial do cliente.​
// Telefone: Número de contato do cliente.​
// Lista de Contas: Contas bancárias associadas ao cliente.

public class Clients {

    private String name;
    private String CPF;

    
    
    public Clients(String name, String cpf) {
        this.name = name;
        this.CPF = cpf;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }

    

}