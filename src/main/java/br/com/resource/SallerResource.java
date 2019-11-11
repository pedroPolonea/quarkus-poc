package br.com.resource;

import br.com.entity.ProductEntity;
import br.com.entity.SellerEntity;
import br.com.service.SallerService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/saller")
public class SallerResource {

    @Inject
    private SallerService sallerService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<SellerEntity> getAll() {
        return sallerService.getAll();
    }
}
