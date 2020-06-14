    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author hakan
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    
    private static final String username = "root";
    private static final String url = "jdbc:mysql://localhost:3306/sys?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Europe/Moscow";
    private static final String password = "";
    
    private static int number_of_email =0;
    private static int check;
    private static int type_id;
    
    static String user_name = "";
    static String user_email = "";
    static String user_password = "";
    static String user_birthday = "";
    
    public Register() {
        initComponents();
    }

    private static void get_number_of_email(){
        
        @SuppressWarnings("UnusedAssignment")
        Connection conn2 = null;
        
        try{
            conn2 = DriverManager.getConnection(url, username, password);
            
            Statement state2 = conn2.createStatement();
            
            ResultSet myresult2 = state2.executeQuery("select*from user_table");
            
            while(myresult2.next()){
                number_of_email++;
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        action_check = new javax.swing.JCheckBox();
        fantastic_check = new javax.swing.JCheckBox();
        horror_check = new javax.swing.JCheckBox();
        sfiction_check = new javax.swing.JCheckBox();
        childandfamily_check = new javax.swing.JCheckBox();
        anime_check = new javax.swing.JCheckBox();
        comedy_check = new javax.swing.JCheckBox();
        documentary_check = new javax.swing.JCheckBox();
        thriller_check = new javax.swing.JCheckBox();
        romance_check = new javax.swing.JCheckBox();
        snature_check = new javax.swing.JCheckBox();
        reality_check = new javax.swing.JCheckBox();
        drama_check = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("user name");

        jLabel2.setText("user email");

        jLabel3.setText("user password");

        jLabel4.setText("user birthday");

        jButton1.setText("REGISTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("select favorite program");

        action_check.setText("Action");

        fantastic_check.setText("Fantastic");

        horror_check.setText("Horror");

        sfiction_check.setText("Science Fiction");

        childandfamily_check.setText("Child and Family");

        anime_check.setText("Anime");

        comedy_check.setText("Comedy");

        documentary_check.setText("Documentary");

        thriller_check.setText("Thriller");

        romance_check.setText("Romance");

        snature_check.setText("Science and Nature");

        reality_check.setText("Reality Program");

        drama_check.setText("Drama");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(493, 493, 493)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(snature_check)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(romance_check)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reality_check)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sfiction_check))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField1)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField2)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField3)
                        .addComponent(jTextField4)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(action_check)
                            .addComponent(drama_check))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(childandfamily_check)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(anime_check))
                            .addComponent(fantastic_check)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comedy_check)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(documentary_check)
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(horror_check)
                            .addComponent(thriller_check))))
                .addContainerGap(532, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fantastic_check, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(action_check)
                        .addComponent(horror_check)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(childandfamily_check)
                    .addComponent(anime_check)
                    .addComponent(drama_check))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comedy_check)
                    .addComponent(documentary_check)
                    .addComponent(thriller_check))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(romance_check)
                    .addComponent(reality_check)
                    .addComponent(sfiction_check))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(snature_check)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("UnusedAssignment")
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        number_of_email ++;
        
        user_name = jTextField1.getText();
        user_email = jTextField2.getText();
        user_password = jTextField3.getText();
        user_birthday = jTextField4.getText();
                
        Date date = new Date(2000,04,12);
        
        @SuppressWarnings("UnusedAssignment")
        Connection conn = null;
        
        try{
            conn = DriverManager.getConnection(url, username, password);
            
            String sql = "INSERT INTO user_table (user_id,user_name, user_email, user_password , user_birthday)" +
            "VALUES (?,?,?,?,?)";
            
            //create a prepared statement to add user into database
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            
            preparedStatement.setInt(1, number_of_email);
            preparedStatement.setString(2, user_name);
            preparedStatement.setString(3, user_email);
            preparedStatement.setString(4, user_password);
            preparedStatement.setDate(5, date);
            
            preparedStatement.executeUpdate(); 
            
        }catch(SQLException e){
            System.out.println(e);
        }
        
        //checking checkbox . if checkbox is selected show result of the query
        if(action_check.isSelected() && check<4){
            try {
                conn = DriverManager.getConnection(url, username, password);
                
                Statement state2 = conn.createStatement();
                String query2 = "select * from type_table  where type_name='Action'";
                ResultSet result2 = state2.executeQuery(query2);
                
                while(result2.next()){
                    type_id = result2.getInt("type_id");
                }
                
                Statement state = conn.createStatement();
                String query = "select * from user_program_table  where type_id='"+type_id+"' order by user_rate desc limit 2";
                ResultSet result = state.executeQuery(query);
                
                while(result.next()){
                    Statement state3 = conn.createStatement();
                    String query3 = "select program_name from program_table where program_id='" + result.getInt("program_id") +"'";
                    ResultSet result3 = state3.executeQuery(query3);
                    
                    while(result3.next()){
                        System.out.println("Best film/series for Action:");
                        System.out.println(result3.getString("program_name"));
                        System.out.println("\n");
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            }
            check++;
        }
        
        if(romance_check.isSelected() && check<4){
            try {
                conn = DriverManager.getConnection(url, username, password);
                
                Statement state2 = conn.createStatement();
                String query2 = "select * from type_table  where type_name='Romance'";
                ResultSet result2 = state2.executeQuery(query2);
                
                while(result2.next()){
                    type_id = result2.getInt("type_id");
                }
                
                Statement state = conn.createStatement();
                String query = "select * from user_program_table  where type_id='"+type_id+"' order by user_rate desc limit 2";
                ResultSet result = state.executeQuery(query);
                
                System.out.println("Best film/series for Romance:");
                
                while(result.next()){
                    Statement state3 = conn.createStatement();
                    String query3 = "select program_name from program_table where program_id='" + result.getInt("program_id") +"'";
                    ResultSet result3 = state3.executeQuery(query3);
                    
                    while(result3.next()){
                        System.out.println(result3.getString("program_name"));
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            }
            check++;
        }
        
        if(anime_check.isSelected() && check<4){
            try {
                conn = DriverManager.getConnection(url, username, password);
                
                Statement state2 = conn.createStatement();
                String query2 = "select * from type_table  where type_name='Anime'";
                ResultSet result2 = state2.executeQuery(query2);
                
                while(result2.next()){
                    type_id = result2.getInt("type_id");
                }
                
                Statement state = conn.createStatement();
                String query = "select * from user_program_table  where type_id='"+type_id+"' order by user_rate desc limit 2";
                ResultSet result = state.executeQuery(query);
                
                while(result.next()){
                    Statement state3 = conn.createStatement();
                    String query3 = "select program_name from program_table where program_id='" + result.getInt("program_id") +"'";
                    ResultSet result3 = state3.executeQuery(query3);
                    
                    while(result3.next()){
                        System.out.println("Best film/series for Anime:");
                        System.out.println(result3.getString("program_name"));
                        System.out.println("\n");
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            }
            check++;
        }
        
        if(childandfamily_check.isSelected() && check<4){
            try {
                conn = DriverManager.getConnection(url, username, password);
                
                Statement state2 = conn.createStatement();
                String query2 = "select * from type_table  where type_name='Child and Family'";
                ResultSet result2 = state2.executeQuery(query2);
                
                while(result2.next()){
                    type_id = result2.getInt("type_id");
                }
                
                Statement state = conn.createStatement();
                String query = "select * from user_program_table  where type_id='"+type_id+"' order by user_rate desc limit 2";
                ResultSet result = state.executeQuery(query);
                
                while(result.next()){
                    Statement state3 = conn.createStatement();
                    String query3 = "select program_name from program_table where program_id='" + result.getInt("program_id") +"'";
                    ResultSet result3 = state3.executeQuery(query3);
                    
                    while(result3.next()){
                        System.out.println("Best film/series for Child and Family:");
                        System.out.println(result3.getString("program_name"));
                        System.out.println("\n");
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            }
            check++;
        }
        
        if(comedy_check.isSelected() && check<4){
            try {
                conn = DriverManager.getConnection(url, username, password);
                
                Statement state2 = conn.createStatement();
                String query2 = "select * from type_table  where type_name='Comedy'";
                ResultSet result2 = state2.executeQuery(query2);
                
                while(result2.next()){
                    type_id = result2.getInt("type_id");
                }
                
                Statement state = conn.createStatement();
                String query = "select * from user_program_table  where type_id='"+type_id+"' order by user_rate desc limit 2";
                ResultSet result = state.executeQuery(query);
                
                while(result.next()){
                    Statement state3 = conn.createStatement();
                    String query3 = "select program_name from program_table where program_id='" + result.getInt("program_id") +"'";
                    ResultSet result3 = state3.executeQuery(query3);
                    
                    while(result3.next()){
                        System.out.println("Best film/series for Comedy:");
                        System.out.println(result3.getString("program_name"));
                        System.out.println("\n");
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            }
            check++;
        }
        
        if(documentary_check.isSelected()&& check<4){
            try {
                conn = DriverManager.getConnection(url, username, password);
                
                Statement state2 = conn.createStatement();
                String query2 = "select * from type_table  where type_name='Documentary'";
                ResultSet result2 = state2.executeQuery(query2);
                
                while(result2.next()){
                    type_id = result2.getInt("type_id");
                }
                
                Statement state = conn.createStatement();
                String query = "select * from user_program_table  where type_id='"+type_id+"' order by user_rate desc limit 2";
                ResultSet result = state.executeQuery(query);
                
                while(result.next()){
                    Statement state3 = conn.createStatement();
                    String query3 = "select program_name from program_table where program_id='" + result.getInt("program_id") +"'";
                    ResultSet result3 = state3.executeQuery(query3);
                    
                    while(result3.next()){
                        System.out.println("Best film/series for Documentary:");
                        System.out.println(result3.getString("program_name"));
                        System.out.println("\n");
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            }
            check++;
        }
        
        if(drama_check.isSelected() && check<4){
            try {
                conn = DriverManager.getConnection(url, username, password);
                
                Statement state2 = conn.createStatement();
                String query2 = "select * from type_table  where type_name='Drama'";
                ResultSet result2 = state2.executeQuery(query2);
                
                while(result2.next()){
                    type_id = result2.getInt("type_id");
                }
                
                Statement state = conn.createStatement();
                String query = "select * from user_program_table  where type_id='"+type_id+"' order by user_rate desc limit 2";
                ResultSet result = state.executeQuery(query);
                
                while(result.next()){
                    Statement state3 = conn.createStatement();
                    String query3 = "select program_name from program_table where program_id='" + result.getInt("program_id") +"'";
                    ResultSet result3 = state3.executeQuery(query3);
                    
                    while(result3.next()){
                        System.out.println("Best film/series for Drama:");
                        System.out.println(result3.getString("program_name"));
                        System.out.println("\n");
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            }
            check++;
        }
        
        if(fantastic_check.isSelected() && check<4){
            try {
                conn = DriverManager.getConnection(url, username, password);
                
                Statement state2 = conn.createStatement();
                String query2 = "select * from type_table  where type_name='Fantastic'";
                ResultSet result2 = state2.executeQuery(query2);
                
                while(result2.next()){
                    type_id = result2.getInt("type_id");
                }
                
                Statement state = conn.createStatement();
                String query = "select * from user_program_table  where type_id='"+type_id+"' order by user_rate desc limit 2";
                ResultSet result = state.executeQuery(query);
                
                while(result.next()){
                    Statement state3 = conn.createStatement();
                    String query3 = "select program_name from program_table where program_id='" + result.getInt("program_id") +"'";
                    ResultSet result3 = state3.executeQuery(query3);
                    
                    while(result3.next()){
                        System.out.println("Best film/series for Fantastic:");
                        System.out.println(result3.getString("program_name"));
                        System.out.println("\n");
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            }
            check++;
        }
        
        if(horror_check.isSelected() && check<4){
            try {
                conn = DriverManager.getConnection(url, username, password);
                
                Statement state2 = conn.createStatement();
                String query2 = "select * from type_table  where type_name='Horror'";
                ResultSet result2 = state2.executeQuery(query2);
                
                while(result2.next()){
                    type_id = result2.getInt("type_id");
                }
                
                Statement state = conn.createStatement();
                String query = "select * from user_program_table  where type_id='"+type_id+"' order by user_rate desc limit 2";
                ResultSet result = state.executeQuery(query);
                
                while(result.next()){
                    Statement state3 = conn.createStatement();
                    String query3 = "select program_name from program_table where program_id='" + result.getInt("program_id") +"'";
                    ResultSet result3 = state3.executeQuery(query3);
                    
                    while(result3.next()){
                        System.out.println("Best film/series for Horror:");
                        System.out.println(result3.getString("program_name"));
                        System.out.println("\n");
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            }
            check++;
        }
        
        if(reality_check.isSelected() && check<4){
            try {
                conn = DriverManager.getConnection(url, username, password);
                
                Statement state2 = conn.createStatement();
                String query2 = "select * from type_table  where type_name='Reality Program'";
                ResultSet result2 = state2.executeQuery(query2);
                
                while(result2.next()){
                    type_id = result2.getInt("type_id");
                }
                
                Statement state = conn.createStatement();
                String query = "select * from user_program_table  where type_id='"+type_id+"' order by user_rate desc limit 2";
                ResultSet result = state.executeQuery(query);
                
                while(result.next()){
                    Statement state3 = conn.createStatement();
                    String query3 = "select program_name from program_table where program_id='" + result.getInt("program_id") +"'";
                    ResultSet result3 = state3.executeQuery(query3);
                    
                    while(result3.next()){
                        System.out.println("Best film/series for Reality Program:");
                        System.out.println(result3.getString("program_name"));
                        System.out.println("\n");
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            }
            check++;
        }
        
        if(snature_check.isSelected() && check<4){
            try {
                conn = DriverManager.getConnection(url, username, password);
                
                Statement state2 = conn.createStatement();
                String query2 = "select * from type_table  where type_name='Science and Nature'";
                ResultSet result2 = state2.executeQuery(query2);
                
                while(result2.next()){
                    type_id = result2.getInt("type_id");
                }
                
                Statement state = conn.createStatement();
                String query = "select * from user_program_table  where type_id='"+type_id+"' order by user_rate desc limit 2";
                ResultSet result = state.executeQuery(query);
                
                while(result.next()){
                    Statement state3 = conn.createStatement();
                    String query3 = "select program_name from program_table where program_id='" + result.getInt("program_id") +"'";
                    ResultSet result3 = state3.executeQuery(query3);
                    
                    while(result3.next()){
                        System.out.println("Best film/series for Science and Nature:");
                        System.out.println(result3.getString("program_name"));
                        System.out.println("\n");
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            }
            check++;
        }
        
        if(sfiction_check.isSelected() && check<4){
            try {
                conn = DriverManager.getConnection(url, username, password);
                
                Statement state2 = conn.createStatement();
                String query2 = "select * from type_table  where type_name='Science Fiction'";
                ResultSet result2 = state2.executeQuery(query2);
                
                while(result2.next()){
                    type_id = result2.getInt("type_id");
                }
                
                Statement state = conn.createStatement();
                String query = "select * from user_program_table  where type_id='"+type_id+"' order by user_rate desc limit 2";
                ResultSet result = state.executeQuery(query);
                
                while(result.next()){
                    Statement state3 = conn.createStatement();
                    String query3 = "select program_name from program_table where program_id='" + result.getInt("program_id") +"'";
                    ResultSet result3 = state3.executeQuery(query3);
                    
                    while(result3.next()){
                        System.out.println("Best film/series for Science Fiction:");
                        System.out.println(result3.getString("program_name"));
                        System.out.println("\n");
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            }
            check++;
        }
        
        if(thriller_check.isSelected() && check<4){
            try {
                conn = DriverManager.getConnection(url, username, password);
                
                Statement state2 = conn.createStatement();
                String query2 = "select * from type_table  where type_name='Thriller'";
                ResultSet result2 = state2.executeQuery(query2);
                
                while(result2.next()){
                    type_id = result2.getInt("type_id");
                }
                
                Statement state = conn.createStatement();
                String query = "select * from user_program_table  where type_id='"+type_id+"' order by user_rate desc limit 2";
                ResultSet result = state.executeQuery(query);
                
                while(result.next()){
                    Statement state3 = conn.createStatement();
                    String query3 = "select program_name from program_table where program_id='" + result.getInt("program_id") +"'";
                    ResultSet result3 = state3.executeQuery(query3);
                    
                    while(result3.next()){
                        System.out.println("Best film/series for Thriller:");
                        System.out.println(result3.getString("program_name"));
                        System.out.println("\n");
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            }
            check++;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Register().setVisible(true);
        });
        
        get_number_of_email();
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox action_check;
    private javax.swing.JCheckBox anime_check;
    private javax.swing.JCheckBox childandfamily_check;
    private javax.swing.JCheckBox comedy_check;
    private javax.swing.JCheckBox documentary_check;
    private javax.swing.JCheckBox drama_check;
    private javax.swing.JCheckBox fantastic_check;
    private javax.swing.JCheckBox horror_check;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JCheckBox reality_check;
    private javax.swing.JCheckBox romance_check;
    private javax.swing.JCheckBox sfiction_check;
    private javax.swing.JCheckBox snature_check;
    private javax.swing.JCheckBox thriller_check;
    // End of variables declaration//GEN-END:variables
}