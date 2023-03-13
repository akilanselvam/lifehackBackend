package com.akilanselvam.lifehack.service;

import com.akilanselvam.lifehack.model.LifeHack;
import com.akilanselvam.lifehack.repository.LifeHackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class LifeHackService {

    @Autowired
    private LifeHackRepository lhRepository;

    public LifeHack addLifeHack(LifeHack lifeHack){
        lifeHack.setLhId(UUID.randomUUID().toString().split("-")[0]);
        return lhRepository.save(lifeHack);
    }

    public List<LifeHack> findAllLifeHack(){
        return lhRepository.findAll();
    }

    public LifeHack getLifeHackById(String lhId){
        return lhRepository.findById(lhId).get();
    }

    public LifeHack updateLifeHack(LifeHack lifeHackNew){
        LifeHack lifeHackOld = lhRepository.findById(lifeHackNew.getLhId()).get();
        lifeHackOld.setTitle(lifeHackNew.getTitle());
        lifeHackOld.setDescription(lifeHackNew.getDescription());
        lifeHackOld.setApproval(lifeHackNew.getApproval());
        lifeHackOld.setLhDate(lifeHackNew.getLhDate());
        return lhRepository.save(lifeHackOld);
    }

    public String deleteLifeHack(String lhId){
        lhRepository.deleteById(lhId);
        return "Life Hack has been Deleted!";
    }

}
