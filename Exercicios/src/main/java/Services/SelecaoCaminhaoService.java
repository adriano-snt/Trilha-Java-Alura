package Services;

import Objects.Caminhao;
import java.util.*;
import static Services.DadosCaminhaoService.*;


public class SelecaoCaminhaoService {

    public static List<Caminhao> inserirCaminhao() {

        String tipoCaminhao = "";
        String tipoPluviometro;
        String adicionarPluviometro;
        List<Caminhao> caminhoes = new ArrayList<>();

        System.out.println("==========CADASTRO DE CAMINHÕES==========");

        while (!tipoCaminhao.matches("Fim")) {

            int pluviometroX = 0;
            int pluviometroY = 0;
            int pluviometroZ = 0;
            int capacidadePluviometros;

            List<Integer> pluviometros = new ArrayList<>();

            do {
                System.out.println("\nEscolha um dos tipos de caminhões abaixo ou digite 'Fim' para sair.");
                System.out.println("Tipos de caminhão: 'Alfa' ou 'Beta'");
                tipoCaminhao = leString();

                if (!tipoCaminhao.matches("Alfa") && !tipoCaminhao.matches("Beta") && !tipoCaminhao.matches("Fim")) {
                    System.out.println("Digite um tipo válido de caminhão ou 'Fim' para sair.");
                }

            } while (!tipoCaminhao.matches("Fim") && !tipoCaminhao.matches("Alfa") && !tipoCaminhao.matches("Beta"));


            if (!tipoCaminhao.matches("Fim")) {

                do {

                    do {
                        System.out.println("Digite um dos tipos de pluviômetros: 'x', 'y' ou 'z'");
                        tipoPluviometro = leString();
                        if ((!tipoPluviometro.matches("x") && !tipoPluviometro.matches("y") && !tipoPluviometro.matches("z"))) {
                            System.out.println("Informe um tipo de pluviômetro disponível.");
                        }

                    } while ((!tipoPluviometro.matches("x") && !tipoPluviometro.matches("y") && !tipoPluviometro.matches("z")));


                    System.out.println("Informe a quantidade do pluviômetro do tipo " + tipoPluviometro + " :");
                    if (tipoPluviometro.matches("x")) {
                        pluviometroX += leInteiro();
                    }
                    if (tipoPluviometro.matches("y")) {
                        pluviometroY += leInteiro();
                    }
                    if (tipoPluviometro.matches("z")) {
                        pluviometroZ += leInteiro();
                    }

                    System.out.println("Digite 'Sim' para adicionar outro tipo de pluviômetro ou 'Não' para prosseguir.");
                    adicionarPluviometro = leString();


                    if (!adicionarPluviometro.matches("Sim") && !adicionarPluviometro.matches("Não")) {

                        System.out.println("Digite uma opção válida.");
                        System.out.println("Digite 'Sim' para adicionar outro tipo de pluviômetro ou 'Não' para prosseguir.");
                        adicionarPluviometro = leString();

                    }
                } while (!adicionarPluviometro.matches("Não"));

                capacidadePluviometros = pluviometroX + pluviometroY + pluviometroZ;

                pluviometros.add(pluviometroX);
                pluviometros.add(pluviometroY);
                pluviometros.add(pluviometroZ);

                caminhoes.add(new Caminhao(tipoCaminhao, capacidadePluviometros, pluviometros));
            }
        }
        return caminhoes;
    }


    public static void selecionaCaminhoes(List<Caminhao> caminhoes) {

        if ((caminhoes != null)) {
            Optional<Caminhao> caminhaoComMaiorCapacidade = caminhoes.stream()
                    .max(Comparator.comparing(Caminhao::getCapacidadePluviometros));

            System.out.println("\n=============================================");
            System.out.println("Dados do caminhão com maior capacidade");
            System.out.println("Tipo: " + caminhaoComMaiorCapacidade.get().getTipoCaminhao() + ";");
            System.out.println("Capacidade total de pluviômetros: " + caminhaoComMaiorCapacidade.get().getCapacidadePluviometros() + " unidades;");
            System.out.println("Tipos de pluviômetros:");
            System.out.println(" - Tipo x: " + caminhaoComMaiorCapacidade.get().getPluviometros().get(0) + " unidades;");
            System.out.println(" - Tipo y: " + caminhaoComMaiorCapacidade.get().getPluviometros().get(1) + " unidades;");
            System.out.println(" - Tipo z: " + caminhaoComMaiorCapacidade.get().getPluviometros().get(2) + " unidades;");
            System.out.println("=============================================");

        }
    }
}

