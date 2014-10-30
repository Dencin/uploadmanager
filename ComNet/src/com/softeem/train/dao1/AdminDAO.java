package com.softeem.train.dao1;

import java.util.List;

import com.softeem.train.dto.AdminDTO;

public interface AdminDAO {

	boolean valiLogin(AdminDTO admin);

	boolean addAdmin(AdminDTO at);

	List<AdminDTO> allAdmin();

	boolean deleteById(int userID);

	boolean valiReg(String userName);

}
