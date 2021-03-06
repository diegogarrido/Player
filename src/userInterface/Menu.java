/*
 * Autor: Diego Garrido
 */
package userInterface;

import java.io.File;
import javafx.util.Duration;
import player.Count;
import player.Data;
import player.Play;

public class Menu extends javax.swing.JFrame {

    Play p;
    Data d;
    boolean isPlaying;

    public Menu() {
        initComponents();
        this.p = new Play();
        this.d = new Data();
        this.setLocationRelativeTo(null);
        isPlaying = false;
        try {
            Choose.setCurrentDirectory(new File(d.loadData()[0]));
        } catch (Exception e) {
        }
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
        volume = new javax.swing.JSlider();
        timebar = new javax.swing.JSlider();
        time = new javax.swing.JLabel();

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

        volume.setMajorTickSpacing(2);
        volume.setMinorTickSpacing(1);
        volume.setOrientation(javax.swing.JSlider.VERTICAL);
        volume.setPaintTicks(true);
        volume.setSnapToTicks(true);
        volume.setValue(100);
        volume.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                volumeStateChanged(evt);
            }
        });

        timebar.setValue(0);
        timebar.setVerifyInputWhenFocusTarget(false);
        timebar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                timebarMouseDragged(evt);
            }
        });

        time.setText("00:00");

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
                        .addComponent(pausebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(timebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(volume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(time))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(volume, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(file, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(playbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pausebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stopbtn))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(time, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(timebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileActionPerformed
        p = null;
        p = new Play();
        Choose.showOpenDialog(this);
        if (isPlaying) {
            this.p.stop();
            isPlaying = false;
        }
        try {
            this.p.setMedia(Choose.getSelectedFile());
            title.setText(Choose.getSelectedFile().getName());
            d.saveData("" + Choose.getCurrentDirectory());
            this.p.play();
            new Thread() {
                {
                    this.setPriority(MIN_PRIORITY);
                    while (p.getMedia().getTotalDuration().toString().equals("UNKNOWN")) {
                        System.out.println("");
                    }
                    //int min = (int) p.getMedia().getTotalDuration().toMinutes();
                    int sec = (int) p.getMedia().getTotalDuration().toSeconds();
                    timebar.setMaximum(sec);
                    time.setText("0:0");
                    //add live-timebar
                    
                }
            };
        } catch (Exception e) {
        }
    }//GEN-LAST:event_fileActionPerformed

    private void playbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playbtnActionPerformed
        try {
            if (!isPlaying) {
                this.p.play();
                isPlaying = true;
            }
        } catch (java.lang.NullPointerException e) {
            fileActionPerformed(evt);
        }
    }//GEN-LAST:event_playbtnActionPerformed

    private void stopbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopbtnActionPerformed
        try {
            this.p.stop();
        } catch (java.lang.NullPointerException e) {
            fileActionPerformed(evt);
        }
    }//GEN-LAST:event_stopbtnActionPerformed

    private void pausebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pausebtnActionPerformed
        try {
            if (isPlaying) {
                this.p.pause();
                isPlaying = false;
            }
        } catch (java.lang.NullPointerException e) {
            fileActionPerformed(evt);
        }
    }//GEN-LAST:event_pausebtnActionPerformed

    private void volumeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_volumeStateChanged
        try {
            Double vol;
            if (volume.getValue() == 100) {
                vol = 1.0;
            } else if (volume.getValue() > 10) {
                vol = Double.parseDouble("0." + volume.getValue());
            } else {
                vol = Double.parseDouble("0.0" + volume.getValue());
            }
            this.p.getMedia().setVolume(vol);
        } catch (java.lang.NullPointerException ex) {
            volume.setValue(100);
        }
    }//GEN-LAST:event_volumeStateChanged

    private void timebarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timebarMouseDragged
        try {
            this.p.getMedia().seek(Duration.seconds(timebar.getValue()));
            int min = timebar.getValue() / 60;
            time.setText(min + ":" + (timebar.getValue() - (min * 60)));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_timebarMouseDragged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser Choose;
    private javax.swing.JButton file;
    private javax.swing.JButton pausebtn;
    private javax.swing.JButton playbtn;
    private javax.swing.JButton stopbtn;
    private javax.swing.JLabel time;
    private javax.swing.JSlider timebar;
    private javax.swing.JLabel title;
    private javax.swing.JSlider volume;
    // End of variables declaration//GEN-END:variables
}
