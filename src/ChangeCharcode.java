import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;


public class ChangeCharcode {

	public static void main(String[] args) {
		BufferedReader isr = null;
		try {
			isr = new BufferedReader(new InputStreamReader(new FileInputStream("c:\\2.txt"), "GBK"));
			String str = null;
			while((str = isr.readLine()) != null){
				System.out.println(str);
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
				try {
					if(isr != null)
						isr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

	}

}
