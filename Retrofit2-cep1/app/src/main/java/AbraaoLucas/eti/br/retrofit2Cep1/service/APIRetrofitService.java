package AbraaoLucas.eti.br.retrofit2Cep1.service;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import AbraaoLucas.eti.br.retrofit2Cep1.model.CEP;

public interface APIRetrofitService {

    String BASE_URL = "https://viacep.com.br/ws/";

    @GET ("{estado}/{cidade}/{endereco}/json/")
    Call<List<CEP>> getCEPByCidadeEstadoEndereco(
            @Path("estado") String estado,
            @Path("cidade") String cidade,
            @Path("endereco") String endereco
    );

    @GET ("{CEP}/json/")
    Call<CEP> getEnderecoByCEP(@Path("CEP") String CEP);

}