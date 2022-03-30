package com.api.parkingcontrol.services;


import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repositories.ParkingSpotRepository;

@Service
public class ParkingSpotService {
	
	final ParkingSpotRepository parkingSpotRepository;
	
	public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
		this.parkingSpotRepository = parkingSpotRepository;
	}

	@Transactional
	public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
		// TODO Auto-generated method stub
		return parkingSpotRepository.save(parkingSpotModel);
	}
	
	public boolean existsByLicensePlateCar(String licensePlateCar) {
		return parkingSpotRepository.existsByLicensePlateCar(licensePlateCar);
	}
	
	public boolean existsByParkingSpotNumber(String parkingSpotNumber) {
		return parkingSpotRepository.existsByParkingSpotNumber(parkingSpotNumber);
	}
	
	public boolean existsByApartamentAndBlock(String apartamento, String block) {
		return parkingSpotRepository.existsByApartamentAndBlock(apartamento, block);
	}

	public Page<ParkingSpotModel> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return parkingSpotRepository.findAll(pageable);
	}

	public Optional<ParkingSpotModel> findById(UUID id) {
		// TODO Auto-generated method stub
		return parkingSpotRepository.findById(id);
	}

	public void delete(ParkingSpotModel parkingSpotModel) {
		// TODO Auto-generated method stub
		parkingSpotRepository.delete(parkingSpotModel);
		
	}

}
