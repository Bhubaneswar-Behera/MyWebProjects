package in.ashokit.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * 
 * @author Bhubaneswar Behera @date 25-Jun-2022
 *
 */
//@Repository("mySQL")
@Repository
@Primary
public class MySQLDaoImpl implements ReportDao {
	
	public MySQLDaoImpl() {
		System.out.println("ReportDaoImpl :: Constructor");
	}
	
	
	public String findData() {
		System.out.println("Fetching report data from MySQLDaoImpl ...");
		return "Report Data";
	}

}
