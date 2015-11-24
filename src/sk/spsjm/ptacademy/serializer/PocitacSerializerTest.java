
package sk.spsjm.ptacademy.serializer;

import org.junit.Assert;
import org.junit.Test;
import sk.spsjm.ptacademy.model.Pocitac;

public class PocitacSerializerTest {

    @Test
    public void test() {
        Pocitac pocitac = new Pocitac();
        pocitac.setPocetProcesorov((short) 4);
        pocitac.setRam(1024);
        PocitacSerializer serializer = new PocitacSerializer();
        String serializedString = serializer.serialize(pocitac);
        Assert.assertEquals("Pocitac{ ram:1024, pocetProcesorov:4, taktovaciaFrekvencia:0,"
                + " velkostDisku:0, vykonZdroj:0, znacka:null, pamatNaProcesor:256 }",
                serializedString);
    }

    @Test
    public void testDeserializacie() {
        String vstup = "Pocitac{ ram:1024, pocetProcesorov:4, taktovaciaFrekvencia:36,"
                + " velkostDisku:256, vykonZdroj:15, znacka:Lenivo }";
        PocitacSerializer deserializer = new PocitacSerializer();
        Pocitac prelozenyVstup = deserializer.deserialize(vstup);
        Pocitac ocakavanyPocitac = new Pocitac();
        ocakavanyPocitac.setPocetProcesorov((short) 4);
        ocakavanyPocitac.setRam(1024);
        ocakavanyPocitac.setTaktovaciaFrekvencia((short) 36);
        ocakavanyPocitac.setVelkostDisku(256);
        ocakavanyPocitac.setVykonZdroj((short) 15);
        ocakavanyPocitac.setZnacka("Lenivo");
        Assert.assertEquals(1024, prelozenyVstup.getRam());
        Assert.assertEquals(4, prelozenyVstup.getPocetProcesorov());
        
        Assert.assertEquals("Prelozeny vstup nezodpoveda ocakavanemu pocitacu",
                ocakavanyPocitac, prelozenyVstup);
    }
}
