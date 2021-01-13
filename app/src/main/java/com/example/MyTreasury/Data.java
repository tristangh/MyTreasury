package com.example.MyTreasury;

import android.widget.EditText;

public class Data {

    public String id;
    public String date;
    public String cause;
    public String amount;
    public String currency;
    public String type;
    public String state;
    public String payer;
    public String cat;
    public String subcat;
    public String comments;
    public String img_id_str;
    public String balance;

    public Data(String id, String date, String cause, String amount, String currency, String type,
                String state, String payer, String cat, String subcat, String comments, String img_id_str) {

        this.id=id;
        this.date=date;
        this.cause=cause;
        this.amount=amount;
        this.currency=currency;
        this.type=type;
        this.state=state;
        this.payer=payer;
        this.cat=cat;
        this.subcat=subcat;
        this.comments=comments;
        this.img_id_str=img_id_str;

        String sign;
        if (type.equals("Debit")){
            sign = "+";
        }
        else if (type.equals("Credit")) {
            sign = "-";
        }
        else {
            sign="";
        }

        this.balance=sign+amount+" "+currency;
    }
}