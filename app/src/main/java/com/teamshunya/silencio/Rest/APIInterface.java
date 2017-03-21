package com.teamshunya.silencio.Rest;


import com.teamshunya.silencio.Models.ArrivalList;
import com.teamshunya.silencio.Models.DepartureList;
import com.teamshunya.silencio.Models.OfferList;


import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by himanshusingh on 19/03/17.
 */

public interface APIInterface {
    @GET("/arrival")
    Call<ArrivalList> getFlightDetails();

    @GET("/departure")
    Call<DepartureList> getFlightDetail();

    @GET("/offers")
    Call<OfferList> getOfferDetail();
}