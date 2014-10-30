package com.softeem.train.dao1;

import com.softeem.train.dto.RevertDTO;

public interface RevertDAO {

	boolean revert(RevertDTO rt);

	RevertDTO findInfoById(int parseInt);

}
