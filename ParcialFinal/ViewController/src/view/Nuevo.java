package view;

import javax.faces.event.ActionEvent;

import oracle.adf.view.rich.component.rich.nav.RichButton;

public class Nuevo {
    private RichButton nuevo;

    public Nuevo() {
    }

    public void Metodo(ActionEvent actionEvent) {
        // Add event code here...
    }

    public void setNuevo(RichButton nuevo) {
        this.nuevo = nuevo;
    }

    public RichButton getNuevo() {
        return nuevo;
    }
}
