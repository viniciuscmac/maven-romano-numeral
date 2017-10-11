package br.ufg.inf.numeroRomanoTeste;
import org.junit.Assert;
import org.junit.Test;

import br.ufg.inf.numeroRomano.NumeroRomano;

public class NumeroRomanoTeste {
	
	@Test
    public void romanoValido()
    {
		NumeroRomano numR = new NumeroRomano();
        String romano1 = "i";
        String romano2 = "I";
        String romano3 = "iv";
        String romano4 = "ix";
        String romano5 = "x";
        String romano6 = "M";
        String romano7 = "D";
        String romano8 = "c";
        String romano9 = "l";
        Assert.assertEquals(1, numR.romanToDecimal(romano1));
        Assert.assertEquals(1, numR.romanToDecimal(romano2));
        Assert.assertEquals(4, numR.romanToDecimal(romano3));
        Assert.assertEquals(9, numR.romanToDecimal(romano4));
        Assert.assertEquals(10, numR.romanToDecimal(romano5));
        Assert.assertEquals(1000, numR.romanToDecimal(romano6));
        Assert.assertEquals(500, numR.romanToDecimal(romano7));
        Assert.assertEquals(100, numR.romanToDecimal(romano8));
        Assert.assertEquals(50, numR.romanToDecimal(romano9));
    }

}
