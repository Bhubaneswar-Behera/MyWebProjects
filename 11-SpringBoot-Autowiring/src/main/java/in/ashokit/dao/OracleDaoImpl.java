package in.ashokit.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * 
 * @author Bhubaneswar Behera @date 25-Jun-2022
 *
 */
//@Repository("oracle")
@Repository
public class OracleDaoImpl  implements ReportDao {
	
	public OracleDaoImpl() {
		System.out.println("OracleDaoImpl :: Constructor");
	}
	
	
	public String findData() {
		System.out.println("Fetching report data from OracleDaoImpl ...");
		return "Report Data";
	}

}
