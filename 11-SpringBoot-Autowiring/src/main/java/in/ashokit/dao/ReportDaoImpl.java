package in.ashokit.dao;

import org.springframework.stereotype.Repository;

/**
 * 
 * @author Bhubaneswar Behera @date 25-Jun-2022
 *
 */
@Repository
public class ReportDaoImpl implements ReportDao {
	
	public ReportDaoImpl() {
		System.out.println("ReportDaoImpl :: Constructor");
	}
	
	
	public String findData() {
		System.out.println("Fetching report data ...");
		return "Report Data";
	}
}
