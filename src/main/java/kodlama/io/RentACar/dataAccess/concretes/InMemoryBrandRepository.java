package kodlama.io.RentACar.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.RentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.RentACar.entities.concretes.Brand;

@Repository
public class InMemoryBrandRepository implements BrandRepository{
	
	List<Brand> brands;
	
	public InMemoryBrandRepository() {
		brands  = new ArrayList<>();
		brands.add(new Brand(1,"Audi"));
		brands.add(new Brand(2,"Bmw"));
		brands.add(new Brand(3,"Ferrari"));
		brands.add(new Brand(4,"Mercedes"));
		brands.add(new Brand(5,"Fiat"));
	}
	@Override
	public List<Brand> getAll() {
		// TODO Auto-generated method stub
		return brands;
	}

}
