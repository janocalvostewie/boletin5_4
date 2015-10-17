package boletin5_4;

import javax.swing.JOptionPane;

/**
 *
 * @author Jano
 */
public class Boletin5_4 {
    public static void main(String[] args) {
        Restaurante primerRestaurante= new Restaurante(Float.parseFloat(JOptionPane.showInputDialog("Kilos de pulpo:")),Float.parseFloat(JOptionPane.showInputDialog("Kilos de patatas:")));
        JOptionPane.showMessageDialog(null,"Cantidad actual de pulpo: "+primerRestaurante.getPulpo()+" kilos\nCantidad actual de patatas: "+primerRestaurante.getPatatas()+" kilos\nTienes matria prima para: "+primerRestaurante.calcularClientes()+" clientes");
        //MODIFICAR CANTIDADES
        primerRestaurante.setPulpo(Float.parseFloat(JOptionPane.showInputDialog("Kilos de pulpo:")));
        primerRestaurante.setPatatas(Float.parseFloat(JOptionPane.showInputDialog("Kilos de patatas:")));
        JOptionPane.showMessageDialog(null,"Cantidad actual de pulpo: "+primerRestaurante.getPulpo()+" kilos\nCantidad actual de patatas: "+primerRestaurante.getPatatas()+" kilos\nTienes matria prima para: "+primerRestaurante.calcularClientes()+" clientes");
        
    }
    
}
