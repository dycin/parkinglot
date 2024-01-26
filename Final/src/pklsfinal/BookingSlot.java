package pklsfinal;

import java.awt.Color;
import static java.lang.reflect.Array.set;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class BookingSlot extends javax.swing.JFrame {
    
            
    public BookingSlot() {
        initComponents();

    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Slotnum = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Vname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ComboTime = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Price = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Date = new javax.swing.JTextField();
        ComboType = new javax.swing.JComboBox<>();
        Slot15 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        Slot1 = new javax.swing.JButton();
        Slot2 = new javax.swing.JButton();
        Slot3 = new javax.swing.JButton();
        Slot4 = new javax.swing.JButton();
        Slot5 = new javax.swing.JButton();
        Slot6 = new javax.swing.JButton();
        Slot7 = new javax.swing.JButton();
        Slot8 = new javax.swing.JButton();
        Slot9 = new javax.swing.JButton();
        Slot10 = new javax.swing.JButton();
        Slot11 = new javax.swing.JButton();
        Slot12 = new javax.swing.JButton();
        Slot13 = new javax.swing.JButton();
        Slot14 = new javax.swing.JButton();
        PaymentMethod = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        Vnumber = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        ClearButton2 = new javax.swing.JButton();
        PayAndReserveButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        AccNumber = new javax.swing.JTextField();
        ExitButton = new javax.swing.JButton();
        ClearButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Booking Slot");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Account number:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 160, 39));

        Slotnum.setEditable(false);
        Slotnum.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Slotnum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Slotnum.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        Slotnum.setDoubleBuffered(true);
        Slotnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SlotnumActionPerformed(evt);
            }
        });
        jPanel1.add(Slotnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 580, 250, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Vehicle name ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 130, 39));
        jPanel1.add(Vname, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 250, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Vehicle number");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 150, 39));

        ComboTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "6:00 - 8:00 AM", "8:00 - 10:00 AM", "10:00 AM - 12:00 PM", "12:00 - 2:00 PM", "2:00 - 4:00 PM", "4:00 - 6:00 PM", "7:00 - 9:00 PM", "10:00 pm - 12:00 AM" }));
        jPanel1.add(ComboTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 250, 30));

        jPanel2.setBackground(new java.awt.Color(153, 0, 102));
        jPanel2.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                jPanel2HierarchyChanged(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/7.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Palatino Linotype", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Parking Lot Reservation");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 410, 60));

        jLabel12.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Per Slot:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 100, 40));

        Price.setEditable(false);
        Price.setBackground(new java.awt.Color(153, 0, 102));
        Price.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        Price.setForeground(new java.awt.Color(255, 255, 255));
        Price.setText("200");
        Price.setBorder(null);
        jPanel2.add(Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 50, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 110));

        jLabel7.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Choose Payment Method");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 290, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Slot number:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 540, 120, 39));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Type of Vehicle");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 130, 39));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Date");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 60, 39));
        jPanel1.add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 328, 250, -1));

        ComboType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "2 wheeler", "4 wheeler" }));
        ComboType.setToolTipText("");
        jPanel1.add(ComboType, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 250, -1));

        Slot15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Slot15.setText("15");
        buttonGroup2.add(Slot15);
        Slot15.setEnabled(false);
        jPanel1.add(Slot15, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 630, 70, 20));

        jLabel11.setFont(new java.awt.Font("Palatino Linotype", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("BOOK YOUR SLOT");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 360, 50));

        Slot1.setBackground(new java.awt.Color(204, 204, 204));
        Slot1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Slot1.setText("1");
        buttonGroup2.add(Slot1);
        Slot1.setEnabled(false);
        jPanel1.add(Slot1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 60, 20));

        Slot2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Slot2.setText("2");
        buttonGroup2.add(Slot2);
        Slot2.setEnabled(false);
        jPanel1.add(Slot2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 60, 20));

        Slot3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Slot3.setText("3");
        buttonGroup2.add(Slot3);
        Slot3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Slot3MouseClicked(evt);
            }
        });
        Slot3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Slot3ActionPerformed(evt);
            }
        });
        jPanel1.add(Slot3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, 60, 20));

        Slot4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Slot4.setText("4");
        buttonGroup2.add(Slot4);
        Slot4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Slot4ActionPerformed(evt);
            }
        });
        jPanel1.add(Slot4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, 60, 20));

        Slot5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Slot5.setText("5");
        buttonGroup2.add(Slot5);
        Slot5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Slot5ActionPerformed(evt);
            }
        });
        jPanel1.add(Slot5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 630, 60, 20));

        Slot6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Slot6.setText("6");
        buttonGroup2.add(Slot6);
        Slot6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Slot6ActionPerformed(evt);
            }
        });
        Slot6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Slot6KeyPressed(evt);
            }
        });
        jPanel1.add(Slot6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, 70, 20));

        Slot7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Slot7.setText("7");
        buttonGroup2.add(Slot7);
        Slot7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Slot7ActionPerformed(evt);
            }
        });
        jPanel1.add(Slot7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 510, 70, 20));

        Slot8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Slot8.setText("8");
        buttonGroup2.add(Slot8);
        Slot8.setEnabled(false);
        jPanel1.add(Slot8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 550, 70, 20));

        Slot9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Slot9.setText("9");
        buttonGroup2.add(Slot9);
        Slot9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Slot9ActionPerformed(evt);
            }
        });
        jPanel1.add(Slot9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 590, 70, 20));

        Slot10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Slot10.setText("10");
        buttonGroup2.add(Slot10);
        Slot10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Slot10ActionPerformed(evt);
            }
        });
        jPanel1.add(Slot10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 630, 70, 20));

        Slot11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Slot11.setText("11");
        buttonGroup2.add(Slot11);
        Slot11.setEnabled(false);
        jPanel1.add(Slot11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 70, 20));

        Slot12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Slot12.setText("12");
        buttonGroup2.add(Slot12);
        Slot12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Slot12ActionPerformed(evt);
            }
        });
        jPanel1.add(Slot12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, 70, 20));

        Slot13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Slot13.setText("13");
        buttonGroup2.add(Slot13);
        Slot13.setEnabled(false);
        Slot13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Slot13ActionPerformed(evt);
            }
        });
        jPanel1.add(Slot13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 550, 70, 20));

        Slot14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Slot14.setText("14");
        buttonGroup2.add(Slot14);
        Slot14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Slot14ActionPerformed(evt);
            }
        });
        jPanel1.add(Slot14, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 590, 70, 20));

        PaymentMethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "G-cash", "Maya", "PayPal" }));
        PaymentMethod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentMethodActionPerformed(evt);
            }
        });
        jPanel1.add(PaymentMethod, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, 310, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Time");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 50, 39));
        jPanel1.add(Vnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 250, -1));

        jLabel14.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Available Slots");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 130, 40));

        ClearButton2.setBackground(new java.awt.Color(153, 0, 102));
        ClearButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ClearButton2.setForeground(new java.awt.Color(255, 255, 255));
        ClearButton2.setText("Clear ");
        ClearButton2.setToolTipText("");
        ClearButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(ClearButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, -1, 30));

        PayAndReserveButton2.setBackground(new java.awt.Color(153, 0, 102));
        PayAndReserveButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PayAndReserveButton2.setForeground(new java.awt.Color(255, 255, 255));
        PayAndReserveButton2.setText(" Pay & Reserved");
        PayAndReserveButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayAndReserveButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(PayAndReserveButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 300, -1, 30));

        area.setEditable(false);
        area.setColumns(20);
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 340, 270));
        jPanel1.add(AccNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 310, -1));

        ExitButton.setBackground(new java.awt.Color(153, 0, 102));
        ExitButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(255, 255, 255));
        ExitButton.setText("Exit");
        ExitButton.setToolTipText("");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 620, 60, 30));

        ClearButton1.setBackground(new java.awt.Color(153, 0, 102));
        ClearButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ClearButton1.setForeground(new java.awt.Color(255, 255, 255));
        ClearButton1.setText("Clear ");
        ClearButton1.setToolTipText("");
        ClearButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(ClearButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 620, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2HierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jPanel2HierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2HierarchyChanged

    private void Slot13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Slot13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Slot13ActionPerformed

    private void ClearButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButton2ActionPerformed
        // if click this button it will clear the declared fields.
        Vname.setText(null); 
        Vnumber.setText(null); 
        Vname.setText(null); 
        Date.setText(null); 
        ComboType.setSelectedIndex(0);
        ComboTime.setSelectedIndex(0);
    }//GEN-LAST:event_ClearButton2ActionPerformed

    private void SlotnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SlotnumActionPerformed
        // if you click this button it will show the slot number in slot number field.
    }//GEN-LAST:event_SlotnumActionPerformed

    private void Slot3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Slot3ActionPerformed
        // if you click this button it will show the slot number in slot number field.
        Slotnum.setText("Slot 3");  
        Slot3.setEnabled(!Slot3.isEnabled());
    }//GEN-LAST:event_Slot3ActionPerformed

    private void Slot4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Slot4ActionPerformed
        // if you click this button it will show the slot number in slot number field.
        Slotnum.setText("Slot 4");
          Slot4.setEnabled(!Slot4.isEnabled());
    }//GEN-LAST:event_Slot4ActionPerformed

    private void Slot5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Slot5ActionPerformed
        // if you click this button it will show the slot number in slot number field.
        Slotnum.setText("Slot 5");
          Slot5.setEnabled(!Slot5.isEnabled());
    }//GEN-LAST:event_Slot5ActionPerformed

    private void Slot6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Slot6ActionPerformed
        // if you click this button it will show the slot number in slot number field.
        Slotnum.setText("Slot 6");
          Slot6.setEnabled(!Slot6.isEnabled());
    }//GEN-LAST:event_Slot6ActionPerformed

    private void Slot7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Slot7ActionPerformed
        // if you click this button it will show the slot number in slot number field.
        Slotnum.setText("Slot 7");
          Slot7.setEnabled(!Slot7.isEnabled());
    }//GEN-LAST:event_Slot7ActionPerformed

    private void Slot9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Slot9ActionPerformed
        // if you click this button it will show the slot number in slot number field.
        Slotnum.setText("Slot 9");
          Slot9.setEnabled(!Slot9.isEnabled());
    }//GEN-LAST:event_Slot9ActionPerformed

    private void Slot12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Slot12ActionPerformed
        // if you click this button it will show the slot number in slot number field.
        Slotnum.setText("Slot 12");
          Slot12.setEnabled(!Slot12.isEnabled());
    }//GEN-LAST:event_Slot12ActionPerformed

    private void Slot14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Slot14ActionPerformed
        // if you click this button it will show the slot number in slot number field.
        Slotnum.setText("Slot 14");
          Slot14.setEnabled(!Slot14.isEnabled());
    }//GEN-LAST:event_Slot14ActionPerformed

    private void Slot10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Slot10ActionPerformed
        // if you click this button it will show the slot number in slot number field.
        Slotnum.setText("Slot 10");
          Slot10.setEnabled(!Slot10.isEnabled());
    }//GEN-LAST:event_Slot10ActionPerformed

    private void PayAndReserveButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayAndReserveButton2ActionPerformed
        // Declare variables
        String vename = Vname.getText();
        String venum = Vnumber.getText();
        String da = Date.getText();
        String Snum = Slotnum.getText();
        String num = AccNumber.getText();
        
        
        if (vename.isEmpty() || venum.isEmpty() || da.isEmpty() || Snum.isEmpty() || num.isEmpty()){
            JOptionPane.showMessageDialog(this,"Oops! something went wrong. Please fill up all the fields to continue.", "Error", JOptionPane.ERROR_MESSAGE);
        
            //display receipt.
        } else{                                               
                 area.setText("*********************************************************************\n");
                 area.setText(area.getText()+ "*                                           RECEIPT                                         *\n");
                 area.setText(area.getText()+ "*********************************************************************\n");                 
                 area.setText(area.getText()+ "Slot number: " + Slotnum.getText() +"\n");
                 area.setText(area.getText()+ "Vehicle name: " + Vname.getText() +"\n");
                 area.setText(area.getText()+ "Vehicle number: " + Vnumber.getText()+"\n");
                 area.setText(area.getText()+ "Vehicle Type: " + ComboType.getSelectedItem()+"\n");
                 area.setText(area.getText()+ "*********************************************************************\n");                
                 area.setText(area.getText()+ "Date: " + Date.getText()+"\n");
                 area.setText(area.getText()+ "Time: " + ComboTime.getSelectedItem()+"\n");
                 area.setText(area.getText()+ "*********************************************************************\n");   
                 area.setText(area.getText()+ "Payment Method: " + PaymentMethod.getSelectedItem()+"\n");
                 area.setText(area.getText()+ "Account Number: " + AccNumber.getText()+"\n");
                 area.setText(area.getText()+ "Price Paid: " + Price.getText()+"\n");                                         
        }       
    }//GEN-LAST:event_PayAndReserveButton2ActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // if you clicked this button the system will back to home page.
       Home newname = new Home();
        newname.show();
         dispose();
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void PaymentMethodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentMethodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PaymentMethodActionPerformed

    private void Slot3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Slot3MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_Slot3MouseClicked

    private void Slot6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Slot6KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Slot6KeyPressed

    private void ClearButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButton1ActionPerformed
        // TODO add your handling code here:
        Slot3.setEnabled(true);
        Slot4.setEnabled(true);
        Slot5.setEnabled(true);
        Slot6.setEnabled(true);
        Slot7.setEnabled(true);
        Slot9.setEnabled(true);
        Slot10.setEnabled(true);
        Slot12.setEnabled(true);
        Slot14.setEnabled(true);
        
        Slotnum.setText(null); 
        
    }//GEN-LAST:event_ClearButton1ActionPerformed

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingSlot().setVisible(true);
            }
            
           
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AccNumber;
    private javax.swing.JButton ClearButton1;
    private javax.swing.JButton ClearButton2;
    public javax.swing.JComboBox<String> ComboTime;
    private javax.swing.JComboBox<String> ComboType;
    private javax.swing.JTextField Date;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton PayAndReserveButton2;
    private javax.swing.JComboBox<String> PaymentMethod;
    private javax.swing.JTextField Price;
    private javax.swing.JButton Slot1;
    private javax.swing.JButton Slot10;
    private javax.swing.JButton Slot11;
    private javax.swing.JButton Slot12;
    private javax.swing.JButton Slot13;
    private javax.swing.JButton Slot14;
    private javax.swing.JButton Slot15;
    private javax.swing.JButton Slot2;
    private javax.swing.JButton Slot3;
    private javax.swing.JButton Slot4;
    private javax.swing.JButton Slot5;
    private javax.swing.JButton Slot6;
    private javax.swing.JButton Slot7;
    private javax.swing.JButton Slot8;
    private javax.swing.JButton Slot9;
    public javax.swing.JTextField Slotnum;
    private javax.swing.JTextField Vname;
    private javax.swing.JTextField Vnumber;
    private javax.swing.JTextArea area;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
