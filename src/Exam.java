 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;
 
public class Exam extends javax.swing.JFrame {

  
    public Exam() {
        initComponents();
        aleatoire();
        firstSelect();
		ButtonGroup gr=new ButtonGroup();
		this.setLocationRelativeTo(null);
		gr.add(jRadioButton1);gr.add(jRadioButton2);gr.add(jRadioButton3);gr.add(jRadioButton4);
    }

     
    @SuppressWarnings("unchecked")
                            
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton1.setSelected(true);
        jButton1 = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24));  
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("_");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(52, 73, 94));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24));  
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("x");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24));  
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("–");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));  
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Examen");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(38)
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 687, Short.MAX_VALUE)
        			.addComponent(jLabel4)
        			.addGap(31)
        			.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
        			.addGap(23))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(13)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel2)
        						.addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        					.addGap(21))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
        					.addGap(27))))
        );
        jPanel1.setLayout(jPanel1Layout);

        jPanel2.setForeground(new java.awt.Color(197, 239, 247));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18));  
        jLabel5.setText("Question:");

        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 18));  
        jRadioButton1.setText("Radio1");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 18));  
        jRadioButton2.setText("Radio2");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 18));  
        jRadioButton3.setText("Radio3");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.setFont(new java.awt.Font("Tahoma", 0, 18));  
        jRadioButton4.setText("Radio4");

        jButton1.setBackground(new java.awt.Color(34, 167, 240));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jButton1.setText("Suivant");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGap(82)
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jRadioButton4)
        						.addComponent(jRadioButton3)
        						.addComponent(jRadioButton2)
        						.addComponent(jRadioButton1)
        						.addComponent(jLabel5)))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGap(364)
        					.addComponent(jButton1)))
        			.addContainerGap(445, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGap(69)
        			.addComponent(jLabel5)
        			.addGap(33)
        			.addComponent(jRadioButton1)
        			.addGap(32)
        			.addComponent(jRadioButton2)
        			.addGap(29)
        			.addComponent(jRadioButton3)
        			.addGap(32)
        			.addComponent(jRadioButton4)
        			.addPreferredGap(ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
        			.addComponent(jButton1)
        			.addGap(19))
        );
        jPanel2.setLayout(jPanel2Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        this.setIconImage(new ImageIcon(this.getClass().getResource("class.png")).getImage()); 
        pack();
    }// </editor-fold>                        

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {                                     
        int rep=JOptionPane.showConfirmDialog(null, "Fermer la fenetre","Fermer",JOptionPane.YES_NO_OPTION);
        if(rep==JOptionPane.OK_OPTION)
        {
            System.exit(0);
        }
    }                                    

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {                                     
        this.setState(JFrame.ICONIFIED);
    }                                    

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {                                     
        this.setState(JFrame.ICONIFIED);
    }                                    

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) 
{                                         
click(); 
jRadioButton1.setSelected(true);

} 
    
public void aleatoire() 
{
  	int nombre;
   	tab=new int[10];
   	int lentab=0;
   	int k=0;
   	do {
  		nombre=((int)(Math.random()*10))+1;
   		boolean t=true;
   		for(int x=0;x<=lentab;x++)
   		{
  			if(nombre==tab[x])
   			{
  				t=false;
   				break;
   			}
   		}
   		if(t==true) 
   		{
   		tab[k]=nombre;
   		k++;
   		lentab++;
   		}
   	}while(k<10);
    	
    	
    	for(int x=0;x<lentab;x++)
    	{
    		System.out.println(tab[x]);
    	}
    }
    
 public void click()
    {
		if(jRadioButton1.isSelected())
		{
			re+=tabvalide[0];
		}
	else if(jRadioButton2.isSelected())
		{
			re+=tabvalide[1];
		}
	else if(jRadioButton3.isSelected())
		{
			re+=tabvalide[2];
		}
	else if(jRadioButton4.isSelected())
		{
			re+=tabvalide[3];
		}
		if(i<10)
		firstSelect();
		else {
		jButton1.setText("Terminer");
		if(ajout==false)
		{
		JOptionPane.showMessageDialog(null,"Fin de test, votre résultat est de: "+re+"/"+10);
		ajouterResultat(re);
		ajout=true;
		
		this.hide();
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
		}

		}

		
    }

public void ajouterResultat(int score)
{
	 Statement st=null;
	 int valid;
		try
		{
		Class.forName("com.mysql.jdbc.Driver");//Importer et tester si le driver de sql est activé
		Connection cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/projet1112","root","");
		System.out.println("Connexion bien établie");//arriere plan pour verfie les erruers
		st=cnx.createStatement();////creer un objet st qui va executer les requetes sql a laide de cnx
		if(re<5)
			valid=0;
			else
				valid=1;
		st.executeUpdate("insert into resultat(score,idusers,date,valide) values('"+score+"','"+connexionEtudiant.p.get(0).getId()+"',SYSDATE(),'"+valid+"')");
		JOptionPane.showMessageDialog(null,"Le score a été ajouté avec succès a la base de données");   
		}
		catch(ClassNotFoundException e)
		{
		JOptionPane.showMessageDialog(null,"Erreur driver");
		} 
		catch (SQLException e) {
			JOptionPane.showMessageDialog(null,"Erreur requete sql");
		}
	
}
 
    
public void firstSelect()
	{

		
		Question u=null;
		Reponse r=null;
	
	try 
		{
		//1
		Class.forName("com.mysql.jdbc.Driver");
		//2
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/projet1112","root",""); 
		Statement pr=cn.createStatement();
		
		Statement pr1=cn.createStatement();
		
		ResultSet rs1=pr.executeQuery("SELECT * FROM question where id='"+tab[i]+"'");
		
		ResultSet rs2=pr1.executeQuery("SELECT * FROM reponse where idquestion='"+tab[i]+"'");

		rs1.next();
		jLabel5.setText(rs1.getString(2));
		
		
		int j=1;
		while(rs2.next())
		{
			r=new Reponse();
			r.setReponse(rs2.getString(2));
			r.setValide(rs2.getInt(4));
					
			if(j==1) {
				jRadioButton1.setText(r.getReponse());
				tabvalide[0]=r.getValide();
				System.out.println(tabvalide[0]);
				}
			else if(j==2) {
				jRadioButton2.setText(r.getReponse());
				tabvalide[1]=r.getValide();
				System.out.println(tabvalide[1]);
			}
			else if(j==3) {
				jRadioButton3.setText(r.getReponse());
				tabvalide[2]=r.getValide();
				System.out.println(tabvalide[2]);
			}
			else if(j==4) {
				jRadioButton4.setText(r.getReponse());
				tabvalide[3]=r.getValide();
				System.out.println(tabvalide[3]);
			}
			
		j++;
		}
		i++;

		}
			
			catch(ClassNotFoundException e)
			{
			JOptionPane.showMessageDialog(null,"Erreur driver");
			} 
			catch (SQLException e) {
				JOptionPane.showMessageDialog(null,"Erreur requete sql");
			}
	
	

				
	}
    
    int[] tab;
    int i=0;
    int saut=1;
    int []tabvalide=new int[4];
    static int re=0;
    int idusers;
    boolean ajout=false;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
}
