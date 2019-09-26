package br.eti.urbano.mobile.exemploretrofit2.resource;

import java.util.List;

import br.eti.urbano.mobile.exemploretrofit2.model.Photos;
import br.eti.urbano.mobile.exemploretrofit2.model.Post;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface PhotosResource {

    @GET("/photos")
    Call<List<Photos>> get();

    @GET("/photos/{id}")
    Call<Photos> get(Integer id);

    @POST("/photos")
    Call<Photos> post(@Body Photos photos);

    @PUT("/photos/{id}")
    Call<Photos> put(@Body Photos photos);

    @DELETE("/photos/{id}")
    Call<Void> delete(Integer id);

    @PATCH("/photos/{id}")
    Call<Photos> patch(Integer id, @Body Photos photos);


}