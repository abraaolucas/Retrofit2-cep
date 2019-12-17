package AbraaoLucas.eti.br.retrofit2Cep1.model;

public interface SimpleCallback<T> {
    void onResponse (T response);
    void onError (String error);
}
