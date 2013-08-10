package fr.tikione.jacocoverage.plugin.config;

import fr.tikione.jacocoverage.plugin.util.IcoTxtComboBoxRenderer;
import fr.tikione.jacocoverage.plugin.util.NBUtils;
import fr.tikione.jacocoverage.plugin.util.Utils;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import org.apache.commons.io.IOUtils;
import org.openide.awt.Mnemonics;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle;
import org.openide.util.RequestProcessor;

/**
 * JaCoCoverage configuration panel.
 *
 * @author Jonathan Lermitage
 */
class JaCoCoveragePanel extends javax.swing.JPanel {

    private static final long serialVersionUID = 1L;

    JaCoCoveragePanel(JaCoCoverageOptionsPanelController controller) {
        initComponents();
        try {
            // Add "NetBeans (default)" and "Norway Today (dark)" themes with colors preview.
            jComboBoxColorTheme.setRenderer(new IcoTxtComboBoxRenderer());
            ImageIcon thNetBeansImg = new ImageIcon(Utils.toBytes("/fr/tikione/jacocoverage/plugin/resources/icon/theme_default.png"));
            ImageIcon thNorwaytoday = new ImageIcon(Utils.toBytes("/fr/tikione/jacocoverage/plugin/resources/icon/theme_norwaytoday.png"));
            thNetBeansImg.setDescription("NetBeans (default)");
            thNorwaytoday.setDescription("Norway Today");
            jComboBoxColorTheme.addItem(thNetBeansImg);
            jComboBoxColorTheme.addItem(thNorwaytoday);

            jComboBoxWorkfiles.setModel(new javax.swing.DefaultComboBoxModel<>(
                    new String[]{"keep original workfiles", "keep zipped workfiles", "delete workfiles"}));
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
        // <editor-fold defaultstate="collapsed" desc="Tooltips">
        // Warning: background of tooltips is black on Ubuntu. Avoid coloring links with blue.
        jButtonSocialTwitter.setToolTipText("<html><body>Jonathan Lermitage on <b>Twitter</b> (author of JaCoCoverage)<br>"
                + "https://twitter.com/JLermitage" + "</body></html>");
        jButtonSocialFacebook.setToolTipText("<html><body>Jonathan Lermitage on <b>Facebook</b> (author of JaCoCoverage)<br>"
                + "https://www.facebook.com/jonathan.lermitage" + "</body></html>");
        jButtonSocialGithub.setToolTipText("<html><body>Jonathan Lermitage  on <b>GitHub</b> (author of JaCoCoverage)<br>"
                + "https://github.com/jonathanlermitage" + "</body></html>");
        jButtonSocialJojohome.setToolTipText("<html><body>Jonathan Lermitage devblog (author of JaCoCoverage)<br>"
                + "http://netbeanscolors.org" + "</body></html>");
        jButtonOnlineHelp.setToolTipText("<html><body>Online help page of JaCoCoverage<br>"
                + "http://jacocoverage.tikione.fr/redirect/help/" + "</body></html>");
        // </editor-fold>
    }

    private void showLatestNews() {
        new RequestProcessor("JaCoCoverage Control Panel showLatestNews() Task", 1, true).post(new Runnable() {
            @Override
            public void run() {
                boolean enable = jCheckBoxShowLatestNews.isSelected();
                if (enable) {
                    jTextAreaLatestNews.setText("Loading...");
                    try {
                        InputStream in = new URL(Globals.LATEST_NEWS_URL).openStream();
                        try {
                            String latestnews = IOUtils.toString(in);
                            jTextAreaLatestNews.setText(latestnews);
                        } finally {
                            IOUtils.closeQuietly(in);
                        }
                    } catch (MalformedURLException ex) {
                        jTextAreaLatestNews.setText("Internal configuration error, can't contact " + Globals.LATEST_NEWS_URL
                                + "\n\n (MalformedURLException: " + ex + ")");
                    } catch (IOException ex) {
                        jTextAreaLatestNews.setText("Communication error, can't contact " + Globals.LATEST_NEWS_URL
                                + "\n\n (IOException: " + ex + ")");
                    }
                    jTextAreaLatestNews.setCaretPosition(0);
                } else {
                    jTextAreaLatestNews.setText("");
                }
                jTextAreaLatestNews.setEnabled(enable);
            }
        });
    }

    /** 
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonResoreDefaults = new JButton();
        jCheckBoxEnableHighlighting = new JCheckBox();
        jCheckBoxEnableConsoleReport = new JCheckBox();
        jLabelAntTaskParams = new JLabel();
        jTextFieldAntTaskParams = new JTextField();
        jLabelAntTaskParamsTips = new JLabel();
        jButtonSocialTwitter = new JButton();
        jButtonSocialFacebook = new JButton();
        jButtonSocialGithub = new JButton();
        jButtonOnlineHelp = new JButton();
        jButtonSocialJojohome = new JButton();
        jCheckBoxEnableHtmlReport = new JCheckBox();
        jCheckBoxOpenHtmlReport = new JCheckBox();
        jScrollPane1 = new JScrollPane();
        jTextAreaLatestNews = new JTextArea();
        jCheckBoxShowLatestNews = new JCheckBox();
        jLabelColorTheme = new JLabel();
        jComboBoxColorTheme = new JComboBox<>();
        jLabelWorkfiles = new JLabel();
        jComboBoxWorkfiles = new JComboBox<>();
        jCheckBoxEnableHighlightingExtended = new JCheckBox();
        jLabelWorkfilesTips = new JLabel();

        jButtonResoreDefaults.setIcon(new ImageIcon(getClass().getResource("/fr/tikione/jacocoverage/plugin/resources/icon/famfamfam_defaults.png"))); // NOI18N
        Mnemonics.setLocalizedText(jButtonResoreDefaults, NbBundle.getMessage(JaCoCoveragePanel.class, "JaCoCoveragePanel.jButtonResoreDefaults.text")); // NOI18N
        jButtonResoreDefaults.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonResoreDefaultsActionPerformed(evt);
            }
        });

        Mnemonics.setLocalizedText(jCheckBoxEnableHighlighting, NbBundle.getMessage(JaCoCoveragePanel.class, "JaCoCoveragePanel.jCheckBoxEnableHighlighting.text")); // NOI18N
        jCheckBoxEnableHighlighting.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jCheckBoxEnableHighlightingActionPerformed(evt);
            }
        });

        Mnemonics.setLocalizedText(jCheckBoxEnableConsoleReport, NbBundle.getMessage(JaCoCoveragePanel.class, "JaCoCoveragePanel.jCheckBoxEnableConsoleReport.text")); // NOI18N

        Mnemonics.setLocalizedText(jLabelAntTaskParams, NbBundle.getMessage(JaCoCoveragePanel.class, "JaCoCoveragePanel.jLabelAntTaskParams.text")); // NOI18N

        jTextFieldAntTaskParams.setText(NbBundle.getMessage(JaCoCoveragePanel.class, "JaCoCoveragePanel.jTextFieldAntTaskParams.text")); // NOI18N

        Mnemonics.setLocalizedText(jLabelAntTaskParamsTips, NbBundle.getMessage(JaCoCoveragePanel.class, "JaCoCoveragePanel.jLabelAntTaskParamsTips.text")); // NOI18N

        jButtonSocialTwitter.setIcon(new ImageIcon(getClass().getResource("/fr/tikione/jacocoverage/plugin/resources/icon/social_twitter.png"))); // NOI18N
        Mnemonics.setLocalizedText(jButtonSocialTwitter, NbBundle.getMessage(JaCoCoveragePanel.class, "JaCoCoveragePanel.jButtonSocialTwitter.text")); // NOI18N
        jButtonSocialTwitter.setBorderPainted(false);
        jButtonSocialTwitter.setContentAreaFilled(false);
        jButtonSocialTwitter.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jButtonSocialTwitter.setMaximumSize(new Dimension(48, 24));
        jButtonSocialTwitter.setMinimumSize(new Dimension(48, 24));
        jButtonSocialTwitter.setPreferredSize(new Dimension(48, 24));
        jButtonSocialTwitter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonSocialTwitterActionPerformed(evt);
            }
        });

        jButtonSocialFacebook.setIcon(new ImageIcon(getClass().getResource("/fr/tikione/jacocoverage/plugin/resources/icon/social_facebook.png"))); // NOI18N
        Mnemonics.setLocalizedText(jButtonSocialFacebook, NbBundle.getMessage(JaCoCoveragePanel.class, "JaCoCoveragePanel.jButtonSocialFacebook.text")); // NOI18N
        jButtonSocialFacebook.setBorderPainted(false);
        jButtonSocialFacebook.setContentAreaFilled(false);
        jButtonSocialFacebook.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jButtonSocialFacebook.setMaximumSize(new Dimension(48, 24));
        jButtonSocialFacebook.setMinimumSize(new Dimension(48, 24));
        jButtonSocialFacebook.setPreferredSize(new Dimension(48, 24));
        jButtonSocialFacebook.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonSocialFacebookActionPerformed(evt);
            }
        });

        jButtonSocialGithub.setIcon(new ImageIcon(getClass().getResource("/fr/tikione/jacocoverage/plugin/resources/icon/social_github.png"))); // NOI18N
        Mnemonics.setLocalizedText(jButtonSocialGithub, NbBundle.getMessage(JaCoCoveragePanel.class, "JaCoCoveragePanel.jButtonSocialGithub.text")); // NOI18N
        jButtonSocialGithub.setBorderPainted(false);
        jButtonSocialGithub.setContentAreaFilled(false);
        jButtonSocialGithub.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jButtonSocialGithub.setMaximumSize(new Dimension(48, 24));
        jButtonSocialGithub.setMinimumSize(new Dimension(48, 24));
        jButtonSocialGithub.setPreferredSize(new Dimension(48, 24));
        jButtonSocialGithub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonSocialGithubActionPerformed(evt);
            }
        });

        jButtonOnlineHelp.setIcon(new ImageIcon(getClass().getResource("/fr/tikione/jacocoverage/plugin/resources/icon/famfamfam_help.png"))); // NOI18N
        Mnemonics.setLocalizedText(jButtonOnlineHelp, NbBundle.getMessage(JaCoCoveragePanel.class, "JaCoCoveragePanel.jButtonOnlineHelp.text")); // NOI18N
        jButtonOnlineHelp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonOnlineHelpActionPerformed(evt);
            }
        });

        jButtonSocialJojohome.setIcon(new ImageIcon(getClass().getResource("/fr/tikione/jacocoverage/plugin/resources/icon/social_jojowebsite.png"))); // NOI18N
        Mnemonics.setLocalizedText(jButtonSocialJojohome, NbBundle.getMessage(JaCoCoveragePanel.class, "JaCoCoveragePanel.jButtonSocialJojohome.text")); // NOI18N
        jButtonSocialJojohome.setBorderPainted(false);
        jButtonSocialJojohome.setContentAreaFilled(false);
        jButtonSocialJojohome.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jButtonSocialJojohome.setMaximumSize(new Dimension(48, 24));
        jButtonSocialJojohome.setMinimumSize(new Dimension(48, 24));
        jButtonSocialJojohome.setPreferredSize(new Dimension(48, 24));
        jButtonSocialJojohome.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonSocialJojohomeActionPerformed(evt);
            }
        });

        Mnemonics.setLocalizedText(jCheckBoxEnableHtmlReport, NbBundle.getMessage(JaCoCoveragePanel.class, "JaCoCoveragePanel.jCheckBoxEnableHtmlReport.text")); // NOI18N
        jCheckBoxEnableHtmlReport.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jCheckBoxEnableHtmlReportActionPerformed(evt);
            }
        });

        Mnemonics.setLocalizedText(jCheckBoxOpenHtmlReport, NbBundle.getMessage(JaCoCoveragePanel.class, "JaCoCoveragePanel.jCheckBoxOpenHtmlReport.text")); // NOI18N

        jTextAreaLatestNews.setEditable(false);
        jTextAreaLatestNews.setColumns(20);
        jTextAreaLatestNews.setFont(new Font("Arial", 0, 12)); // NOI18N
        jTextAreaLatestNews.setLineWrap(true);
        jTextAreaLatestNews.setRows(5);
        jTextAreaLatestNews.setAutoscrolls(false);
        jScrollPane1.setViewportView(jTextAreaLatestNews);

        Mnemonics.setLocalizedText(jCheckBoxShowLatestNews, NbBundle.getMessage(JaCoCoveragePanel.class, "JaCoCoveragePanel.jCheckBoxShowLatestNews.text")); // NOI18N
        jCheckBoxShowLatestNews.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jCheckBoxShowLatestNewsActionPerformed(evt);
            }
        });

        Mnemonics.setLocalizedText(jLabelColorTheme, NbBundle.getMessage(JaCoCoveragePanel.class, "JaCoCoveragePanel.jLabelColorTheme.text")); // NOI18N

        Mnemonics.setLocalizedText(jLabelWorkfiles, NbBundle.getMessage(JaCoCoveragePanel.class, "JaCoCoveragePanel.jLabelWorkfiles.text")); // NOI18N

        Mnemonics.setLocalizedText(jCheckBoxEnableHighlightingExtended, NbBundle.getMessage(JaCoCoveragePanel.class, "JaCoCoveragePanel.jCheckBoxEnableHighlightingExtended.text")); // NOI18N

        jLabelWorkfilesTips.setBackground(new Color(255, 255, 255));
        jLabelWorkfilesTips.setIcon(new ImageIcon(getClass().getResource("/fr/tikione/jacocoverage/plugin/resources/icon/famfamfam_information.png"))); // NOI18N
        Mnemonics.setLocalizedText(jLabelWorkfilesTips, NbBundle.getMessage(JaCoCoveragePanel.class, "JaCoCoveragePanel.jLabelWorkfilesTips.text")); // NOI18N
        jLabelWorkfilesTips.setVerticalAlignment(SwingConstants.TOP);
        jLabelWorkfilesTips.setVerticalTextPosition(SwingConstants.TOP);

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButtonSocialTwitter, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSocialFacebook, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSocialGithub, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSocialJojohome, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonOnlineHelp)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonResoreDefaults))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jCheckBoxEnableHighlightingExtended)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxEnableConsoleReport)
                            .addComponent(jCheckBoxEnableHtmlReport)
                            .addComponent(jCheckBoxShowLatestNews)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jCheckBoxOpenHtmlReport))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBoxEnableHighlighting)
                                .addGap(29, 29, 29)
                                .addComponent(jLabelColorTheme)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxColorTheme, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabelWorkfiles)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxWorkfiles, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelAntTaskParams, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldAntTaskParams)))
                        .addGap(20, 20, 20))
                    .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jLabelAntTaskParamsTips, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap())
            .addComponent(jLabelWorkfilesTips)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxEnableHighlighting)
                    .addComponent(jLabelColorTheme)
                    .addComponent(jComboBoxColorTheme, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxEnableHighlightingExtended)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxEnableConsoleReport)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxEnableHtmlReport)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxOpenHtmlReport)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelWorkfiles)
                    .addComponent(jComboBoxWorkfiles, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAntTaskParams, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAntTaskParams, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelAntTaskParamsTips, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jCheckBoxShowLatestNews)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelWorkfilesTips, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonResoreDefaults)
                        .addComponent(jButtonOnlineHelp))
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(jButtonSocialJojohome, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonSocialTwitter, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSocialFacebook, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSocialGithub, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonResoreDefaultsActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButtonResoreDefaultsActionPerformed
        jTextFieldAntTaskParams.setText(Globals.DEF_TEST_ANT_TASK_JAVAAGENT);
        jCheckBoxEnableHighlighting.setSelected(Globals.DEF_ENABLE_HIGHLIGHT);
        jCheckBoxEnableConsoleReport.setSelected(Globals.DEF_ENABLE_CONSOLE_REPORT);
        jCheckBoxEnableHtmlReport.setSelected(Globals.DEF_ENABLE_HTML_REPORT);
        jCheckBoxOpenHtmlReport.setSelected(Globals.DEF_AUTOOPEN_HTML_REPORT);
        jCheckBoxOpenHtmlReport.setEnabled(jCheckBoxEnableHtmlReport.isSelected());
        jCheckBoxShowLatestNews.setSelected(Globals.DEF_SHOW_LATEST_NEWS);
        jComboBoxColorTheme.setSelectedIndex(Globals.DEF_THEME);
        jComboBoxColorTheme.setEnabled(jCheckBoxEnableHighlighting.isSelected());
        jComboBoxWorkfiles.setSelectedIndex(Globals.DEF_JACOCOWORKFILES_RULE);
        jCheckBoxEnableHighlightingExtended.setSelected(Globals.DEF_ENABLE_HIGHLIGHTEXTENDED);
        jCheckBoxEnableHighlightingExtended.setEnabled(jCheckBoxEnableHighlighting.isSelected());
        showLatestNews();
    }//GEN-LAST:event_jButtonResoreDefaultsActionPerformed

    private void jButtonSocialTwitterActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButtonSocialTwitterActionPerformed
        NBUtils.extBrowser("https://twitter.com/JLermitage");
    }//GEN-LAST:event_jButtonSocialTwitterActionPerformed

    private void jButtonSocialFacebookActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButtonSocialFacebookActionPerformed
        NBUtils.extBrowser("https://www.facebook.com/jonathan.lermitage");
    }//GEN-LAST:event_jButtonSocialFacebookActionPerformed

    private void jButtonSocialGithubActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButtonSocialGithubActionPerformed
        NBUtils.extBrowser("https://github.com/jonathanlermitage");
    }//GEN-LAST:event_jButtonSocialGithubActionPerformed

    private void jButtonOnlineHelpActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButtonOnlineHelpActionPerformed
        NBUtils.extBrowser("http://jacocoverage.tikione.fr/redirect/help/");
    }//GEN-LAST:event_jButtonOnlineHelpActionPerformed

    private void jButtonSocialJojohomeActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButtonSocialJojohomeActionPerformed
        NBUtils.extBrowser("http://netbeanscolors.org");
    }//GEN-LAST:event_jButtonSocialJojohomeActionPerformed

    private void jCheckBoxEnableHtmlReportActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jCheckBoxEnableHtmlReportActionPerformed
        jCheckBoxOpenHtmlReport.setEnabled(jCheckBoxEnableHtmlReport.isSelected());
    }//GEN-LAST:event_jCheckBoxEnableHtmlReportActionPerformed

    private void jCheckBoxShowLatestNewsActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jCheckBoxShowLatestNewsActionPerformed
        showLatestNews();
    }//GEN-LAST:event_jCheckBoxShowLatestNewsActionPerformed

    private void jCheckBoxEnableHighlightingActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jCheckBoxEnableHighlightingActionPerformed
        jComboBoxColorTheme.setEnabled(jCheckBoxEnableHighlighting.isSelected());
        jCheckBoxEnableHighlightingExtended.setEnabled(jCheckBoxEnableHighlighting.isSelected());
    }//GEN-LAST:event_jCheckBoxEnableHighlightingActionPerformed

    /** Load user preferences and configure UI. */
    void load() {
        Config.sync();
        jTextFieldAntTaskParams.setText(Config.getAntTaskJavaagentArg());
        jCheckBoxEnableHighlighting.setSelected(Config.isEnblHighlighting());
        jCheckBoxEnableConsoleReport.setSelected(Config.isEnblConsoleReport());
        jCheckBoxEnableHtmlReport.setSelected(Config.isEnblHtmlReport());
        jCheckBoxOpenHtmlReport.setSelected(Config.isOpenHtmlReport());
        jCheckBoxOpenHtmlReport.setEnabled(jCheckBoxEnableHtmlReport.isSelected());
        jCheckBoxShowLatestNews.setSelected(Config.isShowLatestNews());
        jComboBoxColorTheme.setSelectedIndex(Config.getTheme());
        jComboBoxColorTheme.setEnabled(jCheckBoxEnableHighlighting.isSelected());
        jComboBoxWorkfiles.setSelectedIndex(Config.getJaCoCoWorkfilesRule());
        jCheckBoxEnableHighlightingExtended.setSelected(Config.isEnblHighlightingExtended());
        jCheckBoxEnableHighlightingExtended.setEnabled(jCheckBoxEnableHighlighting.isSelected());
        showLatestNews();
    }

    /** Store configuration to user preferences. */
    void store() {
        Config.setAntTaskJavaagentArg(jTextFieldAntTaskParams.getText());
        Config.setEnblConsoleReport(jCheckBoxEnableConsoleReport.isSelected());
        Config.setEnblHighlighting(jCheckBoxEnableHighlighting.isSelected());
        Config.setEnblHtmlReport(jCheckBoxEnableHtmlReport.isSelected());
        Config.setOpenHtmlReport(jCheckBoxOpenHtmlReport.isSelected());
        Config.setShowLatestNews(jCheckBoxShowLatestNews.isSelected());
        Config.setTheme(jComboBoxColorTheme.getSelectedIndex());
        Config.setJaCoCoWorkfilesRule(jComboBoxWorkfiles.getSelectedIndex());
        Config.setEnblHighlightingExtended(jCheckBoxEnableHighlightingExtended.isSelected());
        Config.flush();
    }

    boolean valid() {
        return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton jButtonOnlineHelp;
    private JButton jButtonResoreDefaults;
    private JButton jButtonSocialFacebook;
    private JButton jButtonSocialGithub;
    private JButton jButtonSocialJojohome;
    private JButton jButtonSocialTwitter;
    private JCheckBox jCheckBoxEnableConsoleReport;
    private JCheckBox jCheckBoxEnableHighlighting;
    private JCheckBox jCheckBoxEnableHighlightingExtended;
    private JCheckBox jCheckBoxEnableHtmlReport;
    private JCheckBox jCheckBoxOpenHtmlReport;
    private JCheckBox jCheckBoxShowLatestNews;
    private JComboBox<Object> jComboBoxColorTheme;
    private JComboBox<String> jComboBoxWorkfiles;
    private JLabel jLabelAntTaskParams;
    private JLabel jLabelAntTaskParamsTips;
    private JLabel jLabelColorTheme;
    private JLabel jLabelWorkfiles;
    private JLabel jLabelWorkfilesTips;
    private JScrollPane jScrollPane1;
    private JTextArea jTextAreaLatestNews;
    private JTextField jTextFieldAntTaskParams;
    // End of variables declaration//GEN-END:variables
}
