package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import in.ashokit.dao.ReportDao;

/**
 * 
 * @author Bhubaneswar Behera @date 25-Jun-2022
 *
 */
@Service
public class ReportService {
	
	private ReportDao reportDao;
	
	/*@Autowired
	//@Qualifier("oracle")
	public void setReportDao(ReportDao reportDao) {
		System.out.println("setReportDao() called");
		this.reportDao = reportDao;
	}*/
	
	/**
	 * 0-param constrcutor is by default called when there are more than 1 constructor
	 * 
	 */
	public ReportService() {
		System.out.println("ReportService :: 0-param constructor called");
	}
	@Autowired
	public ReportService(ReportDao reportDao) {
		System.out.println("ReportService :: param constructor called");
		this.reportDao = reportDao;
	}
	
	public void generateReport() {
		reportDao.findData();
		System.out.println("Generating report ....");
	}

}
