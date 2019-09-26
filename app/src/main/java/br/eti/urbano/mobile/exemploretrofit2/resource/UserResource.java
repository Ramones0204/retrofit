package br.eti.urbano.mobile.exemploretrofit2.resource;

import java.util.List;

import br.eti.urbano.mobile.exemploretrofit2.model.Album;
import br.eti.urbano.mobile.exemploretrofit2.model.Post;
import br.eti.urbano.mobile.exemploretrofit2.model.Users;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface UserResource {

    @GET("/users")
    Call<List<Users>> get();

    @POST("/users")
    Call<Users> post(Users users);

    @PUT("/users")
    Call<Void> put(Users users);

    @DELETE("/users")
    Call<Void> delete(Users users);

    @PATCH("/users")
    Call<Void> patch(Users users);

    @GET("/users/{id}")
    Call<List<Users>> get(Integer id);
}