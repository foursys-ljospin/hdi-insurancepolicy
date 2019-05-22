package com.hdi.crm.insurance.dao;

import com.hdi.crm.insurance.api.dto.InteractionLog;
import com.hdi.crm.insurance.api.dto.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InteractionLogDao implements Dao<ResponseDto> {

    @Autowired
    JdbcTemplate jdbcTemplate;


    public List<ResponseDto> get(Long idInsurancePolicy, String xCompanyId, String xApplicationId, String xUserId) {
        String query = getQuery();
        return jdbcTemplate.query(query, new Object[]{idInsurancePolicy, xCompanyId, xApplicationId, xUserId}, new InteractionLogMapExtractor());
    }

    @Override
    public String getQuery() {
        StringBuilder query = new StringBuilder();
        query.append("select a.\"dat-movimentacao\" as Data,")
                .append("a.\"hor-movimentacao\" as Hora,")
                .append("a.\"user-id\" as Usuario,")
                .append("a.\"hor-inicio\" as Hora_Inicial,")
                .append("a.\"hor-final\" as Hora_Final,")
                .append("a.\"cod-motivo\" as Cod_Motivo,")
                .append("b.\"des-motivo\" as Des_Motivo,")
                .append("b.\"flg-agenda-interna\" as Flag_Agenda_Interna,")
                .append("a.\"ofi-num-protocolo\" as Protocolo,")
                .append("a.\"des-comentario\" as Descricao")
                .append("from pub.islogsin a")
                .append("inner join bas.pub.ismotlogsin b on b.\"cod-motivo\" = a.\"cod-motivo\"")
                .append("where b.\"cod-motivo\" <> '0'")
                .append("and a.\"seq-siniuss\" = '010683151416127'")
                .append("order by a.\"dat-movimentacao\"  desc");
        return query.toString();
    }
}
