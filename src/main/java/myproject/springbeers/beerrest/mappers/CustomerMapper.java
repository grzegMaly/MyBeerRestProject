package myproject.springbeers.beerrest.mappers;

import myproject.springbeers.beerrest.entities.Customer;
import myproject.springbeers.beerrest.model.CustomerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDTO dto);

    CustomerDTO customerToCustomerDto(Customer customer);

}
