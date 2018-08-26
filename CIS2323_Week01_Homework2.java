import javax.swing.JTextArea;
import javax.swing.JFrame;

public class CIS2323_Week01_Homework2 {
	public static void main(String[] args){
		
		JFrame frame = new JFrame ("Kevin Tran");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextArea textArea = new JTextArea(
				"----------------------------------------------\n"+
				"                    Kevin Tran\n"+                   
				"       kevin115533@yahoo.com\n"+
				"             Phone:405-926-0131\n" +
				"         github.com/kevin115533\n"+
				"           Student , OSU - OKC\n"+ 
				"----------------------------------------------" 
				,7,17);
				
				textArea.setLineWrap(true);
				textArea.setWrapStyleWord(true);
				textArea.setEditable(false);
		
				frame.add(textArea);
				frame.pack();
				frame.setVisible(true);		
	}
}