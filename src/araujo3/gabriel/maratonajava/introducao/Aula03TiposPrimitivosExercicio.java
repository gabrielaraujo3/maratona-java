package araujo3.gabriel.maratonajava.introducao;
/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salário>, na data <data>
 */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Gabriel Araujo";
        String endereco = "Rua central, 1000";
        double salario = 2100.40;
        String dataSalario = "01/05/2024";
        String relatorio = "Eu "+nome+", morando no endereço "+endereco+", confirmo que recebi o salário de "+salario+", na data "+dataSalario+".";

        System.out.println(relatorio);
    }
}
