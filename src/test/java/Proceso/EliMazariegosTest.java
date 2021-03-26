/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proceso;

import Objetos.carr;
import Objetos.r_academicoAcademico;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import Objetos.Horario;




public class EliMazariegosTest {
    @InjectMocks
    private AsignarHorario a_horario;
    
    @Mock 
    private RegistroAcademico carr;

    @Mock
    private Carrera r_academico;
    
    
	@Test
    public void prueba_descripcion() throws Exception{
        when(r_academico.getAnio()).thenReturn(2020);
        when(carr.procesarcarr()).thenReturn(1);
        when(r_academico.cheequearCarnet()).thenReturn(true);
        
        val =new AsignarHorario();
        assertEquals("Jornada", val.generarHorario(carr,r_academico).getDescripcion());
    
    }
    @Test
    public void prueba_ch() throws Exception{
        when(r_academico.getAnio()).thenReturn(2020);
        when(carr.procesarcarr()).thenReturn(1);
        when(r_academico.cheequearCarnet()).thenReturn(true);
        
        val =new AsignarHorario();
        assertEquals(0, val.generarHorario(carr,r_academico).getCodigoHorario());
    }
    
  
 
}