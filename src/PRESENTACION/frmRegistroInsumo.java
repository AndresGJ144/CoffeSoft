/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRESENTACION;

import NEGOCIO.Administrador;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import NEGOCIO.Materiales;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yeison Caicedo - Andrés Garzón
 */
public class frmRegistroInsumo extends javax.swing.JFrame {

    
    Administrador miAdministrador;
    long vCodInsumo;
    Toolkit t;
    Dimension screenSize;
    ImageIcon fot;
    ImageIcon fot2;
    Icon icono;
    Icon icono2;
    /**
     * Creates new form frmRegistroInsumo
     */
    public frmRegistroInsumo() {
        vCodInsumo = 0;
        initComponents();
        setIcon();
        miAdministrador = new Administrador();
        
        sololetras(this.txtProveedor);
        sololetras(this.txtMarca);
        solonumeros(this.txtCantidad);
        solonumeros(this.txtCosto);
        Calendar c2 = new GregorianCalendar();
        this.cldFecha.setCalendar(c2);
        
        setLocationRelativeTo(frmRegistroInsumo.this);        // Centering on screen...
        setTitle("GESTION DE PERSONAS"); 
        //setSize(1370, 600);                  // Setting dimensions...
        this.setExtendedState(frmRegistroInsumo.MAXIMIZED_BOTH);
        setIcon();
        
        
        
        t = Toolkit.getDefaultToolkit();
        screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screenSize.width, screenSize.height);
        
        fot = new ImageIcon("src/PRESENTACION/imagenes/coffe wall 1.jpg");
        icono = new ImageIcon(fot.getImage().getScaledInstance(this.lblFondo.getWidth(), this.lblFondo.getHeight(), Image.SCALE_DEFAULT));
        this.lblFondo.setIcon(icono);
        this.repaint();
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblActualizar = new javax.swing.JLabel();
        lblCosto = new javax.swing.JLabel();
        lblProveedor = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        lblListar = new javax.swing.JLabel();
        lblEliminar = new javax.swing.JLabel();
        lblNuevo = new javax.swing.JLabel();
        lblBuscarNombre = new javax.swing.JLabel();
        cldFecha = new com.toedter.calendar.JDateChooser();
        txtNombre = new javax.swing.JTextField();
        txtCosto = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtProveedor = new javax.swing.JTextField();
        txtTipoBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        spnlLista = new javax.swing.JScrollPane();
        tblInsumos = new javax.swing.JTable();
        cbxTipo = new javax.swing.JComboBox();
        cbxEstado = new javax.swing.JComboBox();
        btnGuardar = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        setName("frmRegistroMateriaes"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("*Nombre:");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        lblTipo.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(255, 255, 255));
        lblTipo.setText("Tipo:");
        getContentPane().add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        lblDescripcion.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        lblDescripcion.setText("Descripción:");
        getContentPane().add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        lblActualizar.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblActualizar.setForeground(new java.awt.Color(255, 255, 255));
        lblActualizar.setText("Actualizar");
        getContentPane().add(lblActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, -1, -1));

        lblCosto.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblCosto.setForeground(new java.awt.Color(255, 255, 255));
        lblCosto.setText("*Costo unitario:");
        getContentPane().add(lblCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, 160, -1));

        lblProveedor.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblProveedor.setForeground(new java.awt.Color(255, 255, 255));
        lblProveedor.setText("Proveedor:");
        getContentPane().add(lblProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 280, -1, -1));

        lblMarca.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblMarca.setForeground(new java.awt.Color(255, 255, 255));
        lblMarca.setText("Marca:");
        getContentPane().add(lblMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 320, -1, -1));

        lblFecha.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setText("Fecha:");
        getContentPane().add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 200, -1, -1));

        lblEstado.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(255, 255, 255));
        lblEstado.setText("Estado:");
        getContentPane().add(lblEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, -1, -1));

        lblCantidad.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblCantidad.setForeground(new java.awt.Color(255, 255, 255));
        lblCantidad.setText("Cantidad:");
        getContentPane().add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, -1, -1));

        lblListar.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblListar.setForeground(new java.awt.Color(255, 255, 255));
        lblListar.setText("Listar");
        getContentPane().add(lblListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, -1, -1));

        lblEliminar.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblEliminar.setForeground(new java.awt.Color(255, 255, 255));
        lblEliminar.setText("Eliminar");
        getContentPane().add(lblEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, -1, -1));

        lblNuevo.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblNuevo.setForeground(new java.awt.Color(255, 255, 255));
        lblNuevo.setText("Guardar");
        getContentPane().add(lblNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        lblBuscarNombre.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblBuscarNombre.setForeground(new java.awt.Color(240, 240, 240));
        lblBuscarNombre.setText("Buscar por Nombre:");
        getContentPane().add(lblBuscarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, -1, -1));

        cldFecha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(cldFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 200, 210, 30));

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 480, -1));

        txtCosto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 160, 480, -1));

        txtCantidad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 120, 220, -1));

        txtMarca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 320, 480, -1));

        txtProveedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 280, 480, -1));

        txtTipoBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTipoBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTipoBuscarKeyReleased(evt);
            }
        });
        getContentPane().add(txtTipoBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 20, 220, -1));

        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 480, 110));

        tblInsumos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblInsumos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblInsumos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblInsumosMouseClicked(evt);
            }
        });
        spnlLista.setViewportView(tblInsumos);

        getContentPane().add(spnlLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 1330, 300));

        cbxTipo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Abono Orgánico", "Abono Químico", "Insumo", "Maquinaria", "Implemento de trabajo" }));
        getContentPane().add(cbxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 480, -1));

        cbxEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbxEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bueno", "Regular", "Malo" }));
        getContentPane().add(cbxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 240, 210, -1));

        btnGuardar.setForeground(new java.awt.Color(102, 0, 0));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PRESENTACION/imagenes/guardar_48.png"))); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 80, 70));

        btnHome.setBackground(new java.awt.Color(212, 189, 179));
        btnHome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnHome.setForeground(new java.awt.Color(102, 0, 0));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PRESENTACION/imagenes/logoFinalRecortado.png"))); // NOI18N
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
        });
        getContentPane().add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, -1));

        btnActualizar.setForeground(new java.awt.Color(102, 0, 0));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PRESENTACION/imagenes/update_48.png"))); // NOI18N
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 70, 70));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PRESENTACION/imagenes/delete_48.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 70, 70));

        btnListar.setForeground(new java.awt.Color(102, 0, 0));
        btnListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PRESENTACION/imagenes/listar_48.png"))); // NOI18N
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        getContentPane().add(btnListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 70, 70));

        lblFondo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblFondo.setForeground(new java.awt.Color(102, 0, 0));
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //<editor-fold defaultstate="collapsed" desc="Metodos Propios">
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // Boton Guardar Insumo/Material
        //Comenzamos a obtener los datos de los txt del GUI.
        
        int veriCampos = verificarCampos();
        
        if (veriCampos == 0){
            String nombre = this.txtNombre.getText();
            String tipo = this.cbxTipo.getSelectedItem().toString();
            String descripcion = this.txtDescripcion.getText();
            long cantidad = Long.parseLong(this.txtCantidad.getText());
            double costoUni = Double.parseDouble(this.txtCosto.getText());
            String fechaS = new SimpleDateFormat("dd/MM/yyyy").format(this.cldFecha.getDate());
            String estado = this.cbxEstado.getSelectedItem().toString();
            String provedor = this.txtProveedor.getText();
            String marca = this.txtMarca.getText();
            
            int res = miAdministrador.registrarMaterial(nombre.toLowerCase(),descripcion.toLowerCase(), cantidad,costoUni,provedor.toLowerCase(),marca.toLowerCase(),fechaS,tipo.toLowerCase(),estado.toLowerCase());
            if (res == 1) {
                JOptionPane.showMessageDialog(this, "Registro exitoso");
                vCodInsumo = 0;
                limpiar();
                listar();
            } else {
                JOptionPane.showMessageDialog(this, "Registro no exitoso, Por favor verifique los datos!");

            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Datos Obligatorios (**) sin llenar");
        }    
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        
        int fila = this.tblInsumos.getSelectedRow();
        if (fila != -1) {
            long codigo = Long.parseLong(this.tblInsumos.getValueAt(fila, 0).toString());
            int res = miAdministrador.eliminarMaterial(codigo);
            if (res != 0) {
                JOptionPane.showMessageDialog(rootPane, "Insumo eliminado con éxito");
                listar();
                limpiar();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Insumo NO eliminado");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un insumo de la tabla para eliminar");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        
        int veriCampos = verificarCampos();
        if (vCodInsumo != 0){
            
            if (veriCampos == 0){
                String nombre = this.txtNombre.getText();
                String tipo = this.cbxTipo.getSelectedItem().toString();
                String descripcion = this.txtDescripcion.getText();
                long cantidad = Long.parseLong(this.txtCantidad.getText());
                double costoUni = Double.parseDouble(this.txtCosto.getText());
                String fechaS = new SimpleDateFormat("dd/MM/yyyy").format(this.cldFecha.getDate());
                String estado = this.cbxEstado.getSelectedItem().toString();
                String provedor = this.txtProveedor.getText();
                String marca = this.txtMarca.getText();




                int res = miAdministrador.actualizarMaterial(vCodInsumo,nombre.toLowerCase(),descripcion.toLowerCase(), cantidad,costoUni,provedor.toLowerCase(),marca.toLowerCase(),fechaS,tipo.toLowerCase(),estado.toLowerCase());
                if (res == 1) {
                    JOptionPane.showMessageDialog(this, "Insumo Actualizado");
                    vCodInsumo = 0;
                    limpiar();
                    listar();
                } else {
                    JOptionPane.showMessageDialog(this, "Insumo NO Actualizado");
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Datos Obligatorios (**) sin llenar");
            }
            
        }else
            JOptionPane.showMessageDialog(this, "Seleccione un registro!");
        
        
        
        
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        // TODO add your handling code here:
        listar();
    }//GEN-LAST:event_btnListarActionPerformed

    private void tblInsumosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblInsumosMouseClicked
        // Codigo donde click en el mouse, pasar información a los txt
        
        int fila = this.tblInsumos.getSelectedRow();
        //Date fecha = Date.valueOf(this.tblInsumos.getValueAt(fila,4).toString());
        
        this.txtNombre.setText(this.tblInsumos.getValueAt(fila,1).toString());
        this.cbxTipo.setSelectedIndex(valoresCbxTipo(this.tblInsumos.getValueAt(fila,5).toString().toLowerCase()));
        this.txtDescripcion.setText(this.tblInsumos.getValueAt(fila, 2).toString());
        this.txtCantidad.setText(this.tblInsumos.getValueAt(fila,9).toString());
        this.txtCosto.setText(this.tblInsumos.getValueAt(fila,8).toString());
       // this.cldFecha.setDate(fecha);
        this.cbxEstado.setSelectedIndex(valoresCbxEstado(this.tblInsumos.getValueAt(fila,6).toString().toLowerCase()));
        this.txtProveedor.setText(this.tblInsumos.getValueAt(fila,3).toString());
        this.txtMarca.setText(this.tblInsumos.getValueAt(fila,7).toString());
        vCodInsumo = Long.parseLong(this.tblInsumos.getValueAt(fila,0).toString());
        

        
    }//GEN-LAST:event_tblInsumosMouseClicked

    private void txtTipoBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoBuscarKeyReleased
        // TODO add your handling code here:
        String bNombre = this.txtTipoBuscar.getText();
        buscarInsumosPorActividad(bNombre.toLowerCase());
    }//GEN-LAST:event_txtTipoBuscarKeyReleased

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        // TODO add your handling code here:
        frmPrincipal myPrincipal = new frmPrincipal();
        myPrincipal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnHomeMouseClicked
    //</editor-fold> 
    
    
    //<editor-fold defaultstate="collapsed" desc="Excepciones">
    public  void  solonumeros(JTextField a){
       a.addKeyListener(new KeyAdapter() {
        public void keyTyped(KeyEvent e) {
            char c=e.getKeyChar();
            if(Character.isLetter(c)){
                getToolkit().beep();
                e.consume();
            }
        }  
           
       });
    }
    
    public  void  sololetras(JTextField a){
       a.addKeyListener(new KeyAdapter() {
        public void keyTyped(KeyEvent e) {
            char c=e.getKeyChar();
            if(Character.isDigit(c)){
                getToolkit().beep();
                e.consume();
            }
        }  
           
       });
    }
    
    //</editor-fold> 
    
    
    //<editor-fold defaultstate="collapsed" desc="METODOS PROPIOS">
    //Abono Orgánico, Abono Químico, Insumo, Maquinaria, Implemento de trabajo
    //        Bueno, Regular, Malo
    
    private void buscarInsumosPorActividad(String bNombree) {
        
        ArrayList<Object[]> materialess = miAdministrador.buscarPorTipoyNombre(bNombree.toLowerCase());
        DefaultTableModel datos = new DefaultTableModel();
        this.tblInsumos.setModel(datos);

        Object[] columnas = materialess.get(0);
        for (int i = 0; i < columnas.length; i++) {
            datos.addColumn(columnas[i]);
        }
        for (int i = 1; i < materialess.size(); i++) {
            datos.addRow(materialess.get(i));
        }
    }
    
    private int valoresCbxTipo (String valor){
        int posicion = -1;
        if ("Abono Orgánico".equalsIgnoreCase(valor.toLowerCase()))
            posicion = 0;
        else if ("Abono Químico".equalsIgnoreCase(valor.toLowerCase()))
            posicion = 1;
        else if ("Insumo".equalsIgnoreCase(valor.toLowerCase()))
            posicion = 6;
        else if ("Maquinaria".equalsIgnoreCase(valor.toLowerCase()))
            posicion = 2;
        else if ("Implemento de trabajo".equalsIgnoreCase(valor.toLowerCase()))
            posicion = 4;
        else 
            posicion = -1;
        
        return posicion;
    }
    private int valoresCbxEstado (String valor){
        int posicion = -1;
        if ("Bueno".equalsIgnoreCase(valor.toLowerCase()))
            posicion = 0;
        else if ("Regular".equalsIgnoreCase(valor.toLowerCase()))
            posicion = 1;
        else if ("Malo".equalsIgnoreCase(valor.toLowerCase()))
            posicion = 2;
        else 
            posicion = -1;
        
        return posicion;
    }
    
    private int verificarCampos(){
        int retVerificar = 0;
        
        if(this.txtCantidad.getText().length()==0)
            retVerificar = 1;
        if(this.txtNombre.getText().length()==0)
            retVerificar = 1;
        
        return retVerificar;    
    }
    
    private void bloquear(){
        this.txtCantidad.setEnabled(false);
        this.txtCosto.setEnabled(false);
        this.txtDescripcion.setEnabled(false);
        this.txtMarca.setEnabled(false);
        this.txtNombre.setEnabled(false);
        this.txtProveedor.setEnabled(false);
    }
    
    private void setIcon() {
    
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("iconProgram.png")));
        
    }

    private void listar() {
        

        ArrayList<Object[]> empleados = miAdministrador.listarMateriales();
        DefaultTableModel datos = new DefaultTableModel();
        this.tblInsumos.setModel(datos);

        Object[] columnas = empleados.get(0);
        for (int i = 0; i < columnas.length; i++) {
            datos.addColumn(columnas[i]);
        }
        for (int i = 1; i < empleados.size(); i++) {
            datos.addRow(empleados.get(i));
        }
        
        if (tblInsumos.getRowCount() == 0)
            JOptionPane.showMessageDialog(this, "No existen insumos registrados");
        

       
    
    }

    private void limpiar() {
        
      this.txtNombre.setText("");
      this.txtDescripcion.setText("");
      this.txtCantidad.setText("");
      this.txtCosto.setText("");
      this.txtProveedor.setText("");
      this.txtMarca.setText("");
      
        
    }
    
    
    //</editor-fold> 
    
    //<editor-fold defaultstate="collapsed" desc="Main">
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
            java.util.logging.Logger.getLogger(frmRegistroInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistroInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistroInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistroInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistroInsumo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnListar;
    private javax.swing.JComboBox cbxEstado;
    private javax.swing.JComboBox cbxTipo;
    private com.toedter.calendar.JDateChooser cldFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblActualizar;
    private javax.swing.JLabel lblBuscarNombre;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblEliminar;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblListar;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNuevo;
    private javax.swing.JLabel lblProveedor;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JScrollPane spnlLista;
    private javax.swing.JTable tblInsumos;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtProveedor;
    private javax.swing.JTextField txtTipoBuscar;
    // End of variables declaration//GEN-END:variables
   
}
//</editor-fold>