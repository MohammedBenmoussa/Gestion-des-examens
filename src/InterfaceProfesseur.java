 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.Cursor;
 

public class InterfaceProfesseur extends javax.swing.JFrame implements MouseMotionListener,MouseListener{

    
    public InterfaceProfesseur() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
 
    @SuppressWarnings("unchecked")
                       
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ArrayList<Users> p =new ArrayList<Users>();
        p=selection();
        DefaultListModel dlm = new DefaultListModel();
        for(int i=0;i<p.size();i++) {
        dlm.addElement(p.get(i).getNom()+" "+p.get(i).getPrenom());}
        jList1 = new javax.swing.JList(dlm);
        
        
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(52, 73, 96));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Operation Professeur");

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
        label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        label.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		LabelMouseClicked(e);
        	}
        });
        label.setText("<");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Tahoma", Font.BOLD, 24));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGap(33)
        			.addComponent(jLabel1)
        			.addPreferredGap(ComponentPlacement.RELATED, 419, Short.MAX_VALUE)
        			.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
        			.addGap(26)
        			.addComponent(label, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        			.addGap(30)
        			.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGap(14)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
        				.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        					.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(label, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel3))))
        			.addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2.setLayout(jPanel2Layout);

        jPanel1.setBackground(new java.awt.Color(102,102,102));

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Tw Cen MT", 0, 24));  
        jButton1.setForeground(new java.awt.Color(44, 62, 80));
        jButton1.setText("Ajouter Question/Reponse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Tw Cen MT", 0, 24));  
        jButton2.setForeground(new java.awt.Color(44, 62, 80));
        jButton2.setText("Modifier Question/Reponse");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); 
        jButton3.setForeground(new java.awt.Color(44, 62, 80));
        jButton3.setText("Supprimer Question/Reponse");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));  
        jLabel4.setForeground(new java.awt.Color(236, 240, 241));
        jLabel4.setText("Etudiants :");

        jList1.setBackground(new java.awt.Color(204, 204, 255));
        jScrollPane2.setViewportView(jList1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(26)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(jButton3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(jButton2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 363, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
        			.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE)
        			.addGap(22))
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap(605, Short.MAX_VALUE)
        			.addComponent(jLabel4)
        			.addGap(92))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(84)
        			.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
        			.addGap(33)
        			.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
        			.addGap(30)
        			.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(125, Short.MAX_VALUE))
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap(20, Short.MAX_VALUE)
        			.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 326, GroupLayout.PREFERRED_SIZE)
        			.addGap(29))
        );
        jPanel1.setLayout(jPanel1Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        this.setIconImage(new ImageIcon(this.getClass().getResource("class.png")).getImage()); 
        addMouseMotionListener(this);
        addMouseListener(this);
        pack();
    }                      

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {                                     
        System.exit(0);
    }                                    
    private void LabelMouseClicked(java.awt.event.MouseEvent evt) {                                     
    	   int rep=JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment se deconnecter","se deconnecter",JOptionPane.YES_NO_OPTION);
           if(rep==JOptionPane.OK_OPTION)
           {
              this.hide();
     		 try {
     	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
     	                if ("Nimbus".equals(info.getName())) {
     	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
     	                    break;
     	                }
     	            }
     	        } catch (ClassNotFoundException ex) {
     	            java.util.logging.Logger.getLogger(InterfacePC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     	        } catch (InstantiationException ex) {
     	            java.util.logging.Logger.getLogger(InterfacePC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     	        } catch (IllegalAccessException ex) {
     	            java.util.logging.Logger.getLogger(InterfacePC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
     	            java.util.logging.Logger.getLogger(InterfacePC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     	        }
     	        
     	        java.awt.EventQueue.invokeLater(new Runnable() {
     	            public void run() {
     	                new InterfacePC().setVisible(true);
     	            }
     	        });	        
           }
    }  
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {                                     
        this.setState(JFrame.ICONIFIED);
    }                                    

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Supprimer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Supprimer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Supprimer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Supprimer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Supprimer().setVisible(true);
            }
        });
        this.hide();
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {   
    	this.hide();
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Modifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modifier().setVisible(true);
            }
        });
        
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	 try {
             for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                 if ("Nimbus".equals(info.getName())) {
                     javax.swing.UIManager.setLookAndFeel(info.getClassName());
                     break;
                 }
             }
         } catch (ClassNotFoundException ex) {
             java.util.logging.Logger.getLogger(Ajouter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (InstantiationException ex) {
             java.util.logging.Logger.getLogger(Ajouter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (IllegalAccessException ex) {
             java.util.logging.Logger.getLogger(Ajouter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (javax.swing.UnsupportedLookAndFeelException ex) {
             java.util.logging.Logger.getLogger(Ajouter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         }

         java.awt.EventQueue.invokeLater(new Runnable() {
             public void run() {
                 new Ajouter().setVisible(true);
             }
         });
         this.hide();

    }        
    public ArrayList<Users> selection() {
		  ArrayList<Users> p=new ArrayList<Users>();
		  
		  Users pf=null;
		  try 
			{
			//1
			Class.forName("com.mysql.jdbc.Driver");
			//2
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/projet1112","root",""); 
			Statement pr=cn.createStatement();
			ResultSet rs=pr.executeQuery("SELECT * FROM users where active=0 and idprofesseur='"+InterfacePC.p.get(0).getId()+"'");//permet de recuperer les donnees dune table
			
			while(rs.next())
			{
				pf= new Users();
				pf.setId(rs.getInt(1));
				pf.setLogin(rs.getString(2));
				pf.setPrenom(rs.getString(4));
				pf.setNom(rs.getString(5));
				pf.setPassword(rs.getString(3));
				pf.setDateNaissance(rs.getString(6));
				pf.setAdresse(rs.getString(7));
				pf.setActive(rs.getInt(8));
				p.add(pf);
			}
			} 
			catch (Exception e) 
			{		
				e.printStackTrace();
			}
		  return p;
	  }


    

              
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private JLabel label;
	// TODO Auto-generated method stub
	
	

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

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}                     
}
