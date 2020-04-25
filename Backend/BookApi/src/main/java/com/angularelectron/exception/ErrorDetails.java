package com.angularelectron.exception;

import java.sql.Date;

public class ErrorDetails {

	private Date timestamp;
    private String message;
    private String details;

    public ErrorDetails(java.util.Date date, String message, String details) {
        super();
        this.timestamp = (Date) date;
        this.message = message;
        this.details = details;
    }

    public ErrorDetails(Date timestamp2, String message2, String description) {
    	super();
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
	}

	public Date getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
         return message;
    }

    public String getDetails() {
         return details;
    }
}
