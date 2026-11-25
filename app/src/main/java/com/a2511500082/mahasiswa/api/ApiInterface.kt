package com.a2511500082.mahasiswa.api
import com.a2511500082.mahasiswa.model.MahasiswaDetailResponse
import com.a2511500082.mahasiswa.model.MahasiswaResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {
    @GET("mahasiswa.php")
    suspend fun getDaftarMahasiswa(): Response<MahasiswaResponse>

    @GET("mahasiswa.php")
    suspend fun searchMahasiswa(
        @Query("search") keyword: String
    ): Response<MahasiswaResponse>

    @GET("mahasiswa.php")
    suspend fun getDetailMahasiswa(
        @Query("id") id: String
    ): Response<MahasiswaDetailResponse>
}