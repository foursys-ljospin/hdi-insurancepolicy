package com.hdi.crm.insurance.dao;

import com.hdi.crm.insurance.api.dto.InteractionLog;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class InteractionLogMapExtractor implements ResultSetExtractor<List<InteractionLog>> {

    @Override
    public List<InteractionLog> extractData(ResultSet resultSet) throws SQLException {
        List<InteractionLog> interations = new ArrayList<>();
        while (resultSet.next()) {
            InteractionLog interation = new InteractionLog();
            interations.add(interation);
        }
        return interations;
    }
}
