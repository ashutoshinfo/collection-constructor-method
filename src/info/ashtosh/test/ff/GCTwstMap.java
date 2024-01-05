package info.ashtosh.test.ff;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class GCTwstMap {

	public static void main(String[] args) throws InterruptedException {
		TEmre emre = new TEmre();
		IdentityHashMap<TEmre, String> hashMap = new IdentityHashMap<>();
		hashMap.put(emre, "DUrga");
		System.out.println(hashMap);
		emre = null;
		System.gc();
//		Thread.sleep(30000);
		System.out.println(hashMap);
		
		for (int i = 0; i < 32; i++) {
			System.out.println("<section class=\"saturday\" >\r\n"
					+ "        <div class=\"left-box\"></div>\r\n"
					+ "        <div class=\"section-number\">"+i+"</div>\r\n"
					+ "    </section>");
		}

	}

}

class TEmre {

	@Override
	public String toString() {
		return "TEmre";
	}

}
