
import java.awt.Color;
import static java.awt.Color.orange;
import static java.awt.Color.white;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author komal
 */
public class TTT_FRAME extends javax.swing.JFrame {

  private String turn="X";
  private int xcount=0;
  private int ocount=0;
    public TTT_FRAME() {
        initComponents();
    }
    public void choosePlayer()
    {
       if(turn.equalsIgnoreCase("X")){
           turn = "O";
       }else{
           turn = "X";
       }
    }
    
    public void setScore()
    {
        XB.setText(String.valueOf(xcount));
        OB.setText(String.valueOf(ocount));
    }
    public void chooseWinner()
    {
        String b1=GAMEB1.getText();
        String b2=GAMEB2.getText();
        String b3=GAMEB3.getText();
        String b4=GAMEB4.getText();
        String b5=GAMEB5.getText();
        String b6=GAMEB6.getText();
        String b7=GAMEB7.getText();
        String b8=GAMEB8.getText();
        String b9=GAMEB9.getText();
        
        if(b1=="X" && b2=="X" && b3=="X"){
            JOptionPane.showMessageDialog(this,
                    "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            setScore();
            GAMEB1.setBackground(orange);
            GAMEB2.setBackground(orange);
            GAMEB3.setBackground(orange);
        }else if(b4=="X" && b5=="X" && b6=="X"){
            JOptionPane.showMessageDialog(this,
                    "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            setScore();
            GAMEB4.setBackground(orange);
            GAMEB5.setBackground(orange);
            GAMEB6.setBackground(orange);
        }else if(b7=="X" && b8=="X" && b9=="X"){
            JOptionPane.showMessageDialog(this,
                    "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            setScore();
            GAMEB7.setBackground(orange);
            GAMEB8.setBackground(orange);
            GAMEB9.setBackground(orange);
        }else if(b1=="X" && b4=="X" && b7=="X"){
            JOptionPane.showMessageDialog(this,
                    "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            setScore();
            GAMEB1.setBackground(orange);
            GAMEB4.setBackground(orange);
            GAMEB7.setBackground(orange);
        }else if(b2=="X" && b5=="X" && b8=="X"){
            JOptionPane.showMessageDialog(this,
                    "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            setScore();
            GAMEB2.setBackground(orange);
            GAMEB5.setBackground(orange);
            GAMEB8.setBackground(orange);
        }else if(b3=="X" && b6=="X" && b9=="X"){
            JOptionPane.showMessageDialog(this,
                    "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            setScore();
            GAMEB3.setBackground(orange);
            GAMEB6.setBackground(orange);
            GAMEB9.setBackground(orange);
        }else if(b1=="X" && b5=="X" && b9=="X"){
            JOptionPane.showMessageDialog(this,
                    "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            setScore();
            GAMEB1.setBackground(orange);
            GAMEB5.setBackground(orange);
            GAMEB9.setBackground(orange);
        }else if(b3=="X" && b5=="X" && b7=="X"){
            JOptionPane.showMessageDialog(this,
                    "Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            setScore();
            GAMEB3.setBackground(orange);
            GAMEB5.setBackground(orange);
            GAMEB7.setBackground(orange);
        }else if(b1=="O" && b2=="O" && b3=="O"){
            JOptionPane.showMessageDialog(this,
                    "Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            setScore();
            GAMEB1.setBackground(orange);
            GAMEB2.setBackground(orange);
            GAMEB3.setBackground(orange);
        }else if(b4=="O" && b5=="O" && b6=="O"){
            JOptionPane.showMessageDialog(this,
                    "Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            setScore();
            GAMEB4.setBackground(orange);
            GAMEB5.setBackground(orange);
            GAMEB6.setBackground(orange);
        }else if(b7=="O" && b8=="O" && b9=="O"){
            JOptionPane.showMessageDialog(this,
                    "Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            setScore();
            GAMEB7.setBackground(orange);
            GAMEB8.setBackground(orange);
            GAMEB9.setBackground(orange);
        }else if(b1=="O" && b4=="O" && b7=="O"){
            JOptionPane.showMessageDialog(this,
                    "Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            setScore();
            GAMEB1.setBackground(orange);
            GAMEB4.setBackground(orange);
            GAMEB7.setBackground(orange);
        }else if(b2=="O" && b5=="O" && b8=="O"){
            JOptionPane.showMessageDialog(this,
                    "Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            setScore();
            GAMEB2.setBackground(orange);
            GAMEB5.setBackground(orange);
            GAMEB8.setBackground(orange);
        }else if(b3=="O" && b6=="O" && b9=="O"){
            JOptionPane.showMessageDialog(this,
                    "Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            setScore();
            GAMEB3.setBackground(orange);
            GAMEB6.setBackground(orange);
            GAMEB9.setBackground(orange);
        }else if(b1=="O" && b5=="O" && b9=="O"){
            JOptionPane.showMessageDialog(this,
                    "Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            setScore();
            GAMEB1.setBackground(orange);
            GAMEB5.setBackground(orange);
            GAMEB9.setBackground(orange);
        }else if(b3=="O" && b5=="O" && b7=="O"){
            JOptionPane.showMessageDialog(this,
                    "Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            setScore();
            GAMEB3.setBackground(orange);
            GAMEB5.setBackground(orange);
            GAMEB7.setBackground(orange);
        }
        
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        GAMEB2 = new javax.swing.JButton();
        GAMEB1 = new javax.swing.JButton();
        GAMEB3 = new javax.swing.JButton();
        GAMEB5 = new javax.swing.JButton();
        GAMEB4 = new javax.swing.JButton();
        GAMEB6 = new javax.swing.JButton();
        GAMEB8 = new javax.swing.JButton();
        GAMEB7 = new javax.swing.JButton();
        GAMEB9 = new javax.swing.JButton();
        RESETB = new javax.swing.JButton();
        EXITB = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        OB = new javax.swing.JLabel();
        XB = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOE");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TIC TOC TOE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        GAMEB2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        GAMEB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GAMEB2ActionPerformed(evt);
            }
        });

        GAMEB1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        GAMEB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GAMEB1ActionPerformed(evt);
            }
        });

        GAMEB3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        GAMEB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GAMEB3ActionPerformed(evt);
            }
        });

        GAMEB5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        GAMEB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GAMEB5ActionPerformed(evt);
            }
        });

        GAMEB4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        GAMEB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GAMEB4ActionPerformed(evt);
            }
        });

        GAMEB6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        GAMEB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GAMEB6ActionPerformed(evt);
            }
        });

        GAMEB8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        GAMEB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GAMEB8ActionPerformed(evt);
            }
        });

        GAMEB7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        GAMEB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GAMEB7ActionPerformed(evt);
            }
        });

        GAMEB9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        GAMEB9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GAMEB9ActionPerformed(evt);
            }
        });

        RESETB.setBackground(new java.awt.Color(204, 204, 255));
        RESETB.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        RESETB.setText("RESET");
        RESETB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESETBActionPerformed(evt);
            }
        });

        EXITB.setBackground(new java.awt.Color(255, 204, 204));
        EXITB.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        EXITB.setText("EXIT");
        EXITB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITBActionPerformed(evt);
            }
        });

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("PlayerX:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("PlayerO:");

        OB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        OB.setText("------");

        XB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        XB.setText("------");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(25, 25, 25)
                        .addComponent(OB))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addComponent(XB)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(XB))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(OB))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(GAMEB7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(GAMEB8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(GAMEB9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(GAMEB4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(GAMEB5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(GAMEB6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(GAMEB1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(GAMEB2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(GAMEB3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EXITB, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(RESETB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GAMEB2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GAMEB1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GAMEB3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GAMEB5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GAMEB4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GAMEB6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GAMEB8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GAMEB7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GAMEB9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RESETB, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EXITB, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void GAMEB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GAMEB2ActionPerformed
         GAMEB2.setText(turn);   
        if(turn.equalsIgnoreCase("X"))
        {
            GAMEB2.setForeground(Color.red);
        }else{
            GAMEB2.setForeground(Color.blue);
        }
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_GAMEB2ActionPerformed

    private void GAMEB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GAMEB4ActionPerformed
        // TODO add your handling code here:
         GAMEB4.setText(turn);   
        if(turn.equalsIgnoreCase("X"))
        {
            GAMEB4.setForeground(Color.red);
        }else{
            GAMEB4.setForeground(Color.blue);
        }
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_GAMEB4ActionPerformed

    private void EXITBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITBActionPerformed
        // TODO add your handling code here:
        JFrame frame=new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit",
                        "Tic Tac Toe",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
            System.exit(0); 
        }
    }//GEN-LAST:event_EXITBActionPerformed

    private void GAMEB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GAMEB1ActionPerformed
        GAMEB1.setText(turn);   
        if(turn.equalsIgnoreCase("X"))
        {
            GAMEB1.setForeground(Color.red);
        }else{
            GAMEB1.setForeground(Color.blue);
        }
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_GAMEB1ActionPerformed

    private void GAMEB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GAMEB3ActionPerformed
        // TODO add your handling code here:
         GAMEB3.setText(turn);   
        if(turn.equalsIgnoreCase("X"))
        {
            GAMEB3.setForeground(Color.red);
        }else{
            GAMEB3.setForeground(Color.blue);
        }
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_GAMEB3ActionPerformed

    private void GAMEB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GAMEB5ActionPerformed
        // TODO add your handling code here:
         GAMEB5.setText(turn);   
        if(turn.equalsIgnoreCase("X"))
        {
            GAMEB5.setForeground(Color.red);
        }else{
            GAMEB5.setForeground(Color.blue);
        }
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_GAMEB5ActionPerformed

    private void GAMEB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GAMEB6ActionPerformed
        // TODO add your handling code here:
         GAMEB6.setText(turn);   
        if(turn.equalsIgnoreCase("X"))
        {
            GAMEB6.setForeground(Color.red);
        }else{
            GAMEB6.setForeground(Color.blue);
        }
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_GAMEB6ActionPerformed

    private void GAMEB7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GAMEB7ActionPerformed
        // TODO add your handling code here:
         GAMEB7.setText(turn);   
        if(turn.equalsIgnoreCase("X"))
        {
            GAMEB7.setForeground(Color.red);
        }else{
            GAMEB7.setForeground(Color.blue);
        }
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_GAMEB7ActionPerformed

    private void GAMEB8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GAMEB8ActionPerformed
        // TODO add your handling code here:
         GAMEB8.setText(turn);   
        if(turn.equalsIgnoreCase("X"))
        {
            GAMEB8.setForeground(Color.red);
        }else{
            GAMEB8.setForeground(Color.blue);
        }
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_GAMEB8ActionPerformed

    private void GAMEB9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GAMEB9ActionPerformed
        // TODO add your handling code here:
         GAMEB9.setText(turn);   
        if(turn.equalsIgnoreCase("X"))
        {
            GAMEB9.setForeground(Color.red);
        }else{
            GAMEB9.setForeground(Color.blue);
        }
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_GAMEB9ActionPerformed

    private void RESETBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESETBActionPerformed
        // TODO add your handling code here:
        GAMEB1.setText(null);
        GAMEB2.setText(null);
        GAMEB3.setText(null);
        GAMEB4.setText(null);
        GAMEB5.setText(null);
        GAMEB6.setText(null);
        GAMEB7.setText(null);
        GAMEB8.setText(null);
        GAMEB9.setText(null);
        
        GAMEB1.setBackground(white);
        GAMEB2.setBackground(white);
        GAMEB3.setBackground(white);
        GAMEB4.setBackground(white);
        GAMEB5.setBackground(white);
        GAMEB6.setBackground(white);
        GAMEB7.setBackground(white);
        GAMEB8.setBackground(white);
        GAMEB9.setBackground(white);
        
        
    }//GEN-LAST:event_RESETBActionPerformed

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
            java.util.logging.Logger.getLogger(TTT_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TTT_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TTT_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TTT_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TTT_FRAME().setVisible(true);
            }
        });
        //chooseWinner();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EXITB;
    private javax.swing.JButton GAMEB1;
    private javax.swing.JButton GAMEB2;
    private javax.swing.JButton GAMEB3;
    private javax.swing.JButton GAMEB4;
    private javax.swing.JButton GAMEB5;
    private javax.swing.JButton GAMEB6;
    private javax.swing.JButton GAMEB7;
    private javax.swing.JButton GAMEB8;
    private javax.swing.JButton GAMEB9;
    private javax.swing.JLabel OB;
    private javax.swing.JButton RESETB;
    private javax.swing.JLabel XB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
