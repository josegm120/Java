package JuegoDadosTests;

import static org.junit.Assert.*;

import org.junit.Test;

public class DadosTest {

    @Test
    public void getValorTest() {
        //Metodología AAA

        //Arrange
        Dados miDadoDePrueba = new Dados();
        int numeros[] = new int[6];
        int veces = 6000;

        //Act
        int result;
        for (int i=0;i<veces;i++) {
            miDadoDePrueba.nuevoValor();
            result = miDadoDePrueba.getValor();
            numeros[result -1] = numeros[result-1] + 1;
            //Assert
            assertTrue(result>0 && result <7);
        }
        //Assert
        for (int i=0;i<6;i++) {
            //usamos el 5/100 para calcular la desviación con respecto al 5% de las veces que se
            //prueba el dado

            assertTrue(numeros[i] < (veces / 6 + veces * 5 / 100) && numeros[i] > (veces / 6 - veces * 5 / 100));
        }
    }


}