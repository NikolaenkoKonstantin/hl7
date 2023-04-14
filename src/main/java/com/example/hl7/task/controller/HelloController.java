package com.example.hl7.task.controller;

import com.example.hl7.task.model.PatientDTO;
import com.example.hl7.task.model.Patient;
import com.example.hl7.task.repository.DimensionRepository;
import com.example.hl7.task.repository.PatientRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    private final PatientRepository patientRepo;
    private final DimensionRepository dimensionRepo;

    private int count = 1;

    @Autowired
    public HelloController(PatientRepository patientRepository, DimensionRepository dimensionRepository) {
        this.patientRepo = patientRepository;
        this.dimensionRepo = dimensionRepository;
    }

    @GetMapping("/test")
    public String test(){
        return "test";
    }

    @GetMapping("/click")
    public String click(){
        return "click";
    }

    @GetMapping("/ajax1")
    public ResponseEntity<String> ajax1(){
        String response = "List Patient: ";
        int n = (int) patientRepo.count();

        for(int i = 1; i < n; i++){
            Patient patient = patientRepo.getById(i);
            response += patient.getFirstName() + " " + patient.getLastName() + ", ";
        }

        return ResponseEntity.ok(response);
    }

    @GetMapping("/ajax2")
    public ResponseEntity<PatientDTO> ajax2(){
        Patient patient = patientRepo.getById(1);
        ModelMapper modelMapper = new ModelMapper();
        return ResponseEntity.ok(modelMapper.map(patient, PatientDTO.class));
    }

}
