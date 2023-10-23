package com.cg.dao;

import java.util.List;
import com.cg.entity.Mobile;

public interface MobileDao {

	public String addMobile(Mobile mobile);
	public List<Mobile> getallMobiles();
}
