/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartgym.gui.tables;

import java.util.List;
import javax.swing.JCheckBox;
import smartgym.models.entities.Payment;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ClientPendeceTable extends TableFrameBase {

    /**
     * Creates new form ClientPendeceTable
     */
    public ClientPendeceTable() {
        initComponents();
        this.setTableHeaderl(new String[]{"", "Data"});

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    @Override
    protected Object getSelectedRow() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void updateSelectedRow() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void updateTable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void fillTable(List objectList) {
        Object[][] dados = new Object[objectList.size()][2];

        for (int i = 0; i < objectList.size(); i++) {
            Payment payment = (Payment) objectList.get(i);
            JCheckBox checkbox = new JCheckBox();
            checkbox.addActionListener(null);
            dados[i][0] = checkbox;
            dados[i][1] = payment.getPaymentedDay();

        }
    }
}
