package checkers;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Imagen extends javax.swing.JPanel {
    private final String archivo;

    public Imagen(String img) {
        this.setSize(100, 100); //se selecciona el tamaño del panel
        this.archivo = img;
    }

    //Se crea un método cuyo parámetro debe ser un objeto Graphics

    public void paint(Graphics grafico) {
        Dimension height = getSize();

        //Se selecciona la imagen que tenemos en el paquete de la //ruta del programa

        ImageIcon Img = new ImageIcon(Objects.requireNonNull(getClass().getResource("/Images/" + archivo)));

        //se dibuja la imagen que tenemos en el paquete Images //dentro de un panel

        grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);

        setOpaque(false);
        super.paintComponent(grafico);
    }
}
