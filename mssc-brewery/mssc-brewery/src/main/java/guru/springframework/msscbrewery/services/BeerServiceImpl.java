package guru.springframework.msscbrewery.services;

import java.util.UUID;

import guru.springframework.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

@Service
public class BeerServiceImpl implements BeerService {

	@Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }

	@Override
	public BeerDto saveNewBeer(BeerDto beerDto) {
		// TODO Auto-generated method stub
		return BeerDto.builder()
				.id(UUID.randomUUID())
				.build();
	}
	
	
	

}
