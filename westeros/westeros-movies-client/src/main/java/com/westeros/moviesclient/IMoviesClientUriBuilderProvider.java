package com.westeros.moviesclient;

import org.springframework.web.util.UriComponentsBuilder;

public interface IMoviesClientUriBuilderProvider {

    /**
     * Ten getter zwraca klucz do api https://www.themoviedb.org/
     * -> utwórz darmowe konto i sprawdź w ustawieniach konta wartość klucza
     * @return klucz do api
     */
     String getApiKey();

    /**
     * Ten getter zwraca adres bazowy do api api.themoviedb.org
     * @return
     */
    String getHost();

    /**
     * zwraca wersję api - domyślnie 3
     * @return
     */
    int getApiVersion();


    /**
     * Metoda zwraca spredefinowanego budowniczego do adresów URI
     * docs. https://www.baeldung.com/spring-uricomponentsbuilder
     * @return UriComponentsBuilder
     */
    default UriComponentsBuilder builder(){
        return UriComponentsBuilder.newInstance()
                .scheme("http")
                .host(getHost())
                .pathSegment(getApiVersion()+"")
                .queryParam("api_key", getApiKey());
    }
}
