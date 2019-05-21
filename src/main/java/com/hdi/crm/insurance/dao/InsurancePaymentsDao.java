package com.hdi.crm.insurance.dao;

import com.hdi.crm.insurance.api.dto.InsurancePolicyPayments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InsurancePaymentsDao implements Dao<InsurancePolicyPayments>{

    @Autowired
    JdbcTemplate jdbcTemplate;


    public List<InsurancePolicyPayments> get(Long idInsurancePolicy, String xCompanyId, String xApplicationId, String xUserId) {
        String query = getQuery();
        return jdbcTemplate.query(query, new Object[]{idInsurancePolicy, xCompanyId, xApplicationId, xUserId}, new InsurancePaymentsMapExtractor());
    }

    public String getQuery() {
        StringBuilder query = new StringBuilder();
        query.append("select a.\"cod-empresa\" as Cod_Empresa,")
                .append("a.\"cod-sucursal\" as Cod_Sucursal,")
                .append("a.\"cod-carteira\" as Cod_Carteira,")
                .append("a.\"seq-apolice\" as Num_Apolice,")
                .append("a.\"seq-endosso\" as Num_Endosso,")
                .append("a.\"seq-parcela\" as Num_Parcela,")
                .append("a.\"vlr-a-rec\" as VL_Recxeber,")
                .append("a.\"vlr-receb\" as VL_Pago,")
                .append("b.\"descmoeda\" as Moeda,")
                .append("a.\"dt-a-rec\" as DT_Receber,")
                .append("a.\"dtreceb\" as DT_Pago,")
                .append("case when a.\"dtreceb\" <= a.\"dt-a-rec\" then 'Pago em dia'")
                .append("when a.\"dtreceb\" >= a.\"dt-a-rec\" then 'Pago em Atraso'")
                .append("when a.\"dtreceb\" >= SYSDATE() then 'Em Aberto'")
                .append("when a.\"dtreceb\" <= SYSDATE() then 'Vencido' else '' end as Status,")
                .append("case when a.\"tip-cobranca\" = 'D' then 'Debito em conta'")
                .append("when a.\"tip-cobranca\" = 'S' then 'Boleto sem registro'")
                .append("when a.\"tip-cobranca\" = 'R' then 'Boleto com registro'")
                .append("when a.\"tip-cobranca\" = 'C' then 'Cartao de credito'")
                .append("when a.\"tip-cobranca\" = 'N' then 'Boleto OCT'")
                .append("when a.\"tip-cobranca\" = 'M' then 'OCT - Boleto parcela antecipada' else '' end as Tipo_Pagamento")
                .append("from fin.pub.rbregper a")
                .append("left join bas.pub.tipmoeda b on b.tipmoeda = a.\"tip-moeorig\"")
                .append("where a.\"stt-premio\" = '1'")
                .append("and a.\"cod-empresa\" = ?")
                .append("and a.\"cod-sucursal\" = ?")
                .append("and a.\"cod-carteira\" = ?")
                .append("and a.\"seq-apolice\" = ?");
        return query.toString();
    }
}
