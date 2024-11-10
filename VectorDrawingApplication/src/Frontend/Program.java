package Frontend;

import Interfaces.Shape;
import java.awt.Color;
import java.awt.Graphics2D;
import javax.swing.JColorChooser;


public class Program extends javax.swing.JFrame {
    public static Graphics2D g;
    protected ShapesManager shapesManager;
    protected javax.swing.JComboBox shapesComboBox;
    public Program() {
        initComponents();
        setTitle("Vector Drawing Application");
        setContentPane(jPanel1);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        g=(Graphics2D)canvas.getGraphics();
        
        //Initalize Shape Manager to track shapes 
        this.shapesComboBox=shapesBox;
        this.shapesManager=new ShapesManager();
        
        //To Make Origin(0,0) At Bottom Left Corner
        g.translate(0, canvas.getHeight());
        g.scale(1,-1);
         
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        canvas.setBackground(new java.awt.Color(255, 255, 255));
        canvas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204)));
        canvas.setPreferredSize(new java.awt.Dimension(450, 350));

        javax.swing.GroupLayout canvasLayout = new javax.swing.GroupLayout(canvas);
        canvas.setLayout(canvasLayout);
        canvasLayout.setHorizontalGroup(
            canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 507, Short.MAX_VALUE)
        );
        canvasLayout.setVerticalGroup(
            canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 348, Short.MAX_VALUE)
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
        colorize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorizeActionPerformed(evt);
            }
        });

        remove.setFont(new java.awt.Font("Georgia Pro", 0, 12)); // NOI18N
        remove.setText("Remove");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(colorize)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(remove))
                    .addComponent(shapesBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(canvas, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(circleButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(lineButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(squareButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(rectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(circleButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lineButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(squareButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rectButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(canvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(shapesBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(colorize)
                            .addComponent(remove))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lineButtonActionPerformed
        LineDialogBox window=new LineDialogBox(this, rootPaneCheckingEnabled);
    }//GEN-LAST:event_lineButtonActionPerformed

    private void circleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circleButtonActionPerformed
        CircleDialogBox window=new CircleDialogBox(this, rootPaneCheckingEnabled);
    }//GEN-LAST:event_circleButtonActionPerformed

    private void squareButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareButtonActionPerformed
        SquareDialogBox window=new SquareDialogBox(this, rootPaneCheckingEnabled);
    }//GEN-LAST:event_squareButtonActionPerformed

    private void rectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectButtonActionPerformed
        RectangleDialogBox window=new RectangleDialogBox(this, rootPaneCheckingEnabled);
    }//GEN-LAST:event_rectButtonActionPerformed

    private void shapesBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shapesBoxActionPerformed
        
    }//GEN-LAST:event_shapesBoxActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        String selectedShapeString=(String)shapesBox.getSelectedItem();
        if(selectedShapeString!=null)
        {
        this.shapesComboBox.removeItem(selectedShapeString);
        
        System.out.println("Shape"+selectedShapeString);
        Shape shapeToRemove=shapesManager.shapes.get(selectedShapeString);
        shapesManager.removeShape(shapeToRemove);
        shapesManager.refresh(g);
        }
    }//GEN-LAST:event_removeActionPerformed

    private void colorizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorizeActionPerformed
        Color currentColor = Color.BLACK;
        String selectedShapeString = (String) this.shapesComboBox.getSelectedItem();
        System.out.println("Color :"+selectedShapeString);
         if(selectedShapeString!=null)
         {
             Shape shapeToColor = shapesManager.shapes.get(selectedShapeString);
             Color newColor;
                newColor = JColorChooser.showDialog(Program.this, "Select Shape Color", currentColor);
            if (newColor != null) {
                System.out.println("Hello");
                    currentColor = newColor;
                    shapeToColor.setColor(newColor);
                    shapeToColor.setFillColor(newColor);
                    
                    shapesManager.refresh(g);
         }
    }
    }//GEN-LAST:event_colorizeActionPerformed

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
    private javax.swing.JButton rectButton;
    private javax.swing.JButton remove;
    private javax.swing.JComboBox<String> shapesBox;
    private javax.swing.JButton squareButton;
    // End of variables declaration//GEN-END:variables
}
