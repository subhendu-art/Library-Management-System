/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library.System.ui.Main;

import static com.sun.corba.se.impl.util.Utility.printStackTrace;
import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Anusuya
 */
public class StudentDetails extends javax.swing.JFrame {

    int mousepX;
    int mousepY;
    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public StudentDetails() {
        initComponents();
        Connect();
        Details_Sid.requestFocus();
        Details_Sname.setText("STUDENT NAME");
        jLabel10.setText("STATUS MESSAGE");
        jButton3.setEnabled(false);
        Details_Simage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library/System/ui/Main/project Images/Profile (2).png")));

    }

    public void Connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/slibrary", "root", "");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AddCategory.class.getName()).log(Level.SEVERE, null, ex);
            printStackTrace();
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Details_Sid = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        Details_Sroll = new javax.swing.JLabel();
        Details_Sdepartment = new javax.swing.JLabel();
        Details_Sstream = new javax.swing.JLabel();
        Details_Sgender = new javax.swing.JLabel();
        Details_Snickname = new javax.swing.JLabel();
        Details_Scontact = new javax.swing.JLabel();
        Details_Sdob = new javax.swing.JLabel();
        Details_Saddress = new javax.swing.JLabel();
        Details_Sgmail = new javax.swing.JLabel();
        Details_Simage = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        Details_Sname = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Details_Saddress1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Details_SIssuedBook = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library/System/ui/Main/project Images/icons8-close-window-96.png"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("STUDENT DETAILS PANEL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(587, 587, 587)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("STUDENT ID");

        Details_Sid.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Details_Sid.setForeground(new java.awt.Color(0, 0, 255));
        Details_Sid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        Details_Sid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Details_SidMouseClicked(evt);
            }
        });
        Details_Sid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Details_SidKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Details_SidKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Details_SidKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Details_Sid, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Details_Sid, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        jPanel5.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("ROLL NO.:");
        jPanel5.add(jLabel2);
        jLabel2.setBounds(58, 35, 72, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("STREAM:");
        jPanel5.add(jLabel3);
        jLabel3.setBounds(66, 91, 64, 45);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("DEPARTMENT:");
        jPanel5.add(jLabel4);
        jLabel4.setBounds(27, 159, 103, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("DATE OF BIRTH:");
        jPanel5.add(jLabel5);
        jLabel5.setBounds(13, 291, 117, 41);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("NICK NAME:");
        jPanel5.add(jLabel6);
        jLabel6.setBounds(41, 222, 89, 43);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("GENDER:");
        jPanel5.add(jLabel7);
        jLabel7.setBounds(66, 350, 64, 41);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("GMAIL:");
        jPanel5.add(jLabel8);
        jLabel8.setBounds(78, 485, 52, 45);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setText("ADDRESS:");
        jPanel5.add(jLabel9);
        jLabel9.setBounds(58, 548, 72, 45);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library/System/ui/Main/project Images/HOME.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2);
        jButton2.setBounds(690, 620, 50, 48);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 153));
        jLabel11.setText("CONTACT:");
        jPanel5.add(jLabel11);
        jLabel11.setBounds(55, 417, 75, 41);

        Details_Sroll.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Details_Sroll.setForeground(new java.awt.Color(255, 0, 204));
        jPanel5.add(Details_Sroll);
        Details_Sroll.setBounds(157, 35, 290, 45);

        Details_Sdepartment.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Details_Sdepartment.setForeground(new java.awt.Color(255, 0, 204));
        jPanel5.add(Details_Sdepartment);
        Details_Sdepartment.setBounds(157, 159, 410, 45);

        Details_Sstream.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Details_Sstream.setForeground(new java.awt.Color(255, 0, 204));
        jPanel5.add(Details_Sstream);
        Details_Sstream.setBounds(157, 91, 410, 45);

        Details_Sgender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Details_Sgender.setForeground(new java.awt.Color(255, 0, 204));
        jPanel5.add(Details_Sgender);
        Details_Sgender.setBounds(157, 346, 290, 45);

        Details_Snickname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Details_Snickname.setForeground(new java.awt.Color(255, 0, 204));
        jPanel5.add(Details_Snickname);
        Details_Snickname.setBounds(157, 222, 410, 45);

        Details_Scontact.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Details_Scontact.setForeground(new java.awt.Color(255, 0, 204));
        jPanel5.add(Details_Scontact);
        Details_Scontact.setBounds(157, 417, 240, 45);

        Details_Sdob.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Details_Sdob.setForeground(new java.awt.Color(255, 0, 204));
        jPanel5.add(Details_Sdob);
        Details_Sdob.setBounds(157, 291, 290, 45);

        Details_Saddress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Details_Saddress.setForeground(new java.awt.Color(255, 0, 204));
        jPanel5.add(Details_Saddress);
        Details_Saddress.setBounds(157, 548, 420, 45);

        Details_Sgmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Details_Sgmail.setForeground(new java.awt.Color(255, 0, 204));
        jPanel5.add(Details_Sgmail);
        Details_Sgmail.setBounds(157, 485, 420, 45);
        jPanel5.add(Details_Simage);
        Details_Simage.setBounds(1180, 130, 210, 270);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jPanel5.add(jLabel10);
        jLabel10.setBounds(1160, 80, 250, 40);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 153, 51));
        jButton3.setText("STATUS");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3);
        jButton3.setBounds(1230, 470, 130, 40);

        Details_Sname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Details_Sname.setForeground(new java.awt.Color(204, 0, 0));
        Details_Sname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel5.add(Details_Sname);
        Details_Sname.setBounds(1180, 410, 220, 40);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 153));
        jLabel13.setText("ADDRESS:");
        jPanel5.add(jLabel13);
        jLabel13.setBounds(58, 548, 72, 45);

        Details_Saddress1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Details_Saddress1.setForeground(new java.awt.Color(255, 0, 204));
        jPanel5.add(Details_Saddress1);
        Details_Saddress1.setBounds(157, 548, 206, 45);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 153, 153));
        jLabel14.setText("ISSUED BOOKS:");
        jPanel5.add(jLabel14);
        jLabel14.setBounds(20, 600, 120, 45);

        Details_SIssuedBook.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Details_SIssuedBook.setForeground(new java.awt.Color(255, 0, 204));
        jPanel5.add(Details_SIssuedBook);
        Details_SIssuedBook.setBounds(160, 600, 290, 45);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 1428, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(471, 471, 471))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1480, 860);

        setSize(new java.awt.Dimension(1480, 861));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        // TODO add your handling code here:
        int coOrdinateX = evt.getXOnScreen();
        int coOrdinateY = evt.getYOnScreen();
        this.setLocation(coOrdinateX - mousepX, coOrdinateY - mousepY);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
        mousepX = evt.getX();
        mousepY = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void Details_SidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Details_SidKeyTyped
        // TODO add your handling code here:
        Details_Sname.setText("STUDENT NAME");
        jLabel10.setText("STATUS MESSAGE");
        Details_Simage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library/System/ui/Main/project Images/Profile (2).png")));
        Details_Sroll.setText("");
        Details_Sstream.setText("");
        Details_Sdepartment.setText("");
        Details_Snickname.setText(null);
        Details_Sdob.setText("");
        Details_Sgender.setText("");
        Details_Scontact.setText("");
        Details_Sgmail.setText("");
        Details_Saddress.setText("");
        jButton3.setText("STATUS");

    }//GEN-LAST:event_Details_SidKeyTyped

    private void Details_SidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Details_SidKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_Details_SidKeyPressed

    private void Details_SidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Details_SidMouseClicked
        // TODO add your handling code here:
        Details_Sname.setText("STUDENT NAME");
        jLabel10.setText("STATUS MESSAGE");
        Details_Simage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library/System/ui/Main/project Images/Profile (2).png")));
        Details_Sroll.setText("");
        Details_Sstream.setText("");
        Details_Sdepartment.setText("");
        Details_Snickname.setText(null);
        Details_Sdob.setText("");
        Details_Sgender.setText("");
        Details_Scontact.setText("");
        Details_Sgmail.setText("");
        Details_Saddress.setText("");
        jButton3.setText("STATUS");

    }//GEN-LAST:event_Details_SidMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String Studentid = Details_Sid.getText();
        String StactusCheck = "ACTIVE";
        String StactusCheck1 = "INACTIVE";

        String S_Message = " STUDENT IS NOT ACTIVE";
        String s_Message = "STUDENT IS  ACTIVE";

        String StatusMessage = jLabel10.getText();

        String MyUpdateQuery = "UPDATE `student` SET `STATUS`=? WHERE `id` = ?";

        if (StatusMessage.equals(S_Message)) {
            try {

                pst = con.prepareStatement(MyUpdateQuery);
                pst.setString(1, StactusCheck);
                pst.setString(2, Studentid);

                int U = pst.executeUpdate();

                if (U == 1) {
                    jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                    jButton3.setForeground(new java.awt.Color(255, 0, 0));
                    jButton3.setText("INACTIVE");
                    jPanel5.add(jButton3);
                    jButton3.setBounds(1200, 470, 130, 40);

                    jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                    jLabel10.setForeground(new java.awt.Color(0, 153, 51));
                    jLabel10.setText("STUDENT IS  ACTIVE");
                    jPanel5.add(jLabel10);
                    jLabel10.setBounds(1170, 50, 190, 40);

                    Details_Sname.setForeground(Color.GREEN);
                }

            } catch (SQLException ex) {
                Logger.getLogger(StudentDetails.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        if (StatusMessage.equals(s_Message)) {
            try {

                String SelectStudentQuery = "SELECT * FROM `student` WHERE `id` = ?";

                pst = con.prepareStatement(SelectStudentQuery);
                pst.setString(1, Studentid);
                rs = pst.executeQuery();

                if (rs.next() == false) {
                    Details_Sid.requestFocus();
                    return;
                } else {
                    do {

                        int IssuedBookQuantity = rs.getInt("NoOfBookIssued");
                        String StudentName = rs.getString("Name");
                        String NoOfIssuedBook = String.valueOf(IssuedBookQuantity);

                        if (IssuedBookQuantity > 0) {
                            JOptionPane.showMessageDialog(null, "This student has already taken " + NoOfIssuedBook + " Books \nSo you can't Inactive", "WARNING", JOptionPane.WARNING_MESSAGE);

                        } else {

                            pst = con.prepareStatement(MyUpdateQuery);
                            pst.setString(1, StactusCheck1);
                            pst.setString(2, Studentid);

                            int UpdateStatus = pst.executeUpdate();

                            if (UpdateStatus == 1) {

                                jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                                jButton3.setForeground(new java.awt.Color(0, 153, 51));
                                jButton3.setText("ACTIVE");
                                jPanel5.add(jButton3);
                                jButton3.setBounds(1200, 470, 130, 40);

                                jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                                jLabel10.setForeground(new java.awt.Color(255, 0, 0));
                                jLabel10.setText(" STUDENT IS NOT ACTIVE");
                                jPanel5.add(jLabel10);
                                jLabel10.setBounds(1140, 60, 240, 30);

                                Details_Sname.setForeground(Color.red);
                            }

                        }

                    } while (rs.next());
                }

            } catch (SQLException ex) {
                Logger.getLogger(StudentDetails.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void Details_SidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Details_SidKeyReleased
        // TODO add your handling code here:

        try {
            String StactusCheck1 = "ACTIVE";
            String StactusCheck2 = "INACTIVE";
            String Studentid = Details_Sid.getText();

            String SelectStudentQuery = "SELECT * FROM `student` WHERE `id` = ?";

            pst = con.prepareStatement(SelectStudentQuery);
            pst.setString(1, Studentid);
            rs = pst.executeQuery();

            if (rs.next() == false) {

                return;
            } else {
                do {
                    String Sname = rs.getString("Name");
                    String Sroll = rs.getString("Roll");
                    String Sstream = rs.getString("Stream");
                    String Sdepartment = rs.getString("Department");
                    String ImgPath = rs.getString("student_imgPath");
                    byte[] DetailsStudent_img = rs.getBytes("Student_Image");
                    String SnickName = rs.getString("Nickname");
                    Date Sdob = rs.getDate("DOB");
                    String Sdate = String.valueOf(Sdob);
                    String Sgender = rs.getString("Gender");
                    String SContact = rs.getString("Contact");
                    String SGmail = rs.getString("Gmail");
                    String SAddress = rs.getString("Address");
                    String status = rs.getString("STATUS");
                    int IssuedBookQuantity = rs.getInt("NoOfBookIssued");
                    String NoOfIssuedBook = String.valueOf(IssuedBookQuantity);

                    ImageIcon format;
                    format = new ImageIcon(DetailsStudent_img);
                    Image image = format.getImage().getScaledInstance(Details_Simage.getWidth(), Details_Simage.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon resizedImageIcon = new ImageIcon(image);

                    if (status.equals(StactusCheck2)) {

                        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
                        jLabel10.setText(" STUDENT IS NOT ACTIVE");
                        jPanel5.add(jLabel10);
                        jLabel10.setBounds(1140, 60, 240, 30);
                        jButton3.setEnabled(true);

                        Details_Sroll.setText(Sroll);
                        Details_Sstream.setText(Sstream);
                        Details_Sdepartment.setText(Sdepartment);
                        Details_Simage.setIcon(resizedImageIcon);
                        Details_Snickname.setText(SnickName);
                        Details_Sdob.setText(Sdate);
                        Details_Sgender.setText(Sgender);
                        Details_Scontact.setText(SContact);
                        Details_Sgmail.setText(SGmail);
                        Details_Saddress.setText(SAddress);
                        Details_Sname.setText(Sname);
                        Details_SIssuedBook.setText(NoOfIssuedBook);
                        Details_Sname.setForeground(Color.red);

                        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                        jButton3.setForeground(new java.awt.Color(0, 153, 51));
                        jButton3.setText("ACTIVE");
                        jPanel5.add(jButton3);
                        jButton3.setBounds(1200, 470, 130, 40);

                    }

                    if (status.equals(StactusCheck1)) {
                        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                        jLabel10.setForeground(new java.awt.Color(0, 153, 51));
                        jLabel10.setText("STUDENT IS  ACTIVE");
                        jPanel5.add(jLabel10);
                        jLabel10.setBounds(1170, 50, 190, 40);
                        jButton3.setEnabled(true);

                        Details_Sroll.setText(Sroll);
                        Details_Sstream.setText(Sstream);
                        Details_Sdepartment.setText(Sdepartment);
                        Details_Simage.setIcon(resizedImageIcon);
                        Details_Snickname.setText(SnickName);
                        Details_Sdob.setText(Sdate);
                        Details_Sgender.setText(Sgender);
                        Details_Scontact.setText(SContact);
                        Details_Sgmail.setText(SGmail);
                        Details_Saddress.setText(SAddress);
                        Details_Sname.setText(Sname);
                        Details_SIssuedBook.setText(NoOfIssuedBook);
                        Details_Sname.setForeground(Color.GREEN);

                        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                        jButton3.setForeground(new java.awt.Color(255, 0, 0));
                        jButton3.setText("INACTIVE");
                        jPanel5.add(jButton3);
                        jButton3.setBounds(1200, 470, 130, 40);

                    }

                } while (rs.next());
            }

        } catch (SQLException ex) {
            Logger.getLogger(StudentDetails.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_Details_SidKeyReleased

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
                //                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Details_SIssuedBook;
    public javax.swing.JLabel Details_Saddress;
    public javax.swing.JLabel Details_Saddress1;
    public javax.swing.JLabel Details_Scontact;
    public javax.swing.JLabel Details_Sdepartment;
    public javax.swing.JLabel Details_Sdob;
    public javax.swing.JLabel Details_Sgender;
    public javax.swing.JLabel Details_Sgmail;
    public javax.swing.JTextField Details_Sid;
    public javax.swing.JLabel Details_Simage;
    public javax.swing.JLabel Details_Sname;
    public javax.swing.JLabel Details_Snickname;
    public javax.swing.JLabel Details_Sroll;
    public javax.swing.JLabel Details_Sstream;
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    public javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
