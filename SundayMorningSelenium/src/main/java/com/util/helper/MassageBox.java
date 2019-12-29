package com.util.helper;

import java.awt.Color;
import java.awt.Dimension;

import javax.print.DocFlavor.URL;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.html.HTML;

public class MassageBox {

	
		    public static String getMsgBox(String infoMessage, String titleBar) throws Throwable
		    {
		        //JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
//		        JLabel label = new JLabel(infoMessage);
//		        label.setFont(new Font("Arial", Font.BOLD, 18));
//		        JOptionPane.showMessageDialog(null,label,titleBar,JOptionPane.YES_NO_CANCEL_OPTION);
		    	 JTextPane jtp = new JTextPane();
		    	 Document doc = jtp.getDocument();
		    	    for (int i = 0; i < 50; i++) {
		    	        doc.insertString(doc.getLength(), " Hello Java World ", new SimpleAttributeSet());
		    	        if ((3 == i) || (7 == i) || (15 == i)) {
		    	            doc.insertString(doc.getLength(), " Hello Java World ", new SimpleAttributeSet());
		    	            SimpleAttributeSet attrs = new SimpleAttributeSet();
		    	            StyleConstants.setUnderline(attrs, true);
		    	            StyleConstants.setForeground(attrs, Color.BLUE);
		    	            String text = "www.google.com";
		    	            URL url = new URL("http://" + text);
		    	            attrs.addAttribute(HTML.Attribute.HREF, url.toString());
		    	            doc.insertString(doc.getLength(), text, attrs);
		    	        }
		    	    }
		    	 jtp.setSize(new Dimension(380, 10));
		    	 jtp.setPreferredSize(new Dimension(380, jtp.getPreferredSize().height));
		     //   JOptionPane.showMessageDialog(null,  "<html><font face='Calibri' size='15' color='red'>Hello");
		        
		        JOptionPane.showMessageDialog(null, jtp, "Title", JOptionPane.INFORMATION_MESSAGE);
		        return infoMessage;
		    }
		
		    public static void main(String[] args) throws Throwable {
		    	MassageBox.getMsgBox("Error", "Alert Popuo::01");
			}

	}


