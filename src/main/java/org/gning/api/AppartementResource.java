package org.gning.api;
import java.util.List;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/appartements")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AppartementResource {

    @Inject
    AppartementService appartementService;

    @POST
    public Response ajouterAppartement(Appartement appartement) {
        appartementService.ajouterAppartement(appartement);
        return Response.status(Response.Status.CREATED).entity(appartement).build();
    }

    @GET
    public List<Appartement> listerAppartements() {
        return appartementService.listerAppartements();
    }

    @GET
    @Path("/{id}")
    public Response trouverAppartement(@PathParam("id") Long id) {
        Appartement appartement = appartementService.trouverAppartement(id);
        if (appartement != null) {
            return Response.ok(appartement).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @PUT
    @Path("/{id}")
    public Response modifierAppartement(@PathParam("id") Long id, Appartement appartement) {
        appartementService.modifierAppartement(id, appartement);
        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    public Response supprimerAppartement(@PathParam("id") Long id) {
        appartementService.supprimerAppartement(id);
        return Response.noContent().build();
    }
}
