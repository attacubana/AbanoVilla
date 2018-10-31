package com.meeple.abanovilla;

/**
* QUESTA CLASSE RAPPRESENTA UNA SINGOLA STANZA DELLA VILLA, I PARAMETRI, LETTI NELL'ACTIVITY HOME SONO:
 * - id: identificativo, equivalente al codice dell'iBeacon
 * - visitata: boolean che rappresenta se il visitatore è già entrato in una stanza
 * - immagine_mappa: immagine da mostrare al visitatore indicante la mappa con la stanza colorata, in modo da facilitare l'orientamento
* */


public class Stanza {

    private String id;
    private boolean visitata;
    private String immagine_mappa;

}
