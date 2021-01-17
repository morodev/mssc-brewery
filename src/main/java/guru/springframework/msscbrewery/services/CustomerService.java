package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

/**
 * Created by Luca Moro on 04/01/2021 08:06
 */
public interface CustomerService {
    CustomerDto saveNewCustomer(CustomerDto customerDto);

    CustomerDto getCustomerById(UUID customerId);

    void updateCustomer(UUID customerId, CustomerDto customerDto);

    void deleteById(UUID customerId);
}
