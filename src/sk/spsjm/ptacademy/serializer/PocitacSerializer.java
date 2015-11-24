
package sk.spsjm.ptacademy.serializer;

import sk.spsjm.ptacademy.model.Pocitac;

public class PocitacSerializer {

    public String serialize(Pocitac pocitac) {
        String serialized = "Pocitac{ ram:%s, pocetProcesorov:%s, taktovaciaFrekvencia:%s,"
                + " velkostDisku:%s, vykonZdroj:%s, znacka:%s }";
        String formatedString = String.format(serialized, pocitac.getRam(), pocitac.getPocetProcesorov(),
                pocitac.getTaktovaciaFrekvencia(), pocitac.getVelkostDisku(),
                pocitac.getVykonZdroj(), pocitac.getZnacka());
        return formatedString;
    }
    
    public Pocitac deserialize(String string) {
        Pocitac deserialized = new Pocitac();
        if (! string.substring(0, 8).equals("Pocitac{")) {
            throw new IllegalStateException("Neviem zostrojit Pocitac zo Stringu: " + string);
        }
        string = string.replace("Pocitac{", "");
        string = string.replace(" }", "");
        String[] split = string.split(",");
        for (int i = 0; i < split.length; i++) {
            String[] split2 = split[i].split(":");
            switch (split2[0]) {
            case " ram":
                deserialized.setRam(Integer.parseInt(split2[1]));
                break;
            case " pocetProcesorov":
                deserialized.setPocetProcesorov(Short.parseShort(split2[1]));
                break;
            case " taktovaciaFrekvencia":
                deserialized.setTaktovaciaFrekvencia(Short.parseShort(split2[1]));
                break;
            case " velkostDisku":
                deserialized.setVelkostDisku(Integer.parseInt(split2[1]));
                break;
            case " vykonZdroj":
                deserialized.setVykonZdroj(Short.parseShort(split2[1]));
                break;
            case " znacka":
                deserialized.setZnacka(split2[1]);
                break;
            default:
                System.out.println("Nenasiel som vhodny parameter pre pocitac: "
                                                    + split2[0]);
                throw new IllegalStateException("Nenasiel som vhodny parameter pre pocitac: "
                                                    + split2[0]);
            }
        }
        
        return deserialized;
    }
}
