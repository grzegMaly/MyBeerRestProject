package myproject.springbeers.beerrest.mappers;

import myproject.springbeers.beerrest.entities.Beer;
import myproject.springbeers.beerrest.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    Beer beerDtoToBeer(BeerDTO dto);

    BeerDTO beerToBeerDto(Beer beer);

}
