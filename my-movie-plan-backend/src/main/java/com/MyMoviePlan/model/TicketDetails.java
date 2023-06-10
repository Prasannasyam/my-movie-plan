package com.MyMoviePlan.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class TicketDetails {

	public TicketDetails(String auditoriumName, String showname, String showTiming, double amount, String movieName, String movieImage,
			String bgImage) {

	}



	private String auditoriumName;

    private String showName;

    private String showTiming;

    private double amount;

    private String movieName;

    private String movieImage;

    private String movieBgImage;
}
