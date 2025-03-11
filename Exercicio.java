import javax.swing.JOptionPane;;

public class Exercicio {
    public static void main(String[] args) {
        Double hp, lp, ha, la, areaParede, areaAzulejo, quantidadeAzulejos;
        String saida;
        hp = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura da parede: "));
        lp = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a largura da parede: "));
        ha = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura do azulejo: "));
        la = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a largura do azulejo: "));
        areaParede = hp * lp;
        areaAzulejo = ha * la;
        quantidadeAzulejos = areaAzulejo / areaParede;
        saida = String.format("Para completar a parede com azulejos é necessário %.2f ", quantidadeAzulejos);
        JOptionPane.showMessageDialog(null, saida);
        System.out.printf(saida); 
    
    }
}
