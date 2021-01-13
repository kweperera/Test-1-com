package com.satellite_api_master.satellite_catalog.service_implementation;


import com.satellite_api_master.satellite_catalog.model.Catalog;
import com.satellite_api_master.satellite_catalog.repository.CatalogRepository;
import com.satellite_api_master.satellite_catalog.service_interface.CatalogInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogImplementation implements CatalogInterface {

    @Autowired
    private CatalogRepository catalogRepo;
    @Override
    public Catalog saveCatalog(Catalog catalog) {
        return catalogRepo.save(catalog);
    }

    @Override
    public Catalog updateCatalog(Catalog catalog) {
        Catalog existingCatalog = catalogRepo.findById(catalog.getSatelliteId()).orElse(null);
        existingCatalog.setSatelliteName(catalog.getSatelliteName());
        existingCatalog.setCountry(catalog.getCountry());
        existingCatalog.setOperator(catalog.getOperator());
        existingCatalog.setSector(catalog.getSector());
        existingCatalog.setPurpose(catalog.getPurpose());
        existingCatalog.setPrimeContractor(catalog.getPrimeContractor());
        existingCatalog.setLaunchDate(catalog.getLaunchDate());
        existingCatalog.setStatus(catalog.getStatus());
        return catalogRepo.save(existingCatalog);

    }

    @Override
    public List<Catalog> findAllCatalog() {
        // It returns a list so casting is needed
        return (List<Catalog>) catalogRepo.findAll();
    }

    @Override
    public void deleteCatalog(long id) {
        // To delete catalog
        catalogRepo.deleteById(id);

    }
}
