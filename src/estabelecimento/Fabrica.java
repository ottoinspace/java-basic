package estabelecimento;

import equimpamentos.impressora.Deskjet;
import equimpamentos.impressora.Impressora;
import equimpamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        Impressora impressora = new EquipamentoMultifuncional();

        impressora.imprimir();
    }
}
