package com.cell.dao;

import java.util.List;

import com.cell.model.Risk;

public interface RiskDao extends GenericDao<Risk, Integer>{

	public List<Risk> findByProjectId(int projectId);
}
