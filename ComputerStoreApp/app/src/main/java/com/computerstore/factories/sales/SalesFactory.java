package com.computerstore.factories.sales;

/**
 * Created by Aidem on 2016/04/17.
 */

import com.computerstore.domain.sales.Sales;
import java.util.UUID;

public class SalesFactory{

    public static Sales createSales(String salesId,int empID, String date,double totalSales, double dicount) {
        Sales  sales = new Sales
                .Builder()
                .id(UUID.randomUUID().toString())
                .salesId(salesId)
                .empID(empID)
                .date(date)
                .totalSales(totalSales)
                .discount(dicount)
                .build();
        return sales;
    }

}

