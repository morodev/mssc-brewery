package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

/**
 * Created by Luca Moro on 04/01/2021 08:06
 */
public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
