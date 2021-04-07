package com.example.newsappandroid.businessLogic;

import java.time.LocalTime;

public class Nyhedsindslag {
    String overskrift;
    String teasertekst;
    String videoLink;
    String billedeLink;
    String udgivelsesdato; //TODO Date datetype.
    Boolean udgivetEllerEj;
    Boolean slettetEllerEj;

    public String getOverskrift() {
        return overskrift;
    }

    public void setOverskrift(String overskrift) {
        this.overskrift = overskrift;
    }

    public String getTeasertekst() {
        return teasertekst;
    }

    public void setTeasertekst(String teasertekst) {
        this.teasertekst = teasertekst;
    }

    public String getVideoLink() {
        return videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }

    public String getBilledeLink() {
        return billedeLink;
    }

    public void setBilledeLink(String billedeLink) {
        this.billedeLink = billedeLink;
    }

    public String getUdgivelsesdato() {
        return udgivelsesdato;
    }

    public void setUdgivelsesdato(String udgivelsesdato) {
        this.udgivelsesdato = udgivelsesdato;
    }

    public Boolean getUdgivetEllerEj() {
        return udgivetEllerEj;
    }

    public void setUdgivetEllerEj(Boolean udgivetEllerEj) {
        this.udgivetEllerEj = udgivetEllerEj;
    }

    public Boolean getSlettetEllerEj() {
        return slettetEllerEj;
    }

    public void setSlettetEllerEj(Boolean slettetEllerEj) {
        this.slettetEllerEj = slettetEllerEj;
    }

    public Nyhedsindslag() {
    }

    public Nyhedsindslag(String overskrift, String teasertekst, String billedeLink) {
        this.overskrift = overskrift;
        this.teasertekst = teasertekst;
        this.billedeLink = billedeLink;
    }
}
