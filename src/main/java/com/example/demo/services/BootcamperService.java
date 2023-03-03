package com.example.demo.services;


import com.example.demo.models.Bootcamper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BootcamperService {
    private List<Bootcamper> bootcapers = new ArrayList<>();

    public List<Bootcamper> getAll(){
        return bootcapers;
    }

    public void add(Bootcamper bootcamper){
        bootcapers.add(bootcamper);
    }

    public Bootcamper get(String nombre) {
        for (Bootcamper bootcamper : bootcapers) {
            if (bootcamper.getName().equalsIgnoreCase(nombre)) {
                return bootcamper;
            }
        }

        return null;
    }

}
