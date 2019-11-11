package br.com.repository;

import br.com.entity.SellerEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SallerRepository implements PanacheRepository<SellerEntity> {
}
