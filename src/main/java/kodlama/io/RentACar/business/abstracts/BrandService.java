package kodlama.io.RentACar.business.abstracts;

import java.util.List;

import kodlama.io.RentACar.entities.concretes.Brand;

public interface BrandService {
	
	List<Brand> getAll();	
	
	public void add(Brand  brand);
}
