package com.issabelaromero.irmusicapp.data.network

import com.issabelaromero.irmusicapp.data.model.Album
import retrofit2.http.GET
import retrofit2.http.Path

interface MusicApiService {
    @GET("api/albums")
    suspend fun getAlbums(): List<Album>

    @GET("api/albums/{id}")
    suspend fun getAlbumById(@Path("id") id: String): Album
}
