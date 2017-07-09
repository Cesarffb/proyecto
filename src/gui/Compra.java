/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.hibernate.Session;
import sexshop.Articulo;
import sexshop.Cliente;
import sexshop.HibernateUtil;

/**
 *
 * @author ccp
 */
public class Compra extends javax.swing.JDialog {
    Session st = HibernateUtil.getSessionFactory().openSession();
    List<Cliente> listaC;
    List<Articulo> lista;
    public Integer ID;
    public Object canti;
    public String cantidad = "1";
    public String preci = "0";
    public int cantidadVendida;
    /**
     * Creates new form Compra
     */
    public Compra(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        st.beginTransaction();
        this.lista = (List<Articulo>)st.createQuery("From Articulo").list();
        this.listaC = (List<Cliente>)st.createQuery("From Cliente").list();
        initComponents();
        //s_cantidad.
        //EnviarLista(this.lista);
        b_registrar.setVisible(false);
        control(this.preci);
        t_monto.setText("0");
    }

    public Compra(java.awt.Frame parent, boolean modal, Integer ID) {
        super(parent, modal);
        st.beginTransaction();
        this.ID = ID;
        this.lista = (List<Articulo>)st.createQuery("From Articulo").list();
        this.listaC = (List<Cliente>)st.createQuery("From Cliente").list();
        initComponents();
        Articulo ar = Articulo(this.ID);
        this.preci = Float.toString(ar.getPrecioVenta());
        b_registrar.setVisible(false);
        control(this.preci);
        t_monto.setText("0");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        t_nombre = new javax.swing.JTextField();
        t_cantidad = new javax.swing.JLabel();
        t_precio = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        s_cantidad = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        t_monto = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        t_ci = new javax.swing.JTextField();
        t_nombreC = new javax.swing.JLabel();
        t_dire = new javax.swing.JLabel();
        b_registrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        panel2.setBackground(new java.awt.Color(255, 255, 255));
        panel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "A Comprar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10), new java.awt.Color(102, 102, 102))); // NOI18N
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Nombre:");
        panel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 29, -1, -1));

        jLabel5.setText("Cantidad disponible:");
        panel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 65, -1, 30));

        jLabel6.setText("Precio:");
        panel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        t_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t_nombreKeyReleased(evt);
            }
        });
        panel2.add(t_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 270, 30));
        panel2.add(t_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 280, 30));
        panel2.add(t_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 280, 30));

        jButton3.setText("Selecionar de lista");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, 30));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Compra de Articulo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        s_cantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 99999, 1));
        s_cantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                s_cantidadStateChanged(evt);
            }
        });

        jLabel7.setText("Cantidad a Comprar:");

        jLabel8.setText("Monto a Cobrar:");

        jButton1.setText("Comprar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Atras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "A cliente:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("Nombre:");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel10.setText("N.C.I. o RUC:");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 30, -1, -1));

        jLabel11.setText("Direcciion:");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        t_ci.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                t_ciFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                t_ciFocusLost(evt);
            }
        });
        t_ci.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t_ciKeyReleased(evt);
            }
        });
        jPanel6.add(t_ci, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 270, 30));
        jPanel6.add(t_nombreC, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 270, 30));
        jPanel6.add(t_dire, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 270, 30));

        b_registrar.setText("Registrar");
        b_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_registrarActionPerformed(evt);
            }
        });
        jPanel6.add(b_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 120, 30));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(s_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_monto, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(s_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addComponent(t_monto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_registrarActionPerformed
        // Registrar
        regCliente REG = new regCliente(null, true, t_ci.getText());
        REG.setLocationRelativeTo(this);
        REG.setVisible(true);
    }//GEN-LAST:event_b_registrarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Ver lista
        List<Articulo> lista = (List<Articulo>)st.createQuery("From Articulo").list();
        UpdateArticulo inf = new UpdateArticulo(null, true, true);
        inf.LlenarTabla(lista);
        inf.setTitle("Lista de Articulos xd");
        inf.setLocationRelativeTo(this);
        this.setVisible(false);
        inf.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void t_ciKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_ciKeyReleased
        // 
        ver_info();
    }//GEN-LAST:event_t_ciKeyReleased

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        //
    }//GEN-LAST:event_formFocusGained

    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost
        //
    }//GEN-LAST:event_formFocusLost

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        System.out.println("Foco ganado");
        this.listaC = (List<Cliente>)st.createQuery("From Cliente").list();
        this.preci = t_precio.getText();
        this.canti = t_cantidad.getText();
        //System.out.println("__________Foco____________");
        System.out.println(this.preci);
        System.out.println(this.canti);
        //this.revalidate();
        ver_info();
        //this.repaint();
    }//GEN-LAST:event_formWindowGainedFocus

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        System.out.println("Foco perdido");
        this.listaC = (List<Cliente>)st.createQuery("From Cliente").list();
        this.preci = t_precio.getText();
        control(this.preci);
        this.canti = t_cantidad.getText();
        //this.revalidate();
        ver_info();
        //this.repaint();
    }//GEN-LAST:event_formWindowLostFocus

    private void t_ciFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_ciFocusGained
        // TODO add your handling code here:
        ver_info();
    }//GEN-LAST:event_t_ciFocusGained

    private void t_ciFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_ciFocusLost
        // TODO add your handling code here:
        ver_info();
    }//GEN-LAST:event_t_ciFocusLost

    private void t_nombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_nombreKeyReleased
        // Articulos
        ver_infoArticulo();
    }//GEN-LAST:event_t_nombreKeyReleased

    private void s_cantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_s_cantidadStateChanged
        //
        //System.out.println("___________________________________");
        //int precio = Integer.parseInt(this.preci);
        //System.out.println(this.preci);
        //this.canti = s_cantidad.getValue().toString();
        //String cant = s_cantidad.getValue().toString();
        //System.out.println(cant);
        //int mont = (int) (precio * Integer.parseInt(cant)); //(Integer)this.canti
        //System.out.println(mont);
        //t_monto.setText(Integer.toString(mont));
    }//GEN-LAST:event_s_cantidadStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Volver al menu prinsipal
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Boton comprar
        try{
            Articulo art = (Articulo)st.load(Articulo.class, ID);
            int cantOriginal = art.getCantidadDisponible();
            art.setCantidadDisponible(cantOriginal-this.cantidadVendida);
            st.update(art);
            st.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Compra registrada","Listo", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo registrar la compra", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Compra dialog = new Compra(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel panel2;
    private javax.swing.JSpinner s_cantidad;
    private javax.swing.JLabel t_cantidad;
    private javax.swing.JTextField t_ci;
    private javax.swing.JLabel t_dire;
    private javax.swing.JLabel t_monto;
    private javax.swing.JTextField t_nombre;
    private javax.swing.JLabel t_nombreC;
    private javax.swing.JLabel t_precio;
    // End of variables declaration//GEN-END:variables

    private void ver_info() {
        System.out.println(t_ci.getText());
        //st.beginTransaction();
        for (Iterator<Cliente> it = listaC.iterator(); it.hasNext();) {
            Cliente pro = it.next();
            String ci = Integer.toString(pro.getCedula());
            if(ci.equals(t_ci.getText())){
                //System.out.println(pro.getProducto());
                t_nombreC.setText(pro.getNombreRazonSocial());
                t_dire.setText(pro.getDireccion());
                b_registrar.setVisible(false);
                break;
            }
            else{
                t_nombreC.setText("");
                t_dire.setText("");
                b_registrar.setVisible(true);}
            //System.out.println(pro.getProducto());
        }
    }

    private void ver_infoArticulo() {
        System.out.println(t_nombre.getText());
        for (Iterator<Articulo> it = lista.iterator(); it.hasNext();) {
            Articulo pro = it.next();
            if(pro.getNombreProducto().equals(t_nombre.getText())){
                //System.out.println(pro.getProducto());
                t_cantidad.setText(Integer.toString(pro.getCantidadDisponible()));
                t_precio.setText(Float.toString(pro.getPrecioVenta()));
                this.cantidad = Integer.toString(pro.getCantidadDisponible());
                this.preci = Float.toString(pro.getPrecioVenta());
                control(this.preci);
                break;
            }
            else{
                t_cantidad.setText("");
                t_precio.setText("");
            }
            //System.out.println(pro.getProducto());
        }
    }

    private Articulo Articulo(Integer ID) {
        System.out.println(t_nombre.getText());
        for (Iterator<Articulo> it = lista.iterator(); it.hasNext();) {
            Articulo pro = it.next();
            if(pro.getIdproducto().equals(ID)){
                //System.out.println(pro.getProducto());
                t_nombre.setText(pro.getNombreProducto());
                t_cantidad.setText(Integer.toString(pro.getCantidadDisponible()));
                t_precio.setText(Float.toString(pro.getPrecioVenta()));
                return pro;
            }
            else{
                t_cantidad.setText("Buscando...");
                t_precio.setText("Buscando....");
            }
            //System.out.println(pro.getProducto());
        }
        return null;
    }

    private void control(String preci1) {
        System.out.println("__________control()___");
        this.preci = preci1;
        System.out.println(this.preci);
        System.out.println("____________finControl_");
        s_cantidad.addChangeListener(new ChangeListener() {
        public void stateChanged(ChangeEvent e) {
            Float t = Float.parseFloat(preci1.trim());
            //System.out.println("____________metodo_control_______");
            //System.out.println(preci1);
            String cant = ("" + ((JSpinner)e.getSource()).getValue());
            guardarCant(cant);
            //System.out.println(cant);
            int monto = (int) (Integer.parseInt(cant) * t);
            t_monto.setText(Integer.toString(monto));
            //System.out.println(monto);    
            }
        });
    }
    public void guardarCant(String cant){
        this.cantidadVendida = Integer.parseInt(cant);
    }
}