/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my.rps;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Michael
 */
public class rps extends javax.swing.JFrame {

    /**
     * Creates new form rps
     */
    public rps() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        mainMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        noOfRounds = new javax.swing.JTextField();
        difficultlyLevel = new javax.swing.JComboBox();
        startMatch = new javax.swing.JButton();
        gamePlayMenu = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        buttonRock = new javax.swing.JButton();
        buttonPaper = new javax.swing.JButton();
        buttonScissors = new javax.swing.JButton();
        displayPlayerChoice = new javax.swing.JLabel();
        displayComputerChoice = new javax.swing.JLabel();
        currentScore = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        currentUserScore = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        currentComputerScore = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        currentTieScore = new javax.swing.JLabel();
        resultsMenu = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultsArea = new javax.swing.JTextPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        helpMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rock, Paper, Scissors");

        mainPanel.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Rock Paper Scissors Game");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Rounds");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Difficulty");

        noOfRounds.setText("1");

        difficultlyLevel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Random", "Smart" }));

        startMatch.setText("Start");
        startMatch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startMatchMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mainMenuLayout = new javax.swing.GroupLayout(mainMenu);
        mainMenu.setLayout(mainMenuLayout);
        mainMenuLayout.setHorizontalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(mainMenuLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(noOfRounds, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainMenuLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(difficultlyLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(startMatch))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        mainMenuLayout.setVerticalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(noOfRounds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(difficultlyLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(startMatch)
                .addContainerGap())
        );

        mainPanel.add(mainMenu, "mainMenu");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Rock Paper Scissors Game");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Selection");

        buttonRock.setText("Rock");
        buttonRock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonRockMouseClicked(evt);
            }
        });

        buttonPaper.setText("Paper");
        buttonPaper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonPaperMouseClicked(evt);
            }
        });
        buttonPaper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPaperActionPerformed(evt);
            }
        });

        buttonScissors.setText("Scissors");
        buttonScissors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonScissorsMouseClicked(evt);
            }
        });

        displayPlayerChoice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        displayPlayerChoice.setText("    ");
        displayPlayerChoice.setMaximumSize(new java.awt.Dimension(1, 1));

        displayComputerChoice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        displayComputerChoice.setText("  ");

        currentScore.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        currentScore.setForeground(new java.awt.Color(0, 0, 153));
        currentScore.setText("Score");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("User");

        currentUserScore.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        currentUserScore.setText("0");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText("Computer");

        currentComputerScore.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        currentComputerScore.setText("0");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setText("Ties");

        currentTieScore.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        currentTieScore.setText("0");

        javax.swing.GroupLayout gamePlayMenuLayout = new javax.swing.GroupLayout(gamePlayMenu);
        gamePlayMenu.setLayout(gamePlayMenuLayout);
        gamePlayMenuLayout.setHorizontalGroup(
            gamePlayMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePlayMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gamePlayMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addGroup(gamePlayMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(displayComputerChoice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(displayPlayerChoice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gamePlayMenuLayout.createSequentialGroup()
                        .addGroup(gamePlayMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(gamePlayMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(buttonPaper, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonRock, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonScissors, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(gamePlayMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(currentScore, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))))
                .addGap(18, 18, 18)
                .addGroup(gamePlayMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(currentUserScore, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                    .addComponent(currentComputerScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(currentTieScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        gamePlayMenuLayout.setVerticalGroup(
            gamePlayMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePlayMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(gamePlayMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(currentScore))
                .addGap(18, 18, 18)
                .addGroup(gamePlayMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRock)
                    .addComponent(jLabel6)
                    .addComponent(currentUserScore))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(gamePlayMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gamePlayMenuLayout.createSequentialGroup()
                        .addComponent(buttonPaper)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonScissors)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(displayPlayerChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(displayComputerChoice))
                    .addGroup(gamePlayMenuLayout.createSequentialGroup()
                        .addGroup(gamePlayMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(currentComputerScore))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(gamePlayMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(currentTieScore)
                            .addComponent(jLabel8))))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        mainPanel.add(gamePlayMenu, "gamePlayMenu");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Rock Paper Scissors Game");

        jScrollPane1.setViewportView(resultsArea);

        javax.swing.GroupLayout resultsMenuLayout = new javax.swing.GroupLayout(resultsMenu);
        resultsMenu.setLayout(resultsMenuLayout);
        resultsMenuLayout.setHorizontalGroup(
            resultsMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultsMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(resultsMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(resultsMenuLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 78, Short.MAX_VALUE)))
                .addContainerGap())
        );
        resultsMenuLayout.setVerticalGroup(
            resultsMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultsMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainPanel.add(resultsMenu, "resultsMenu");

        helpMenu.setText("Help");
        helpMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helpMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(helpMenu);
        helpMenu.getAccessibleContext().setAccessibleName("Help");

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startMatchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startMatchMouseClicked
    
        // Create the game system based on user selections
        
        
        gameMatch = new Match( Integer.parseInt(noOfRounds.getText()),
                (String)difficultlyLevel.getSelectedItem());
        
        // Switch to the game menu
        cardSwitcher("gamePlayMenu");
        
    }//GEN-LAST:event_startMatchMouseClicked

    private void buttonPaperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPaperActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPaperActionPerformed

    private void buttonRockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRockMouseClicked
        gameMatch.playMatch('r', history);
        programState('r');
    }//GEN-LAST:event_buttonRockMouseClicked

    private void buttonPaperMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPaperMouseClicked
        gameMatch.playMatch('p', history);
        programState('p');
    }//GEN-LAST:event_buttonPaperMouseClicked

    private void buttonScissorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonScissorsMouseClicked
        gameMatch.playMatch('s', history);
        programState('s');
    }//GEN-LAST:event_buttonScissorsMouseClicked

    private void helpMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMenuMouseClicked
        // TODO add your handling code here:
        String rules = (
        "\nThe game of Rock-Paper-Scissors is not only simple to learn,\n"
        +"it is also fun to play too! The way that the game works is\n"
        +"that the player (you) must choose how many rounds that they\n"
        +"wish to play against the computer. The number of rounds that\n"
        +"the player chooses distinguishes how long a Match will be.\n\n"
        +"Each round consists of the player deciding between playing\n"
        +"either Rock, Paper, or Scissors as their weapon of choice.\n"
        +"The player with the more powerful weapon wins the round. It\n"
        +"is easy to remember which weapon wins in a round. Rock beats\n"
        +"Scissors, Scissors beats Paper, and Paper beats Rock. Now\n"
        +"that you know how to play Rock-Paper-Scissors, try your luck\n"
        +"against the Computer! Whoever wins the majority of rounds in\n"
        +"a match wins!!\n");
        
        JOptionPane.showMessageDialog(this, rules);
    }//GEN-LAST:event_helpMenuMouseClicked

    
    
    public void cardSwitcher(String menu) {
        CardLayout cl = (CardLayout)(mainPanel.getLayout());
        //cl.next(mainPanel);
        cl.show(mainPanel, menu);
    }
    
   private void programState (char c) {
       showPlayerChoice(c);
       showComputerChoice();
       updateScoreBoard();
       
       
       // Match is done
       if (gameMatch.getMatchProgress() == true){
           cardSwitcher ("resultsMenu");
           resultsArea.setText( history.getMatchResults());
           
       }
   }
   
   private void updateScoreBoard () {
       
       currentUserScore.setText(
                Integer.toString(history.getCurrentUserScore()) );
       
       currentComputerScore.setText(
                Integer.toString(history.getCurrentComputerScore()) );
       
       currentTieScore.setText(
               Integer.toString(history.getCurrentTies()) );
       
   }
   
   public void showPlayerChoice(char c) {
        if (c == 'r') {
            displayPlayerChoice.setText("User selected Rock");
        } else if (c == 'p') {
            displayPlayerChoice.setText("User selected Paper");
        } else {
            displayPlayerChoice.setText("User selected Scissors");
        }
    }
   
   public void showComputerChoice() {

        String computerChoice = history.getResults().get(
                history.getResults().size() - 1).getCompGesture();
        String computerPrediction = "";
        if(computerChoice.toLowerCase().equals("rock")){
            computerPrediction = "Scissors";

        }else if(computerChoice.toLowerCase().equals("paper")){
            computerPrediction = "Rock";

        }else if(computerChoice.toLowerCase().equals("scissors")){
            computerPrediction = "Paper";
        }


         String displayForComputerChoice = "Computer Selection: "
                 + computerChoice + " - Prediction: "
                 + computerPrediction;


        displayComputerChoice.setText(displayForComputerChoice);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(rps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                
                new rps().setVisible(true);
                
            }
        });
    }
    public static ResultsHistory history = new ResultsHistory();
    public Match gameMatch; // match object. initialized later
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonPaper;
    private javax.swing.JButton buttonRock;
    private javax.swing.JButton buttonScissors;
    private javax.swing.JLabel currentComputerScore;
    private javax.swing.JLabel currentScore;
    private javax.swing.JLabel currentTieScore;
    private javax.swing.JLabel currentUserScore;
    private javax.swing.JComboBox difficultlyLevel;
    private javax.swing.JLabel displayComputerChoice;
    private javax.swing.JLabel displayPlayerChoice;
    private javax.swing.JPanel gamePlayMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainMenu;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField noOfRounds;
    private javax.swing.JTextPane resultsArea;
    private javax.swing.JPanel resultsMenu;
    private javax.swing.JButton startMatch;
    // End of variables declaration//GEN-END:variables
}
