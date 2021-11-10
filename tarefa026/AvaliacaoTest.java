
public class AvaliacaoTest {
    private Avaliacao metodo;

    @Before
    public void setup() {
        metodo = new Avaliacao();
    }


    @Test
    public void testCargaHorariaNegativa() {
        double N1 = 1;
        double N2 = 1;
        double faltas = 1;
        double CH = -1;
        Exception erro = new Exception();
        try {
            metodo.verifica(N1, N2, faltas, CH);
        } catch (Exception e) {
            erro = e;
        }

        Assert.assertEquals("Valores não está válidos..", erro.getMessage());
    }

    @Test
    public void testFaltasMenorQueZero() {
        double nota1 = 1;
        double nota2 = 1;
        double faltas = -1;
        double cargaHoraria = 10;
        Exception exception = new Exception();
        try {
            metodo.verifica(nota1, nota2, faltas, cargaHoraria);
        } catch (Exception e) {
            exception = e;
        }

        Assert.assertEquals("Valores não está válidos..", exception.getMessage());
    }

    @Test
    public void testFaltasMaiorQueCarga() {
        double nota1 = 1;
        double nota2 = 1;
        double faltas = 10;
        double cargaHoraria = 1;
        Exception exception = new Exception();
        try {
            metodo.verifica(nota1, nota2, faltas, cargaHoraria);
        } catch (Exception e) {
            exception = e;
        }

        Assert.assertEquals("Valores que não estão válidos.", exception.getMessage());
    }

    @Test
    public void testNota1MenorQueZero() {
        double nota1 = -1;
        double nota2 = 1;
        double faltas = 1;
        double cargaHoraria = 10;
        Exception exception = new Exception();
        try {
            metodo.verifica(nota1, nota2, faltas, cargaHoraria);
        } catch (Exception e) {
            exception = e;
        }

        Assert.assertEquals("Valores não está válidos..", exception.getMessage());
    }

    @Test
    public void testNota1MaiorQueDez() {
        double nota1 = 11;
        double nota2 = 1;
        double faltas = 1;
        double cargaHoraria = 10;
        Exception exception = new Exception();
        try {
            metodo.verifica(nota1, nota2, faltas, cargaHoraria);
        } catch (Exception e) {
            exception = e;
        }

        Assert.assertEquals("Valores não está válidos..", exception.getMessage());
    }

    @Test
    public void testNota2MenorQueZero() {
        double nota1 = 1;
        double nota2 = -1;
        double faltas = 1;
        double cargaHoraria = 10;
        Exception exception = new Exception();
        try {
            metodo.verifica(nota1, nota2, faltas, cargaHoraria);
        } catch (Exception e) {
            exception = e;
        }
        Assert.assertEquals("Valores não está válidos..", exception.getMessage());
    }

    @Test
    public void testNota2MaiorQueDez() {
        double nota1 = 1;
        double nota2 = 11;
        double faltas = 1;
        double cargaHoraria = 10;
        Exception exception = new Exception();
        try {
            metodo.verifica(nota1, nota2, faltas, cargaHoraria);
        } catch (Exception e) {
            exception = e;
        }

        Assert.assertEquals("Valores não está válidos.", exception.getMessage());
    }

    @Test
    public void testReprovadoFalta() {
        double nota1 = 7;
        double nota2 = 7;
        double faltas = 26;
        double cargaHoraria = 100;
        String resultado = "";
        try {
            resultado = metodo.verifica(nota1, nota2, faltas, cargaHoraria);
        } catch (Exception e) {}

        Assert.assertEquals("Aluno reprovado por Falta.", resultado);
    }

    @Test
    public void testReprovadoMediaMenorTrez() {
        double nota1 = 2;
        double nota2 = 2;
        double faltas = 20;
        double cargaHoraria = 100;
        String resultado = "";
        try {
            resultado = metodo.verifica(nota1, nota2, faltas, cargaHoraria);
        } catch (Exception e) {}

        Assert.assertEquals("Aluno reprovado por Média.", resultado);
    }

    @Test
    public void testProvaExtra() {
        double nota1 = 4;
        double nota2 = 4;
        double faltas = 20;
        double cargaHoraria = 100;
        String resultado = "";
        try {
            resultado = metodo.verifica(nota1, nota2, faltas, cargaHoraria);
        } catch (Exception e) {}

        Assert.assertEquals("Há uma prova Extra.", resultado);
    }

    @Test
    public void testProvaExtra2() {
        double nota1 = 3;
        double nota2 = 3;
        double faltas = 20;
        double cargaHoraria = 100;
        String resultado = "";
        try {
            resultado = metodo.verifica(nota1, nota2, faltas, cargaHoraria);
        } catch (Exception e) {}

        Assert.assertEquals("Há uma prova Extra.", resultado);
    }

    @Test
    public void testAprovado1() {
        double nota1 = 6;
        double nota2 = 6;
        double faltas = 1;
        double cargaHoraria = 10;
        String resultado = "";
        try {
            resultado = metodo.verifica(nota1, nota2, faltas, cargaHoraria);
        } catch (Exception e) {}
        Assert.assertEquals("Está aprovado.", resultado);
    }

    @Test
    public void testAprovado2() {
        double nota1 = 7;
        double nota2 = 7;
        double faltas = 1;
        double cargaHoraria = 10;
        String resultado = "";
        try {
            resultado = metodo.verifica(nota1, nota2, faltas, cargaHoraria);
        } catch (Exception e) {}

        Assert.assertEquals("Está aprovado.", resultado);
    }

}