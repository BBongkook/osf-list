package osf.adrlist;

import java.util.HashMap;
import java.util.Map;

import osf.adrlist.controller.AddressController;

public class Execute {

	public static void main(String[] args) {
		AddressController ac = new AddressController();
		Map<String,String> req = new HashMap<>();
		Map<String,Object> res = new HashMap<>();
		
//		req.put("cmd","address");
//		req.put("number","063");
//		ac.doGet(req, res);
//		System.out.println(res);
		

		
//		req.put("이름","하자차");
//		req.put("주소", "제주도");
//		req.put("전화번호","030");
//		ac.doPost(req, res);
//		System.out.println(res);
//		
//		req.put("cmd","addresslist");
//		ac.doGet(req, res);
//		System.out.println(res);
		
//		req.put("cmd", "update");
//		req.put("name", "가나다");
//		req.put("number", "066");
//		ac.doPost(req, res);
		
		req.put("cmd","delete");
		req.put("name","사아자");
		ac.doPost(req, res);
		System.out.println(res);
		
		req.put("cmd","addresslist");
		ac.doGet(req, res);
		System.out.println(res);
	}
}
