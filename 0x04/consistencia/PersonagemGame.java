public class PersonagemGame {
    private String nome;
    private int saudeAtual;
    private String status;

    public PersonagemGame(int saudeAtual, String nome) {
        this.setSaudeAtual(saudeAtual);
        this.nome = nome;
    }

    public void tomarDano(int quantidadeDeDano) {
        if (saudeAtual - quantidadeDeDano <= 0) {
            this.setSaudeAtual(0);
        } else {
          this.setSaudeAtual(saudeAtual -= quantidadeDeDano);
        }
    }

    public void receberCura(int quantidadeDeCura) {
        if (saudeAtual + quantidadeDeCura >= 100) {
            this.setSaudeAtual(100);
        } else {
            this.setSaudeAtual(saudeAtual += quantidadeDeCura);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome == "") {
            this.nome = this.getNome();
        } else {
            this.nome = nome;
        }
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
        if (saudeAtual > 0) {
            status = "vivo";
        } else {
            status = "morto";
        }
    }

    public String getStatus() {
        return status;
    }
}
