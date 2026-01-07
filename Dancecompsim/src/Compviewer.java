import java.awt.*;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class Compviewer extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1l;
	private JPanel characters;
	private JPanel skills1;
	private JPanel skills2;
	private JPanel comp, pic, rules;
	private JButton ch1, ch2, ch3, reg, nat, intl, precomp;
	private JButton cartw, handst, walk, handsp, flip, aerial, kick, tilt, illus, turns, need, leap;
	private JButton isol, btwis, popp, headsp, wind, headspr;
	private JLabel move,info;
	private Regionals beg = new Regionals("beg");
	private Nationals mid = new Nationals("mid");
	private Internationals end = new Internationals("end");
	private Precomp practice = new Precomp("practice");
	private Map<String, String> hm = new HashMap<String, String>(); 
	
	Intermediate cami = new Intermediate("Cami", 17, "contemporary");
	Intermediate rich= new Intermediate("Richelle", 16, "acro");
	Intermediate tim = new Intermediate("Tim", 17, "hip hop");
	Intermediate act = new Intermediate();
	
	
	
	public Compviewer() {
		setSize(1000,1000);
		setLayout(new FlowLayout());
		addcomponents();
	}
	private void addcomponents() {
		characters = new JPanel();
		characters.setLayout(new FlowLayout());
		
		
		skills1 = new JPanel();
		skills1.setLayout(new FlowLayout());
		
		skills2 = new JPanel();
		skills2.setLayout(new FlowLayout());
				
		comp = new JPanel();
		comp.setLayout(new FlowLayout());
		
		pic = new JPanel();
		pic.setLayout(new FlowLayout());
		
		rules = new JPanel();
		rules.setLayout(new FlowLayout());
		
		
		// adding panels to frame
		
		add(characters);
		add(skills1);
		add(skills2);
		add(comp);
		add(pic);
		add(rules);
		
		
		
		
		info = new JLabel();
		info.setText("Select a dance character");
		
		move = new JLabel();
		nullpic(move);
		
		ch1 = new JButton();
		ch2 = new JButton();
		ch3 = new JButton();
		reg = new JButton();
		nat = new JButton();
		intl = new JButton();
		cartw = new JButton();
		cartw.setText("Cartwheel");
		cartw.addActionListener(this);
		handst = new JButton();
		handst.setText("Handstand");
		handst.addActionListener(this);
		walk = new JButton();
		walk.setText("Walkover");
		walk.addActionListener(this);
		handsp = new JButton();
		handsp.setText("Handspring");
		handsp.addActionListener(this);
		flip = new JButton();
		flip.setText("Flip");
		flip.addActionListener(this);
		aerial = new JButton();
		aerial.setText("Aeriel");
		aerial.addActionListener(this);
		kick = new JButton();
		kick.setText("Kick");
		kick.addActionListener(this);
		tilt = new JButton();
		tilt.setText("Tilt");
		tilt.addActionListener(this);
		illus = new JButton();
		illus.setText("Illusion");
		illus.addActionListener(this);
		turns = new JButton();
		turns.setText("Turns");
		turns.addActionListener(this);
		need = new JButton();
		need.setText("Needle");
		need.addActionListener(this);
		leap = new JButton();
		leap.setText("leap");
		leap.addActionListener(this);
		isol = new JButton();
		isol.setText("Isolation");
		isol.addActionListener(this);
		btwis = new JButton();
		btwis.setText("B-Twist");
		btwis.addActionListener(this);
		popp = new JButton();
		popp.setText("Popping");
		popp.addActionListener(this);
		headsp = new JButton();
		headsp.setText("Headspin");
		headsp.addActionListener(this);
		wind = new JButton();
		wind.setText("windmill");
		wind.addActionListener(this);
		headspr = new JButton();
		headspr.setText("Headspring");
		headspr.addActionListener(this);
		
		
		try {
			Toolkit forsch = Toolkit.getDefaultToolkit();
			URL fsch1= new URL("https://images.squarespace-cdn.com/content/v1/54db42d2e4b0408bd2444fab/1424096931355-WXG96AVN1N3HRZWQ9GX9/ke17ZwdGBToddI8pDm48kJhkLXSoGm19J4nlafYrnIhZw-zPPgdn4jUwVcJE1ZvWQUxwkmyExglNqGp0IvTJZUJFbgE-7XRK3dMEBRBhUpwD0jT5dfC9GKnHw9RDRN7RHVCn3JmxJ4AKU2zNDo2Vwy6KKHmzm9VEvEtQNgw37jc/image-asset.jpeg");
			Image mage = forsch.getImage(fsch1);
			mage = mage.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
			
			ImageIcon sch1 = new ImageIcon(mage);
			ch1.setIcon(sch1);
			
			
		} 
		catch (Exception ex) {
			;
		}
		
		
		try {
			Toolkit forsch = Toolkit.getDefaultToolkit();
			URL fsch1= new URL("https://img2.pngio.com/acro-dance-silhouette-acro-dance-silhouettes-png-150_225.png");
			Image mage = forsch.getImage(fsch1);
			mage = mage.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
			
			ImageIcon sch2 = new ImageIcon(mage);
			ch2.setIcon(sch2);
			
			
		} 
		catch (Exception ex) {
			;
		}
		try {
			Toolkit forsch = Toolkit.getDefaultToolkit();
			URL fsch1= new URL("https://i.pinimg.com/originals/f1/28/b4/f128b4769b6f2c2034a261aad0fad5cb.jpg");
			Image mage = forsch.getImage(fsch1);
			mage = mage.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
			
			ImageIcon sch3 = new ImageIcon(mage);
			ch3.setIcon(sch3);
			
			
		} 
		catch (Exception ex) {
			;
		}
		
		
		try {
			Toolkit forsch = Toolkit.getDefaultToolkit();
			URL fsch1= new URL("https://media.eventhubs.com/images/2019/01/30-socal-regionals-event-will-not-be-hosted-2019.jpg");
			Image mage = forsch.getImage(fsch1);
			mage = mage.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
			
			ImageIcon sch4 = new ImageIcon(mage);
			reg.setIcon(sch4);
			
			
		} 
		catch (Exception ex) {
			;
		}
		
		
			try {
				Toolkit forsch = Toolkit.getDefaultToolkit();
				URL fsch1= new URL("https://mark.trademarkia.com/logo-images/washington-nationals-baseball-club/nationals-78520879.jpg");
				Image mage = forsch.getImage(fsch1);
				mage = mage.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
				
				ImageIcon sch5 = new ImageIcon(mage);
				nat.setIcon(sch5);
				
				
			} 
			catch (Exception ex) {
				;
			}
			
			
			
				try {
					Toolkit forsch = Toolkit.getDefaultToolkit();
					URL fsch1= new URL("https://fbctlh.org/wp-content/uploads/INTERNATIONALS-WITH-FBCTLH-LOGO-MARK_2017.jpg");
					Image mage = forsch.getImage(fsch1);
					mage = mage.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
					
					ImageIcon sch6 = new ImageIcon(mage);
					intl.setIcon(sch6);
					
					
				} 
				catch (Exception ex) {
					;
				}
		//added characters to panel
		characters.add(ch1);
		characters.add(ch2);
		characters.add(ch3);
		
		//added skills to panel
		skills1.add(cartw);
		skills1.add(handst);
		skills1.add(walk);
		skills1.add(handsp);
		skills1.add(flip);
		skills1.add(aerial);
		skills1.add(kick);
		skills1.add(tilt);
		skills1.add(illus);
		skills2.add(turns);
		skills2.add(need);
		skills2.add(leap);
		skills2.add(isol);
		skills2.add(btwis);
		skills2.add(popp);
		skills2.add(headsp);
		skills2.add(wind);
		skills2.add(headspr);
		
		comp.add(reg);
		comp.add(nat);
		comp.add(intl);
		
		pic.add(move);
		rules.add(info);
		
		characters.revalidate();
		skills1.revalidate();
		skills2.revalidate();
		comp.revalidate();
		
		revalidate();
		
		
		
		
		

	

		
		
	}
	
	public void loadmap() {
		
		hm.put("cartwheel", "https://i.pinimg.com/originals/c2/70/0f/c2700f8b024431758249fcbe2e084318.jpg");
		hm.put("handstand", "https://i.pinimg.com/originals/0c/60/a2/0c60a2550a42f8570fe8b517613e7952.jpg");
		hm.put("walkover", "https://i.pinimg.com/originals/cd/8e/9d/cd8e9d57315ef6075e87420621a43d81.png");
		hm.put("handspring", "https://img.russelloliver.co.uk/270-_-325-_-70-_-getdrawings.com/img/silhouette-gymnastics-14.jpg");
		hm.put("flip", "https://b.kisscc0.com/20190415/fqw/kisscc0-silhouette-flip-somersault-cheerleading-somersaulting-man-silhouette-5cb50e9d0b4568.5717779515553696290462.png");
		hm.put("aerial", "https://webstockreview.net/images/gymnast-clipart-aerial-gymnastics-2.jpg");
		hm.put("kick", "https://i.pinimg.com/474x/8c/c4/10/8cc410d4fb8b8dcbe30b119756a56018.jpg");
		hm.put("tilt", "https://64.media.tumblr.com/616ca52a37672f6dc9ad7abebebf7e60/tumblr_nnjaxiMsq81use6w0o1_500.jpg");
		hm.put("illusion", "https://i.pinimg.com/originals/74/a8/9d/74a89d89fab8fded844bffb4bdae4a3c.png");
		hm.put("turns", "https://i.pinimg.com/originals/eb/2d/71/eb2d71d3743a2f6e0cff6df881ee7720.jpg");
		hm.put("needle", "https://thumbs.dreamstime.com/b/vector-hand-drawn-illustration-ballerina-silhouette-white-background-vector-isolated-dancer-girl-logo-sticker-logotype-130363398.jpg");
		hm.put("leap", "https://lh3.googleusercontent.com/proxy/0q51Q4HlBu5UVnMFQNlFbEnAy_vsQNXk16sOeO_zd3rOD4tv_UZiLPtWWHjx5FhNNsM0zn3gYjpGxJQJqvNHTNgpzWrULe4");
		hm.put("isolation", "https://www.clipartmax.com/png/middle/207-2079018_hip-hop-dancer-man-silhouette-dance.png");
		hm.put("btwist","https://i.pinimg.com/originals/4a/dd/6c/4add6c0203da31777c9d76cd549845b3.jpg" );
		hm.put("popping", "https://image.shutterstock.com/image-photo/silhouette-sequence-hip-hop-dancer-260nw-25266424.jpg");
		hm.put("headspin", "https://image.shutterstock.com/image-vector/hip-hop-dancer-silhouette-on-260nw-565056514.jpg");
		hm.put("windmill", "https://i.pinimg.com/originals/08/45/73/084573cfa72872a4064731ca3616d7d2.jpg");
		hm.put("headspring", "https://i.pinimg.com/474x/9b/90/19/9b90194b1cc5c491f8e969cbc9cf4363.jpg");
	}
	
	public void setmovepic(String moves) {
		loadmap();
		
		try {
			Toolkit forsch = Toolkit.getDefaultToolkit();
			URL fsch1= new URL(hm.get(moves));
			Image mage = forsch.getImage(fsch1);
			mage = mage.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
			
			ImageIcon sch1 = new ImageIcon(mage);
			move.setIcon(sch1);
			
			
		} 
		catch (Exception ex) {
			;
		}
		
		
	}
	
	public void nullpic(JButton x) {
		
			
			try {
				Toolkit forsch = Toolkit.getDefaultToolkit();
				URL fsch1= new URL("https://crh-white.com/wp-content/uploads/revslider/corona1/drawing.png");
				Image mage = forsch.getImage(fsch1);
				mage = mage.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
				
				ImageIcon sch1 = new ImageIcon(mage);
				x.setIcon(sch1);
				
				
			} 
			catch (Exception ex) {
				;
			}
		
	}
	
	public void nullpic(JLabel l) {
		
		
		try {
			Toolkit forsch = Toolkit.getDefaultToolkit();
			URL fsch1= new URL("https://crh-white.com/wp-content/uploads/revslider/corona1/drawing.png");
			Image mage = forsch.getImage(fsch1);
			mage = mage.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
			
			ImageIcon sch1 = new ImageIcon(mage);
			l.setIcon(sch1);
			
			
		} 
		catch (Exception ex) {
			;
		}
	
}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == ch1) {
			act = cami;
			nullpic(ch2);
			nullpic(ch3);
		} else if (e.getSource() == ch2) {
			act = rich;
			nullpic(ch3);
			nullpic(ch1);
		} else if (e.getSource() == ch3) {
			act = tim;
			nullpic(ch1);
			nullpic(ch2);
		}  else if (e.getSource() == reg) {
			info.setText(beg.Start(act));
			
		} else if (e.getSource() == nat) {
			info.setText(mid.Start(act));
			
		} else if (e.getSource() == intl) {
			info.setText(end.Start(act));
			
		}else if (e.getSource() == precomp) {
			info.setText(practice.Start(act));
			
		}
		else if (e.getSource() == cartw) {
			setmovepic("cartwheel");
			if (act.getreg() == "incomplete") {
				info.setText(beg.levelup(beg, act, "cartwheel"));
			} else if (act.getnat() == "incomplete" && act.getreg() =="complete") {
				info.setText(mid.levelup(beg, act, "cartwheel"));
				
			} else if (act.getnat() == "complete" && act.getintl() == "incomplete") {
				info.setText(end.levelup(beg, act, "cartwheel"));
			}
			
		} else if (e.getSource() == handst) {
			setmovepic("handstand");
			if (act.getreg() == "incomplete") {
				info.setText(beg.levelup(beg, act, "handstand"));
			} else if (act.getnat() == "incomplete" && act.getreg() =="complete") {
				info.setText(mid.levelup(beg, act, "handstand"));
				
			} else if (act.getnat() == "complete" && act.getintl() == "incomplete") {
				info.setText(end.levelup(beg, act, "handstand"));
			}
			
		} else if (e.getSource() == walk) {
			setmovepic("walkover");
			if (act.getreg() == "incomplete") {
				info.setText(beg.levelup(beg, act, "walkover"));
			} else if (act.getnat() == "incomplete" && act.getreg() =="complete") {
				info.setText(mid.levelup(beg, act, "walkover"));
				
			} else if (act.getnat() == "complete" && act.getintl() == "incomplete") {
				info.setText(end.levelup(beg, act, "walkover"));
			}
			
		} else if (e.getSource() == handsp) {
			setmovepic("handspring");
			if (act.getreg() == "incomplete") {
				info.setText(beg.levelup(beg, act, "handspring"));
			} else if (act.getnat() == "incomplete" && act.getreg() =="complete") {
				info.setText(mid.levelup(beg, act, "handspring"));
				
			} else if (act.getnat() == "complete" && act.getintl() == "incomplete") {
				info.setText(end.levelup(beg, act, "handspring"));
			}
			
		} else if (e.getSource() == flip) {
			setmovepic("flip");
			if (act.getreg() == "incomplete") {
				info.setText(beg.levelup(beg, act, "flip"));
			} else if (act.getnat() == "incomplete" && act.getreg() =="complete") {
				info.setText(mid.levelup(beg, act, "flip"));
				
			} else if (act.getnat() == "complete" && act.getintl() == "incomplete") {
				info.setText(end.levelup(beg, act, "flip"));
			}
			
		} else if (e.getSource() == aerial) {
			setmovepic("aerial");
			if (act.getreg() == "incomplete") {
				info.setText(beg.levelup(beg, act, "aerial"));
			} else if (act.getnat() == "incomplete" && act.getreg() =="complete") {
				info.setText(mid.levelup(beg, act, "aerial"));
				
			} else if (act.getnat() == "complete" && act.getintl() == "incomplete") {
				info.setText(end.levelup(beg, act, "aerial"));
			}
			
		} else if (e.getSource() == kick) {
			setmovepic("kick");
			if (act.getreg() == "incomplete") {
				info.setText(beg.levelup(beg, act, "kick"));
			} else if (act.getnat() == "incomplete" && act.getreg() =="complete") {
				info.setText(mid.levelup(beg, act, "kick"));
				
			} else if (act.getnat() == "complete" && act.getintl() == "incomplete") {
				info.setText(end.levelup(beg, act, "kick"));
			}
			
		} else if (e.getSource() == tilt) {
			setmovepic("tilt");
			if (act.getreg() == "incomplete") {
				info.setText(beg.levelup(beg, act, "tilt"));
			} else if (act.getnat() == "incomplete" && act.getreg() =="complete") {
				info.setText(mid.levelup(beg, act, "tilt"));
				
			} else if (act.getnat() == "complete" && act.getintl() == "incomplete") {
				info.setText(end.levelup(beg, act, "tilt"));
			}
			
		} else if (e.getSource() == illus) {
			setmovepic("illusion");
			if (act.getreg() == "incomplete") {
				info.setText(beg.levelup(beg, act, "illusion"));
			} else if (act.getnat() == "incomplete" && act.getreg() =="complete") {
				info.setText(mid.levelup(beg, act, "illusion"));
				
			} else if (act.getnat() == "complete" && act.getintl() == "incomplete") {
				info.setText(end.levelup(beg, act, "illusion"));
			}
			
		} else if (e.getSource() == turns) {
			setmovepic("turns");
			if (act.getreg() == "incomplete") {
				info.setText(beg.levelup(beg, act, "turns"));
			} else if (act.getnat() == "incomplete" && act.getreg() =="complete") {
				info.setText(mid.levelup(beg, act, "turns"));
				
			} else if (act.getnat() == "complete" && act.getintl() == "incomplete") {
				info.setText(end.levelup(beg, act, "turns"));
			}
			
		} else if (e.getSource() == need) {
			setmovepic("needle");
			if (act.getreg() == "incomplete") {
				info.setText(beg.levelup(beg, act, "needle"));
			} else if (act.getnat() == "incomplete" && act.getreg() =="complete") {
				info.setText(mid.levelup(beg, act, "needle"));
				
			} else if (act.getnat() == "complete" && act.getintl() == "incomplete") {
				info.setText(end.levelup(beg, act, "needle"));
			}
			
		}  
			 else if (e.getSource() == leap) {
				 setmovepic("leap");
			if (act.getreg() == "incomplete") {
				info.setText(beg.levelup(beg, act, "switch leap"));
			} else if (act.getnat() == "incomplete" && act.getreg() =="complete") {
				info.setText(mid.levelup(beg, act, "switch leap"));
				
			} else if (act.getnat() == "complete" && act.getintl() == "incomplete") {
				info.setText(end.levelup(beg, act, "switch leap"));
			}
			
		} else if (e.getSource() == isol) {
			setmovepic("isolation");
			if (act.getreg() == "incomplete") {
				info.setText(beg.levelup(beg, act, "isolation"));
			} else if (act.getnat() == "incomplete" && act.getreg() =="complete") {
				info.setText(mid.levelup(beg, act, "isolation"));
				
			} else if (act.getnat() == "complete" && act.getintl() == "incomplete") {
				info.setText(end.levelup(beg, act, "isolation"));
			}
			
		} else if (e.getSource() == btwis) {
			setmovepic("btwist");
			if (act.getreg() == "incomplete") {
				info.setText(beg.levelup(beg, act, "btwis"));
			} else if (act.getnat() == "incomplete" && act.getreg() =="complete") {
				info.setText(mid.levelup(beg, act, "isolation"));
				
			} else if (act.getnat() == "complete" && act.getintl() == "incomplete") {
				info.setText(end.levelup(beg, act, "isolation"));
			}
			
		} else if (e.getSource() == popp) {
			setmovepic("popping");
			if (act.getreg() == "incomplete") {
				info.setText(beg.levelup(beg, act, "popping"));
			} else if (act.getnat() == "incomplete" && act.getreg() =="complete") {
				info.setText(beg.levelup(beg, act, "popping"));
				
			} else if (act.getnat() == "complete" && act.getintl() == "incomplete") {
				info.setText(beg.levelup(beg, act, "popping"));
			}
			
		}   else if (e.getSource() == headsp) {
			setmovepic("headspin");
			if (act.getreg() == "incomplete") {
				info.setText(beg.levelup(beg, act, "headspin"));
			} else if (act.getnat() == "incomplete" && act.getreg() =="complete") {
				info.setText(mid.levelup(beg, act, "headspin"));
				
			} else if (act.getnat() == "complete" && act.getintl() == "incomplete") {
				info.setText(end.levelup(beg, act, "headspin"));
			}
			
		} else if (e.getSource() == wind) {
			setmovepic("windmill");
			if (act.getreg() == "incomplete") {
				info.setText(beg.levelup(beg, act, "windmill"));
			} else if (act.getnat() == "incomplete" && act.getreg() =="complete") {
				info.setText(mid.levelup(beg, act, "windmill"));
				
			} else if (act.getnat() == "complete" && act.getintl() == "incomplete") {
				info.setText(end.levelup(beg, act, "windmill"));
			}
			
		} else if (e.getSource() == headspr) {
			setmovepic("headspring");
			if (act.getreg() == "incomplete") {
				info.setText(beg.levelup(beg, act, "headspring"));
			} else if (act.getnat() == "incomplete" && act.getreg() =="complete") {
				info.setText(mid.levelup(beg, act, "headspring"));
				
			} else if (act.getnat() == "complete" && act.getintl() == "incomplete") {
				info.setText(end.levelup(beg, act, "headspring"));
			}
			
		} 
		
		
	}
	
	public void showWindow() {
		setVisible(true);
		setTitle("Dance competition");
	}

}
