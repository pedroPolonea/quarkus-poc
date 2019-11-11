package br.com.service;

import br.com.entity.SellerEntity;
import br.com.repository.SallerRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class SallerService {

    @Inject
    private SallerRepository sallerRepository;

    public List<SellerEntity> getAll(){
        return sallerRepository.listAll();
    }
}

