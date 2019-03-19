package osf.adrlist.dao.impl;

import java.util.List;
import java.util.Map;

import osf.adrlist.dao.AddressDAO;
import osf.adrlist.data.AddressData;

public class AddressDAOImpl implements AddressDAO {

	@Override
	public List<Map<String, String>> selectAddressList() {
		return AddressData.ADDRESS_LIST;
	}

	@Override
	public Map<String, String> selectAddress(Map<String, String> address) {
		for(int i=0; i<AddressData.ADDRESS_LIST.size(); i++) {
			Map<String,String> a = AddressData.ADDRESS_LIST.get(i);
			if(a.get("전화번호").equals(address.get("전화번호"))) {
				return a;
			}
		}
		return null;
	}

	@Override
	public boolean insertAddress(Map<String, String> address) {
		// TODO Auto-generated method stub
		return AddressData.ADDRESS_LIST.add(address);
	}

	@Override
	public boolean updateAddress(Map<String, String> address) {
		for(int i=0; i<AddressData.ADDRESS_LIST.size(); i++) {
			Map<String, String> a = AddressData.ADDRESS_LIST.get(i);
			if(a.get("이름").equals(address.get("이름"))) {
				if(address.get("주소")!=null) {
					a.put("주소", address.get("주소"));
				}
				if(address.get("전화번호")!=null) {
					a.put("전화번호", address.get("전화번호"));
				}
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteAddress(Map<String, String> address) {
		for(int i=0; i<AddressData.ADDRESS_LIST.size(); i++) {
			Map<String, String> m = AddressData.ADDRESS_LIST.get(i);
			if(m.get("이름").equals(address.get("이름"))) {
				AddressData.ADDRESS_LIST.remove(i);
				return true;
			}
		}
		return false;
	}
}
