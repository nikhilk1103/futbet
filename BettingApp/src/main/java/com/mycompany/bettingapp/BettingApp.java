/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

 package com.mycompany.bettingapp;

 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;
 import java.time.*;  
 import java.util.*;
 
 class MyFrame extends JFrame implements ActionListener {
	 
 
	 
	  String regex = "[a-zA-Z ]+";
	  String regex1 = "[0-9]+";
	  String regexmail = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" 
		 + "[^-][a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,})$";
	  double odds;
          double potwin;
	  String fullname;
	  LocalDate dateofb;
	  LocalDate curDate;  
	  Period period;
	 private Container c;
	 //private JLabel bgimg;
	 private JLabel title;
	 private JLabel name1;
	 private JTextField tname1;
	 private JLabel mno;
	 private JTextField tmno;
	  private JComboBox mnocode;
	  private JLabel email;
	  private JTextField temail;
	 private JLabel match;
	 private JLabel result;
	 private JLabel score;
	 private JTextField steam1;
	 private JTextField vsteam1;
	 private JLabel dash;
	 private JTextField vsteam2;
	 private JTextField steam2;
	 private JLabel ccno;
	 private JLabel curr;
	 private JLabel amt;
	 private JTextField vccno;
	 private JTextField vamt;
	 private JComboBox vcurr;
	 private JRadioButton team1;
	 private JRadioButton team2;
	 private JRadioButton draw;
	 private ButtonGroup teams;
	 private JComboBox tmatch;	
	  private JLabel eid;
	 private JTextField teid;
	 private JLabel dob;
	 private JComboBox date;
	 private JComboBox month;
	 private JComboBox year;
	 private JCheckBox term;
	 private JButton sub;
	 private JButton reset;
	  private JButton confirm;
          private JLabel RecOver;
	 private JTextArea tout;
	 private JLabel res;

	 
	 
	 
 
	
	 private String matches[]
	 ={
		 "[WC 3rd Place] CRO vs MAR", "[WC Final] ARG vs FRA"
	 };
	 private String dates[]
		 = { "1", "2", "3", "4", "5",
			 "6", "7", "8", "9", "10",
			 "11", "12", "13", "14", "15",
			 "16", "17", "18", "19", "20",
			 "21", "22", "23", "24", "25",
			 "26", "27", "28", "29", "30",
			 "31" };
	 private String months[]
		 = { "1", "2", "3", "4",
			 "5", "6", "7", "8",
			 "9", "10", "11", "12" };
	 private String years[]
		 = {     "2022","2021","2020","2019", 
				  "2018", "2017", "2016", 
				 "2015", "2014", "2013", "2012",
				 "2011", "2010", "2009", "2008", 
				 "2007", "2006", "2005", "2004",
				 "2003", "2002", "2001", "2000",
				 "1999", "1998", "1997", "1996",
				 "1995", "1994", "1993", "1992",
				 "1991", "1990", "1989", "1988",       
				 "1987", "1986", "1985", "1984", 
				 "1983", "1982", "1981", "1980", 
				 "1979", "1978", "1977", "1976",
			 "1975", "1974", "1973", "1972",
			 "1971", "1970", "1969", "1968",
			 "1967", "1966", "1965", "1964",
			 "1963", "1962", "1961", "1960",
			 "1959", "1958", "1957", "1956",
			 "1955" };
	  private String mnocodes[]
		   = {"055","050","052","054","056","058"};
	 private String currencies[]
	 ={
		 "United States Dollar (USD)" , "Arab Emirates Dirham (AED)" , "Great British Pounds (GBP)" , "Nigerian Naira (NGN)"
	 };	  
	 
   
 
	 
	  public MyFrame(){
			setTitle("FÚTBET");
			getContentPane().setBackground(Color.DARK_GRAY);
			 //Background image
			 //bgimg = new JLabel()
 
		 setSize(1250, 650);
		 
		 setBackground(Color.DARK_GRAY);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 setResizable(false);
 
		 c = getContentPane();
		 c.setLayout(null);
 
		 
 
		 title = new JLabel("<html><center>Welcome to FÚTBET! Place your bets now!<br/> Enter a few details below and proceed to betting.</html>");
		 title.setFont(new Font("Arial", Font.BOLD, 25));
		 title.setForeground(Color.green);
		 title.setSize(800, 67);
		 title.setLocation(150, 30);
		 c.add(title);
 
		 name1 = new JLabel("Name");
		 name1.setFont(new Font("Arial", Font.PLAIN, 20));
		 name1.setForeground(Color.WHITE);
		 name1.setSize(100, 20);
		 name1.setLocation(90, 110);
		 c.add(name1);
 
		 tname1 = new JTextField();
		 tname1.setFont(new Font("Arial", Font.PLAIN, 15));
		 tname1.setBackground(Color.LIGHT_GRAY);
		 
		 tname1.setSize(220, 20);
		 tname1.setLocation(200, 110);
		 c.add(tname1);
 
		 mno = new JLabel("Mobile");
		 mno.setFont(new Font("Arial", Font.PLAIN, 20));
		 mno.setForeground(Color.WHITE);
		 mno.setSize(100, 20);
		 mno.setLocation(460, 110);
		 c.add(mno);
 
		 tmno = new JTextField();
		 tmno.setFont(new Font("Arial", Font.PLAIN, 15));
		 tmno.setBackground(Color.LIGHT_GRAY);
		 tmno.setSize(150, 20);
		 tmno.setLocation(630, 110);
		 c.add(tmno);
 
			mnocode = new JComboBox(mnocodes);
		 mnocode.setFont(new Font("Arial", Font.PLAIN, 15));
		 mnocode.setBackground(Color.LIGHT_GRAY);
		 mnocode.setSize(60, 20);
		 mnocode.setLocation(560, 110);
		 c.add(mnocode);
 
			email = new JLabel("Email");
			email.setForeground(Color.WHITE);
		 email.setFont(new Font("Arial", Font.PLAIN, 20));
		 email.setSize(100, 20);
		 email.setLocation(90, 160);
		 c.add(email);
 
		 temail = new JTextField();
		 temail.setFont(new Font("Arial", Font.PLAIN, 15));
		 temail.setBackground(Color.LIGHT_GRAY);
		 temail.setSize(580, 20);
		 temail.setLocation(200, 160);
		 c.add(temail);
 
		 dob = new JLabel("DOB");
		 dob.setForeground(Color.WHITE);
		 dob.setFont(new Font("Arial", Font.PLAIN, 20));
		 dob.setSize(100, 20);
		 dob.setLocation(90, 210);
		 
		 c.add(dob);
 
		 
		 date = new JComboBox(dates);
		 date.setFont(new Font("Arial", Font.PLAIN, 15));
		 date.setBackground(Color.LIGHT_GRAY);
		 date.setSize(50, 20);
		 date.setLocation(200, 210);
		 
		 c.add(date);
 
		 month = new JComboBox(months);
		 month.setFont(new Font("Arial", Font.PLAIN, 15));
		 month.setBackground(Color.LIGHT_GRAY);
		 month.setSize(60, 20);
		 month.setLocation(260, 210);
		 c.add(month);
 
		 year = new JComboBox(years);
		 year.setFont(new Font("Arial", Font.PLAIN, 15));
		 year.setBackground(Color.LIGHT_GRAY);
		 year.setSize(60, 20);
		 year.setLocation(330, 210);
		 c.add(year);
 
		 eid = new JLabel("EID");
		 eid.setForeground(Color.WHITE);
		 eid.setFont(new Font("Arial", Font.PLAIN, 20));
		 eid.setSize(100, 20);
		 eid.setLocation(460, 210);
		 c.add(eid);
 
		 teid = new JTextField();
		 teid.setFont(new Font("Arial", Font.PLAIN, 15));
		 teid.setBackground(Color.LIGHT_GRAY);
		 teid.setSize(210, 20);
		 teid.setLocation(570, 210);
		 c.add(teid); 
 
 
		 match = new JLabel("Matches");
		 match.setForeground(Color.WHITE);
		 match.setFont(new Font("Arial", Font.PLAIN, 20));
		 match.setSize(100, 20);
		 match.setLocation(90, 310);
		 c.add(match);
 
		 tmatch = new JComboBox(matches);
		 tmatch.setFont(new Font("Arial", Font.PLAIN, 15));
		 tmatch.addActionListener(this);
		 tmatch.setBackground(Color.LIGHT_GRAY);
		 tmatch.setSize(230, 20);
		 tmatch.setLocation(200, 310);
		 c.add(tmatch);
 
		 score = new JLabel("Score");
		 score.setForeground(Color.WHITE);
		 score.setFont(new Font("Arial", Font.PLAIN, 20));
		 score.setSize(100, 20);
		 score.setLocation(90, 400);
		 c.add(score);
 
		 result = new JLabel("Result");
		 result.setForeground(Color.WHITE);
		 result.setFont(new Font("Arial", Font.PLAIN, 20));
		 result.setSize(100, 20);
		 result.setLocation(90, 360);
		 c.add(result);
 
		 team1 = new JRadioButton("CRO");
		 team1.setForeground(Color.WHITE);
		 team1.setBackground(Color.DARK_GRAY);
		 team1.setFont(new Font("Arial", Font.PLAIN, 15));
		 team1.setSelected(true);
		 team1.setSize(80 , 20);
		 team1.setLocation(200, 360);
		 c.add(team1);
 
		 team2= new JRadioButton("MAR");
		 team2.setForeground(Color.WHITE);
		 team2.setBackground(Color.DARK_GRAY);
		 team2.setFont(new Font("Arial", Font.PLAIN, 15));
		 team2.setSelected(false);
		 team2.setSize(70, 20);
		 team2.setLocation(280, 360);
		 c.add(team2);
 
		 draw= new JRadioButton("Draw");
		 draw.setForeground(Color.WHITE);
		 draw.setBackground(Color.DARK_GRAY);
		 draw.setFont(new Font("Arial", Font.PLAIN, 15));
		 draw.setSelected(false);
		 draw.setSize(80, 20);
		 draw.setLocation(360, 360);
		 c.add(draw);
 
		 teams = new ButtonGroup();
		 teams.add(team1);
		 teams.add(team2);
		 teams.add(draw);
 
		 steam1 = new JTextField("CRO");
		 steam1.setForeground(Color.WHITE);
		 steam1.setFont(new Font("Arial", Font.PLAIN, 15));
		 steam1.setEditable(false);
		 steam1.setBackground(Color.DARK_GRAY);
		 steam1.setSize(40, 20);
		 steam1.setLocation(200, 400);
		 c.add(steam1);
 
		 vsteam1 = new JTextField();
		 vsteam1.setFont(new Font("Arial", Font.PLAIN, 15));
		 vsteam1.setBackground(Color.LIGHT_GRAY);
		 vsteam1.setSize(25, 20);
		 vsteam1.setLocation(250, 400);
		 c.add(vsteam1);
 
		 
		 dash = new JLabel("-");
		 dash.setForeground(Color.WHITE);
		 dash.setFont(new Font("Arial", Font.PLAIN, 20));
		 dash.setBackground(Color.DARK_GRAY);
		 dash.setSize(10, 20);
		 dash.setLocation(285, 397);
		 c.add(dash);
 
		 vsteam2 = new JTextField();
		 vsteam2.setFont(new Font("Arial", Font.PLAIN, 15));
		 vsteam2.setBackground(Color.LIGHT_GRAY);
		 vsteam2.setSize(25, 20);
		 vsteam2.setLocation(305, 400);
		 c.add(vsteam2);
 
		 steam2 = new JTextField("MAR");
		 steam2.setForeground(Color.WHITE);
		 steam2.setFont(new Font("Arial", Font.PLAIN, 15));
		 steam2.setEditable(false);
		 steam2.setBackground(Color.DARK_GRAY);
		 steam2.setSize(40, 20);
		 steam2.setLocation(340, 400);
		 c.add(steam2);
 
		 //ccno
		 ccno = new JLabel("CC Number");
		 ccno.setForeground(Color.WHITE);
		 ccno.setFont(new Font("Arial", Font.PLAIN, 20));
		 ccno.setSize(190, 20);
		 ccno.setLocation(460, 310);
		 c.add(ccno);
 
		 //vccno
		 vccno = new JTextField("");
		 vccno.setFont(new Font("Arial", Font.PLAIN, 15));
		 vccno.setBackground(Color.LIGHT_GRAY);
		 vccno.setSize(200, 20);
		 vccno.setLocation(580,310);
		 c.add(vccno);
 
		 //curr
		 curr = new JLabel("Currency");
		 curr.setForeground(Color.WHITE);
		 curr.setFont(new Font("Arial", Font.PLAIN, 20));
		 curr.setSize(100, 20);
		 curr.setLocation(460, 360);
		 c.add(curr);
 
		 //vcurr
		 vcurr = new JComboBox(currencies);
		 vcurr.setFont(new Font("Arial", Font.PLAIN, 15));
		 vcurr.setBackground(Color.LIGHT_GRAY);
		 vcurr.setSize(210, 20);
		 vcurr.setLocation(570, 360);
		 c.add(vcurr);
		 
 
		 //amt
		 amt = new JLabel("Amount");
		 amt.setForeground(Color.WHITE);
		 amt.setFont(new Font("Arial", Font.PLAIN, 20));
		 amt.setSize(100, 20);
		 amt.setLocation(460, 400);
		 c.add(amt);
 
		 //vamt
		 vamt = new JTextField("");
		 vamt.setFont(new Font("Arial", Font.PLAIN, 15));
		 vamt.setBackground(Color.LIGHT_GRAY);
		 vamt.setSize(210, 20);
		 vamt.setLocation(570, 400);
		 c.add(vamt);
	
		   
		 term = new JCheckBox("Accept Terms And Conditions.");
		 term.setForeground(Color.WHITE);
		 term.setFont(new Font("Arial", Font.PLAIN, 15));
		 term.setBackground(Color.DARK_GRAY);
		 term.setSize(250, 20);
		 term.setLocation(150, 460);
		 c.add(term);
 
		 sub = new JButton("Overview");
		 sub.setFont(new Font("Arial", Font.PLAIN, 15));
		 sub.setSize(100, 20);
		 sub.setLocation(250, 510);
		 sub.addActionListener(this);
		 c.add(sub);
 
		 reset = new JButton("Reset");
		 reset.setFont(new Font("Arial", Font.PLAIN, 15));
		 reset.setSize(100, 20);
		 reset.setLocation(370, 510);
		 reset.addActionListener(this);
		 c.add(reset);
		
		 confirm = new JButton("Confirm Bet");
		 confirm.setFont(new Font("Arial", Font.PLAIN, 15));
		 confirm.setSize(150, 20);
		 confirm.setLocation(490, 510);
		 confirm.addActionListener(this);
		 c.add(confirm);
			
                 RecOver = new JLabel(" RECEIPT EXAMPLE  ");
                 RecOver.setFont(new Font("Arial", Font.PLAIN, 25));
                 RecOver.setForeground(Color.WHITE);
		 RecOver.setSize(800, 40);
		 RecOver.setLocation(875, 50);
                 c.add(RecOver);
                 
		 tout = new JTextArea();
		 tout.setFont(new Font("Arial", Font.PLAIN, 15));
		 tout.setSize(300, 400);
		 tout.setLocation(850, 110);
		 tout.setLineWrap(true);
		 tout.setEditable(false);
		 c.add(tout);
 
		 res = new JLabel("");
		 res.setFont(new Font("Arial", Font.PLAIN, 20));
		 res.setForeground(Color.red);
		 res.setSize(800, 25);
		 res.setLocation(90, 550);
		 c.add(res);
 
		 setVisible(true);
	  }
	 
 
	 
	 public void actionPerformed(ActionEvent e){
		   try{
			 dateofb = LocalDate.of(Integer.valueOf((String)year.getSelectedItem()),Integer.valueOf((String)month.getSelectedItem()),Integer.valueOf((String)date.getSelectedItem())); 
		 }
		 catch(DateTimeException m){
			 tout.setText("");
				 res.setText("Please enter valid DOB");
		 }
		  if (tmatch.getSelectedIndex()==0)
		  {
			 team1.setText("CRO");
			 team2.setText("MAR");
			 steam1.setText("CRO");
			 steam2.setText("MAR");
                  
		  }
		  else
		   {
			 team1.setText("ARG");
			 team2.setText("FRA");
			 steam1.setText("ARG");
			 steam2.setText("FRA");
                         
		  }
				 curDate = LocalDate.now(); 
			period = Period.between(dateofb, curDate);  
			fullname=tname1.getText();
 
 
		 if(e.getSource()==sub) {
			 String recresult;
			 String signcurr;
			 //team selected view in reciept
			 if(team1.isSelected()==true){
				 recresult = team1.getText() + " Wins";
			 }
			 else if (team2.isSelected()==true){
				 recresult =team2.getText() + " Wins";
			 }
			 else{
				 recresult =draw.getText();
			 }
			 
			 //sign of curr
			 if(vcurr.getSelectedIndex()==0){
				 signcurr = " $";
			 }
			 else if(vcurr.getSelectedIndex()==1){
				 signcurr = " AED";
			 }
			 else if(vcurr.getSelectedIndex()==2){
				 signcurr = " £";
			 }
			 else {
				 signcurr = " ₦";
			 }
				 if(tname1.getText().equals("")){
					   tout.setText("");
				 res.setText("Please enter first name");
				 }
				else if(tname1.getText().matches(regex)==false){
						tout.setText("");
						res.setText("Please enter only characters in first name");
				}
				else if(tmno.getText().matches(regex1)==false){
						tout.setText("");
						res.setText("Please enter only numbers and 7 digits in mob no");
				}
				else if(tmno.getText().length()!=7){
						tout.setText("");
						res.setText("Please enter 7 digit mobile number");
                                      
				}
                                else if(tmno.getText().equals("")){
					   tout.setText("");
						 res.setText("Please enter mob no");
					   }
				 else if(temail.getText().matches(regexmail)==false){
							tout.setText("");
							res.setText("Please enter mailid and in format: username@domain.com");
				}
                                else if(period.getYears()<21){
					   tout.setText("");
					   res.setText("Your age is below 21 and hence is not eligible for betting");
					  }
				else if(teid.getText().equals("")){
								tout.setText("");
						  res.setText("Please enter emirates id no");
				}
				else if(teid.getText().matches(regex1)==false){
								tout.setText("");
								res.setText("Please enter only numbers and 15 digits in eid");
				}
				else if(teid.getText().length()!=15){
								tout.setText("");
								res.setText("Please enter 15 digit Emirates ID");
				}  
				else if(vccno.getText().equals("")){
									tout.setText("");
									  res.setText("Please enter credit card number");
				}
				else if(vccno.getText().matches(regex1)==false){
									tout.setText("");
									res.setText("Please enter only numbers and 16 digits in credit card number");
				}
				else if(vccno.getText().length()!=16){
									tout.setText("");
									res.setText("Please enter 16 digit credit card number");
				}
				else if(team1.isSelected()==false && team2.isSelected()==false && draw.isSelected()==false){
					 res.setText("Please select a result");
				 }
				 else if(vsteam1.getText().equals("")){
					 tout.setText("");
                                        res.setText("Please enter score for team 1");
				 }
				   else if(vsteam1.getText().matches(regex1)==false){
					 tout.setText("");
					 res.setText("Please enter only numbers as score");
				 }
				 else if(vsteam2.getText().equals("")){
						 tout.setText("");
				   res.setText("Please enter score for team 2");
				 }
				 else if(vsteam2.getText().matches(regex1)==false){
						 tout.setText("");
						 res.setText("Please enter only numbers as score");	
				 }
				 else if(team1.isSelected()==true &&  Integer.valueOf(vsteam1.getText())<=Integer.valueOf(vsteam2.getText()))  
				 {
					 //tout.setText("");
					 res.setText("Score entered does not match with result");
				 }   
				 else if(team2.isSelected()==true &&  Integer.valueOf(vsteam2.getText())<=Integer.valueOf(vsteam1.getText()))  
				 {
					 //tout.setText("");
					 res.setText("Score entered does not match with result");
				 }
				 else if(draw.isSelected()==true &&  Integer.valueOf(vsteam1.getText())!=Integer.valueOf(vsteam2.getText()))  
				 {
					 //tout.setText("");
					 res.setText("Score entered does not match with result");
				 }   
				 else if(vamt.getText().equals("") ){
						 tout.setText("");
						   res.setText("Please enter valid bet amount");
						 }
				 else if(vamt.getText().matches(regex1)==false){
						 tout.setText("");
						 res.setText("Please enter only numbers as the bet amount");
						 }
                                 else if(Integer.valueOf(vamt.getText()).equals(0) ){
                                     tout.setText("");
						   res.setText("Please enter valid bet amount");
						 
                                 }
				
				 
 
 
				 
				 else if (term.isSelected()) {
				 if(tmatch.getSelectedIndex()==0 && team1.isSelected()==true){
                                    odds = 1.6;
                                
                                    potwin = 1.6*Double.parseDouble(vamt.getText());
                                }
                                 else if(tmatch.getSelectedIndex()==0 && team2.isSelected()==true){
                                     odds = 2.5;
                                     potwin = 2.5*Double.parseDouble(vamt.getText());
                                }
                                 else if (tmatch.getSelectedIndex()==0 && draw.isSelected()==true){
                                     odds = 1.1;
                                     potwin = 1.1*Double.parseDouble(vamt.getText());
                                 }
                                 else if(tmatch.getSelectedIndex()==1 && team1.isSelected()==true){
                                     odds = 1.2;
                                     potwin = 1.2*Double.parseDouble(vamt.getText());
                                 }
                                 else if(tmatch.getSelectedIndex()==1 && team2.isSelected()==true){
                                     odds = 1.4;
                                     potwin = 1.4*Double.parseDouble(vamt.getText());
                                 }
                                 else if(tmatch.getSelectedIndex()==1 && draw.isSelected()==true){
                                     odds = 1.7;
                                     potwin = 1.7*Double.parseDouble(vamt.getText());
                                 }
                                 
				 String data
             
					 ="――――――――――――――――――――――――――"
                                         + "――――――――――――"+"User Details :"+"\n"+"  "+"Name : "
					 + tname1.getText() +" "+"\n"
					 + "  "+"Mobile : "+(String)mnocode.getSelectedItem()
					 + tmno.getText() + "\n"+"  "+"Email id: "+ temail.getText()
							+"\n"+"  "+ "Emirates id: "+teid.getText()+"\n"+ "  "
                                         +"Credit Card number :"+ vccno.getText()+"\n";
					  
				 String data2
					 = "  "+"DOB : "
					 + (String)date.getSelectedItem()
					 + "/" + (String)month.getSelectedItem()
					 + "/" + (String)year.getSelectedItem()
					 + "\n"+"――――――――――――――――――――――――――"
                                         + "――――――――――――"+"\n";
 
				 String data3
					 = "Order Summary : "+"\n"
					 +"  " +(String)tmatch.getSelectedItem()+"\n"
					 +"  "+ "Result Selected :                   "+ recresult 					
					 + "\n" +"  "+"Score Selected :                          "+vsteam1.getText()+"-"
					 + vsteam2.getText()+"\n"+" "+" Final Bet Amount :                   "+signcurr+""
					 +vamt.getText()+ "\n"+"  "+"Potential Collect :                   "+signcurr+""+Double.toString(potwin)+"\n"
                                         +"――――――――――――――――――――――――――"
                                         + "――――――――――――"+"\n";
                                         

                                         
 
				 
				 tout.setText(data + data2 + data3);
				 tout.setEditable(false);
				 res.setText("Please recheck details and press Confirm Bet ");
			 }
			 
			 else {
				 tout.setText("");
				 
				 res.setText("Please accept the"
							 + " terms & conditions and press submit to recheck details");
			 }
		 }
 
		 else if (e.getSource() == reset) {
			 String def = "";
			 tname1.setText(def);
			 vccno.setText(def);  
			 vamt.setText(def);
			 vsteam1.setText(def);
			 vsteam2.setText(def);
			 tmatch.setSelectedIndex(0);
			 tmno.setText(def);
			   res.setText(def);
			 tout.setText(def);
				 temail.setText(def);
				 teid.setText(def);
				 mnocode.setSelectedIndex(0);
				 vcurr.setSelectedIndex(0);
			 teams.clearSelection();	
			 
			 term.setSelected(false);
			 date.setSelectedIndex(0);
			 month.setSelectedIndex(0);
			 year.setSelectedIndex(0);
			 
		 }
		   else if (e.getSource() == confirm){
				 if(tout.getText().equals("")){ 
					 res.setText("Please enter your details and press submit to view details and then proceed with betting");
				  }
				 else{
					   try{  
						  Exit frame = new Exit();
						  frame.setVisible(true);
                                                  dispose();
						  frame.setTitle("Thank You!!");
						  frame.setBounds(0, 0, 746, 608);
						  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						  frame.setResizable(false);
						  frame.setLayout(null);
					 
						  }       
						  
					  
					   catch(Exception ee)  
					   {     
				
						  JOptionPane.showMessageDialog(null, ee.getMessage());  
					   }
						 }     
		  }
	 }
 }
 
 
 class BettingApp{
 
	 public static void main(String[] args) throws Exception
	 {
				 welcome w = new welcome();
				 w.setVisible(true);
                                 
		 //MyFrame f = new MyFrame();
				 
  
		 
	 }
 
	 void setVisible(boolean c) {
		 throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	 }
 
	 
 
	 
 }    