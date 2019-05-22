package com.hdi.crm.insurance.dao;

import com.hdi.crm.insurance.api.dto.DomainData;
import com.hdi.crm.insurance.api.dto.InteractionLog;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;

public class InteractionLogMapExtractor implements ResultSetExtractor<List<InteractionLog>> {

    @Override
    public List<InteractionLog> extractData(ResultSet resultSet) throws SQLException {
        List<InteractionLog> interations = new ArrayList<>();
        while (resultSet.next()) {
            InteractionLog interation = new InteractionLog();
            interation.setCreationDateTime(convertDateTime(resultSet.getDate("Data"), resultSet.getTime("Hora")));
            interation.setDescription(resultSet.getString("Descricao"));
            interation.setProtocolCode(resultSet.getString("Protocolo"));
            interation.setReason(convertDomainData(resultSet.getString("Cod_Motivo"), resultSet.getString("Des_Motivo")));
            interations.add(interation);
        }
        return interations;
    }

    private DomainData convertDomainData(String cod_motivo, String des_motivo) {
        DomainData domainData = new DomainData();
        domainData.setId(cod_motivo);
        domainData.setDescription(des_motivo);
        return domainData;
    }

    private OffsetDateTime convertDateTime(Date date, Time time) {
        LocalDate localDate = date.toLocalDate();
        LocalTime localTime = time.toLocalTime();

        return OffsetDateTime.of(localDate, localTime, ZoneOffset.of(ZoneOffset.systemDefault().getId()));
    }
}
