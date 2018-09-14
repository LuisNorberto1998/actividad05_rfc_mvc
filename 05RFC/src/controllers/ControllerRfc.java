package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import models.*;
import views.*;
//@author Norberto

public class ControllerRfc implements ActionListener {

    ModelFondoPanel modelFondoPanel;
    ModelRfc modelRfc;
    ViewRfc viewRfc;

    public ControllerRfc(ModelFondoPanel modelFondoPanel, ModelRfc modelRfc, ViewRfc viewRfc) {
        this.modelFondoPanel = modelFondoPanel;
        this.modelRfc = modelRfc;
        this.viewRfc = viewRfc;
        this.viewRfc.jbConsultar.addActionListener(this);
        inintComp();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == viewRfc.jbConsultar) {
            btnConsultar();
        }
    }

    private void btnConsultar() {
        modelRfc.setaPaterno(modelRfc.rfcObtener(viewRfc.jtfAP.getText()));
        modelRfc.setaMaterno(viewRfc.jtfAM.getText());
        modelRfc.setNombre(viewRfc.jtfNombre.getText());
        modelRfc.setFechaNacimiento(viewRfc.jdcFechaNac.getDateFormatString());
        JOptionPane.showMessageDialog(null, "rfc", "RFC", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void inintComp() {
        viewRfc.setTitle("RFC");
        viewRfc.setResizable(false);
        viewRfc.setLocationRelativeTo(null);
        viewRfc.setVisible(true);
    }
}
