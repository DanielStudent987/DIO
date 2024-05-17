public class Cliente {
    private String name;
    private int telefone;
    private String cpf;


    public Cliente (String name, int telefone, String cpf) {
        this.name = name;
        this.telefone = telefone;
        this.cpf = cpf;
    }


    //GETTERS AND SETTERS
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
