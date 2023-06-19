/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package exercicios.trabalhoordenacao;
import javax.swing.JOptionPane;
/**
 *
 * @author allan
 */

public class TrabalhoOrdenacao {

    public static void main(String[] args) {
        String escolha;
        OrdenacaoVetores pesquisa = new OrdenacaoVetores();

        JOptionPane.showMessageDialog(null, "Vamos criar seu vetor de números inteiros");
        pesquisa.criarVetor();
        
        boolean sair = false;
        
        while (!sair) {
            String input = JOptionPane.showInputDialog(
                "Qual opção de ordenação ou pesquisa você deseja?\n\n"
                + "(1) Ordenação por inserção\n"
                + "(2) Ordenação por seleção\n"
                + "(3) Ordenação por bolha\n"
                + "(4) Pesquisa Binária\n"
                + "(5) Pesquisa Linear\n"
                + "(6) Sair\n"
                + "(7) Novo Vetor de inteiros"
            );

            escolha = input.trim();

            switch (escolha) {
                case "1":
                    JOptionPane.showMessageDialog(null, "Você escolheu a ordenação por inserção");
                    pesquisa.OrdenacaoInsercao();
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, "Você escolheu a ordenação por seleção");
                    pesquisa.OrdenacaoSelecao();
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Você escolheu a ordenação por bolha");
                    pesquisa.OrdenacaoBolha();
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "Você escolheu Pesquisa Binária");
                    pesquisa.OpcaoBinaria();
                    break;
                case "5":
                    JOptionPane.showMessageDialog(null, "Você escolheu Pesquisa Linear");
                    pesquisa.OpcaoLinear();
                    break;
                case "6":
                    JOptionPane.showMessageDialog(null, "Você escolheu Sair");
                    sair = true;
                    break;
                case "7":
                    JOptionPane.showMessageDialog(null, "Você escolheu mudar o vetor");
                    pesquisa.criarVetor();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA, TENTE NOVAMENTE!");
                    break;
            }
        }
    }
}

