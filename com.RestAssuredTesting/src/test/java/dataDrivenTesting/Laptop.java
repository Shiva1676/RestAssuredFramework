/**
 * 
 */
package dataDrivenTesting;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonFormat.Features;

/**
 * @author Lenovo
 *
 */
@XmlRootElement(name = "Laptop")
public class Laptop {

	private String BrandName;

	private String Id;

	private String LaptopName;

	private Features features;
	
	@XmlElement(name = "Features")
	public Features getFeatures() {
		return features;
	}

	public void setFeatures(Features features) {
		this.features = features;
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

	@XmlElement(name= "LaptopName")
	public String getLaptopName() {
		return LaptopName;
	}

	public void setLaptopName(String laptopName) {
		LaptopName = laptopName;
	}

}
