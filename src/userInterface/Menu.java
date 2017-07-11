/*
 * Autor: Diego Garrido
 */
package userInterface;

import player.Play;

public class Menu extends javax.swing.JFrame {

    Play p;
    boolean isPlaying;

    public Menu() {
        initComponents();
        p = new Play();
        this.setLocationRelativeTo(null);
        isPlaying = false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Choose = new javax.swing.JFileChooser();
        file = new javax.swing.JButton();
        playbtn = new javax.swing.JButton();
        stopbtn = new javax.swing.JButton();
        pausebtn = new javax.swing.JButton();
        title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Player");
        setResizable(false);

        file.setText("Choose File");
        file.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileActionPerformed(evt);
            }
        });

        playbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/play.png"))); // NOI18N
        playbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playbtnActionPerformed(evt);
            }
        });

        stopbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/stop.png"))); // NOI18N
        stopbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopbtnActionPerformed(evt);
            }
        });

        pausebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/pause.png"))); // NOI18N
        pausebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pausebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pausebtnActionPerformed(evt);
            }
        });

        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setText("Title");
        title.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        title.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        title.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(file))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(playbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stopbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pausebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(file, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(playbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pausebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stopbtn))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileActionPerformed
        Choose.showOpenDialog(this);
        if (isPlaying) {
            p.stop();
            isPlaying = false;
        }
        p.setMedia(Choose.getSelectedFile());
        title.setText(Choose.getSelectedFile().getName());
    }//GEN-LAST:event_fileActionPerformed

    private void playbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playbtnActionPerformed
        try {
            if (!isPlaying) {
                p.play();
                isPlaying = true;
            }
        } catch (java.lang.NullPointerException e) {
            fileActionPerformed(evt);
        }
    }//GEN-LAST:event_playbtnActionPerformed

    private void stopbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopbtnActionPerformed
        try {
            p.stop();
        } catch (java.lang.NullPointerException e) {
            fileActionPerformed(evt);
        }
    }//GEN-LAST:event_stopbtnActionPerformed

    private void pausebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pausebtnActionPerformed
        try {
            if (isPlaying) {
                p.pause();
                isPlaying = false;
            }
        } catch (java.lang.NullPointerException e) {
            fileActionPerformed(evt);
        }
    }//GEN-LAST:event_pausebtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser Choose;
    private javax.swing.JButton file;
    private javax.swing.JButton pausebtn;
    private javax.swing.JButton playbtn;
    private javax.swing.JButton stopbtn;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
