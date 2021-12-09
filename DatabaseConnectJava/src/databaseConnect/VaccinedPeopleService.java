package databaseConnect;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//ORM (Object Relational Mapping : Kỹ thuật thực hiện ánh xạ cơ sở dữ liệu cơ sở dữ liệu 
//sang các đối tượng trong các ngôn ngữ lập trình .
//Hibernate là một trong những ORM phổ biến
public class VaccinedPeopleService {
	//SessionFactory là interface giúp tạo ra kết nối đến database bằng cách đọc Hibernate Config.
	private static SessionFactory factory =new Configuration().configure().buildSessionFactory();
	
	public Integer addPeople(String name, String phone, String address) {
		Session session = factory.openSession();
		//Transaction bảo đảm tính toàn vẹn của dữ liệu ,nếu có 1 lỗi xảy ra thì các tác vụ thực hiện thất bại
		Transaction ts = null;
		Integer id = null;
		try {
			ts = session.beginTransaction();
			VaccinedPeople vaccinePeople = new VaccinedPeople(name,phone,address);
			id = (Integer) session.save(vaccinePeople);
			ts.commit();
		} catch (HibernateException e) {
			if(ts !=null)
			ts.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}
		return id;
	}
	
	public void showList(List<VaccinedPeople> arr) {
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i).toString());
		}
	}

}
