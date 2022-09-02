package oops;

public class FileWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String str = "hello this is file handling in java";
	        FileWriter fwrt = new FileWriter();
	    for(int i=0;i<str.length();i++)
	    {
	        
	        fwrt.write(str.charAt(i));
	    }
	    fwrt.close();
		}

	
	}


