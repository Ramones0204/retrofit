package br.eti.urbano.mobile.exemploretrofit2.resource;

import java.util.List;

import br.eti.urbano.mobile.exemploretrofit2.model.Post;
import br.eti.urbano.mobile.exemploretrofit2.model.Todos;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface TodosResource {

    @GET("/todos")
    Call<List<Todos>> get();

    @GET("/todos/{id}")
    Call<Todos> get(Integer id);

    @POST("/todos")
    Call<Todos> post(@Body Todos todos);

    @PUT("/todos/{id}")
    Call<Todos> put(@Body Todos todos);

    @DELETE("/todos/{id}")
    Call<Todos> delete(Integer id);

    @PATCH("/todos/{id}")
    Call<Todos> patch(Integer id, @Body Todos todos);


}