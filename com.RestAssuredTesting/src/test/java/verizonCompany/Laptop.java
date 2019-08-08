/**
 * 
 */
package verizonCompany;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Lenovo
 *
 */

@XmlRootElement(name = "Laptop")
public class Laptop {

	private String BrandName;

	private String Id;

	private String LaptopName;

	private Features feature;

	@XmlElement(name = "Feature")
	public Features getFeature() {
		return feature;
	}

	public void setFeature(Features feature) {
		this.feature = feature;
	}

	@XmlElement(name = "BrandName")
	public String getBrandName() {
		return BrandName;
	}

	public void setBrandName(String brandName) {
		BrandName = brandName;
	}

	@XmlElement(name = "Id")
	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	@XmlElement(name = "LaptopName")
	public String getLaptopName() {
		return LaptopName;
	}

	public void setLaptopName(String laptopName) {
		LaptopName = laptopName;
	}

}
