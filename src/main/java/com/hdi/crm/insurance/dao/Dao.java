package com.hdi.crm.insurance.dao;

import java.util.List;

public interface Dao<T> {

    public List<T> get(Long idInsurancePolicy, String xCompanyId, String xApplicationId, String xUserId);

    public String getQuery();

}
