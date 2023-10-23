package com.cg.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.cg.dao.MobileDao;
import com.cg.entity.Mobile;

@Service
public class MobileService implements MobileDao {
	List<Mobile> MobileList = new ArrayList<>();

	@Override
	public String addMobile(Mobile mobile) {
		MobileList.add(mobile);
		return "Mobile added successfully";

	}

	@Override
	public List<Mobile> getallMobiles() {

		return MobileList;
	}
}
