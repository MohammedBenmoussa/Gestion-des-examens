import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
public class Acceuil extends JFrame implements KeyListener,MouseMotionListener,MouseListener
{

   
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Acceuil() {

        jLabel3 = new JLabel();
        jPanel1 = new JPanel();
        jLabel2 = new JLabel();
        jLabel4 = new JLabel();
        jLabel1 = new JLabel();
        jPanel2 = new JPanel();
        jLabel6 = new JLabel();
        jLabel5 = new JLabel();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();

        jLabel3.setText("jLabel3");
       
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(52, 73, 96));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("x");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("_");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Acceuil");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 637, Short.MAX_VALUE)
                .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));/* la couleur de l arriere plan*/ 

        jLabel6.setFont(new java.awt.Font("Chiller", 1, 90));  //la police
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));// la couleur de l ecriture // rgb red green bleu
        jLabel6.setText("LEARN WAY ");

        jLabel5.setIcon(new ImageIcon(getClass().getResource("/examen-cambridge(1).png"))); 

        jLabel7.setIcon(new ImageIcon(getClass().getResource("/etudiant.png"))); 
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setIcon(new ImageIcon(getClass().getResource("/prof.png")));  
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18));  
        jLabel9.setForeground(new java.awt.Color(236, 240, 241));
        jLabel9.setText("ESPACE ETUDIANT");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18));  
        jLabel10.setForeground(new java.awt.Color(236, 240, 241));
        jLabel10.setText("ESPACE PROFESSEUR");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel7)
                        .addGap(83, 83, 83))
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99))))
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(57, 57, 57))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
     
        this.setIconImage(new ImageIcon(this.getClass().getResource("class.png")).getImage()); 
        addMouseMotionListener(this);
        addMouseListener(this);
        this.addKeyListener(this);
        pack(); //permet de recuperer la taille de la fenetre par defaut a partir des composent inserer 
        this.setLocationRelativeTo(null);
        
    }

       /****** si je clique sur le boutton gauche de la souris sur le label X je vais fermer la page ******/              

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {                                     
        int rep=JOptionPane.showConfirmDialog(null, "Fermer la fenetre","Fermer",JOptionPane.YES_NO_OPTION);
        if(rep==JOptionPane.OK_OPTION)
        {
            System.exit(0);
        }
    }  
    
    
    
    /****** si je clique sur le boutton gauche de la souris sur le label - je vais reduire la page ******/

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {                                     
        this.setState(JFrame.ICONIFIED);
    }                                    

    @SuppressWarnings("deprecation")
	private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {                                      
        this.hide();
        new InterfacePC().setVisible(true);
    }                                     

    @SuppressWarnings("deprecation")
	private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {                                     
        	this.hide();     	
        	new connexionEtudiant().setVisible(true);
    }                                    

    @SuppressWarnings("deprecation")
	private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {                                     
        this.hide();
        new InterfacePC().setVisible(true);        
    }                                    

    @SuppressWarnings("deprecation")
	private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {                                     
        		this.hide();
        		new connexionEtudiant().setVisible(true);
    }                                    

   
    
    public static void main(String args[]) {
       
    	 new Acceuil().setVisible(true);
    }

                      
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel2;
	@SuppressWarnings("deprecation")
	@Override
	public void keyPressed(KeyEvent e) {
		 if ((e.getModifiers()==KeyEvent.CTRL_MASK) && (e.getKeyCode()==KeyEvent.VK_RIGHT)) {
         this.hide();
			  try {
		            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		                if ("Nimbus".equals(info.getName())) {
		                    UIManager.setLookAndFeel(info.getClassName());
		                    break;
		                }
		            }
		        } catch (ClassNotFoundException ex) {
		            java.util.logging.Logger.getLogger(CncAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        } catch (InstantiationException ex) {
		            java.util.logging.Logger.getLogger(CncAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        } catch (IllegalAccessException ex) {
		            java.util.logging.Logger.getLogger(CncAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        } catch (UnsupportedLookAndFeelException ex) {
		            java.util.logging.Logger.getLogger(CncAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        }
		        java.awt.EventQueue.invokeLater(new Runnable() {
		            public void run() {
		                new CncAdmin().setVisible(true);
		            }
		        });
		 }
	}


	@Override
	public void keyReleased(KeyEvent e) {  }


	@Override
	public void keyTyped(KeyEvent e) {	}
	int initX = 0;
	int initY=0;
	@Override
	public void mouseDragged(MouseEvent e) {
		
		int deplacementX =  e.getX()-initX;
		
		int deplacementY =  e.getY()-initY;		
	         this.setLocation(this.getLocation().x+deplacementX, this.getLocation().y+deplacementY);
	
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		initX = e.getX();
		initY = e.getY();
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	/*
	 * 
	 * 
	 * newX,newY = nouvelles coordonnées de la fenêtre = ancienne position de la fenêtre + déplacement


initX,initY = position de la fenêtre avant le déplacement (avant le dragg) 
	 */
                      
}
