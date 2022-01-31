package com.restapi.jdbc.dao;

import com.restapi.jdbc.entity.CustomerDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Repository
@RestController
public class OrderDetailsDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

/*    class CustomerDetailsRowMapper implements RowMapper<CustomerDetails>{
        @Override
        public CustomerDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
            CustomerDetails customer = new CustomerDetails();
            customer.setOrderNumber(rs.getInt("order_number"));
            customer.setEngineDesignation(rs.getString("Engine_designation"));
            return customer;
        }

    }*/

    @GetMapping(path="/{customerno}")
    public List<CustomerDetails> findById(@PathVariable int customerno){
        return jdbcTemplate.query("select DISTINCT o.order_number,o.order_date, ov.model_name,ov.trim_name,ov.engine_designation,te.wheel_type,te.effective_date,te.headlight_type,te.infotainment_type,te.upholstery_type\n" +
                        "from orders AS o \n" +
                        "INNER JOIN ordered_vehicles AS ov  \n" +
                        "ON o.order_number= ov.order_number \n" +
                        "INNER JOIN trim_equipment AS te \n" +
                        "ON ov.trim_name=te.trim_name \n" +
                        "where customer_number= ? and te.effective_date<o.order_date;",
                new Object[] { customerno },
                new BeanPropertyRowMapper<CustomerDetails>(CustomerDetails.class));
    }

}
