package sample.general;

public enum Role {
    USER("Usuário", "Ler; editar;"),
    ADMIN("Administrador", "Ler; Editar; Criar; Excluir;"),
    OWNER("Proprietário", "Ler; Criar; Promover;"),
    TEMP("Temporário", "Ler"),
    READ("Visitante", "Ler com restrições");

    String nome;
    String permissoes;

    Role(String nome, String permissoes) {
        this.nome = nome;
        this.permissoes = permissoes;
    }
}
