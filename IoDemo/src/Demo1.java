import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) {
		try {
			String path1 = "D:\\io\\input.txt";
			String path2 = "D:\\io\\output.txt";

			FileReader fr = new FileReader(path1);
			FileWriter fw = new FileWriter(path2);
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);
			
			String a;
			
			while((a=br.readLine())!=null) {
				bw.write(a);
			}
			bw.flush();
			br.close();
			bw.close();
			fr.close();
			fw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
