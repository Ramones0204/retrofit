package br.eti.urbano.mobile.exemploretrofit2.resource;

import java.util.List;

import br.eti.urbano.mobile.exemploretrofit2.model.Album;
import br.eti.urbano.mobile.exemploretrofit2.model.Comments;
import br.eti.urbano.mobile.exemploretrofit2.model.Post;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface CommentsResource {

    @GET("/comments")
    Call<List<Comments>> get();

    @POST("/comments")
    Call<Comments> post(Album album);

    @PUT("/comments")
    Call<Void> put(Comments comments);

    @DELETE("/comments")
    Call<Void> delete(Comments comments);

    @PATCH("/comments")
    Call<Void> patch(Comments comments);

    @GET("/comments/{id}")
    Call<List<Comments>> get(Integer id);
}