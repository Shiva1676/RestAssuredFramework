package dataDrivenTesting;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class Features {

	private List<String> list;

	public Features() {

		list = new ArrayList<String>();
	}

	@XmlElement(name = "feature")
	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

}
