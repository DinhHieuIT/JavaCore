package sinhvien;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class SinhvienDao {
	
	private static final String TEN_FILE= "quanlysinhvien.txt";
	
	public void  viet (List<Sinhvien> danhsachsinhvien) {
		
		FileOutputStream fos = null;
		ObjectOutputStream oos=null;
		
		try {
			fos = new FileOutputStream(new File(TEN_FILE));
			oos = new ObjectOutputStream(fos);
			oos.writeObject(danhsachsinhvien);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (EOFException eof) {
			
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			closeStream(fos);
			closeStream(oos);
		}
		
	}
	
	public List<Sinhvien> doc(){
		
		List<Sinhvien> danhsachsinhvien = new ArrayList<>();
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		
		try {
			fis = new FileInputStream(new File(TEN_FILE));
			ois = new ObjectInputStream(fis);
			danhsachsinhvien = (List<Sinhvien>) ois.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (EOFException eof) {
			System.out.println("Sao khong thay gì");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			closeStream(fis);
			closeStream(ois);
		}
		
		return danhsachsinhvien;
		
	}
	private void closeStream(OutputStream tontaifile) {
		if (tontaifile != null) {
			try {
				tontaifile.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	}
	
	private void closeStream(InputStream tontaifile) {
		if (tontaifile != null) {
			try {
				tontaifile.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
