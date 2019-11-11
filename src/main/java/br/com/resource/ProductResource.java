package br.com.resource;

import br.com.entity.ProductEntity;
import br.com.service.ProductService;
import jdk.nashorn.internal.ir.annotations.Ignore;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@Path("/products")
public class ProductResource {

    @Inject
    private ProductService productService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<ProductEntity> getAll() {
        return productService.getProdutos();
    }

}
