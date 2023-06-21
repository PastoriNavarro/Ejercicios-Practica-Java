
import java.net.PortUnreachableException;
public class Carta {

    private Palo palo;
    private Numero numero;

    public Carta(Palo[] values, Numero[] numeros) {

    }

    public Carta(Palo palo, Numero numero) {
        this.palo = palo;
        this.numero = numero;

    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    public Numero getNumero() {
        return numero;
    }

    public void setNumero(Numero numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "" + "" +
                 palo.getAbreviatura() +
                numero.getAbreviatura() +
                '"';
    }

    enum Palo{
        ESPADAS('E'),
        ORO('O'),
        BASTOS('B'),
        COPAS('C');

        Palo(char abreviatura) {
            this.abreviatura = abreviatura;
        }

        private char abreviatura;

        public char getAbreviatura() {
            return abreviatura;
        }

    }
        enum Numero{
        AS('1'),
        DOS('2'),
        TRES('3'),
        CUATRO('4'),
        CINCO('5'),
        SEIS('6'),
        SIETE('7'),
        SOTA('S'),
        CABALLO('C'),
        REY('R');

            Numero(char abreviatura) {
                this.abreviatura = abreviatura;
            }

            private char abreviatura;

            public char getAbreviatura() {
                return abreviatura;
            }
        }
        }
