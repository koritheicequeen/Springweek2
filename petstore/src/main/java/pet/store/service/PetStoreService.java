package pet.store.service;

import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pet.store.controller.model.PetStoreData;
import pet.store.dao.PetStoreDao;
import pet.store.entity.petStore;

@Service
public class PetStoreService {
	@Autowired
private PetStoreDao petStoreDao;
@Transactional(readOnly = false)
	public PetStoreData savePetStore(PetStoreData petStoreData) {
		petStore PetStore = findOrCreatePetStore(petStoreData.getPetStoreId());
		copyPetStoreFields(PetStore, petStoreData);
	return new PetStoreData(petStoreDao.save(PetStore));
	}

	private petStore findOrCreatePetStore(Long id) {
if (id == null) {
	return new petStore();
}
return findPetStoreById(id);
	}
	
	
	 private petStore findPetStoreById(Long petStoreId) {
	        return petStoreDao.findById(petStoreId).orElseThrow(() -> new NoSuchElementException("No pet store with that ID was found"));
	    }
	 public void copyPetStoreFields(petStore PetStore, PetStoreData petStoreData) {
	      
	        PetStore.setPetStoreName(petStoreData.getPetStoreName());
	        PetStore.setPetStoreAddress(petStoreData.getPetStoreAddress());
	        PetStore.setPetStorePhone(petStoreData.getPetStorePhone());
	        PetStore.setPetStoreCity(petStoreData.getPetStoreCity());    
			PetStore.setPetStoreState(petStoreData.getPetStoreState());
			PetStore.setPetStoreZip(petStoreData.getPetStoreZip());
}
	
}
