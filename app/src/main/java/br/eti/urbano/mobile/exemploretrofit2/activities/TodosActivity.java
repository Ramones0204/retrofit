package br.eti.urbano.mobile.exemploretrofit2.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.List;

import br.eti.urbano.mobile.exemploretrofit2.R;
import br.eti.urbano.mobile.exemploretrofit2.boostrap.APIClient;
import br.eti.urbano.mobile.exemploretrofit2.model.Post;
import br.eti.urbano.mobile.exemploretrofit2.model.Todos;
import br.eti.urbano.mobile.exemploretrofit2.resource.PostResource;
import br.eti.urbano.mobile.exemploretrofit2.resource.TodosResource;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class TodosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todos);

        /*Pega a referencia do ENDPOINT e do converter(gson)
        * */
        Retrofit retrofit = APIClient.getClient();

        //Faz o 'bind' da instância do retrofit com interface
        //que contém as operações (GET,POST,PUT,DELETE)
        TodosResource todosResource = retrofit.create(TodosResource.class);

        //Faz a chamada do serviço
        Call<List<Todos>> get = todosResource.get();

        get.enqueue(new Callback<List<Todos>>() {
            @Override
            public void onResponse(Call<List<Todos>> call, Response<List<Todos>> response) {
                //Se deu certo executa este método
                List<Todos> posts = response.body();
                posts.forEach(p-> Log.i  ("senai",p.toString()));
            }

            @Override
            public void onFailure(Call<List<Todos>> call, Throwable t) {
                //Houve erro é executado este método.
            }
        });

    }
}
