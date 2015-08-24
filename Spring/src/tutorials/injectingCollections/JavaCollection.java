package tutorials.injectingCollections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class JavaCollection {

	private List addressList;
	private Map addressMap;
	private Set addressSet;
	private Properties addressProperties;
	
	
	public List getAddressList() {
		System.out.println("List Elements :"  + addressList);
		return addressList;
	}
	public Map getAddressMap() {
		System.out.println("List Elements :"  + addressMap);
		return addressMap;
	}
	public Set getAddressSet() {
		System.out.println("List Elements :"  + addressSet);
		return addressSet;
	}
	public Properties getAddressProperties() {
		System.out.println("Property Elements : " + addressProperties);
		return addressProperties;
	}
	
	public void setAddressList(List addressList) {
		this.addressList = addressList;
	}
	public void setAddressMap(Map addressMap) {
		this.addressMap = addressMap;
	}
	public void setAddressSet(Set addressSet) {
		this.addressSet = addressSet;
	}
	public void setAddressProperties(Properties props) {
		this.addressProperties = props;
	}
}
