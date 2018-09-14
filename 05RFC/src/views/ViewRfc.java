package views;
//@author Norberto

import models.ModelFondoPanel;


public class ViewRfc extends javax.swing.JFrame {

    public ViewRfc() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jlFechaNac = new javax.swing.JLabel();
        jdcFechaNac = new com.toedter.calendar.JDateChooser();
        jtfNombre = new javax.swing.JTextField();
        jlNombre = new javax.swing.JLabel();
        jtfAM = new javax.swing.JTextField();
        jlApellMaterno = new javax.swing.JLabel();
        jtfAP = new javax.swing.JTextField();
        jlAellPaterno = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jlText = new javax.swing.JLabel();
        jbConsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelFondo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jPanelFondoPropertyChange(evt);
            }
        });

        jPanel1.setOpaque(false);

        jlFechaNac.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlFechaNac.setForeground(new java.awt.Color(51, 51, 51));
        jlFechaNac.setText("Fecha de nacimiento:");

        jdcFechaNac.setDateFormatString("yy/MM/dd");

        jtfNombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jlNombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlNombre.setForeground(new java.awt.Color(51, 51, 51));
        jlNombre.setText("Nombre (s):");

        jtfAM.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jlApellMaterno.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlApellMaterno.setForeground(new java.awt.Color(51, 51, 51));
        jlApellMaterno.setText("Apellido Materno:");

        jtfAP.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jlAellPaterno.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlAellPaterno.setForeground(new java.awt.Color(51, 51, 51));
        jlAellPaterno.setText("Apellido Paterno:");

        jLabel1.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("\"Datos personales\"");

        jlText.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jlText.setForeground(new java.awt.Color(255, 0, 0));
        jlText.setText("Todos los campos son obligatorios");

        jbConsultar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbConsultar.setText("CONSULTAR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlText)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlAellPaterno)
                                    .addComponent(jLabel1)
                                    .addComponent(jlApellMaterno)
                                    .addComponent(jlNombre)
                                    .addComponent(jlFechaNac))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfAP)
                                    .addComponent(jtfAM)
                                    .addComponent(jtfNombre)
                                    .addComponent(jdcFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jbConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAellPaterno)
                    .addComponent(jtfAP))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlApellMaterno)
                    .addComponent(jtfAM))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombre)
                    .addComponent(jtfNombre))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlFechaNac)
                    .addComponent(jdcFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelFondoLayout = new javax.swing.GroupLayout(jPanelFondo);
        jPanelFondo.setLayout(jPanelFondoLayout);
        jPanelFondoLayout.setHorizontalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoLayout.createSequentialGroup()
                .addContainerGap(375, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        jPanelFondoLayout.setVerticalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoLayout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelFondoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jPanelFondoPropertyChange
        models.ModelFondoPanel imagenMenu = new ModelFondoPanel();
        jPanelFondo.add(imagenMenu);
        jPanelFondo.repaint();
        
    }//GEN-LAST:event_jPanelFondoPropertyChange

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewRfc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelFondo;
    public javax.swing.JButton jbConsultar;
    public com.toedter.calendar.JDateChooser jdcFechaNac;
    private javax.swing.JLabel jlAellPaterno;
    private javax.swing.JLabel jlApellMaterno;
    private javax.swing.JLabel jlFechaNac;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlText;
    public javax.swing.JTextField jtfAM;
    public javax.swing.JTextField jtfAP;
    public javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}
