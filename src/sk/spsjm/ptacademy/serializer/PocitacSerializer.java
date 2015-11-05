
package sk.spsjm.ptacademy.serializer;

import sk.spsjm.ptacademy.model.Pocitac;

public class PocitacSerializer {

    public String serialize(Pocitac pocitac) {
        String serialized = "Pocitac{ ram:%s, pocetProcesorov:%s, taktovaciaFrekvencia:%s,"
                + " velkostDisku:%s, vykonZdroj:%s, znacka:%s, pamatNaProcesor:%s }";
        String formatedString = String.format(serialized, pocitac.getRam(), pocitac.getPocetProcesorov(),
                pocitac.getTaktovaciaFrekvencia(), pocitac.getVelkostDisku(),
                pocitac.getVykonZdroj(), pocitac.getZnacka(), pocitac.getPamatNaProcesor());
        return formatedString;
    }
    
    public Pocitac deserialize(String pocitac) {
        Pocitac deserialized = new Pocitac();
        if (! pocitac.substring(7).equals("Pocitac")) {
            throw new IllegalStateException("Neznamy String");
        }
        pocitac.replace("Pocitac{", "");
        pocitac.replace(" }", "");
        String[] split = pocitac.split(",");
        for (int i = 0; i < split.length; i++) {
            String[] split2 = split[i].split(":");
            switch (split2[0]) {
            case " ram":
                deserialized.setRam(Integer.parseInt(split2[1]));
                break;

            default:
                break;
            }
        }
        
        return deserialized;
    }
}
