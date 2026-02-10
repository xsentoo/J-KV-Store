package Service;

import Entity.Tache;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TacheServcice {

    Tache tache = new Tache("Fix bug" , "Senthooran" , "thayaparan" , "27/07/2027");
    public void ajouterUnTache(){
        List<Tache> tacheList = new ArrayList<Tache>();
        tacheList.add(tache);
    }

    public void TacheToJson(){
        StringBuilder json = new StringBuilder();
        json.append(String.format( "\"description\":\"%s\","
                        + "\"nom\":\"%s\","
                        + "\"prenom\":\"%s\",",
                tache.getDescription(), tache.getNom(), tache.getPrenom()

        ));
        json.append("\"maxTime\":\"").append(tache.getMaxTime()).append("\"");


    }


}
