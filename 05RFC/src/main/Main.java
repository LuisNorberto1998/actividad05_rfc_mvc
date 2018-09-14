package main;
import models.*;
import views.ViewRfc;
import controllers.ControllerRfc;

//@author Norberto
public class Main {
    
    private static ModelRfc modelRfc;
    private static ModelFondoPanel modelFondoPanel;
    private static ViewRfc viewRfc;
    private static ControllerRfc controllerRfc;
    
    public static void main(String[] args) {
        modelRfc = new ModelRfc();
        viewRfc = new ViewRfc();
        modelFondoPanel = new ModelFondoPanel();
        controllerRfc = new ControllerRfc(modelFondoPanel, modelRfc, viewRfc);
    }
    
}
