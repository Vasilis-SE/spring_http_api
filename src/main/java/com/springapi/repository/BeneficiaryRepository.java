package com.springapi.repository;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Repository;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.springapi.dao.BeneficiaryDAO;

@Repository
public class BeneficiaryRepository {
    private final String databasePath;

    public BeneficiaryRepository() {
        databasePath = "beneficieries.csv";
    }
    
    public List<BeneficiaryDAO> fetchAll() throws IOException, URISyntaxException {
        List<BeneficiaryDAO> beneficiaries = new ArrayList<>();

        // URL res = getClass().getClassLoader().getResource(databasePath);
        // File file = Paths.get(res.toURI()).toFile();
        // String absolutePath = file.getAbsolutePath();
  
        File file = new File("src/main/resources/"+databasePath);
        String absolutePath = file.getAbsolutePath();
        FileReader in = new FileReader(absolutePath);
        Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);


        for (CSVRecord csvRecord : records) {
            beneficiaries.add(BeneficiaryDAO.builder()
                .beneficiaryId(Integer.parseInt(csvRecord.get("beneficiaryId")))
                .firstName(csvRecord.get("firstName"))
                .lastName(csvRecord.get("lastName"))
                .build());
        }

        return beneficiaries;
    }

}
