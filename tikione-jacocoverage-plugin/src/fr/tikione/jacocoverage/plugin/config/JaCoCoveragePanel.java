package fr.tikione.jacocoverage.plugin.config;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.prefs.Preferences;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.openide.awt.Mnemonics;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle;
import org.openide.util.NbPreferences;

final class JaCoCoveragePanel extends javax.swing.JPanel {

    private static final long serialVersionUID = 1L;

    JaCoCoveragePanel(JaCoCoverageOptionsPanelController controller) {
        initComponents();
    }

    /** 
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHighlightingCoveredCode = new JPanel();
        jLabelCoveredCodeBG = new JLabel();
        jLabelPartiallyCoveredCodeBG = new JLabel();
        jLabelNotCoveredCodeBG = new JLabel();
        jPanelNotCoveredPreview = new JPanel();
        jPanelPartiallyCoveredPreview = new JPanel();
        jPanelCoveredPreview = new JPanel();
        jSpinnerCoveredR = new JSpinner();
        jSpinnerCoveredG = new JSpinner();
        jSpinnerCoveredB = new JSpinner();
        jSpinnerPartiallyCoveredR = new JSpinner();
        jSpinnerPartiallyCoveredG = new JSpinner();
        jSpinnerPartiallyCoveredB = new JSpinner();
        jSpinnerNotCoveredR = new JSpinner();
        jSpinnerNotCoveredG = new JSpinner();
        jSpinnerNotCoveredB = new JSpinner();
        jCheckBoxEnableHighlighting = new JCheckBox();
        jButtonResoreDefaults = new JButton();
        jLabelAuthor = new JLabel();
        jLabelAuthorWebsite = new JLabel();
        jPanelJaCoCoRuntimeParams = new JPanel();
        jLabelAntTaskParams = new JLabel();
        jTextFieldAntTaskParams = new JTextField();
        jLabelAntTaskParamsTips = new JLabel();
        jPanel1 = new JPanel();
        jCheckBoxEnableConsoleReport = new JCheckBox();

        jPanelHighlightingCoveredCode.setBorder(BorderFactory.createTitledBorder(NbBundle.getMessage(JaCoCoveragePanel.class, "JaCoCoveragePanel.jPanelHighlightingCoveredCode.border.title"))); // NOI18N

        Mnemonics.setLocalizedText(jLabelCoveredCodeBG, NbBundle.getMessage(JaCoCoveragePanel.class, "JaCoCoveragePanel.jLabelCoveredCodeBG.text")); // NOI18N

        Mnemonics.setLocalizedText(jLabelPartiallyCoveredCodeBG, NbBundle.getMessage(JaCoCoveragePanel.class, "JaCoCoveragePanel.jLabelPartiallyCoveredCodeBG.text")); // NOI18N

        Mnemonics.setLocalizedText(jLabelNotCoveredCodeBG, NbBundle.getMessage(JaCoCoveragePanel.class, "JaCoCoveragePanel.jLabelNotCoveredCodeBG.text")); // NOI18N

        jPanelNotCoveredPreview.setBackground(new Color(255, 255, 255));
        jPanelNotCoveredPreview.setMaximumSize(new Dimension(16, 16));
        jPanelNotCoveredPreview.setMinimumSize(new Dimension(16, 16));
        jPanelNotCoveredPreview.setName(""); // NOI18N

        GroupLayout jPanelNotCoveredPreviewLayout = new GroupLayout(jPanelNotCoveredPreview);
        jPanelNotCoveredPreview.setLayout(jPanelNotCoveredPreviewLayout);
        jPanelNotCoveredPreviewLayout.setHorizontalGroup(
            jPanelNotCoveredPreviewLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        jPanelNotCoveredPreviewLayout.setVerticalGroup(
            jPanelNotCoveredPreviewLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        jPanelPartiallyCoveredPreview.setBackground(new Color(255, 255, 255));
        jPanelPartiallyCoveredPreview.setMaximumSize(new Dimension(16, 16));
        jPanelPartiallyCoveredPreview.setMinimumSize(new Dimension(16, 16));
        jPanelPartiallyCoveredPreview.setName(""); // NOI18N

        GroupLayout jPanelPartiallyCoveredPreviewLayout = new GroupLayout(jPanelPartiallyCoveredPreview);
        jPanelPartiallyCoveredPreview.setLayout(jPanelPartiallyCoveredPreviewLayout);
        jPanelPartiallyCoveredPreviewLayout.setHorizontalGroup(
            jPanelPartiallyCoveredPreviewLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        jPanelPartiallyCoveredPreviewLayout.setVerticalGroup(
            jPanelPartiallyCoveredPreviewLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        jPanelCoveredPreview.setBackground(new Color(255, 255, 255));
        jPanelCoveredPreview.setMaximumSize(new Dimension(16, 16));
        jPanelCoveredPreview.setMinimumSize(new Dimension(16, 16));
        jPanelCoveredPreview.setName(""); // NOI18N

        GroupLayout jPanelCoveredPreviewLayout = new GroupLayout(jPanelCoveredPreview);
        jPanelCoveredPreview.setLayout(jPanelCoveredPreviewLayout);
        jPanelCoveredPreviewLayout.setHorizontalGroup(
            jPanelCoveredPreviewLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        jPanelCoveredPreviewLayout.setVerticalGroup(
            jPanelCoveredPreviewLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        jSpinnerCoveredR.setModel(new SpinnerNumberModel(0, 0, 255, 1));
        jSpinnerCoveredR.setEnabled(false);
        jSpinnerCoveredR.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                jSpinnerCoveredRStateChanged(evt);
            }
        });

        jSpinnerCoveredG.setModel(new SpinnerNumberModel(0, 0, 255, 1));
        jSpinnerCoveredG.setEnabled(false);
        jSpinnerCoveredG.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                jSpinnerCoveredGStateChanged(evt);
            }
        });

        jSpinnerCoveredB.setModel(new SpinnerNumberModel(0, 0, 255, 1));
        jSpinnerCoveredB.setEnabled(false);
        jSpinnerCoveredB.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                jSpinnerCoveredBStateChanged(evt);
            }
        });

        jSpinnerPartiallyCoveredR.setModel(new SpinnerNumberModel(0, 0, 255, 1));
        jSpinnerPartiallyCoveredR.setEnabled(false);
        jSpinnerPartiallyCoveredR.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                jSpinnerPartiallyCoveredRStateChanged(evt);
            }
        });

        jSpinnerPartiallyCoveredG.setModel(new SpinnerNumberModel(0, 0, 255, 1));
        jSpinnerPartiallyCoveredG.setEnabled(false);
        jSpinnerPartiallyCoveredG.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                jSpinnerPartiallyCoveredGStateChanged(evt);
            }
        });

        jSpinnerPartiallyCoveredB.setModel(new SpinnerNumberModel(0, 0, 255, 1));
        jSpinnerPartiallyCoveredB.setEnabled(false);
        jSpinnerPartiallyCoveredB.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                jSpinnerPartiallyCoveredBStateChanged(evt);
            }
        });

        jSpinnerNotCoveredR.setModel(new SpinnerNumberModel(0, 0, 255, 1));
        jSpinnerNotCoveredR.setEnabled(false);
        jSpinnerNotCoveredR.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                jSpinnerNotCoveredRStateChanged(evt);
            }
        });

        jSpinnerNotCoveredG.setModel(new SpinnerNumberModel(0, 0, 255, 1));
        jSpinnerNotCoveredG.setEnabled(false);
        jSpinnerNotCoveredG.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                jSpinnerNotCoveredGStateChanged(evt);
            }
        });

        jSpinnerNotCoveredB.setModel(new SpinnerNumberModel(0, 0, 255, 1));
        jSpinnerNotCoveredB.setEnabled(false);
        jSpinnerNotCoveredB.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                jSpinnerNotCoveredBStateChanged(evt);
            }
        });

        Mnemonics.setLocalizedText(jCheckBoxEnableHighlighting, NbBundle.getMessage(JaCoCoveragePanel.class, "JaCoCoveragePanel.jCheckBoxEnableHighlighting.text")); // NOI18N

        GroupLayout jPanelHighlightingCoveredCodeLayout = new GroupLayout(jPanelHighlightingCoveredCode);
        jPanelHighlightingCoveredCode.setLayout(jPanelHighlightingCoveredCodeLayout);
        jPanelHighlightingCoveredCodeLayout.setHorizontalGroup(
            jPanelHighlightingCoveredCodeLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHighlightingCoveredCodeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHighlightingCoveredCodeLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxEnableHighlighting)
                    .addGroup(jPanelHighlightingCoveredCodeLayout.createSequentialGroup()
                        .addGroup(jPanelHighlightingCoveredCodeLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelHighlightingCoveredCodeLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelPartiallyCoveredCodeBG)
                                .addComponent(jLabelNotCoveredCodeBG, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelCoveredCodeBG, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelHighlightingCoveredCodeLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelHighlightingCoveredCodeLayout.createSequentialGroup()
                                .addComponent(jSpinnerNotCoveredR, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinnerNotCoveredG, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinnerNotCoveredB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelNotCoveredPreview, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelHighlightingCoveredCodeLayout.createSequentialGroup()
                                .addComponent(jSpinnerCoveredR, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinnerCoveredG, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinnerCoveredB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelCoveredPreview, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelHighlightingCoveredCodeLayout.createSequentialGroup()
                                .addComponent(jSpinnerPartiallyCoveredR, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinnerPartiallyCoveredG, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinnerPartiallyCoveredB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelPartiallyCoveredPreview, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelHighlightingCoveredCodeLayout.setVerticalGroup(
            jPanelHighlightingCoveredCodeLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanelHighlightingCoveredCodeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBoxEnableHighlighting)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelHighlightingCoveredCodeLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelCoveredCodeBG, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelCoveredPreview, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerCoveredR, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerCoveredG, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerCoveredB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelHighlightingCoveredCodeLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelPartiallyCoveredCodeBG, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerPartiallyCoveredR, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerPartiallyCoveredG, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerPartiallyCoveredB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelPartiallyCoveredPreview, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelHighlightingCoveredCodeLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelNotCoveredCodeBG, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerNotCoveredR, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerNotCoveredG, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerNotCoveredB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelNotCoveredPreview, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Mnemonics.setLocalizedText(jButtonResoreDefaults, NbBundle.getMessage(JaCoCoveragePanel.class, "JaCoCoveragePanel.jButtonResoreDefaults.text")); // NOI18N
        jButtonResoreDefaults.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonResoreDefaultsActionPerformed(evt);
            }
        });

        Mnemonics.setLocalizedText(jLabelAuthor, NbBundle.getMessage(JaCoCoveragePanel.class, "JaCoCoveragePanel.jLabelAuthor.text")); // NOI18N

        jLabelAuthorWebsite.setForeground(new Color(0, 51, 204));
        Mnemonics.setLocalizedText(jLabelAuthorWebsite, NbBundle.getMessage(JaCoCoveragePanel.class, "JaCoCoveragePanel.jLabelAuthorWebsite.text")); // NOI18N
        jLabelAuthorWebsite.setToolTipText(NbBundle.getMessage(JaCoCoveragePanel.class, "JaCoCoveragePanel.jLabelAuthorWebsite.toolTipText")); // NOI18N
        jLabelAuthorWebsite.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jLabelAuthorWebsite.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                jLabelAuthorWebsiteMouseClicked(evt);
            }
        });

        jPanelJaCoCoRuntimeParams.setBorder(BorderFactory.createTitledBorder(NbBundle.getMessage(JaCoCoveragePanel.class, "JaCoCoveragePanel.jPanelJaCoCoRuntimeParams.border.title"))); // NOI18N

        Mnemonics.setLocalizedText(jLabelAntTaskParams, NbBundle.getMessage(JaCoCoveragePanel.class, "JaCoCoveragePanel.jLabelAntTaskParams.text")); // NOI18N

        jTextFieldAntTaskParams.setText(NbBundle.getMessage(JaCoCoveragePanel.class, "JaCoCoveragePanel.jTextFieldAntTaskParams.text")); // NOI18N

        Mnemonics.setLocalizedText(jLabelAntTaskParamsTips, NbBundle.getMessage(JaCoCoveragePanel.class, "JaCoCoveragePanel.jLabelAntTaskParamsTips.text")); // NOI18N

        GroupLayout jPanelJaCoCoRuntimeParamsLayout = new GroupLayout(jPanelJaCoCoRuntimeParams);
        jPanelJaCoCoRuntimeParams.setLayout(jPanelJaCoCoRuntimeParamsLayout);
        jPanelJaCoCoRuntimeParamsLayout.setHorizontalGroup(
            jPanelJaCoCoRuntimeParamsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJaCoCoRuntimeParamsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelJaCoCoRuntimeParamsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelJaCoCoRuntimeParamsLayout.createSequentialGroup()
                        .addComponent(jLabelAntTaskParams, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldAntTaskParams, GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE))
                    .addGroup(jPanelJaCoCoRuntimeParamsLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabelAntTaskParamsTips, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelJaCoCoRuntimeParamsLayout.setVerticalGroup(
            jPanelJaCoCoRuntimeParamsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJaCoCoRuntimeParamsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelJaCoCoRuntimeParamsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAntTaskParams, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAntTaskParams, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelAntTaskParamsTips, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(BorderFactory.createTitledBorder(NbBundle.getMessage(JaCoCoveragePanel.class, "JaCoCoveragePanel.jPanel1.border.title"))); // NOI18N
        jPanel1.setPreferredSize(new Dimension(435, 123));

        Mnemonics.setLocalizedText(jCheckBoxEnableConsoleReport, NbBundle.getMessage(JaCoCoveragePanel.class, "JaCoCoveragePanel.jCheckBoxEnableConsoleReport.text")); // NOI18N

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBoxEnableConsoleReport)
                .addContainerGap(166, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBoxEnableConsoleReport)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelAuthor)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelAuthorWebsite)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonResoreDefaults))
            .addComponent(jPanelJaCoCoRuntimeParams, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelHighlightingCoveredCode, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelHighlightingCoveredCode, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelJaCoCoRuntimeParams, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonResoreDefaults)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelAuthor)
                        .addComponent(jLabelAuthorWebsite))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonResoreDefaultsActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButtonResoreDefaultsActionPerformed
        jSpinnerCoveredR.setValue(Globals.DEF_COVERED_R);
        jSpinnerCoveredG.setValue(Globals.DEF_COVERED_G);
        jSpinnerCoveredB.setValue(Globals.DEF_COVERED_B);
        jSpinnerPartiallyCoveredR.setValue(Globals.DEF_PARTIAL_COVERED_R);
        jSpinnerPartiallyCoveredG.setValue(Globals.DEF_PARTIAL_COVERED_G);
        jSpinnerPartiallyCoveredB.setValue(Globals.DEF_PARTIAL_COVERED_B);
        jSpinnerNotCoveredR.setValue(Globals.DEF_NOT_COVERED_R);
        jSpinnerNotCoveredG.setValue(Globals.DEF_NOT_COVERED_G);
        jSpinnerNotCoveredB.setValue(Globals.DEF_NOT_COVERED_B);
        jTextFieldAntTaskParams.setText(Globals.DEF_TEST_ANT_TASK_JAVAAGENT);
        jCheckBoxEnableHighlighting.setSelected(Globals.DEF_ENABLE_HIGHLIGHT);
        jCheckBoxEnableConsoleReport.setSelected(Globals.DEF_ENABLE_CONSOLE_REPORT);
        updatePreviews();
    }//GEN-LAST:event_jButtonResoreDefaultsActionPerformed

    private void jSpinnerCoveredRStateChanged(ChangeEvent evt) {//GEN-FIRST:event_jSpinnerCoveredRStateChanged
        updatePreviews();
    }//GEN-LAST:event_jSpinnerCoveredRStateChanged

    private void jSpinnerCoveredGStateChanged(ChangeEvent evt) {//GEN-FIRST:event_jSpinnerCoveredGStateChanged
        updatePreviews();
    }//GEN-LAST:event_jSpinnerCoveredGStateChanged

    private void jSpinnerCoveredBStateChanged(ChangeEvent evt) {//GEN-FIRST:event_jSpinnerCoveredBStateChanged
        updatePreviews();
    }//GEN-LAST:event_jSpinnerCoveredBStateChanged

    private void jSpinnerPartiallyCoveredRStateChanged(ChangeEvent evt) {//GEN-FIRST:event_jSpinnerPartiallyCoveredRStateChanged
        updatePreviews();
    }//GEN-LAST:event_jSpinnerPartiallyCoveredRStateChanged

    private void jSpinnerPartiallyCoveredGStateChanged(ChangeEvent evt) {//GEN-FIRST:event_jSpinnerPartiallyCoveredGStateChanged
        updatePreviews();
    }//GEN-LAST:event_jSpinnerPartiallyCoveredGStateChanged

    private void jSpinnerPartiallyCoveredBStateChanged(ChangeEvent evt) {//GEN-FIRST:event_jSpinnerPartiallyCoveredBStateChanged
        updatePreviews();
    }//GEN-LAST:event_jSpinnerPartiallyCoveredBStateChanged

    private void jSpinnerNotCoveredRStateChanged(ChangeEvent evt) {//GEN-FIRST:event_jSpinnerNotCoveredRStateChanged
        updatePreviews();
    }//GEN-LAST:event_jSpinnerNotCoveredRStateChanged

    private void jSpinnerNotCoveredGStateChanged(ChangeEvent evt) {//GEN-FIRST:event_jSpinnerNotCoveredGStateChanged
        updatePreviews();
    }//GEN-LAST:event_jSpinnerNotCoveredGStateChanged

    private void jSpinnerNotCoveredBStateChanged(ChangeEvent evt) {//GEN-FIRST:event_jSpinnerNotCoveredBStateChanged
        updatePreviews();
    }//GEN-LAST:event_jSpinnerNotCoveredBStateChanged

    private void jLabelAuthorWebsiteMouseClicked(MouseEvent evt) {//GEN-FIRST:event_jLabelAuthorWebsiteMouseClicked
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new URI("http://netbeanscolors.org"));
            } catch (URISyntaxException ex) {
                Exceptions.printStackTrace(ex);
            } catch (IOException ex) {
                Exceptions.printStackTrace(ex);
            }
        }
    }//GEN-LAST:event_jLabelAuthorWebsiteMouseClicked

    private void updatePreviews() {
        jPanelCoveredPreview.setBackground(new Color(
                (Integer) jSpinnerCoveredR.getValue(),
                (Integer) jSpinnerCoveredG.getValue(),
                (Integer) jSpinnerCoveredB.getValue()));
        jPanelPartiallyCoveredPreview.setBackground(new Color(
                (Integer) jSpinnerPartiallyCoveredR.getValue(),
                (Integer) jSpinnerPartiallyCoveredG.getValue(),
                (Integer) jSpinnerPartiallyCoveredB.getValue()));
        jPanelNotCoveredPreview.setBackground(new Color(
                (Integer) jSpinnerNotCoveredR.getValue(),
                (Integer) jSpinnerNotCoveredG.getValue(),
                (Integer) jSpinnerNotCoveredB.getValue()));
    }

    void load() {
        Preferences pref = NbPreferences.forModule(JaCoCoveragePanel.class);
        int coveredR = pref.getInt(Globals.PROP_COVERAGE_HILIGHT_COLOR_R, Globals.DEF_COVERED_R);
        int coveredG = pref.getInt(Globals.PROP_COVERAGE_HILIGHT_COLOR_G, Globals.DEF_COVERED_G);
        int coveredB = pref.getInt(Globals.PROP_COVERAGE_HILIGHT_COLOR_B, Globals.DEF_COVERED_B);
        int parCoveredR = pref.getInt(Globals.PROP_PARTIALCOVERAGE_HILIGHT_COLOR_R, Globals.DEF_PARTIAL_COVERED_R);
        int parCoveredG = pref.getInt(Globals.PROP_PARTIALCOVERAGE_HILIGHT_COLOR_G, Globals.DEF_PARTIAL_COVERED_G);
        int parCoveredB = pref.getInt(Globals.PROP_PARTIALCOVERAGE_HILIGHT_COLOR_B, Globals.DEF_PARTIAL_COVERED_B);
        int notCoveredR = pref.getInt(Globals.PROP_NOCOVERAGE_HILIGHT_COLOR_R, Globals.DEF_NOT_COVERED_R);
        int notCoveredG = pref.getInt(Globals.PROP_NOCOVERAGE_HILIGHT_COLOR_G, Globals.DEF_NOT_COVERED_G);
        int notCoveredB = pref.getInt(Globals.PROP_NOCOVERAGE_HILIGHT_COLOR_B, Globals.DEF_NOT_COVERED_B);
        String antTaskJavaagent = pref.get(Globals.PROP_TEST_ANT_TASK_JAVAAGENT, Globals.DEF_TEST_ANT_TASK_JAVAAGENT);
        boolean enblHighlighting = pref.getBoolean(Globals.PROP_ENABLE_HIGHLIGHT, Globals.DEF_ENABLE_HIGHLIGHT);
        boolean enblConsoleReport = pref.getBoolean(Globals.PROP_ENABLE_CONSOLE_REPORT, Globals.DEF_ENABLE_CONSOLE_REPORT);
        jSpinnerCoveredR.setValue(coveredR);
        jSpinnerCoveredG.setValue(coveredG);
        jSpinnerCoveredB.setValue(coveredB);
        jSpinnerPartiallyCoveredR.setValue(parCoveredR);
        jSpinnerPartiallyCoveredG.setValue(parCoveredG);
        jSpinnerPartiallyCoveredB.setValue(parCoveredB);
        jSpinnerNotCoveredR.setValue(notCoveredR);
        jSpinnerNotCoveredG.setValue(notCoveredG);
        jSpinnerNotCoveredB.setValue(notCoveredB);
        jPanelCoveredPreview.setBackground(new Color(coveredR, coveredG, coveredB));
        jPanelPartiallyCoveredPreview.setBackground(new Color(parCoveredR, parCoveredG, parCoveredB));
        jPanelNotCoveredPreview.setBackground(new Color(notCoveredR, notCoveredG, notCoveredB));
        jTextFieldAntTaskParams.setText(antTaskJavaagent);
        jCheckBoxEnableHighlighting.setSelected(enblHighlighting);
        jCheckBoxEnableConsoleReport.setSelected(enblConsoleReport);
    }

    void store() {
        Preferences pref = NbPreferences.forModule(JaCoCoveragePanel.class);
        pref.putInt(Globals.PROP_COVERAGE_HILIGHT_COLOR_R, (Integer) jSpinnerCoveredR.getValue());
        pref.putInt(Globals.PROP_COVERAGE_HILIGHT_COLOR_G, (Integer) jSpinnerCoveredG.getValue());
        pref.putInt(Globals.PROP_COVERAGE_HILIGHT_COLOR_B, (Integer) jSpinnerCoveredB.getValue());
        pref.putInt(Globals.PROP_PARTIALCOVERAGE_HILIGHT_COLOR_R, (Integer) jSpinnerPartiallyCoveredR.getValue());
        pref.putInt(Globals.PROP_PARTIALCOVERAGE_HILIGHT_COLOR_G, (Integer) jSpinnerPartiallyCoveredG.getValue());
        pref.putInt(Globals.PROP_PARTIALCOVERAGE_HILIGHT_COLOR_B, (Integer) jSpinnerPartiallyCoveredB.getValue());
        pref.putInt(Globals.PROP_NOCOVERAGE_HILIGHT_COLOR_R, (Integer) jSpinnerNotCoveredR.getValue());
        pref.putInt(Globals.PROP_NOCOVERAGE_HILIGHT_COLOR_G, (Integer) jSpinnerNotCoveredG.getValue());
        pref.putInt(Globals.PROP_NOCOVERAGE_HILIGHT_COLOR_B, (Integer) jSpinnerNotCoveredB.getValue());
        pref.put(Globals.PROP_TEST_ANT_TASK_JAVAAGENT, jTextFieldAntTaskParams.getText());
        pref.putBoolean(Globals.PROP_ENABLE_HIGHLIGHT, jCheckBoxEnableHighlighting.isSelected());
        pref.putBoolean(Globals.PROP_ENABLE_CONSOLE_REPORT, jCheckBoxEnableConsoleReport.isSelected());
    }

    boolean valid() {
        return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton jButtonResoreDefaults;
    private JCheckBox jCheckBoxEnableConsoleReport;
    private JCheckBox jCheckBoxEnableHighlighting;
    private JLabel jLabelAntTaskParams;
    private JLabel jLabelAntTaskParamsTips;
    private JLabel jLabelAuthor;
    private JLabel jLabelAuthorWebsite;
    private JLabel jLabelCoveredCodeBG;
    private JLabel jLabelNotCoveredCodeBG;
    private JLabel jLabelPartiallyCoveredCodeBG;
    private JPanel jPanel1;
    private JPanel jPanelCoveredPreview;
    private JPanel jPanelHighlightingCoveredCode;
    private JPanel jPanelJaCoCoRuntimeParams;
    private JPanel jPanelNotCoveredPreview;
    private JPanel jPanelPartiallyCoveredPreview;
    private JSpinner jSpinnerCoveredB;
    private JSpinner jSpinnerCoveredG;
    private JSpinner jSpinnerCoveredR;
    private JSpinner jSpinnerNotCoveredB;
    private JSpinner jSpinnerNotCoveredG;
    private JSpinner jSpinnerNotCoveredR;
    private JSpinner jSpinnerPartiallyCoveredB;
    private JSpinner jSpinnerPartiallyCoveredG;
    private JSpinner jSpinnerPartiallyCoveredR;
    private JTextField jTextFieldAntTaskParams;
    // End of variables declaration//GEN-END:variables
}
