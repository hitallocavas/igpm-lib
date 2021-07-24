package br.ufpe.cin.hcs3.igpm.lib.output;

public class IgpmOutput {
    private String data;
    private Double valor;

    @Override
    public String toString() {
        return "IgpmOutput{" +
                "data='" + data + '\'' +
                ", valor=" + valor +
                '}';
    }

    public IgpmOutput(String data, Double valor) {
        this.data = data;
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public Double getValor() {
        return valor;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

}
