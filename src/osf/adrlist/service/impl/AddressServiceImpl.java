package osf.adrlist.service.impl;

import java.util.List;
import java.util.Map;

import osf.adrlist.dao.AddressDAO;
import osf.adrlist.dao.impl.AddressDAOImpl;
import osf.adrlist.service.AddressService;

public class AddressServiceImpl implements AddressService {
		AddressDAO ado = new AddressDAOImpl();

	@Override
	public List<Map<String, String>> selectAddressList() {
		// TODO Auto-generated method stub
		return ado.selectAddressList();
	}

	@Override
	public Map<String, String> selectAddress(Map<String, String> address) {
		// TODO Auto-generated method stub
		return ado.selectAddress(address);
	}

	@Override
	public boolean insertAddress(Map<String, String> address) {
		// TODO Auto-generated method stub
		return ado.insertAddress(address);
	}

	@Override
	public boolean updateAddress(Map<String, String> address) {
		// TODO Auto-generated method stub
		return ado.updateAddress(address);
	}

	@Override
	public boolean deleteAddress(Map<String, String> address) {
		// TODO Auto-generated method stub
		return ado.deleteAddress(address);
	}

}
