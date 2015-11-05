
package sk.spsjm.ptacademy.serializer;

import static org.junit.Assert.*;

import org.junit.Assert;

import sk.spsjm.ptacademy.model.Pocitac;
import org.junit.Test;

public class PocitacSerializerTest {

    @Test
    public void test() {
        Pocitac pocitac = new Pocitac();
        pocitac.setPocetProcesorov((short) 4);
        pocitac.setRam(1024);
        PocitacSerializer serializer = new PocitacSerializer();
        String serializedString = serializer.serialize(pocitac);
        Assert.assertEquals("Pocitac{ ram:1024, pocetProcesorov:4, taktovaciaFrekvencia:0,"
                + " velkostDisku:0, vykonZdroj:0, znacka:0, pamatNaProcesor:256 }",
                serializedString);
    }

}
