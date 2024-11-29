package Frontend;

import Backend.Circle;
import Backend.Line;
import Backend.Rectangle;
import Backend.Square;
import Interfaces.Shape;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.MediaTracker;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Program extends javax.swing.JFrame {

    protected Graphics2D g;
    protected ShapesManager shapesManager;
    protected javax.swing.JComboBox shapesComboBox;

    public Program() {
        initComponents();
        setTitle("Vector Drawing Application");
        setContentPane(jPanel1);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        g = (Graphics2D) canvas.getGraphics();
        g.setStroke(new BasicStroke(2));

        //Initalize Shape Manager to track shapes 
        this.shapesComboBox = shapesBox;
        this.shapesManager = new ShapesManager();

        //To Make Origin(0,0) At Bottom Left Corner
        g.translate(0, canvas.getHeight());
        g.scale(1, -1);

        //Change frame icon
        ImageIcon image = new ImageIcon("C:/Users/habib/Documents/NetBeansProjects/VectorDrawingApplication/VectorDrawingApplication/src/Frontend/paintIcon.jpg");
        if (image.getImageLoadStatus() != MediaTracker.COMPLETE) {
            System.out.println("Icon image failed to load.");
        }
        setIconImage(image.getImage());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        canvas = new javax.swing.JPanel();
        circleButton = new javax.swing.JButton();
        lineButton = new javax.swing.JButton();
        squareButton = new javax.swing.JButton();
        rectButton = new javax.swing.JButton();
        shapesBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        colorize = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        resizeButton = new javax.swing.JButton();
        moveButton = new javax.swing.JButton();
        save = new javax.swing.JButton();
        load = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setFocusTraversalPolicyProvider(true);
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 450));

        canvas.setBackground(new java.awt.Color(255, 255, 255));
        canvas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204)));
        canvas.setPreferredSize(new java.awt.Dimension(650, 380));

        javax.swing.GroupLayout canvasLayout = new javax.swing.GroupLayout(canvas);
        canvas.setLayout(canvasLayout);
        canvasLayout.setHorizontalGroup(
            canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        canvasLayout.setVerticalGroup(
            canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 378, Short.MAX_VALUE)
        );

        circleButton.setFont(new java.awt.Font("Georgia Pro", 1, 12)); // NOI18N
        circleButton.setText("Circle");
        circleButton.setPreferredSize(new java.awt.Dimension(90, 40));
        circleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circleButtonActionPerformed(evt);
            }
        });

        lineButton.setFont(new java.awt.Font("Georgia Pro", 1, 12)); // NOI18N
        lineButton.setText("Line");
        lineButton.setPreferredSize(new java.awt.Dimension(90, 40));
        lineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lineButtonActionPerformed(evt);
            }
        });

        squareButton.setFont(new java.awt.Font("Georgia Pro", 1, 12)); // NOI18N
        squareButton.setText("Square");
        squareButton.setPreferredSize(new java.awt.Dimension(90, 40));
        squareButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareButtonActionPerformed(evt);
            }
        });

        rectButton.setFont(new java.awt.Font("Georgia Pro", 1, 12)); // NOI18N
        rectButton.setText("Rectangle");
        rectButton.setPreferredSize(new java.awt.Dimension(90, 40));
        rectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectButtonActionPerformed(evt);
            }
        });

        shapesBox.setFont(new java.awt.Font("Georgia Pro", 0, 12)); // NOI18N
        shapesBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Shape" }));
        shapesBox.setPreferredSize(new java.awt.Dimension(150, 30));
        shapesBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shapesBoxActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Georgia Pro", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Select Shape");
        jLabel1.setPreferredSize(new java.awt.Dimension(90, 20));

        colorize.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        colorize.setText("Colorize");
        colorize.setPreferredSize(new java.awt.Dimension(73, 35));
        colorize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorizeActionPerformed(evt);
            }
        });

        remove.setFont(new java.awt.Font("Georgia Pro", 0, 12)); // NOI18N
        remove.setText("Remove");
        remove.setPreferredSize(new java.awt.Dimension(73, 35));
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });

        resizeButton.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        resizeButton.setText("Resize");
        resizeButton.setPreferredSize(new java.awt.Dimension(73, 21));
        resizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resizeButtonActionPerformed(evt);
            }
        });

        moveButton.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        moveButton.setText("Move");
        moveButton.setOpaque(true);
        moveButton.setPreferredSize(new java.awt.Dimension(70, 21));
        moveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveButtonActionPerformed(evt);
            }
        });

        save.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        save.setText("Save");
        save.setPreferredSize(new java.awt.Dimension(73, 35));
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        load.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        load.setText("Load");
        load.setPreferredSize(new java.awt.Dimension(73, 35));
        load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(shapesBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(load, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(resizeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(moveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(colorize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(remove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(canvas, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(circleButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(lineButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                        .addComponent(squareButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(rectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(circleButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rectButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lineButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(squareButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(load, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(121, 121, 121)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(shapesBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(colorize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(remove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(moveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(canvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lineButtonActionPerformed
        LineDialogBox window = new LineDialogBox(this, rootPaneCheckingEnabled);
    }//GEN-LAST:event_lineButtonActionPerformed

    private void circleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circleButtonActionPerformed
        CircleDialogBox window = new CircleDialogBox(this, rootPaneCheckingEnabled);
    }//GEN-LAST:event_circleButtonActionPerformed

    private void squareButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareButtonActionPerformed
        SquareDialogBox window = new SquareDialogBox(this, rootPaneCheckingEnabled);
    }//GEN-LAST:event_squareButtonActionPerformed

    private void rectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectButtonActionPerformed
        RectangleDialogBox window = new RectangleDialogBox(this, rootPaneCheckingEnabled);
    }//GEN-LAST:event_rectButtonActionPerformed

    private void shapesBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shapesBoxActionPerformed

    }//GEN-LAST:event_shapesBoxActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        String selectedShapeString = (String) shapesBox.getSelectedItem();
        if (selectedShapeString != null && selectedShapeString.compareTo("Choose Shape") != 0) {
            this.shapesComboBox.removeItem(selectedShapeString);
            Shape shapeToRemove = shapesManager.shapes.get(selectedShapeString);
            shapesManager.removeShape(shapeToRemove);
            shapesManager.refresh(g);
        } else if (selectedShapeString.compareTo("Choose Shape") == 0) {
            JOptionPane.showMessageDialog(null, "No Shape Selected!", "Message", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_removeActionPerformed

    private void colorizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorizeActionPerformed
        Color currentColor = Color.BLACK;
        String selectedShapeString = (String) this.shapesComboBox.getSelectedItem();
        if (selectedShapeString.compareTo("Choose Shape") != 0 && selectedShapeString != null) {
            Shape shapeToColor = shapesManager.shapes.get(selectedShapeString);
            Color newColor;
            newColor = JColorChooser.showDialog(Program.this, "Select Shape Color", currentColor);
            if (newColor != null) {
                currentColor = newColor;
                shapeToColor.setColor(newColor);
                shapeToColor.setFillColor(newColor);

                shapesManager.refresh(g);
            }
        } else if (selectedShapeString.compareTo("Choose Shape") == 0) {
            JOptionPane.showMessageDialog(null, "No Shape Selected!", "Message", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_colorizeActionPerformed

    private void resizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resizeButtonActionPerformed
        String selectedShapeString = (String) shapesBox.getSelectedItem();
        if (selectedShapeString != null && selectedShapeString.compareTo("Choose Shape") != 0) {
            Shape shapeToResize = shapesManager.shapes.get(selectedShapeString);
            int index = shapeToResize.getName().indexOf('0');
            String shapeName = shapeToResize.getName().substring(0, index);

            if (shapeToResize instanceof Line) {
                LineResizeDialogBox window = new LineResizeDialogBox(this, rootPaneCheckingEnabled, shapeToResize);
            } else if (shapeToResize instanceof Circle) {
                CircleResizeDialogBox window = new CircleResizeDialogBox(this, rootPaneCheckingEnabled, shapeToResize);
            } else if (shapeToResize instanceof Square) {
                SquareResizeDialogBox window = new SquareResizeDialogBox(this, rootPaneCheckingEnabled, shapeToResize);
            } else if (shapeToResize instanceof Rectangle) {
                RectangleResizeDialogBox window = new RectangleResizeDialogBox(this, rootPaneCheckingEnabled, shapeToResize);
            }
            shapesManager.refresh(g);
        } else if (selectedShapeString.compareTo("Choose Shape") == 0) {
            JOptionPane.showMessageDialog(null, "No Shape Selected!", "Message", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_resizeButtonActionPerformed

    private void moveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveButtonActionPerformed

        String selectedShapeString = (String) shapesBox.getSelectedItem();
        if (selectedShapeString != null && selectedShapeString.compareTo("Choose Shape") != 0) {
            Shape shapeToMove = shapesManager.shapes.get(selectedShapeString);
            MoveShapeDialogBox window = new MoveShapeDialogBox(this, rootPaneCheckingEnabled, shapeToMove);
            shapesManager.refresh(g);
        } else if (selectedShapeString.compareTo("Choose Shape") == 0) {
            JOptionPane.showMessageDialog(null, "No Shape Selected!", "Message", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_moveButtonActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(".")); //To set current directory tp where my project is located 
        int response = fileChooser.showSaveDialog(null); //Select file to Save

        if (response == JFileChooser.APPROVE_OPTION) {
            FileOutputStream fileOut = null;
            try {
                String fileName = fileChooser.getSelectedFile().getName() + ".ser";
                File f = new File(fileName);
                try {
                    if (f.createNewFile()) //File doesn't Exist and Created Successfully
                    {
                        System.out.println("File Created Successfully !" + f);
                    } else {
                        System.out.println("File Already Exists!");
                    }
                } catch (IOException ex) {
                    System.out.println("Exception : " + ex);
                }

                //We have the file we want to save the Objects' info to
                //Serialization
                fileOut = new FileOutputStream(fileName); //The .ser file which i will save all my objects info to
                ObjectOutputStream out = new ObjectOutputStream(fileOut);

                //HERE WE SHOULD WRITE ALL SHAPES OBJECTS
                Shape[] shapesList = this.shapesManager.getShapes();
               for(Shape s:shapesList)
               {
                   System.out.println("Name "+s.getName());
                out.writeObject(s);   
               }

                out.close();
                fileOut.close();

            } catch (FileNotFoundException ex) {
                Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    fileOut.close();
                } catch (IOException ex) {
                    Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_saveActionPerformed

    private void loadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(".")); //To set current directory tp where my project is located 
        int response = fileChooser.showOpenDialog(null); //Select file to Save

        if (response == JFileChooser.APPROVE_OPTION) {

            FileInputStream fileIn = null;
            try {
                String fileName = fileChooser.getSelectedFile().getName();
                System.out.println("File Name" + fileName);
                File f = new File(fileName);

                Shape myObj = null;
                fileIn = new FileInputStream(fileName);
                ObjectInputStream in = new ObjectInputStream(fileIn);
                
                this.shapesManager.shapes.clear();
                this.shapesComboBox.removeAllItems();
                this.shapesComboBox.addItem("Choose Shape");
                
                try (BufferedReader br = new BufferedReader(new FileReader(f))) {
                    String line;
                    while ((line = br.readLine()) != null) {

                        myObj = (Shape) in.readObject();

                        if (myObj instanceof Line) {
                            System.out.println("Line");
                        } else if (myObj instanceof Square) {
                            System.out.println("Square");
                        } else if (myObj instanceof Rectangle) {
                            System.out.println("Rectangle");
                        }
                        else if(myObj instanceof Circle){
                            System.out.println("Circle");
                        }
                        
                        this.shapesManager.shapes.put(myObj.getName(), myObj);
                        this.shapesComboBox.addItem(myObj.getName());

                    }
                } catch (Exception e) {
                    System.out.println("come inside loop to check logs.label update faild");
                }

                

                this.shapesManager.refresh(g);

                in.close();
                fileIn.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    fileIn.close();
                } catch (IOException ex) {
                    Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }//GEN-LAST:event_loadActionPerformed

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
            java.util.logging.Logger.getLogger(Program.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Program.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Program.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Program.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Program().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel canvas;
    private javax.swing.JButton circleButton;
    private javax.swing.JButton colorize;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lineButton;
    private javax.swing.JButton load;
    private javax.swing.JButton moveButton;
    private javax.swing.JButton rectButton;
    private javax.swing.JButton remove;
    private javax.swing.JButton resizeButton;
    private javax.swing.JButton save;
    private javax.swing.JComboBox<String> shapesBox;
    private javax.swing.JButton squareButton;
    // End of variables declaration//GEN-END:variables
}
