package osf.list;

import java.util.HashMap;
import java.util.Map;

import osf.list.controller.FoodController;

// osf.list
//  - controller
//	- dao 데이터에 접근하는 오브젝트 / cf) Repository
//	- service
//	- vo 테이블과 1:1로 되는애
public class Execute {
	public static void main(String[] args) {
		FoodController fc = new FoodController();
		Map<String,String> req = new HashMap<>();
		Map<String,Object> res = new HashMap<>();
//		req.put("cmd","food");
//		req.put("number","2");
//		fc.doGet(req, res);
//		System.out.println(res);
		
//		req.put("cmd","insert");
//		req.put("number","5");
//		req.put("name","라면");
//		req.put("price","900");
//		fc.doPost(req, res);
//		
//		System.out.println(res);
//		
//		req = new HashMap<>();
//		res = new HashMap<>();
//		req.put("cmd","update");
//		req.put("number","4");
//		req.put("name","해장국");
//		fc.doPost(req,res);
		
//		req = new HashMap<>();
//		res = new HashMap<>();
//		req.put("cmd","delete");
//		req.put("number","2");
//		fc.doPost(req, res);
//		System.out.println(res);
//		
		req.put("cmd","insert");
		req.put("number","2");
		req.put("name","갈비");
		req.put("price","40000");
		fc.doPost(req, res);
		
		
		req.put("cmd","foodlist");
		fc.doGet(req, res);
		System.out.println(res);
//		
	}
}
