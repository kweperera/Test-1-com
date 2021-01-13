package com.satellite_api_master.satellite_catalog.service_interface;

import com.satellite_api_master.satellite_catalog.model.Catalog;
import java.util.List;

public interface CatalogInterface {

    // To save new catalog
    public Catalog saveCatalog(Catalog catalog);

    // To update catalog
    public Catalog updateCatalog(Catalog catalog);

    // To fetch all catalog from database
    public List<Catalog> findAllCatalog();

    // To delete catalog
    public void deleteCatalog(long id);
}