package dao.vt.vendorDetail;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class VendorDetailDAO {

	ApplicationContext context;
	JdbcTemplate temp;
	
	public VendorDetailDAO() {
		context = new ClassPathXmlApplicationContext("spring-config.xml");
		temp = (JdbcTemplate) context.getBean("db");
	}
	
	public List<VendorDetail> getAllVendorDetail() {
		String sql = "select * from vendor_details";
		List<VendorDetail> VendorDetailList = temp.query(sql, new VendorDetailMapper());
		return VendorDetailList; 
	}
	
	public List<VendorDetail> getVendorByVendorName(String vendorName) {
		String sql = "select * from vendor_details where vendor_name = ?";
		List <VendorDetail> vd = temp.query(sql, new Object[]{vendorName}, new VendorDetailMapper());
		return vd;
	}
}
