package kodlama.io.RentACar.dataAccess.abstracts;

import java.util.List;

import kodlama.io.RentACar.entities.concretes.Brand;

	
public interface BrandRepository {
	
	List<Brand> getAll();
}
