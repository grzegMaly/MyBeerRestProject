package myproject.springbeers.beerrest.services;

import myproject.springbeers.beerrest.model.BeerCSVRecord;

import java.io.File;
import java.util.List;

public interface BeerCsvService {
    List<BeerCSVRecord> convertCSV(File csvFile);
}