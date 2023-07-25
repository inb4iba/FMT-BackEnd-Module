package enums;

public enum Nivel {
    JUNIOR("Júnior"),
    PLENO("Pleno"),
    SENIOR("Sênior");

    private String descricao;

    private Nivel(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
