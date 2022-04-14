package principal;
import java.sql.*;
    //Resume
        //import java.sql.ResultSet;
        //import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class formularioIndex extends javax.swing.JFrame {

    public formularioIndex() {
        initComponents();
        this.setLocationRelativeTo(null);//Centrar formulario
        showData();
        deleteData();
        
    }
    void showData(){
        DefaultTableModel model = new DefaultTableModel();//instancia de una tabla
        model.addColumn("Código");
        model.addColumn("Precio Producto");
        model.addColumn("Precio Producto");
        productTable.setModel(model);
        
        String [] data = new String[3];
        try{
            Statement st = cn.createStatement();
            ResultSet resultQuery = st.executeQuery("SELECT * FROM productos");
            while(resultQuery.next()){
                
                data[0] = resultQuery.getString(1);
//Posición en el arreglo^                       ^Posicion en bd
                data[1] = resultQuery.getString(2);
                data[2] = resultQuery.getString(3);
                model.addRow(data);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error, revise por favor.");
        }
    }
    
    void limpiar(){
        codeField.setText("");
        nameField.setText("");
        priceField.setText("");
        deleteData.setText("");
        codeField.setEditable(true);
    }
    
    void deleteData(){
        DefaultTableModel model =new DefaultTableModel();//instancia de una tabla
        model.addColumn("Código");
        model.addColumn("Precio Producto");
        model.addColumn("Precio Producto");
        productTable.setModel(model);

}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        saveData = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        codeField = new javax.swing.JTextField();
        priceField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        clean = new javax.swing.JButton();
        listData = new javax.swing.JButton();
        cleanAllData = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        deleteField = new javax.swing.JButton();
        deleteData = new javax.swing.JTextField();
        exitAll = new javax.swing.JButton();
        actualizarDatos = new javax.swing.JButton();

        jPopupMenu1.setComponentPopupMenu(jPopupMenu1);

        jMenuItem1.setText("Eliminar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("Modificar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        saveData.setText("Insertar");
        saveData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveDataActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Formulario Producto");

        jLabel2.setText("Código");

        jLabel3.setText("Nombre Producto");

        jLabel4.setText("Precio Producto");

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        clean.setText("Limpiar");
        clean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanActionPerformed(evt);
            }
        });

        listData.setText("Listar");
        listData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listDataActionPerformed(evt);
            }
        });

        cleanAllData.setText("Vaciar Tabla");
        cleanAllData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanAllDataActionPerformed(evt);
            }
        });

        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        productTable.setComponentPopupMenu(jPopupMenu1);
        jScrollPane2.setViewportView(productTable);

        deleteField.setText("Borrar registro");
        deleteField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteFieldActionPerformed(evt);
            }
        });

        deleteData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteDataActionPerformed(evt);
            }
        });

        exitAll.setBackground(new java.awt.Color(255, 51, 51));
        exitAll.setText("X");
        exitAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitAllActionPerformed(evt);
            }
        });

        actualizarDatos.setBackground(new java.awt.Color(255, 255, 0));
        actualizarDatos.setText("Actualizar producto");
        actualizarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clean)
                        .addGap(42, 42, 42)
                        .addComponent(saveData)
                        .addGap(44, 44, 44)
                        .addComponent(cleanAllData)
                        .addGap(60, 60, 60)
                        .addComponent(listData))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deleteData, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteField)
                        .addGap(18, 18, 18)
                        .addComponent(actualizarDatos)))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitAll)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(codeField)
                            .addComponent(nameField)
                            .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(exitAll))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(codeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listData, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(saveData)
                        .addComponent(clean)
                        .addComponent(cleanAllData)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteField)
                    .addComponent(actualizarDatos))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void saveDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveDataActionPerformed
        
        try{
            PreparedStatement pst = cn.prepareStatement("INSERT INTO productos(codigo,descripcion,precio) VALUES (?,?,?)");
            pst.setString(1, codeField.getText());
            pst.setString(2, nameField.getText());
            pst.setString(3, priceField.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro almacenado en la base de datos.");
            showData();
            limpiar();
        }catch(Exception e){
            System.out.print(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se pudo Almacenar" +e);
        }
    }//GEN-LAST:event_saveDataActionPerformed

    private void cleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanActionPerformed
        // TODO add your handling code here:
        codeField.setText("");
        nameField.setText("");
        priceField.setText("");
        deleteData.setText("");
        codeField.setEditable(true);
    }//GEN-LAST:event_cleanActionPerformed

    private void listDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listDataActionPerformed
        // TODO add your handling code here:
        showData();
    }//GEN-LAST:event_listDataActionPerformed

    private void cleanAllDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanAllDataActionPerformed
        // TODO add your handling code here:
        deleteData();
    }//GEN-LAST:event_cleanAllDataActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        int fila= productTable.getSelectedRow();
        JOptionPane.showMessageDialog(null, "Registro # "+fila+" a modificar");
        if(fila>=0){
            codeField.setText(productTable.getValueAt(fila, 0).toString());
            nameField.setText(productTable.getValueAt(fila, 1).toString());
            priceField.setText(productTable.getValueAt(fila, 2).toString());
            //Con este se inhabilita una caja de texto
            codeField.setEditable(false);
        }else{
            JOptionPane.showMessageDialog(null, "¡No ha seleccionado ningún registro!");
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        int fila = productTable.getSelectedRow();
        String codigo;
        codigo = productTable.getValueAt(fila,0).toString();
        try{
            PreparedStatement pst = cn.prepareStatement("DELETE FROM productos WHERE Codigo='"+codigo+"'");
            pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Registro eliminado.");
                showData();
        }catch(Exception e){
            System.out.print(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se pudo eliminar" +e);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void deleteDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteDataActionPerformed

    private void deleteFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteFieldActionPerformed
        // TODO add your handling code here:
        String datoAEliminar = deleteData.getText();
        try{
            PreparedStatement pst = cn.prepareStatement("DELETE FROM productos WHERE Codigo='"+datoAEliminar+"'");
            pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Registro eliminado.");
                showData();
        }catch(Exception e){
            System.out.print(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se pudo eliminar" +e);
        }
    }//GEN-LAST:event_deleteFieldActionPerformed

    private void exitAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitAllActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitAllActionPerformed

    private void actualizarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarDatosActionPerformed
        // TODO add your handling code here:
        try{
            PreparedStatement pst = cn.prepareStatement("UPDATE productos SET descripcion='"+nameField.getText()+"',precio='"+priceField.getText()+"' WHERE codigo='"+codeField.getText()+"'");
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "¡REGISTRO ACTUALIZADO CON ÉXITO, PAPU!");
            showData();
            limpiar();
            codeField.setEditable(true);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage()+" \t ¡No se pudo actualizar!");
        }
    }//GEN-LAST:event_actualizarDatosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(formularioIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formularioIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formularioIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formularioIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formularioIndex().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarDatos;
    private javax.swing.JButton clean;
    private javax.swing.JButton cleanAllData;
    private javax.swing.JTextField codeField;
    private javax.swing.JTextField deleteData;
    private javax.swing.JButton deleteField;
    private javax.swing.JButton exitAll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton listData;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField priceField;
    private javax.swing.JTable productTable;
    private javax.swing.JButton saveData;
    // End of variables declaration//GEN-END:variables

conexion cc = new conexion();
Connection cn = cc.conexion();

}
