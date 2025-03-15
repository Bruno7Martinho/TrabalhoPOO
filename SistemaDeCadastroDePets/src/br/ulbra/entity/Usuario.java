/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.entity;

/**
 *
 * @author aluno.saolucas
 */
public class Usuario {
    private int id;
    private String nomeUsu;
    private String emailUsu;
    private String senhaUsu;
    private String foneUsu;
    private String cpfUsu;
    private String enderecoUsu;

    public Usuario(){
        
    }
    public Usuario(int id, String nomeUsu, String emailUsu, String senhaUsu, String foneUsu, String cpfUsu, String enderecoUsu) {
        this.id = id;
        this.nomeUsu = nomeUsu;
        this.emailUsu = emailUsu;
        this.senhaUsu = senhaUsu;
        this.foneUsu = foneUsu;
        this.cpfUsu = cpfUsu;
        this.enderecoUsu = enderecoUsu;
    }

   

    

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeUsu() {
        return nomeUsu;
    }

    public void setNomeUsu(String nomeUsu) {
        this.nomeUsu = nomeUsu;
    }

    public String getEmailUsu() {
        return emailUsu;
    }

    public void setEmailUsu(String emailUsu) {
        this.emailUsu = emailUsu;
    }

    public String getSenhaUsu() {
        return senhaUsu;
    }

    public void setSenhaUsu(String senhaUsu) {
        this.senhaUsu = senhaUsu;
    }

    public String getFoneUsu() {
        return foneUsu;
    }

    public void setFoneUsu(String foneUsu) {
        this.foneUsu = foneUsu;
    }

    public String getCpfUsu() {
        return cpfUsu;
    }

    public void setCpfUsu(String cpfUsu) {
        this.cpfUsu = cpfUsu;
    }

    public String getEnderecoUsu() {
        return enderecoUsu;
    }

    public void setEnderecoUsu(String enderecoUsu) {
        this.enderecoUsu = enderecoUsu;
    }
    
   public boolean checkLogin(String email, String senha) {
   String emailValido = "usuario@dominio.com";
        String senhaValida = "senha123";

        return email.equals(emailValido) && senha.equals(senhaValida);
}
 public boolean validarSenha(String senhaUsu){
     String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";
 return senhaUsu.matches(regex);
 }
 
  public boolean confirmarSenha(String senha, String confirmarSenha) {
        // Verifica se a senha original e a de confirmação são iguais
        return senha.equals(confirmarSenha);
    }
 

        public boolean validarCPF(String cpf) {
    cpf = cpf.replaceAll("[^0-9]", ""); // Remove pontos e traços

    if (cpf.length() != 11 || cpf.matches("(\\d)\\1{10}")) { // Verifica se tem 11 dígitos e não é repetido
        return false;
    }

    int[] pesos = {10, 9, 8, 7, 6, 5, 4, 3, 2};
    int soma = 0, resto, digito1, digito2;

    for (int i = 0; i < 9; i++) {
        soma += (cpf.charAt(i) - '0') * pesos[i];
    }

    resto = soma % 11;
    digito1 = (resto < 2) ? 0 : 11 - resto;

    soma = 0;
    int[] pesos2 = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};
    for (int i = 0; i < 10; i++) {
        soma += (cpf.charAt(i) - '0') * pesos2[i];
    }

    resto = soma % 11;
    digito2 = (resto < 2) ? 0 : 11 - resto;

    return (digito1 == (cpf.charAt(9) - '0')) && (digito2 == (cpf.charAt(10) - '0'));
}

    public boolean validarLogin(String senhaUsu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }








}
