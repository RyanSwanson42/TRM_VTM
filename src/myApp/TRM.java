package myApp;

import dao.vt.vendorDetail.VendorDetailDAO;
import dao.vt.vendorTrainingRequest.VendorTrainingRequestDAO;

public class TRM {

	public static void main(String[] args) {
		//----------------- Vendor Training Request DAO ---------------------//
		// Get all vendor training requests
		VendorTrainingRequestDAO vtr = new VendorTrainingRequestDAO();
		System.out.println(vtr.getAllVendorTrainingRequests().toString());
		
		//--------------------- Vendor Details DAO --------------------------//
		// Get all vendor details
		VendorDetailDAO vdd = new VendorDetailDAO();
		System.out.println(vdd.getAllVendorDetail());
		
		// Get Vendor Details by Vendor Training Request Id
		System.out.println(vdd.getVendorByVendorName("Vendor1").toString());
		
	}

}
