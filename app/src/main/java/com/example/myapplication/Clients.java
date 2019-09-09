package com.example.myapplication;

import android.util.Log;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class Clients {


    private String Id;
    private String clientName;
    private Long total;
    private LocalDateTime date;
    private int logo;

    public Clients(String id, String clientName, Long total, LocalDateTime date, int logo) {
        Id = id;
        this.clientName = clientName;
        this.total = total;
        this.date = date;
        this.logo = logo;
    }


    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public String getDate() {
        try {
//            SimpleDateFormat targetFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
//            String formatDateTime = targetFormat.format(date);
//            return formatDateTime;
            return date.toString();
        }finally {
            return "11/12";
        }
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }
}
