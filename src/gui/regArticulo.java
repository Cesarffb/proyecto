
package gui;

import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import sexshop.Articulo;
import sexshop.HibernateUtil;

/**
 *
 * @author ccp
 */
public class regArticulo extends javax.swing.JDialog {

    /**
     * Creates new form regCliente
     */
    public regArticulo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        t_ya.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        t_ya = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        salir = new javax.swing.JButton();
        b_registrar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        t_producto = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_descripcion = new javax.swing.JTextArea();
        t_categoria = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        t_cantidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        t_precioV = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        t_precioC = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setBackground(new java.awt.Color(0, 204, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de Productos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        t_ya.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        t_ya.setForeground(new java.awt.Color(255, 51, 51));
        t_ya.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t_ya.setText("Producto ya registrado  Si continua el registro sera actualizado");
        t_ya.setAutoscrolls(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(t_ya, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(t_ya, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        b_registrar.setText("Registrar");
        b_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_registrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salir)
                    .addComponent(b_registrar))
                .addContainerGap())
        );

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Producto: ");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 20));

        t_producto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        t_producto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t_productoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t_productoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_productoKeyTyped(evt);
            }
        });
        jPanel5.add(t_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 360, 30));

        jButton1.setText("....");
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        jLabel8.setText("Imagen:");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, 20));

        jLabel7.setText("Descripcion:");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        t_descripcion.setColumns(20);
        t_descripcion.setRows(5);
        jScrollPane1.setViewportView(t_descripcion);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 360, 50));

        t_categoria.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel5.add(t_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 360, 30));

        jLabel5.setText("Categoria: ");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel3.setText("Cantidad: ");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        t_cantidad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        t_cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_cantidadKeyTyped(evt);
            }
        });
        jPanel5.add(t_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 360, 30));

        jLabel6.setText("Precio Venta:");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        t_precioV.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel5.add(t_precioV, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 360, 30));

        jLabel4.setText("Precio Compra: ");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        t_precioC.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        t_precioC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_precioCActionPerformed(evt);
            }
        });
        jPanel5.add(t_precioC, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 283, 360, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t_productoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_productoKeyPressed
        //Muestra lo ingresado despues de ingresar el siguiente caracter
        //System.out.println(t_producto.getText());
    }//GEN-LAST:event_t_productoKeyPressed

    private void t_productoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_productoKeyReleased
        System.out.println(t_producto.getText());
        Session st = HibernateUtil.getSessionFactory().openSession();
        st.beginTransaction();
        List<Articulo> lista = (List<Articulo>)st.createQuery("From Articulo").list();
        for (Iterator<Articulo> it = lista.iterator(); it.hasNext();) {
            Articulo pro = it.next();
            if(pro.getNombreProducto().equals(t_producto.getText())){
                //System.out.println(pro.getProducto());
                t_ya.setVisible(true);
                b_registrar.setText("Actualizar");
                break;
            }
            else{t_ya.setVisible(false);
                b_registrar.setText("Guardar");}
            //System.out.println(pro.getProducto());
        }
    }//GEN-LAST:event_t_productoKeyReleased

    private void t_productoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_productoKeyTyped
        // Key typed del nombre del producto

        //if (!t_producto.getText().equals("")) cont++;
    }//GEN-LAST:event_t_productoKeyTyped

    private void t_cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_cantidadKeyTyped
        //if (!t_cantidad.getText().equals("")) cont++;
    }//GEN-LAST:event_t_cantidadKeyTyped

    private void b_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_registrarActionPerformed
        //this.b_registrar.setEnabled(false);
        //this.salir.setEnabled(false);
        String produc, cant, precioV, precioC, cate, desc;
        produc = t_producto.getText();
        cant = t_cantidad.getText();
        precioV = t_precioV.getText();
        precioC = t_precioC.getText();
        cate = t_categoria.getText();
        desc = t_descripcion.getText();
        //System.out.println(cont);
        if (produc.equals("") || (cant.equals("")) || (precioC.equals("")) || (precioV.equals(""))) {
            javax.swing.JOptionPane.showMessageDialog(this,"Debe llenar todos los campos \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            t_producto.requestFocus();
            return;
        }
        else {
            Session  st;
            st = HibernateUtil.getSessionFactory().openSession();
            st.beginTransaction();
            Articulo p = new Articulo();
            //p.setId((short)5); //Innecesario
            p.setNombreProducto(produc);
            p.setPrecioCompra(Float.valueOf(precioC.trim()).floatValue());
            p.setCantidadDisponible(Integer.parseInt(cant));
            p.setPrecioVenta(Float.valueOf(precioV.trim()).floatValue());
            p.setCategoria(cate);
            p.setDescripcion(desc);
            st.save(p);

            //int idArt = 2;
            //Productos art = (Productos)st.load(Productos.class, idArt);
            //System.out.println(art.getProducto());
            st.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Registro agregado.");
        }
        this.t_descripcion.setText("");
        this.t_producto.setText("");
        this.t_precioV.setText("");
        this.t_precioC.setText("");
        this.t_cantidad.setText("");
        this.t_categoria.setText("");
        this.b_registrar.setEnabled(true);
        this.salir.setEnabled(true);
    }//GEN-LAST:event_b_registrarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_salirActionPerformed

    private void t_precioCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_precioCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_precioCActionPerformed

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
            java.util.logging.Logger.getLogger(regArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(regArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(regArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(regArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                regArticulo dialog = new regArticulo(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_registrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton salir;
    private javax.swing.JTextField t_cantidad;
    private javax.swing.JTextField t_categoria;
    private javax.swing.JTextArea t_descripcion;
    private javax.swing.JTextField t_precioC;
    private javax.swing.JTextField t_precioV;
    private javax.swing.JTextField t_producto;
    private javax.swing.JLabel t_ya;
    // End of variables declaration//GEN-END:variables
}