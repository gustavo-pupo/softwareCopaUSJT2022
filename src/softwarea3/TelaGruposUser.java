/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package softwarea3;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Random;


/**
 *
 * @author PUPO, PAGUE UM PAU
 */
public class TelaGruposUser extends javax.swing.JFrame {

    /**
     * Creates new form TelaGrupos
     */
    public TelaGruposUser() {
        initComponents();
        getTimes();
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
        time1Grupo1TextField = new javax.swing.JTextField();
        time2Grupo1TextField = new javax.swing.JTextField();
        time3Grupo1TextField = new javax.swing.JTextField();
        time4Grupo1TextField = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        time1Grupo2TextField = new javax.swing.JTextField();
        time2Grupo2TextField = new javax.swing.JTextField();
        time3Grupo2TextField = new javax.swing.JTextField();
        time4Grupo2TextField = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        time1Grupo3TextField = new javax.swing.JTextField();
        time2Grupo3TextField = new javax.swing.JTextField();
        time3Grupo3TextField = new javax.swing.JTextField();
        time4Grupo3TextField = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        time1Grupo6TextField = new javax.swing.JTextField();
        time2Grupo6TextField = new javax.swing.JTextField();
        time3Grupo6TextField = new javax.swing.JTextField();
        time4Grupo6TextField = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        time1Grupo4TextField = new javax.swing.JTextField();
        time2Grupo4TextField = new javax.swing.JTextField();
        time3Grupo4TextField = new javax.swing.JTextField();
        time4Grupo4TextField = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        time1Grupo5TextField = new javax.swing.JTextField();
        time2Grupo5TextField = new javax.swing.JTextField();
        time3Grupo5TextField = new javax.swing.JTextField();
        time4Grupo5TextField = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        time1Grupo7TextField = new javax.swing.JTextField();
        time2Grupo7TextField = new javax.swing.JTextField();
        time3Grupo7TextField = new javax.swing.JTextField();
        time4Grupo7TextField = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        time1Grupo8TextField = new javax.swing.JTextField();
        time2Grupo8TextField = new javax.swing.JTextField();
        time3Grupo8TextField = new javax.swing.JTextField();
        time4Grupo8TextField = new javax.swing.JTextField();
        voltarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Grupos");
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setSize(new java.awt.Dimension(800, 600));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Grupo A"));
        jPanel1.setMaximumSize(new java.awt.Dimension(150, 250));
        jPanel1.setMinimumSize(new java.awt.Dimension(150, 250));
        jPanel1.setPreferredSize(new java.awt.Dimension(150, 250));

        time1Grupo1TextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        time1Grupo1TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                time1Grupo1TextFieldActionPerformed(evt);
            }
        });

        time2Grupo1TextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        time3Grupo1TextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        time4Grupo1TextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        time4Grupo1TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                time4Grupo1TextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(time1Grupo1TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(time2Grupo1TextField)
                    .addComponent(time3Grupo1TextField)
                    .addComponent(time4Grupo1TextField))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(time1Grupo1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(time2Grupo1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(time3Grupo1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(time4Grupo1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Grupo B"));
        jPanel9.setMaximumSize(new java.awt.Dimension(150, 200));
        jPanel9.setMinimumSize(new java.awt.Dimension(150, 200));
        jPanel9.setPreferredSize(new java.awt.Dimension(150, 200));

        time1Grupo2TextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        time1Grupo2TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                time1Grupo2TextFieldActionPerformed(evt);
            }
        });

        time2Grupo2TextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        time3Grupo2TextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        time3Grupo2TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                time3Grupo2TextFieldActionPerformed(evt);
            }
        });

        time4Grupo2TextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(time1Grupo2TextField)
                    .addComponent(time2Grupo2TextField)
                    .addComponent(time3Grupo2TextField)
                    .addComponent(time4Grupo2TextField))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(time1Grupo2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(time2Grupo2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(time3Grupo2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(time4Grupo2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Grupo C"));
        jPanel10.setMaximumSize(new java.awt.Dimension(150, 250));
        jPanel10.setMinimumSize(new java.awt.Dimension(150, 200));
        jPanel10.setPreferredSize(new java.awt.Dimension(150, 250));

        time1Grupo3TextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        time2Grupo3TextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        time3Grupo3TextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        time4Grupo3TextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        time4Grupo3TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                time4Grupo3TextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(time1Grupo3TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(time2Grupo3TextField)
                    .addComponent(time3Grupo3TextField)
                    .addComponent(time4Grupo3TextField))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(time1Grupo3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(time2Grupo3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(time3Grupo3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(time4Grupo3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Grupo F"));
        jPanel11.setMaximumSize(new java.awt.Dimension(150, 250));
        jPanel11.setMinimumSize(new java.awt.Dimension(150, 250));
        jPanel11.setPreferredSize(new java.awt.Dimension(150, 250));

        time1Grupo6TextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        time2Grupo6TextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        time3Grupo6TextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        time4Grupo6TextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(time2Grupo6TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(time3Grupo6TextField)
                    .addComponent(time4Grupo6TextField)
                    .addComponent(time1Grupo6TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(time1Grupo6TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(time2Grupo6TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(time3Grupo6TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(time4Grupo6TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Grupo D"));
        jPanel12.setMaximumSize(new java.awt.Dimension(150, 250));
        jPanel12.setMinimumSize(new java.awt.Dimension(150, 250));
        jPanel12.setPreferredSize(new java.awt.Dimension(150, 250));

        time1Grupo4TextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        time2Grupo4TextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        time3Grupo4TextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        time4Grupo4TextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(time1Grupo4TextField)
                    .addComponent(time2Grupo4TextField)
                    .addComponent(time3Grupo4TextField)
                    .addComponent(time4Grupo4TextField))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(time1Grupo4TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(time2Grupo4TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(time3Grupo4TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(time4Grupo4TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder("Grupo E"));
        jPanel13.setMaximumSize(new java.awt.Dimension(150, 250));
        jPanel13.setMinimumSize(new java.awt.Dimension(150, 250));
        jPanel13.setPreferredSize(new java.awt.Dimension(150, 250));

        time1Grupo5TextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        time2Grupo5TextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        time3Grupo5TextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        time4Grupo5TextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(time1Grupo5TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(time2Grupo5TextField)
                    .addComponent(time3Grupo5TextField)
                    .addComponent(time4Grupo5TextField))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(time1Grupo5TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(time2Grupo5TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(time3Grupo5TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(time4Grupo5TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder("Grupo G"));
        jPanel14.setMaximumSize(new java.awt.Dimension(150, 250));
        jPanel14.setMinimumSize(new java.awt.Dimension(150, 250));
        jPanel14.setPreferredSize(new java.awt.Dimension(150, 250));

        time1Grupo7TextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        time2Grupo7TextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        time2Grupo7TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                time2Grupo7TextFieldActionPerformed(evt);
            }
        });

        time3Grupo7TextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        time4Grupo7TextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(time1Grupo7TextField)
                    .addComponent(time2Grupo7TextField)
                    .addComponent(time3Grupo7TextField)
                    .addComponent(time4Grupo7TextField))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(time1Grupo7TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(time2Grupo7TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(time3Grupo7TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(time4Grupo7TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder("Grupo H"));
        jPanel15.setMaximumSize(new java.awt.Dimension(150, 250));
        jPanel15.setMinimumSize(new java.awt.Dimension(150, 250));
        jPanel15.setPreferredSize(new java.awt.Dimension(150, 250));

        time1Grupo8TextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        time2Grupo8TextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        time3Grupo8TextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        time4Grupo8TextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(time1Grupo8TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(time2Grupo8TextField)
                    .addComponent(time3Grupo8TextField)
                    .addComponent(time4Grupo8TextField))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(time1Grupo8TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(time2Grupo8TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(time3Grupo8TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(time4Grupo8TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        voltarButton.setText("Voltar");
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(voltarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(voltarButton)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void getTimes(){
        DAO dao = new DAO();
        try{
            Time[] times = dao.getTimes();
            time1Grupo1TextField.setText(times[0].getNome());
            time2Grupo1TextField.setText(times[1].getNome());
            time3Grupo1TextField.setText(times[2].getNome());
            time4Grupo1TextField.setText(times[3].getNome());
            time1Grupo2TextField.setText(times[4].getNome());
            time2Grupo2TextField.setText(times[5].getNome());
            time3Grupo2TextField.setText(times[6].getNome());
            time4Grupo2TextField.setText(times[7].getNome());
            time1Grupo3TextField.setText(times[8].getNome());
            time2Grupo3TextField.setText(times[9].getNome());
            time3Grupo3TextField.setText(times[10].getNome());
            time4Grupo3TextField.setText(times[11].getNome());
            time1Grupo4TextField.setText(times[12].getNome());
            time2Grupo4TextField.setText(times[13].getNome());
            time3Grupo4TextField.setText(times[14].getNome());
            time4Grupo4TextField.setText(times[15].getNome());
            time1Grupo5TextField.setText(times[16].getNome());
            time2Grupo5TextField.setText(times[17].getNome());
            time3Grupo5TextField.setText(times[18].getNome());
            time4Grupo5TextField.setText(times[19].getNome());
            time1Grupo6TextField.setText(times[20].getNome());
            time2Grupo6TextField.setText(times[21].getNome());
            time3Grupo6TextField.setText(times[22].getNome());
            time4Grupo6TextField.setText(times[23].getNome());
            time1Grupo7TextField.setText(times[24].getNome());
            time2Grupo7TextField.setText(times[25].getNome());
            time3Grupo7TextField.setText(times[26].getNome());
            time4Grupo7TextField.setText(times[27].getNome());
            time1Grupo8TextField.setText(times[28].getNome());
            time2Grupo8TextField.setText(times[29].getNome());
            time3Grupo8TextField.setText(times[30].getNome());
            time4Grupo8TextField.setText(times[31].getNome());
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro.");
            e.printStackTrace();
        }
        
    }
    
    private void time1Grupo1TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_time1Grupo1TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_time1Grupo1TextFieldActionPerformed

    private void time4Grupo1TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_time4Grupo1TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_time4Grupo1TextFieldActionPerformed

    private void time3Grupo2TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_time3Grupo2TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_time3Grupo2TextFieldActionPerformed

    private void time4Grupo3TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_time4Grupo3TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_time4Grupo3TextFieldActionPerformed

    private void time2Grupo7TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_time2Grupo7TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_time2Grupo7TextFieldActionPerformed

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        this.dispose();
        TelaUser tu = new TelaUser();
        tu.setVisible(true);
    }//GEN-LAST:event_voltarButtonActionPerformed
   
    private void time1Grupo2TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_time1Grupo2TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_time1Grupo2TextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(TelaGruposUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGruposUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGruposUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGruposUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGruposUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField time1Grupo1TextField;
    private javax.swing.JTextField time1Grupo2TextField;
    private javax.swing.JTextField time1Grupo3TextField;
    private javax.swing.JTextField time1Grupo4TextField;
    private javax.swing.JTextField time1Grupo5TextField;
    private javax.swing.JTextField time1Grupo6TextField;
    private javax.swing.JTextField time1Grupo7TextField;
    private javax.swing.JTextField time1Grupo8TextField;
    private javax.swing.JTextField time2Grupo1TextField;
    private javax.swing.JTextField time2Grupo2TextField;
    private javax.swing.JTextField time2Grupo3TextField;
    private javax.swing.JTextField time2Grupo4TextField;
    private javax.swing.JTextField time2Grupo5TextField;
    private javax.swing.JTextField time2Grupo6TextField;
    private javax.swing.JTextField time2Grupo7TextField;
    private javax.swing.JTextField time2Grupo8TextField;
    private javax.swing.JTextField time3Grupo1TextField;
    private javax.swing.JTextField time3Grupo2TextField;
    private javax.swing.JTextField time3Grupo3TextField;
    private javax.swing.JTextField time3Grupo4TextField;
    private javax.swing.JTextField time3Grupo5TextField;
    private javax.swing.JTextField time3Grupo6TextField;
    private javax.swing.JTextField time3Grupo7TextField;
    private javax.swing.JTextField time3Grupo8TextField;
    private javax.swing.JTextField time4Grupo1TextField;
    private javax.swing.JTextField time4Grupo2TextField;
    private javax.swing.JTextField time4Grupo3TextField;
    private javax.swing.JTextField time4Grupo4TextField;
    private javax.swing.JTextField time4Grupo5TextField;
    private javax.swing.JTextField time4Grupo6TextField;
    private javax.swing.JTextField time4Grupo7TextField;
    private javax.swing.JTextField time4Grupo8TextField;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
