package generics;

import static generics.GenericUtils.*;

import java.util.Arrays;
import java.util.LinkedList;

import com.app.core.HRMgr;
import com.app.core.Mgr;
import com.app.core.SalesMgr;

public class Test6 {

	public static void main(String[] args) {
		// LL<TempWorker> , Vector<SM>
		LinkedList<Mgr> mgrs = new LinkedList<>(Arrays.asList(new SalesMgr(1000), new HRMgr(1100)));
		addMgr(mgrs, new SalesMgr(3456));
		addMgr(mgrs, new HRMgr(3457));
		addMgr(mgrs, new Mgr(100));
		
	}

}
