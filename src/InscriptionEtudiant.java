 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;

import java.awt.Font;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
 
public class InscriptionEtudiant extends javax.swing.JFrame  implements MouseMotionListener,MouseListener{

   
    public InscriptionEtudiant() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

   
    @SuppressWarnings("unchecked")
                             
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPasswordField7 = new javax.swing.JPasswordField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        ArrayList<Professeur> p=selection();
		for(int i=0;i<p.size();i++)
		{
			jComboBox1.addItem(p.get(i).getEmail());
		}
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(52, 73, 94));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Register");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24));  
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("x");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24));  
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("–");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        
        label = new JLabel();
        label.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		LabelMouseClicked(e);
        	}
        });
        label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        label.setText("<");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Tahoma", Font.BOLD, 22));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
        			.addGap(33)
        			.addComponent(jLabel1)
        			.addPreferredGap(ComponentPlacement.RELATED, 269, Short.MAX_VALUE)
        			.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(label, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
        			.addGap(13))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGap(14)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(jLabel3)
        				.addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        				.addComponent(jLabel1))
        			.addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2.setLayout(jPanel2Layout);

        jPanel3.setBackground(new java.awt.Color(36, 37, 42));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18));  
        jLabel4.setForeground(new java.awt.Color(236, 240, 241));
        jLabel4.setText("First name:");

        jTextField1.setBackground(new java.awt.Color(108, 122, 137));
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14));  
        jTextField1.setForeground(new java.awt.Color(228, 241, 254));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(34, 167, 240));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14));  
        jButton1.setText("Create");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(242, 38, 19));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14));  
        jButton2.setText("Cancel");

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18));  
        jLabel5.setForeground(new java.awt.Color(236, 240, 241));
        jLabel5.setText("password:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18));  
        jLabel8.setForeground(new java.awt.Color(236, 240, 241));
        jLabel8.setText("Last name:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18));  
        jLabel9.setForeground(new java.awt.Color(236, 240, 241));
        jLabel9.setText("Adress:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18));  
        jLabel10.setForeground(new java.awt.Color(236, 240, 241));
        jLabel10.setText("Birthdate:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18));  
        jLabel11.setForeground(new java.awt.Color(236, 240, 241));
        jLabel11.setText("Username:");

        jPasswordField7.setBackground(new java.awt.Color(108, 122, 137));
        jPasswordField7.setForeground(new java.awt.Color(228, 241, 254));
        jPasswordField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField7ActionPerformed(evt);
            }
        });

        jTextField2.setBackground(new java.awt.Color(108, 122, 137));
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14));  
        jTextField2.setForeground(new java.awt.Color(228, 241, 254));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setBackground(new java.awt.Color(108, 122, 137));
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14));  
        jTextField3.setForeground(new java.awt.Color(228, 241, 254));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.setBackground(new java.awt.Color(108, 122, 137));
        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14));  
        jTextField4.setForeground(new java.awt.Color(228, 241, 254));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18));  
        jLabel12.setForeground(new java.awt.Color(236, 240, 241));
        jLabel12.setText("Teacher:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3Layout.setHorizontalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel3Layout.createSequentialGroup()
        					.addGap(24)
        					.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel3Layout.createSequentialGroup()
        							.addComponent(jLabel4)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(jTextField1, 282, 282, 282))
        						.addGroup(jPanel3Layout.createSequentialGroup()
        							.addGroup(jPanel3Layout.createParallelGroup(Alignment.TRAILING)
        								.addGroup(jPanel3Layout.createSequentialGroup()
        									.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
        										.addGroup(jPanel3Layout.createSequentialGroup()
        											.addGap(3)
        											.addGroup(jPanel3Layout.createParallelGroup(Alignment.TRAILING)
        												.addComponent(jLabel11)
        												.addComponent(jLabel5)))
        										.addComponent(jLabel8))
        									.addPreferredGap(ComponentPlacement.UNRELATED))
        								.addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
        							.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jTextField2, 282, 282, 282)
        								.addComponent(jTextField3, 282, 282, 282)
        								.addComponent(jPasswordField7, 282, 282, 282)
        								.addComponent(jDateChooser1, GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)))))
        				.addGroup(jPanel3Layout.createSequentialGroup()
        					.addGap(43)
        					.addComponent(jLabel12)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(jPanel3Layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(jPanel3Layout.createSequentialGroup()
        							.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
        							.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
        						.addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, 284, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(jPanel3Layout.createSequentialGroup()
        					.addGap(59)
        					.addComponent(jLabel9)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 282, GroupLayout.PREFERRED_SIZE)))
        			.addGap(69))
        );
        jPanel3Layout.setVerticalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addGap(67)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel11, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
        			.addGap(11)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jPasswordField7, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jDateChooser1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        			.addGap(13)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel12, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel3.setLayout(jPanel3Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        this.setIconImage(new ImageIcon(this.getClass().getResource("class.png")).getImage()); 
        addMouseMotionListener(this);
        addMouseListener(this);
        pack();
    }                        

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {                                     
         int rep=JOptionPane.showConfirmDialog(null, "Fermer la fenetre","Fermer",JOptionPane.YES_NO_OPTION);
			if(rep==JOptionPane.OK_OPTION)                  
			 {
			System.exit(0);
			 }
    }                                    
    private void LabelMouseClicked(java.awt.event.MouseEvent evt) {                                     
        this.hide();
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acceuil().setVisible(true);
            }
        });
    } 
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {                                     
        this.setState(JFrame.ICONIFIED);
    }                                    

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
    }                                     
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) { 
    	this.dispose();
    	 try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException ex) {
	            java.util.logging.Logger.getLogger(connexionEtudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(connexionEtudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(connexionEtudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(connexionEtudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	      
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new connexionEtudiant().setVisible(true);
	            }
	        });
    }
    

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {     
    if(jTextField1.getText().equals("") || jTextField2.getText().equals("") || jTextField3.getText().equals("") || jTextField4.getText().equals("") || jDateChooser1.getDateFormatString().equals("") || jPasswordField7.getText().equals("")) {
    	JOptionPane.showMessageDialog(null,"Veuillez remplir tous les champs"); 
    }
    else {
        Statement st=null;
			try
			{
			Class.forName("com.mysql.jdbc.Driver");//Importer et tester si le driver de sql est activé
			Connection cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/projet1112","root","");
			System.out.println("Connexion bien établie");//arriere plan pour verfie les erruers
			st=cnx.createStatement();////creer un objet st qui va executer les requetes sql a laide de cnx
			st.executeUpdate("insert into users(login,password,Prenom,Nom,dateNaissance,Adresse,active,idprofesseur,valide) values('"+jTextField3.getText()+"','"+MD5.encode(jPasswordField7.getText())+"','"+jTextField1.getText()+"','"+jTextField2.getText()+"','"+jDateChooser1.getDate()+"','"+jTextField4.getText()+"',0,'"+idprofesseur+"',0)");
			
			jTextField3.setText("");//pour vider les zones de textes login et password
			jPasswordField7.setText("");
			jTextField1.setText("");
			jTextField2.setText("");
			jDateChooser1.setDateFormatString("");
			jTextField4.setText("");
			JOptionPane.showMessageDialog(null,"Etduiant est ajouté");   
			}
			catch(ClassNotFoundException e)
			{
			JOptionPane.showMessageDialog(null,"Erreur driver");
			} 
			catch (SQLException e) {
				JOptionPane.showMessageDialog(null,"Erreur requete sql");
			}}
    }                                        

    private void jPasswordField7ActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
    idprofesseur=jComboBox1.getSelectedIndex()+1;       
    JOptionPane.showMessageDialog(null,idprofesseur);	
    }      
    public ArrayList<Professeur> selection() {
		  ArrayList<Professeur> p=new ArrayList<Professeur>();
		  
		  Professeur pf=null;
		  try 
			{
			//1
			Class.forName("com.mysql.jdbc.Driver");
			//2
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/projet1112","root",""); 
			Statement pr=cn.createStatement();
			ResultSet rs=pr.executeQuery("SELECT * FROM professeur");//permet de recuperer les donnees dune table
			
			while(rs.next())
			{
				pf= new Professeur();
				pf.setId(rs.getInt(1));
				pf.setEmail(rs.getString(2));
				pf.setPassword(rs.getString(3));
				p.add(pf);
			}
			} 
			catch (Exception e) 
			{		
				e.printStackTrace();
			}
		  return p;
	  }

  
    private int idprofesseur = 1;                  
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private JLabel label;
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
	int initX = 0;
	int initY=0;
	@Override
	public void mouseDragged(MouseEvent e) {
int deplacementX =  e.getX()-initX;
		
		int deplacementY =  e.getY()-initY;		
	         this.setLocation(this.getLocation().x+deplacementX, this.getLocation().y+deplacementY);
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}                  
}
