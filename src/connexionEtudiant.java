
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;


 
public class connexionEtudiant extends javax.swing.JFrame implements MouseMotionListener,MouseListener{
 
    public connexionEtudiant() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

     
    @SuppressWarnings("unchecked")
                             
    private void initComponents() {
    	label = new JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(52, 73, 94));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));  
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Connexion");

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
        
        
        label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        label.setText("<");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Tahoma", Font.BOLD, 22));
        label.addMouseListener(new MouseAdapter() {
        	public void mouseClicked(MouseEvent e) {
        		LabelMouseClicked(e);
        	}
        });
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGap(33)
        			.addComponent(jLabel1)
        			.addPreferredGap(ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
        			.addComponent(jLabel3)
        			.addGap(18)
        			.addComponent(label, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGap(14)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1)
        				.addComponent(label, GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        				.addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        				.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2.setLayout(jPanel2Layout);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18));  
        jLabel4.setForeground(new java.awt.Color(236, 240, 241));
        jLabel4.setText("username:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18));  
        jLabel5.setForeground(new java.awt.Color(236, 240, 241));
        jLabel5.setText("password:");

        jTextField1.setBackground(new java.awt.Color(108, 122, 137));
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        jTextField1.setForeground(new java.awt.Color(228, 241, 254));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jPasswordField1.setBackground(new java.awt.Color(108, 122, 137));
        jPasswordField1.setForeground(new java.awt.Color(228, 241, 254));
        
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPasswordField1.addKeyListener(new KeyAdapter() 
		{
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode()==KeyEvent.VK_ENTER) {
                	connexionDouble();
                    
                }
            }
        }
        );

        jButton1.setBackground(new java.awt.Color(34, 167, 240));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        jButton1.setText("Login");
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

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14));  
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Click here to create new account");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
        		.addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);
        this.setIconImage(new ImageIcon(this.getClass().getResource("class.png")).getImage()); 
        addMouseMotionListener(this);
        addMouseListener(this);
        pack();
    }// </editor-fold>                        

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {                                     
        System.exit(0);
    }                                    

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {                                     
        this.setState(JFrame.ICONIFIED);
    }                                    

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) 
    {                                         
    	connexionDouble();
	  
	   }
    private void connexionDouble() {
    	 p=selection(jTextField1.getText(),MD5.encode(jPasswordField1.getText()));
 	   if(!p.isEmpty()) {
 		 if(p.get(0).getValide()==2) {
 			  try {
 	  	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
 	  	                if ("Nimbus".equals(info.getName())) {
 	  	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
 	  	                    break;
 	  	                }
 	  	            }
 	  	        } catch (ClassNotFoundException ex) {
 	  	            java.util.logging.Logger.getLogger(EtudiantAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
 	  	        } catch (InstantiationException ex) {
 	  	            java.util.logging.Logger.getLogger(EtudiantAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
 	  	        } catch (IllegalAccessException ex) {
 	  	            java.util.logging.Logger.getLogger(EtudiantAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
 	  	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
 	  	            java.util.logging.Logger.getLogger(EtudiantAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
 	  	        }
 	  	        //</editor-fold>

 	  	        /* Create and display the form */
 	  	        java.awt.EventQueue.invokeLater(new Runnable() {
 	  	            public void run() {
 	  	               EtudiantAcc e = new EtudiantAcc();
 	  	               e.setVisible(true);
 	  	               
 	  	            }
 	  	        });
  	        this.hide();
 		 }
 		 else if(p.get(0).getValide()==1) {
 			Statement st=null;
 		   
 	    	try
 			{
 			Class.forName("com.mysql.jdbc.Driver");//Importer et tester si le driver de sql est activé
 			Connection cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/projet1112","root","");
 			System.out.println("Connexion bien établie");//arriere plan pour verfie les erruers
 			st=cnx.createStatement();////creer un objet st qui va executer les requetes sql a laide de cnx
 			String MDP=generate(8);
 			st.executeUpdate("update users set password='"+MD5.encode(MDP)+"' where id =('"+p.get(0).getId()+"')");
 			st.executeUpdate("update users set valide="+2+" where id =('"+p.get(0).getId()+"')");
 			JOptionPane.showMessageDialog(null,"Votre demande est accepté \n votre nouveau mot de passe est : "+MDP);   
 			}
 			catch(ClassNotFoundException e)
 			{
 			JOptionPane.showMessageDialog(null,"Erreur driver");
 			} 
 			catch (SQLException e) {
 				JOptionPane.showMessageDialog(null,"Erreur requete sql");
 			} 
 		 }
 		 else if(p.get(0).getValide()==0) {
 			JOptionPane.showMessageDialog(null,"Votre demande est en traitement !!");
 			 
 		 }
 		 else if(p.get(0).getValide()==-1) {
  			JOptionPane.showMessageDialog(null,"Vous etes bloqué !!");
  			 
  		 }
 
 	    }        

  	   else if(p.isEmpty()==true) {
  		   JOptionPane.showMessageDialog(null,"Email ou Password INCORRECTE");
  	   }
    }

    private void jButton1MouseClicked(java.awt.event.MouseEvent e) {                                      
        // TODO add your handling code here:
    }  
    private void LabelMouseClicked(java.awt.event.MouseEvent e) {                                      
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

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {                                     
    	 java.awt.EventQueue.invokeLater(new Runnable() {
             public void run() {
                 new InscriptionEtudiant().setVisible(true);
             }
         });
        this.dispose();    
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

     
 
 
    public ArrayList<Users> selection(String x,String y) {
		  ArrayList<Users> p=new ArrayList<Users>();
		  
		  Users pf=null;
		  try 
			{
			//1
			Class.forName("com.mysql.jdbc.Driver");
			//2
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/projet1112","root",""); 
			Statement pr=cn.createStatement();
			ResultSet rs=pr.executeQuery("SELECT * FROM users where login='"+x+"' and password='"+y+"'");//permet de recuperer les donnees dune table
			
			while(rs.next())
			{
				pf= new Users();
				pf.setId(rs.getInt(1));
				pf.setLogin(rs.getString(2));
				pf.setPassword(rs.getString(3));
				pf.setPrenom(rs.getString(4));
				pf.setNom(rs.getString(5));
				pf.setDateNaissance(rs.getString(6));
				pf.setAdresse(rs.getString(7));
				pf.setActive(rs.getInt(8));
				pf.setIdprofesseur(rs.getInt(9));
				pf.setValide(rs.getInt(10));
				p.add(pf);
			}
			} 
			catch (Exception e) 
			{		
				e.printStackTrace();
			}
		  return p;
	  }
    private  String generate(int length)
    {
	    String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890"; // Tu supprimes les lettres dont tu ne veux pas
	    String pass = "";
	    for(int x=0;x<length;x++)
	    {
	       int i = (int)Math.floor(Math.random() * 62); // Si tu supprimes des lettres tu diminues ce nb
	       pass += chars.charAt(i);
	    }
	    System.out.println(pass);
	    return pass;
}
    public static ArrayList<Users>p=new ArrayList<Users>();                 
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
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
