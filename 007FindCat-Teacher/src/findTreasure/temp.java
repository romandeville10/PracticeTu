package findTreasure;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class temp extends JFrame{
    private int row=5;
    private int col=5;
    private int difficulty=row*col;
    private int point=1;
  JLabel[] choiceLabel=new JLabel[difficulty];
  ImageIcon cat=new ImageIcon("realcat.gif");
  ImageIcon bat=new ImageIcon("fakecat.gif");
  JButton newButton=new JButton();
  int catlocation;
  int batlocation;
  Random myRandom=new Random();
  
  public temp() {
    setTitle("Find the Cat - connor smith");
    setResizable(false);
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent evt) {
        exitForm(evt);
      }
    });
    getContentPane().setLayout(new GridBagLayout());
    GridBagConstraints gridConstraints;
    
    for (int i=0; i<difficulty; i++) {
    choiceLabel[i]=new JLabel();
    }
    
    for (int j=0; j<row; j++) {
        for (int i=0; i<col; i++) {
            gridConstraints=new GridBagConstraints();
            choiceLabel[col*j+i].setPreferredSize(new Dimension(cat.getIconWidth(), cat.getIconHeight()));
            choiceLabel[col*j+i].setOpaque(true);
            choiceLabel[col*j+i].setBackground(Color.YELLOW);
            gridConstraints.gridx=i;
            gridConstraints.gridy=j;
            gridConstraints.insets=new Insets(10, 10, 10, 10);
            getContentPane().add(choiceLabel[col*j+i], gridConstraints);
            choiceLabel[col*j+i].addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            labelMouseClicked(e);
        }
      });
    }
    }
    newButton.setText("Play Again");
    gridConstraints=new GridBagConstraints();
    gridConstraints.gridx=(col/2);
    gridConstraints.gridy=5;
    gridConstraints.insets=new Insets(10, 10, 10, 10);
    getContentPane().add(newButton, gridConstraints);
    newButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        newButtonActionPerformed(e);
      }
    });
    getContentPane().setBackground(Color.orange);
    pack();
    Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
    setBounds((int)(0.5*(screenSize.width-getWidth())), (int)(0.5*(screenSize.height-getHeight())), getWidth(), getHeight());
    newButton.doClick();
  }
  
  private void labelMouseClicked(MouseEvent e) {
    Component clickedComponent=e.getComponent();
    
        int choice;
        for (choice=0; choice<difficulty; choice++) {
          if (clickedComponent==choiceLabel[choice]) {
            break;
          }
        }
        choiceLabel[choice].setBackground(Color.ORANGE);
        if (choice==catlocation) {
          choiceLabel[choice].setIcon(cat);
          newButton.setEnabled(true);
          JOptionPane.showMessageDialog(null, "Tries: " + point );
          point = 0;
          for (int i=0; i<difficulty; i++) {
              choiceLabel[i].setIcon(null);
              choiceLabel[i].setBackground(Color.blue);
            }
            catlocation=myRandom.nextInt(difficulty);
            batlocation=myRandom.nextInt(difficulty);
            newButton.setEnabled(false);
        }
        else if(choice==batlocation) {
            choiceLabel[choice].setIcon(bat);
            newButton.setEnabled(true);
            JOptionPane.showMessageDialog(null,"You lose!");
            for (int i=0; i<difficulty; i++) {
                  choiceLabel[i].setIcon(null);
                  choiceLabel[i].setBackground(Color.blue);
                }
                catlocation=myRandom.nextInt(difficulty);
                batlocation=myRandom.nextInt(difficulty);
                newButton.setEnabled(false);
        }
        else point= point+1;
      }
    
    

  private void newButtonActionPerformed(ActionEvent e) {
    for (int i=0; i<difficulty; i++) {
      choiceLabel[i].setIcon(null);
      choiceLabel[i].setBackground(Color.blue);
    }
    catlocation=myRandom.nextInt(difficulty);
    batlocation=myRandom.nextInt(difficulty);
    newButton.setEnabled(false);
    point=1;
  }
  private void exitForm(WindowEvent evt) {
    System.exit(0);
  }
}