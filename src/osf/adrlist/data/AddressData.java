package osf.adrlist.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddressData {

	public static final List<Map<String,String>> ADDRESS_LIST = new ArrayList<>();

	static {
		Map<String,String> map = new HashMap<>();
		map.put("이름","가나다");
		map.put("주소","경기도");
		map.put("전화번호","031");
		ADDRESS_LIST.add(map);
		
		map = new HashMap<>();
		map.put("이름","라마바");
		map.put("주소","강원도");
		map.put("전화번호","033");
		ADDRESS_LIST.add(map);
		
		map = new HashMap<>();
		map.put("이름","사아자");
		map.put("주소","충청도");
		map.put("전화번호","043");
		ADDRESS_LIST.add(map);
		
		map = new HashMap<>();
		map.put("이름","차카타");
		map.put("주소","전라도");
		map.put("전화번호","063");
		ADDRESS_LIST.add(map);
	}
	
}
