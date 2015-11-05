
package sk.spsjm.ptacademy.model;

public class Pocitac {

    private int ram;
    private short pocetProcesorov;
    private short taktovaciaFrekvencia;
    private int velkostDisku;
    private short vykonZdroj;
    private String znacka;
    private int pamatNaProcesor;

    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        if ((ram & -ram) == ram) {
            this.ram = ram;
            this.pamatNaProcesor = (int) ram / pocetProcesorov;
        } else {
            throw new IllegalArgumentException("Cislo nie je mocnina 2");
        }
    }
    public short getPocetProcesorov() {
        return pocetProcesorov;
    }
    public void setPocetProcesorov(short pocetProcesorov) {
        this.pocetProcesorov = pocetProcesorov;
    }
    public short getTaktovaciaFrekvencia() {
        return taktovaciaFrekvencia;
    }
    public void setTaktovaciaFrekvencia(short taktovaciaFrekvencia) {
        this.taktovaciaFrekvencia = taktovaciaFrekvencia;
    }
    public int getVelkostDisku() {
        return velkostDisku;
    }
    public void setVelkostDisku(int velkostDisku) {
        this.velkostDisku = velkostDisku;
    }
    public short getVykonZdroj() {
        return vykonZdroj;
    }
    public void setVykonZdroj(short vykonZdroj) {
        this.vykonZdroj = vykonZdroj;
    }
    public String getZnacka() {
        return znacka;
    }
    public void setZnacka(String znacka) {
        this.znacka = znacka;
    }
    public int getPamatNaProcesor() {
        return pamatNaProcesor;
    }
    public void setPamatNaProcesor(int pamatNaProcesor) {
        this.pamatNaProcesor = pamatNaProcesor;
    }
}
