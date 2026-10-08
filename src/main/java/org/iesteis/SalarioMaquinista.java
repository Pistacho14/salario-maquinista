package org.iesteis;

public class SalarioMaquinista {
    private int tonelada = 0;
    private int distancia = 0;
    private int peniquesMillaTonelada = 0;
    private int combustibleMilla = 0;
    private int materiaPrima = 0;
    private int salarioPeones = 0;

    public SalarioMaquinista(int tonelada, int distancia, int peniquesMillaTonelada, int combustibleMilla,
            int materiaPrima, int salarioPeones) {
        this.tonelada = tonelada;
        this.distancia = distancia;
        this.peniquesMillaTonelada = peniquesMillaTonelada;
        this.combustibleMilla = combustibleMilla;
        this.materiaPrima = materiaPrima;
        this.salarioPeones = salarioPeones;
    }

    public int getTonelada() {
        return tonelada;
    }

    public int getDistancia() {
        return distancia;
    }

    public int getPeniquesMillaTonelada() {
        return peniquesMillaTonelada;
    }

    public int getCombustibleMilla() {
        return combustibleMilla;
    }

    public int getMateriaPrima() {
        return materiaPrima;
    }

    public int getSalarioPeones() {
        return salarioPeones;
    }

    public int peniquesTotales() {
        return getTonelada() * getDistancia() * getPeniquesMillaTonelada();
    }

    public int costeCombustible() {
        return (getDistancia() * getCombustibleMilla()) * 2;
    }

    public int deduccionesTotales() {
        return costeCombustible() + getMateriaPrima() + getSalarioPeones();
    }

    public int salarioTotal() {
        return peniquesTotales() - deduccionesTotales();
    }
}
