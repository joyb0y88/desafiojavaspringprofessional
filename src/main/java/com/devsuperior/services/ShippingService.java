package com.devsuperior.services;

import com.devsuperior.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public double shipment(Order order) {
        return (order.getBasic() < 100.00) ? 20.00 : (order.getBasic() < 200.00) ? 12.00 : 0.0;
    }
}
