package com.marcuspaulo.introducaojunit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilTest {

    @Test
    void testMdcAParP1() {
       final int a = 6;
       final  int b = 3;
       final  int esperado = b;
       final  int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
   @Test
    void testMdcAImparP1(){
       final  int a = 9;
       final  int b = 3;
       final int esperado = b;
       final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado,obtido );
    }
    
}
