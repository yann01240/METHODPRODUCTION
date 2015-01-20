/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packVue;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author Aurèle
 */
public class ImagePanel extends JPanel {          

    private BufferedImage image;

    /**
     *
     * @param fileImg
     */
    public ImagePanel(File fileImg) {
        super();
        try {
            image = ImageIO.read(fileImg);
        } catch (IOException e) {
            image = null;
            System.err.print("Fichier image invalide");
        }
        setBounds(0, 0, this.image.getWidth(), this.image.getHeight());
        setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this.image.getWidth(), this.image.getHeight(), null);
    }
}
