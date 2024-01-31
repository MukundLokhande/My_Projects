package com.mukund.springBoot;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloudvendor") //contextPath to return request
public class CloudVendorAPIService
{
	CloudVendor cloudVendor;
	@GetMapping("{vendorId}") 
	public CloudVendor getCloudVendorDetails(String vendorId)
	{
		return cloudVendor;
		//return new CloudVendor("C1","Vendor 1","Address One", "xxxxx");
	}
	
	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
	{
		this.cloudVendor = cloudVendor;
		return "Cloud vendor Created Successfully";
	}
	
	@PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
	{
		this.cloudVendor = cloudVendor;
		return "Cloud vendor Updated Successfully";
	}
	
	@DeleteMapping("{vendorId}")
	public String deleteCloudVendorDetails(String vendorId)
	{
		this.cloudVendor = null;
		return "Cloud vendor Deleted Successfully";
	}
}