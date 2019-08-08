/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nrkey.hardyweinberg.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author mcnoa
 */
public class MainGui {
    private JFrame gui;
    protected final int HEIGHT;
    protected final int WIDTH;
    final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private JComboBox[] boxes;
    private String[] CATEGORIES;
    private String[] EQUATIONS;
    private final int PREFERRED_SIZE = 100;
    
    public MainGui() {
        gui = new JFrame("SuperCalc");
        
        HEIGHT = (int) screenSize.getHeight() / 2;
        WIDTH = (int) screenSize.getWidth() / 2;
        
        gui.setSize(WIDTH, HEIGHT);
        centerFrame();
        
        makePanel();
        ImageIcon img = new ImageIcon("target/nrkey.png");
        gui.setIconImage(img.getImage());
        
        gui.setVisible(true);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void centerFrame() {
        gui.setLocation((int) screenSize.getWidth()/2 - WIDTH/2, (int) screenSize.getHeight()/2 - HEIGHT/2);
    }
    
    private void makePanel() {
        String[] cats = {"Geometry", "Trigonometry", "Algebra"};
        CATEGORIES = cats;
        
        String[] eqs = {"Pythagorean Theorem"};
        EQUATIONS = eqs;
        
        JComboBox categories = new JComboBox(CATEGORIES);
        JComboBox eq = new JComboBox(EQUATIONS);
        boxes = new JComboBox[2];
        
        boxes[0] = categories;
        boxes[1] = eq;
        
        JPanel panel = new JPanel();
        
        for(JComboBox box : boxes) {
            panel.add(box);
        }
        
        EquationPanel ep = new EquationPanel();
        panel.add(ep);
        
        gui.add(panel);
    }
}
