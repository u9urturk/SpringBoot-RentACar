package kodlama.io.RentACar.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.RentACar.business.abstracts.BrandService;
import kodlama.io.RentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.RentACar.entities.concretes.Brand;

@Service
public class BrandManager implements BrandService {
	
	private BrandRepository brandRepository;
	
	@Autowired
	public BrandManager(BrandRepository brandRepository) {
		this.brandRepository = brandRepository;
	}
	@Override
	public List<Brand> getAll() {
		return brandRepository.getAll();
	}

	@Override
	public void add(Brand brand) {
		// TODO Auto-generated method stub
		
	}

}
