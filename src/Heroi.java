public class Heroi {
    String nome;
    int idade;
    String tipoHeroi;
    String ataque;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTipoHeroi() {
        return tipoHeroi;
    }

    public void setTipoHeroi(String tipoHeroi) {
        this.tipoHeroi = tipoHeroi;
    }

    public void atacar() {
        if (tipoHeroi.equals("mago")) {
            ataque = "magia";
        } else if (tipoHeroi.equals("guerreiro")) {
            ataque = "espada";
        } else if (tipoHeroi.equals("monge")) {
            ataque = "artes marciais";
        } else if(tipoHeroi.equals("ninja")){
            ataque = "shuriken";
        }
        System.out.println("--------------------------------------------");
        System.out.printf("--> O %s atacou usando %s <--\n",tipoHeroi,ataque);
        System.out.println("--------------------------------------------");
    }
}
