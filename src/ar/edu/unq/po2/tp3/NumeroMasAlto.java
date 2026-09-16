package ar.edu.unq.po2.tp3;

public class NumeroMasAlto {

    public int elMultiploSimultaneoMasAlto(int primerValor, int segundoValor) {

        for (int multiploMasAlto = 1000; multiploMasAlto >= 0; multiploMasAlto = multiploMasAlto -1) {

            if (this.esMultiploDe(multiploMasAlto, primerValor) && this.esMultiploDe(multiploMasAlto, segundoValor)) {
                return multiploMasAlto;
            }
        }
        return -1; // Si terminó todo el bucle y no encontró ninguno
    }

    private boolean esMultiploDe(int numero, int divisor) {
        if (divisor == 0) return false; // Protección contra división por cero
        return (numero % divisor == 0);
    }
}